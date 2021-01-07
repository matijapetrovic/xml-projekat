package rs.ac.uns.ftn.xml.tim11.commissionerservice.repository;

import org.springframework.stereotype.Repository;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.util.FusekiReader;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.util.FusekiWriter;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.util.MetadataExtractor;

@Repository
public class ZalbaCutanjeRDFRepository extends RDFRepository {

    //@Value("${xml.zalba-cutanje}")
    private String xmlFilePath = "data/xml/zalbacutanjecir.xml";

    //@Value("${rdf.zalba-cutanje}")
    private String rdfFilePath = "gen/zalbacutanjecir.rdf";

    private final String NAMED_GRAPH = "/zalbacutanje/metadata";

    public ZalbaCutanjeRDFRepository(
            MetadataExtractor extractor,
            FusekiWriter writer,
            FusekiReader reader
    ) {
        super(extractor, writer, reader);
    }

    @Override
    protected String xmlFilePath() { return xmlFilePath; }

    @Override
    protected String rdfFilePath() {
        return rdfFilePath;
    }

    @Override
    protected String namedGraph() {
        return NAMED_GRAPH;
    }
}
