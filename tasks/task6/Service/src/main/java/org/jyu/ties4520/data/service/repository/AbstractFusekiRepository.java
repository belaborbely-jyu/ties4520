package org.jyu.ties4520.data.service.repository;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.rdf.model.RDFNode;
import org.apache.jena.rdfconnection.RDFConnection;
import org.apache.jena.rdfconnection.RDFConnectionFuseki;
import org.apache.jena.rdfconnection.RDFConnectionRemoteBuilder;
import org.jyu.ties4520.data.rdf.entity.AbstractMapBasedRdfEntity;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public abstract class AbstractFusekiRepository<ENTITY extends AbstractMapBasedRdfEntity<ENTITY>> extends AbstractRepository<ENTITY>{

    public static final String FUSEKI_ENDPOINT = "https://semantiweb-cottagebooking.azurewebsites.net/fuseki/CottageBooking/sparql";

    public List<Map<String, RDFNode>> resultSet(String sparql) {
        List<Map<String, RDFNode>> resultList = new LinkedList<>();
        RDFConnectionRemoteBuilder builder = RDFConnectionFuseki.newBuilder();
        try (RDFConnection conn = builder.destination(FUSEKI_ENDPOINT).build()) {
            conn.queryResultSet(sparql, (resultSet) -> {
                while (resultSet.hasNext()) {
                    QuerySolution qs = resultSet.next();
                    processResultSet(resultList, qs);
                }
            });
        }
        return resultList;
    }
}
