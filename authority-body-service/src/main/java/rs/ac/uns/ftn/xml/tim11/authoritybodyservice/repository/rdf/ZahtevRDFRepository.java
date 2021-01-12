package rs.ac.uns.ftn.xml.tim11.authoritybodyservice.repository.rdf;

import org.springframework.stereotype.Repository;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.model.zahtev.Zahtev;
import rs.ac.uns.ftn.xml.tim11.xmllib.fuseki.RDFRepository;
import rs.ac.uns.ftn.xml.tim11.xmllib.fuseki.util.RDFDbConnection;

import javax.xml.bind.JAXBException;

@Repository
public class ZahtevRDFRepository extends RDFRepository<Zahtev> {

    //@Value("${xml.zalba-cutanje}")
    private String xmlFilePath = "data/xml/zahtevcir.xml";

    //@Value("${rdf.zalba-cutanje}")
    private String rdfFilePath = "gen/zahtevcir.rdf";

    private final String NAMED_GRAPH = "/zahtev/metadata";

    public ZahtevRDFRepository(
            RDFDbConnection connection
    ) throws JAXBException {
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

    @Override
    protected String contextPath() {
        return Zahtev.class.getPackage().getName();
    }

}
