
package rs.ac.uns.ftn.xml.tim11.xmllib.fuseki;

import org.apache.jena.query.QueryExecution;
import org.apache.jena.query.QueryExecutionFactory;
import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;
import org.apache.jena.rdf.model.RDFNode;
import org.xml.sax.SAXException;
import rs.ac.uns.ftn.xml.tim11.xmllib.XmlResourceProperties;
import rs.ac.uns.ftn.xml.tim11.xmllib.fuseki.util.*;
import rs.ac.uns.ftn.xml.tim11.xmllib.jaxb.JaxbMarshaller;

import javax.xml.bind.JAXBException;
import javax.xml.transform.TransformerException;
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RDFRepository<T> {
    private final XmlResourceProperties properties;
    private final MetadataExtractor extractor;
    private final FusekiWriter writer;
    private final FusekiReader reader;
    private final JaxbMarshaller<T> marshaller;

    public RDFRepository(RDFDbConnection connection, XmlResourceProperties properties)
            throws JAXBException, SAXException {
        this.properties = properties;
        this.writer = new FusekiWriter(connection);
        this.reader = new FusekiReader(connection);
        this.extractor = new MetadataExtractor();
        this.marshaller = new JaxbMarshaller<>(properties);
    }

    public List<String> query(String sparqlQuery) throws IOException {
        FusekiAuthenticationUtilities.ConnectionProperties conn = FusekiAuthenticationUtilities.loadProperties();
        System.out.println(sparqlQuery);

        // Create a QueryExecution that will access a SPARQL service over HTTP
        QueryExecution query = QueryExecutionFactory.sparqlService(conn.queryEndpoint, sparqlQuery);

        // Query the SPARQL endpoint, iterate over the result set...
        System.out.println("[INFO] Showing the results for SPARQL query using the result handler.\n");
        ResultSet results = query.execSelect();

        String varName;
        RDFNode varValue;

        List<String> result = new ArrayList<>();
        while (results.hasNext()) {

            // A single answer from a SELECT query
            QuerySolution querySolution = results.next();
            Iterator<String> variableBindings = querySolution.varNames();

            // Retrieve variable bindings
            while (variableBindings.hasNext()) {

                varName = variableBindings.next();
                varValue = querySolution.get(varName);

                result.add(varValue.toString().substring(varValue.toString().lastIndexOf("/")+1));
            }
        }

        query.close();

        return result;
    }

    public void saveMetadata(T entity) throws JAXBException, TransformerException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        marshaller.marshal(entity, out);
        byte[] bytes = out.toByteArray();

        out = new ByteArrayOutputStream();
        extractor.extractMetadata(new ByteArrayInputStream(bytes), out);

        writer.save(new ByteArrayInputStream(out.toByteArray()), properties.namedGraph());
    }

    public void read() {
        reader.read(properties.namedGraph());
    }
}