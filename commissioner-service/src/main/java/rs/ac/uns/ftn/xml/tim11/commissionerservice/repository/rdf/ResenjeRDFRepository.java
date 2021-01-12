package rs.ac.uns.ftn.xml.tim11.commissionerservice.repository.rdf;

import org.springframework.stereotype.Repository;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.model.resenje.Resenje;
import rs.ac.uns.ftn.xml.tim11.xmllib.fuseki.RDFRepository;
import rs.ac.uns.ftn.xml.tim11.xmllib.fuseki.util.RDFDbConnection;

import javax.xml.bind.JAXBException;

@Repository
public class ResenjeRDFRepository extends RDFRepository<Resenje> {

    private String xmlFilePath = "data/xml/resenje.xml";

    //@Value("${rdf.zalba-cutanje}")
    private String rdfFilePath = "gen/resenje.rdf";

    private final String NAMED_GRAPH = "/resenje/metadata";

    public ResenjeRDFRepository(
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
        return Resenje.class.getPackage().getName();
    }

}
