package rs.ac.uns.ftn.xml.tim11.xmllib.fuseki.util;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.update.UpdateExecutionFactory;
import org.apache.jena.update.UpdateFactory;
import org.apache.jena.update.UpdateProcessor;
import org.apache.jena.update.UpdateRequest;

import java.io.ByteArrayOutputStream;

public class FusekiWriter {
    private RDFDbConnection conn;

    public FusekiWriter( RDFDbConnection conn ) {
        this.conn = conn;
    }

    public void save(String rdfFilePath, String NAMED_GRAPH) {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        createModel(rdfFilePath, out);
        sendRequest(NAMED_GRAPH, out);
    }

    private void createModel(String rdfFilePath, ByteArrayOutputStream out) {
        // Creates a default model
        Model model = ModelFactory.createDefaultModel();
        model.read(rdfFilePath);

        // out stream nam treba da bismo videli ispis na konzoli
        model.write(out, SparqlUtil.NTRIPLES);
        System.out.println("[INFO] Rendering model as RDF/XML...");
        model.write(System.out, SparqlUtil.RDF_XML);
    }

    private void sendRequest(String NAMED_GRAPH, ByteArrayOutputStream out) {
        /*
         * Create UpdateProcessor, an instance of execution of an UpdateRequest.
         * UpdateProcessor sends update request to a remote SPARQL update service.
         */
        UpdateRequest request = UpdateFactory.create() ;

        UpdateProcessor processor = UpdateExecutionFactory.createRemote(request, conn.getUpdateEndpoint());
        conn.setClient(processor);
        processor.execute();


        // Creating the first named graph and updating it with RDF data
        System.out.println("[INFO] Writing the triples to a named graph \"" + NAMED_GRAPH + "\".");
        String sparqlUpdate = SparqlUtil.insertData(conn.getDataEndpoint() + NAMED_GRAPH, new String(out.toByteArray()));
        System.out.println(sparqlUpdate);

        // UpdateRequest represents a unit of execution
        UpdateRequest update = UpdateFactory.create(sparqlUpdate);
        processor = UpdateExecutionFactory.createRemote(update, conn.getUpdateEndpoint());
        processor.execute();
    }
}
