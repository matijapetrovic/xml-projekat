package rs.ac.uns.ftn.xml.tim11.commissionerservice.repository.rdf;

import org.springframework.stereotype.Repository;
import org.xml.sax.SAXException;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.model.zalbanaodluku.ZalbaNaOdluku;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.util.ZalbaNaOdlukuProperties;
import rs.ac.uns.ftn.xml.tim11.xmllib.fuseki.RDFRepository;
import rs.ac.uns.ftn.xml.tim11.xmllib.fuseki.util.RDFDbConnection;

import javax.xml.bind.JAXBException;

@Repository
public class ZalbaNaOdlukuRDFRepository extends RDFRepository<ZalbaNaOdluku> {

    public ZalbaNaOdlukuRDFRepository(RDFDbConnection connection, ZalbaNaOdlukuProperties properties)
            throws JAXBException, SAXException {
        super(connection, properties);
    }
}
