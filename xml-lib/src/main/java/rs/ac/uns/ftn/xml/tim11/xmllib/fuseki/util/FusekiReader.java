package rs.ac.uns.ftn.xml.tim11.xmllib.fuseki.util;

import org.apache.jena.query.*;
import org.apache.jena.rdf.model.RDFNode;

import java.util.Iterator;

public class FusekiReader {
    private RDFDbConnection conn;

    public FusekiReader( RDFDbConnection conn ) {
        this.conn = conn;
    }

    public void read(String NAMED_GRAPH) {
        System.out.println("[INFO] Selecting the triples from the named graph \"" + NAMED_GRAPH + "\".");
        String sparqlQuery = SparqlUtil.selectData(conn.getDataEndpoint() + NAMED_GRAPH, "?s ?p ?o");

        // Create a QueryExecution that will access a SPARQL service over HTTP
        QueryExecution query = QueryExecutionFactory.sparqlService(conn.getQueryEndpoint(), sparqlQuery);

        // Query the SPARQL endpoint, iterate over the result set...
        ResultSet results = query.execSelect();

//        readWithIteration(results);
        readSPARQLOverHTTP(NAMED_GRAPH, sparqlQuery, results, query);

        query.close() ;
        System.out.println("[INFO] End.");
    }

    private void readWithIteration( ResultSet results) {
        String varName;
        RDFNode varValue;
        while(results.hasNext()) {
            // A single answer from a SELECT query
            QuerySolution querySolution = results.next() ;
            Iterator<String> variableBindings = querySolution.varNames();

            // Retrieve variable bindings
            while (variableBindings.hasNext()) {
                varName = variableBindings.next();
                varValue = querySolution.get(varName);

                System.out.println(varName + ": " + varValue);
            }
            System.out.println();
        }
    }

    private void readSPARQLOverHTTP(
            String NAMED_GRAPH,
            String sparqlQuery,
            ResultSet results,
            QueryExecution query)
    {
        // Querying the other named graph
        System.out.println("[INFO] Selecting the triples from the named graph \"" + NAMED_GRAPH + "\".");
        sparqlQuery = SparqlUtil.selectData(conn.getDataEndpoint() + NAMED_GRAPH, "?s ?p ?o");

        // Create a QueryExecution that will access a SPARQL service over HTTP
        query = QueryExecutionFactory.sparqlService(conn.getQueryEndpoint(), sparqlQuery);

        // Query the collection, dump output response as XML
        results = query.execSelect();
        ResultSetFormatter.outputAsXML(System.out, results);
    }
}
