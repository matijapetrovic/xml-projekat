package rs.ac.uns.ftn.xml.tim11.authoritybodyservice.repository.xml;

import org.springframework.stereotype.Repository;
import org.xml.sax.SAXException;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.model.obavestenje.Obavestenje;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.util.ObavestenjeProperties;
import rs.ac.uns.ftn.xml.tim11.xmllib.exist.XmlRepository;
import rs.ac.uns.ftn.xml.tim11.xmllib.exist.util.DbConnection;

import javax.xml.bind.JAXBException;

@Repository
public class ObavestenjeXmlRepository extends XmlRepository<Obavestenje> {

    public ObavestenjeXmlRepository(DbConnection conn, ObavestenjeProperties properties)
            throws JAXBException, SAXException {
        super(conn, properties);
    }
}
