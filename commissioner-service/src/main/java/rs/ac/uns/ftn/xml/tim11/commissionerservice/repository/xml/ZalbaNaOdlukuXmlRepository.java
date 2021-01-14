package rs.ac.uns.ftn.xml.tim11.commissionerservice.repository.xml;

import org.springframework.stereotype.Repository;
import org.xml.sax.SAXException;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.model.zalbanaodluku.ZalbaNaOdluku;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.util.ZalbaNaOdlukuProperties;
import rs.ac.uns.ftn.xml.tim11.xmllib.exist.XmlRepository;
import rs.ac.uns.ftn.xml.tim11.xmllib.exist.util.DbConnection;

import javax.xml.bind.JAXBException;

@Repository
public class ZalbaNaOdlukuXmlRepository extends XmlRepository<ZalbaNaOdluku> {

    public ZalbaNaOdlukuXmlRepository(DbConnection conn, ZalbaNaOdlukuProperties properties)
            throws JAXBException, SAXException {
        super(conn, properties);
    }
}
