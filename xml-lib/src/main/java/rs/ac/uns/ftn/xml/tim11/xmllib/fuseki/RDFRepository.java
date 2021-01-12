package rs.ac.uns.ftn.xml.tim11.xmllib.fuseki;

import rs.ac.uns.ftn.xml.tim11.xmllib.fuseki.util.FusekiReader;
import rs.ac.uns.ftn.xml.tim11.xmllib.fuseki.util.FusekiWriter;
import rs.ac.uns.ftn.xml.tim11.xmllib.fuseki.util.MetadataExtractor;
import rs.ac.uns.ftn.xml.tim11.xmllib.fuseki.util.RDFDbConnection;

import javax.xml.transform.TransformerException;
import java.io.IOException;

public abstract class RDFRepository {
    protected abstract String xmlFilePath();
    protected abstract String rdfFilePath();
    protected abstract String namedGraph();

    private MetadataExtractor extractor;
    private FusekiWriter writer;
    private FusekiReader reader;

    public RDFRepository(
            RDFDbConnection connection) {
        this.extractor = new MetadataExtractor();
        this.writer = new FusekiWriter(connection);
        this.reader = new FusekiReader(connection);
    }

    public void create() throws IOException, TransformerException {
        extractor.extractToRDF(xmlFilePath(), rdfFilePath());
        writer.save(rdfFilePath(), namedGraph());
    }

    public void read() {
        reader.read(namedGraph());
    }


}
