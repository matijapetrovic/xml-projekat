package rs.ac.uns.ftn.xml.tim11.commissionerservice.repository.rdf;

import org.springframework.stereotype.Repository;
import org.xml.sax.SAXException;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.model.zalbacutanje.ZalbaCutanje;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.util.ZalbaCutanjeProperties;
import rs.ac.uns.ftn.xml.tim11.xmllib.fuseki.RDFRepository;
import rs.ac.uns.ftn.xml.tim11.xmllib.fuseki.util.RDFDbConnection;

import javax.xml.bind.JAXBException;

@Repository
public class ZalbaCutanjeRDFRepository extends RDFRepository<ZalbaCutanje> {

    public ZalbaCutanjeRDFRepository(RDFDbConnection connection, ZalbaCutanjeProperties properties)
            throws JAXBException, SAXException {
        super(connection, properties);
    }
}
