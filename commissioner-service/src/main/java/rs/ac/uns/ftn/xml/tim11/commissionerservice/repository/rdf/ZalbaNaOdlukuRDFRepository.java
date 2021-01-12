package rs.ac.uns.ftn.xml.tim11.commissionerservice.repository.rdf;

import org.springframework.stereotype.Repository;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.model.zalbanaodluku.ZalbaNaOdluku;
import rs.ac.uns.ftn.xml.tim11.xmllib.fuseki.RDFRepository;
import rs.ac.uns.ftn.xml.tim11.xmllib.fuseki.util.RDFDbConnection;

import javax.xml.bind.JAXBException;

@Repository
public class ZalbaNaOdlukuRDFRepository extends RDFRepository<ZalbaNaOdluku> {

    //@Value("${xml.zalba-cutanje}")
    private String xmlFilePath = "data/xml/zalbanaodlukucir.xml";

    //@Value("${rdf.zalba-cutanje}")
    private String rdfFilePath = "gen/zalbanaodlukucir.rdf";

    private final String NAMED_GRAPH = "/zalbanaodluku/metadata";

    public ZalbaNaOdlukuRDFRepository(
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
        return ZalbaNaOdluku.class.getPackage().getName();
    }

}
