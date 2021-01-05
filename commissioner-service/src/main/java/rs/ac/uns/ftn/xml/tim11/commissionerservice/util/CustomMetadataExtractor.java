package rs.ac.uns.ftn.xml.tim11.commissionerservice.util;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.update.UpdateExecutionFactory;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.update.UpdateFactory;
import org.apache.jena.update.UpdateProcessor;
import org.apache.jena.update.UpdateRequest;
import org.xml.sax.SAXException;

import javax.xml.transform.TransformerException;
import java.io.*;

public class CustomMetadataExtractor {
    public DbConnection conn;
    private final MetadataExtractor metadataExtractor;
    private final ByteArrayOutputStream out;

    public CustomMetadataExtractor(
            DbConnection conn,
            MetadataExtractor metadataExtractor) {
        this.conn = conn;
        this.metadataExtractor = metadataExtractor;
        this.out = new ByteArrayOutputStream();
    }

    public void extract(String xmlFilePath, String rdfFilePath, String namedGraphURI) throws IOException, TransformerException, SAXException {
        extractToRDF(xmlFilePath, rdfFilePath);
        Model model = createModel(rdfFilePath);

        UpdateProcessor processor = UpdateExecutionFactory.createRemote(createUpdateRequest(namedGraphURI), conn.connectionProperties.updateEndpoint);
        processor.execute();
    }

    public void extractToRDF(String xmlFilePath, String rdfFilePath) throws FileNotFoundException, TransformerException {
        System.out.println("[INFO] Extracting metadata from RDFa attributes...");
        metadataExtractor.extractMetadata(
                new FileInputStream(new File(xmlFilePath)),
                new FileOutputStream(new File(rdfFilePath)));
    }

    public Model createModel(String rdfFilePath) {
        // Loading a default model with extracted metadata
        Model model = ModelFactory.createDefaultModel();
        model.read(rdfFilePath);

        model.write(out, SparqlUtil.NTRIPLES);

        System.out.println("[INFO] Extracted metadata as RDF/XML...");
        model.write(System.out, SparqlUtil.RDF_XML);

        return model;
    }

    public UpdateRequest createUpdateRequest(String namedGraphUri) {
        // Writing the named graph
        System.out.println("[INFO] Populating named graph \"" + namedGraphUri + "\" with extracted metadata.");
        String sparqlUpdate = SparqlUtil.insertData(conn.connectionProperties.dataEndpoint + namedGraphUri, new String(out.toByteArray()));
        System.out.println(sparqlUpdate);

        // UpdateRequest represents a unit of execution
        return UpdateFactory.create(sparqlUpdate);
    }
}
