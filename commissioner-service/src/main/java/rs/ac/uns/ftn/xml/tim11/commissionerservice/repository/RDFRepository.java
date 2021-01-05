package rs.ac.uns.ftn.xml.tim11.commissionerservice.repository;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.update.UpdateExecutionFactory;
import org.apache.jena.update.UpdateFactory;
import org.apache.jena.update.UpdateProcessor;
import org.apache.jena.update.UpdateRequest;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.util.CustomMetadataExtractor;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.util.DbConnection;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.util.SparqlUtil;

import java.io.IOException;

public class RDFRepository {
    private CustomMetadataExtractor extractor;

    private static final String SPARQL_NAMED_GRAPH_URI = "/example/sparql/metadata";

    public RDFRepository(
            CustomMetadataExtractor extractor) {
        this.extractor = extractor;
    }

    public void create(String xmlFilePath) throws IOException {
        Model model = extractor.createModel(xmlFilePath);

        // Delete all of the triples in all of the named graphs
        UpdateRequest request = UpdateFactory.create() ;
        request.add(SparqlUtil.dropAll());
        /*
         * Create UpdateProcessor, an instance of execution of an UpdateRequest.
         * UpdateProcessor sends update request to a remote SPARQL update service.
         */
        UpdateProcessor processor = UpdateExecutionFactory.createRemote(request, extractor.conn.connectionProperties.updateEndpoint);
        processor.execute();

        processor = UpdateExecutionFactory.createRemote(extractor.createUpdateRequest(SPARQL_NAMED_GRAPH_URI), extractor.conn.connectionProperties.updateEndpoint);
        processor.execute();
        System.out.println("[INFO] End.");
    }
}
