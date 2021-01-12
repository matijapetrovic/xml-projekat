package rs.ac.uns.ftn.xml.tim11.authoritybodyservice.repository.rdf;

import org.springframework.stereotype.Repository;
import rs.ac.uns.ftn.xml.tim11.xmllib.fuseki.RDFRepository;
import rs.ac.uns.ftn.xml.tim11.xmllib.fuseki.util.RDFDbConnection;

@Repository
public class ZahtevRDFRepository extends RDFRepository {

    //@Value("${xml.zalba-cutanje}")
    private String xmlFilePath = "data/xml/zahtevcir.xml";

    //@Value("${rdf.zalba-cutanje}")
    private String rdfFilePath = "gen/zahtevcir.rdf";

    private final String NAMED_GRAPH = "/zahtev/metadata";

    public ZahtevRDFRepository(
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
