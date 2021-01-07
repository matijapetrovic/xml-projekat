package rs.ac.uns.ftn.xml.tim11.commissionerservice.repository;

import rs.ac.uns.ftn.xml.tim11.commissionerservice.util.*;
import javax.xml.transform.TransformerException;
import java.io.IOException;

abstract class RDFRepository {
    protected abstract String xmlFilePath();
    protected abstract String rdfFilePath();
    protected abstract String namedGraph();

    private MetadataExtractor extractor;
    private FusekiWriter writer;
    private FusekiReader reader;

    public RDFRepository(
            MetadataExtractor extractor,
            FusekiWriter writer,
            FusekiReader reader) {
        this.extractor = extractor;
        this.writer = writer;
        this.reader = reader;
    }

    public void create() throws IOException, TransformerException {
        extractor.extractToRDF(xmlFilePath(), rdfFilePath());
        writer.save(rdfFilePath(), namedGraph());
    }

    public void read() {
        reader.read(namedGraph());
    }
}
