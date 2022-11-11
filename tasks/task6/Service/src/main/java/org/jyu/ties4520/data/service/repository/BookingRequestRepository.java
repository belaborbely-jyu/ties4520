package org.jyu.ties4520.data.service.repository;

import org.apache.commons.lang3.Range;
import org.apache.commons.lang3.text.StrSubstitutor;
import org.apache.jena.rdf.model.RDFNode;
import org.jyu.ties4520.data.rdf.entity.RdfBooking;
import org.jyu.ties4520.data.rdf.entity.RdfBookingRequest;
import org.jyu.ties4520.data.rdf.entity.RdfCottage;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.*;

public class BookingRequestRepository extends AbstractFileBasedRepository<RdfBooking> {

    private final CottageRepository cottageRepository = new CottageRepository();

    @Override
    public RdfBooking create() {
        return new RdfBooking();
    }

    public List<RdfBooking> getProposals(RdfBookingRequest request) {
        return findAll(request, createIntervals(request));
    }

    public static List<Range<ChronoLocalDate>> createIntervals(RdfBookingRequest request) {
        return createIntervals(request.getStartDay(), request.getNumberOfDays(), request.getShift());
    }

    public static List<Range<ChronoLocalDate>> createIntervals(LocalDate startDate, int duration, int shifts) {
        List<Range<ChronoLocalDate>> intervalsToTest = new LinkedList<>();
        LocalDate endDate = startDate.plusDays(duration);
        intervalsToTest.add(Range.between(startDate, endDate));
        boolean useUnion = shifts > 0;
        if (useUnion) {
            for (Integer shift = 1; shift < shifts + 1; shift++) {
                LocalDate startDatePlus = startDate.plusDays(shift);
                LocalDate endDatePlus = startDatePlus.plusDays(duration);
                intervalsToTest.add(Range.between(startDatePlus, endDatePlus));
                LocalDate startDateMinus = startDate.plusDays(-shift);
                LocalDate endDateMinus = startDateMinus.plusDays(duration);
                intervalsToTest.add(Range.between(startDateMinus, endDateMinus));
            }
        }
        return intervalsToTest;
    }

    public List<RdfBooking> findAll(RdfBookingRequest request, List<Range<ChronoLocalDate>> intervals) {
        try {
            if (!intervals.isEmpty()) {
                String queryTemplateBase = SparqlHelper.QueryFiles.BOOKING_PROPOSALS.getFileContent();
                String queryTemplateUnion = SparqlHelper.QueryFiles.START_DATE_SHIFT.getFileContent();
                String query = createQuery(request, queryTemplateBase, queryTemplateUnion, intervals);
                return convertPropertyMapsToListOfEntities(resultSet(query));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new LinkedList<>();
    }

    private String createQuery(RdfBookingRequest request
            , String queryTemplateBase
            , String queryTemplateUnion
            , List<Range<ChronoLocalDate>> intervals) {
        StrSubstitutor substitutor = new StrSubstitutor();
        String query = queryTemplateBase;
        boolean hasUnion = intervals.size() > 1;
        Map<String, Object> params = new LinkedHashMap<>();
        putParameter(params, intervals.get(0), request);
        String unionForShift = "";
        if (hasUnion) {
            int shifts = intervals.size();
            for (int i = 1; i < shifts; i++) {
                Map<String, Object> unionParams = new LinkedHashMap<>();
                putParameter(unionParams, intervals.get(i), request);
                unionForShift = unionForShift + substitutor.replace(queryTemplateUnion, unionParams, "${", "}");
            }
        }
        params.put("unionForShift", unionForShift);
        query = substitutor.replace(query, params, "${", "}");
        // Remove not filed template variables
        query = query.replaceAll(".*\\$\\{.*\\}.*", "");
        return query;
    }

    private void putParameter(Map<String, Object> params, Range<ChronoLocalDate> interval, RdfBookingRequest request){
        params.put("startInfo", interval.getMinimum().toString());
        params.put("endInfo", interval.getMaximum().toString());
        params.put("hasPlaces", request.getNumberOfPlaces());
        params.put("hasBedrooms", request.getNumberOfBedrooms());
        if (request.getMetersToTheLake() != null) {
            params.put("hasDistanceFromTheLake", request.getMetersToTheLake());
        }
        if (request.getKmToTheNearestCity() != null) {
            params.put("hasDistanceToCity", request.getKmToTheNearestCity());
        }
        params.put("hasClosestCity", request.getNearestCityName());
    }

    @Override
    public List<RdfBooking> convertPropertyMapsToListOfEntities(List<Map<String, RDFNode>> rdfNodeMaps) {
        Map<String, RdfCottage> cottagesByUri = new LinkedHashMap<>();
        cottageRepository.findAll().forEach(c -> {
            if (c.uri().isPresent()) {
                cottagesByUri.put(c.uri().get(), c);
            }
        });
        List<RdfBooking> bookings = super.convertPropertyMapsToListOfEntities(rdfNodeMaps);
        for (RdfBooking booking : bookings) {
            Optional<RDFNode> cottage = booking.getRdfNode(RdfBooking.PID.cottage.name());
            if (cottage.isPresent() && cottage.get().isResource()) {
                String cottageUri = cottage.get().asResource().getURI();
                booking.put(RdfBooking.PID.cottage.name(), cottagesByUri.get(cottageUri));
            }
        }
        return bookings;
    }
}