
package rs.ac.uns.ftn.xml.tim11.xmllib.fuseki;

import org.xml.sax.SAXException;
import rs.ac.uns.ftn.xml.tim11.xmllib.XmlResourceProperties;
import rs.ac.uns.ftn.xml.tim11.xmllib.fuseki.util.FusekiReader;
import rs.ac.uns.ftn.xml.tim11.xmllib.fuseki.util.FusekiWriter;
import rs.ac.uns.ftn.xml.tim11.xmllib.fuseki.util.MetadataExtractor;
import rs.ac.uns.ftn.xml.tim11.xmllib.fuseki.util.RDFDbConnection;
import rs.ac.uns.ftn.xml.tim11.xmllib.jaxb.JaxbMarshaller;

import javax.xml.bind.JAXBException;
import javax.xml.transform.TransformerException;
import java.io.*;

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