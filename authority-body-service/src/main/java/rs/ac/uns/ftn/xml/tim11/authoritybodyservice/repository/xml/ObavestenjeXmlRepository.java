package rs.ac.uns.ftn.xml.tim11.authoritybodyservice.repository.xml;

import org.springframework.stereotype.Repository;
import org.xml.sax.SAXException;
import org.xmldb.api.base.XMLDBException;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.model.obavestenje.Obavestenje;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.soap.obavestenje.ObavestenjePort;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.util.ObavestenjeProperties;
import rs.ac.uns.ftn.xml.tim11.xmllib.exist.XmlRepository;
import rs.ac.uns.ftn.xml.tim11.xmllib.exist.util.DbConnection;

import javax.xml.bind.JAXBException;
import java.util.Optional;

@Repository
public class ObavestenjeXmlRepository extends XmlRepository<Obavestenje> {

    public ObavestenjeXmlRepository(DbConnection conn, ObavestenjeProperties properties)
            throws JAXBException, SAXException {
        super(conn, properties);
    }

    public Optional<Obavestenje> findByNumber(String number) throws XMLDBException, JAXBException {
        for(Obavestenje obavestenje: this.findAll()) {
            if(obavestenje.getBrojPredmeta().equals(number))
                return Optional.ofNullable(obavestenje);
        }
        return Optional.empty();
    }
}
