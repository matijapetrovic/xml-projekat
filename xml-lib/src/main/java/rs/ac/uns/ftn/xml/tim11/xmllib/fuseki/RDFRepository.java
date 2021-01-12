package rs.ac.uns.ftn.xml.tim11.xmllib.fuseki;

import rs.ac.uns.ftn.xml.tim11.xmllib.fuseki.util.FusekiReader;
import rs.ac.uns.ftn.xml.tim11.xmllib.fuseki.util.FusekiWriter;
import rs.ac.uns.ftn.xml.tim11.xmllib.fuseki.util.MetadataExtractor;
import rs.ac.uns.ftn.xml.tim11.xmllib.fuseki.util.RDFDbConnection;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.TransformerException;
import java.io.*;

public abstract class RDFRepository<T> {
    protected abstract String xmlFilePath();
    protected abstract String rdfFilePath();
    protected abstract String namedGraph();
    protected abstract String contextPath();

    private final MetadataExtractor extractor;
    private final FusekiWriter writer;
    private final FusekiReader reader;

    private final Unmarshaller unmarshaller;
    private final Marshaller marshaller;

    public RDFRepository(
            RDFDbConnection connection) throws JAXBException {
        this.extractor = new MetadataExtractor();
        this.writer = new FusekiWriter(connection);
        this.reader = new FusekiReader(connection);
        JAXBContext context = JAXBContext.newInstance(contextPath());
        unmarshaller = context.createUnmarshaller();
        marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

    }

    public void saveMetadata(T entity) throws JAXBException, TransformerException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        marshaller.marshal(entity, out);
        byte[] bytes = out.toByteArray();

        out = new ByteArrayOutputStream();
        extractor.extractMetadata(new ByteArrayInputStream(bytes), out);

        writer.save(new ByteArrayInputStream(out.toByteArray()), namedGraph());
    }

    public void read() {
        reader.read(namedGraph());
    }
}
