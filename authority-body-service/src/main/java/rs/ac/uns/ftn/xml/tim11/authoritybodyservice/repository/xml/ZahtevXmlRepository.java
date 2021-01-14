package rs.ac.uns.ftn.xml.tim11.authoritybodyservice.repository.xml;


import org.springframework.stereotype.Repository;
import org.xml.sax.SAXException;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.model.zahtev.Zahtev;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.util.ZahtevProperties;
import rs.ac.uns.ftn.xml.tim11.xmllib.exist.XmlRepository;
import rs.ac.uns.ftn.xml.tim11.xmllib.exist.util.DbConnection;

import javax.xml.bind.JAXBException;

@Repository
public class ZahtevXmlRepository extends XmlRepository<Zahtev> {

    public ZahtevXmlRepository(DbConnection dbConnection, ZahtevProperties properties)
            throws JAXBException, SAXException {
        super(dbConnection, properties);
    }

}
