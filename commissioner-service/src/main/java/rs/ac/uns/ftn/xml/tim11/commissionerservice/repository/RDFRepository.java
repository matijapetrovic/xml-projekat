package rs.ac.uns.ftn.xml.tim11.commissionerservice.repository;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.update.UpdateExecutionFactory;
import org.apache.jena.update.UpdateFactory;
import org.apache.jena.update.UpdateProcessor;
import org.apache.jena.update.UpdateRequest;
import org.springframework.beans.factory.annotation.Autowired;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.util.AuthenticationUtilities;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.util.CustomMetadataExtractor;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.util.DbConnection;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.util.SparqlUtil;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class RDFRepository {
    private CustomMetadataExtractor extractor;
    @Autowired
    public DbConnection conn;


    private static final String SPARQL_NAMED_GRAPH_URI = "/example/sparql/metadata";

    public RDFRepository(
            CustomMetadataExtractor extractor) {
        this.extractor = extractor;
    }

    public void create(String xmlFilePath, String rdfFilePath, String metadataGraphUri) throws IOException {
        System.out.println("[INFO] Loading triples from an RDF/XML to a model...");
// Creates a default model
        Model model = ModelFactory.createDefaultModel();
        model.read(rdfFilePath);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        model.write(out, SparqlUtil.NTRIPLES);

        System.out.println("[INFO] Rendering model as RDF/XML...");
        model.write(System.out, SparqlUtil.RDF_XML);

        /*
         * Create UpdateProcessor, an instance of execution of an UpdateRequest.
         * UpdateProcessor sends update request to a remote SPARQL update service.
         */

        UpdateRequest request = UpdateFactory.create() ;

//TODO Remove this later
// This will delete all of the triples in all of the named graphs
// request.add(SparqlUtil.dropAll());
        UpdateProcessor processor = UpdateExecutionFactory.createRemote(request, extractor.conn.connectionProperties.updateEndpoint);
        processor.execute();

// Creating the first named graph and updating it with RDF data
        System.out.println("[INFO] Writing the triples to a named graph \"" + metadataGraphUri + "\".");
        String sparqlUpdate = SparqlUtil.insertData(extractor.conn.connectionProperties.dataEndpoint + metadataGraphUri,
                new String(out.toByteArray()));
        System.out.println(sparqlUpdate);

// UpdateRequest represents a unit of execution
        UpdateRequest update = UpdateFactory.create(sparqlUpdate);

        processor = UpdateExecutionFactory.createRemote(update, extractor.conn.connectionProperties.updateEndpoint);
        processor.execute();
    }
}
