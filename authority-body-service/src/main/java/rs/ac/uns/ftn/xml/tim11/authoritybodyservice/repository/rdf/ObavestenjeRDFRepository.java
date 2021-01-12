package rs.ac.uns.ftn.xml.tim11.authoritybodyservice.repository.rdf;

import org.springframework.stereotype.Repository;
import rs.ac.uns.ftn.xml.tim11.xmllib.fuseki.RDFRepository;
import rs.ac.uns.ftn.xml.tim11.xmllib.fuseki.util.RDFDbConnection;

@Repository
public class ObavestenjeRDFRepository extends RDFRepository {

    //@Value("${xml.zalba-cutanje}")
    private String xmlFilePath = "data/xml/obavestenjecir.xml";

    //@Value("${rdf.zalba-cutanje}")
    private String rdfFilePath = "gen/obavestenjecir.rdf";

    private final String NAMED_GRAPH = "/obavestenje/metadata";

    public ObavestenjeRDFRepository(
            RDFDbConnection connection
    ) {
        super(connection);
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
