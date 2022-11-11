package org.jyu.ties4520.data.service.repository;

import org.apache.jena.query.*;
import org.apache.jena.rdf.model.RDFNode;
import org.jyu.ties4520.data.rdf.entity.AbstractMapBasedRdfEntity;

import java.util.*;

public abstract class AbstractRepository<ENTITY extends AbstractMapBasedRdfEntity<ENTITY>> {

    public abstract ENTITY create();

    public abstract List<Map<String, RDFNode>> resultSet(String sparql);
    public List<ENTITY> convertPropertyMapsToListOfEntities(List<Map<String, RDFNode>> rdfNodeMaps) {
        List<ENTITY> entities = new LinkedList<>();
        for (Map<String, RDFNode> rdfNodeMap : rdfNodeMaps) {
            entities.add(create().put(rdfNodeMap));
        }
        return entities;
    }

    protected void processResultSet(List<Map<String, RDFNode>> resultList, QuerySolution qs) {
        Map<String, RDFNode> row = new LinkedHashMap<>();
        qs.varNames().forEachRemaining(varName -> row.put(varName, qs.get(varName)));
        resultList.add(row);
    }

    public int count() {
        return 100; //TODO
    }

    public List<ENTITY> findAll() {
        return new LinkedList<>(); //TODO
    }

    public void deleteById(Integer id) {
        //TODO
    }

    public ENTITY save(ENTITY entity) {
        //TODO
        return entity;
    }

    public Optional<ENTITY> findById(Integer id) {
        return Optional.empty(); //TODO
    }
}
