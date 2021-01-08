package rs.ac.uns.ftn.xml.tim11.commissionerservice.repository.RDF;

import org.springframework.stereotype.Repository;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.util.RDF.FusekiReader;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.util.RDF.FusekiWriter;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.util.RDF.MetadataExtractor;

@Repository
public class ZalbaNaOdlukuRDFRepository extends RDFRepository {

    //@Value("${xml.zalba-cutanje}")
    private String xmlFilePath = "data/xml/zalbanaodlukucir.xml";

    //@Value("${rdf.zalba-cutanje}")
    private String rdfFilePath = "gen/zalbanaodlukucir.rdf";

    private final String NAMED_GRAPH = "/zalbanaodluku/metadata";

    public ZalbaNaOdlukuRDFRepository(
            MetadataExtractor extractor,
            FusekiWriter writer,
            FusekiReader reader
    ) {
        super(extractor, writer, reader);
    }

    @Override
    protected String xmlFilePath() {
        return xmlFilePath;
    }

    @Override
    protected String rdfFilePath() {
        return rdfFilePath;
    }

    @Override
    protected String namedGraph() {
        return NAMED_GRAPH;
    }
}
