package org.jyu.ties4520.data.service.repository;

import org.apache.jena.ontology.OntModel;
import org.apache.jena.ontology.OntModelSpec;
import org.apache.jena.query.*;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.RDFNode;
import org.apache.jena.riot.RDFDataMgr;
import org.jyu.ties4520.SpringBootTomcatApplication;
import org.jyu.ties4520.data.rdf.entity.AbstractMapBasedRdfEntity;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public abstract class AbstractFileBasedRepository<ENTITY extends AbstractMapBasedRdfEntity<ENTITY>> extends AbstractRepository<ENTITY>{

    Dataset dataset = getDatasetFromFile(SpringBootTomcatApplication.contextPath + "/BookingDB.ttl");

    public static Dataset getDatasetFromFile(String pathDB){
        Model model = RDFDataMgr.loadModel(pathDB);
        OntModelSpec ontModelSpec = OntModelSpec.OWL_DL_MEM;
        OntModel ontModel = ModelFactory.createOntologyModel(ontModelSpec, model);
        return DatasetFactory.create(ontModel);
    }

    public List<Map<String, RDFNode>> resultSet(String sparql) {
        List<Map<String, RDFNode>> resultList = new LinkedList<>();
        Query query = QueryFactory.create(sparql);
        try (QueryExecution exec = QueryExecutionFactory.create(query, dataset)) {
            exec.execSelect().forEachRemaining(qs -> processResultSet(resultList, qs));
        }
        return resultList;
    }
}
