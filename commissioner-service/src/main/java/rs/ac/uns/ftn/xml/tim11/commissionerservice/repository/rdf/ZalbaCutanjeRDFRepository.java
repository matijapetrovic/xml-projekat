package rs.ac.uns.ftn.xml.tim11.commissionerservice.repository.rdf;

import org.springframework.stereotype.Repository;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.model.zalbacutanje.ZalbaCutanje;
import rs.ac.uns.ftn.xml.tim11.xmllib.fuseki.RDFRepository;
import rs.ac.uns.ftn.xml.tim11.xmllib.fuseki.util.RDFDbConnection;

import javax.xml.bind.JAXBException;

@Repository
public class ZalbaCutanjeRDFRepository extends RDFRepository<ZalbaCutanje> {

    //@Value("${xml.zalba-cutanje}")
    private String xmlFilePath = "data/xml/zalbacutanjecir.xml";

    //@Value("${rdf.zalba-cutanje}")
    private String rdfFilePath = "gen/zalbacutanjecir.rdf";

    private final String NAMED_GRAPH = "/zalbacutanje/metadata";

    public ZalbaCutanjeRDFRepository(
            RDFDbConnection connection
    ) throws JAXBException {
        super(connection);
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

    @Override
    protected String contextPath() {
        return ZalbaCutanje.class.getPackage().getName();
    }

}
