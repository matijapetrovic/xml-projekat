package rs.ac.uns.ftn.xml.tim11.commissionerservice.repository.xml;

import org.springframework.stereotype.Repository;
import org.xml.sax.SAXException;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.model.zalbacutanje.ZalbaCutanje;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.util.ZalbaCutanjeProperties;
import rs.ac.uns.ftn.xml.tim11.xmllib.exist.XmlRepository;
import rs.ac.uns.ftn.xml.tim11.xmllib.exist.util.DbConnection;

import javax.xml.bind.JAXBException;

@Repository
public class ZalbaCutanjeXmlRepository extends XmlRepository<ZalbaCutanje> {

    public ZalbaCutanjeXmlRepository(DbConnection dbConnection, ZalbaCutanjeProperties properties)
            throws JAXBException, SAXException {
        super(dbConnection, properties);
    }
}
