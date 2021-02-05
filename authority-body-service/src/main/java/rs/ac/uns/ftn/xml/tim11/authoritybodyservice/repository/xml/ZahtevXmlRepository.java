package rs.ac.uns.ftn.xml.tim11.authoritybodyservice.repository.xml;


import org.springframework.stereotype.Repository;
import org.xml.sax.SAXException;
import org.xmldb.api.base.XMLDBException;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.model.user.Account;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.model.zahtev.Zahtev;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.util.properties.ZahtevProperties;
import rs.ac.uns.ftn.xml.tim11.xmllib.exist.XmlRepository;
import rs.ac.uns.ftn.xml.tim11.xmllib.exist.util.DbConnection;

import javax.xml.bind.JAXBException;
import java.util.List;
import java.util.Optional;

@Repository
public class ZahtevXmlRepository extends XmlRepository<Zahtev> {

    public ZahtevXmlRepository(DbConnection dbConnection, ZahtevProperties properties)
            throws JAXBException, SAXException {
        super(dbConnection, properties);
    }

//    public List<Zahtev> findAll(String email) throws XMLDBException, JAXBException {
//        for(Account account: this.findAll()) {
//            if(account.getEmail().equals(email))
//                return Optional.ofNullable(account);
//        }
//        return Optional.empty();
//    }
}
