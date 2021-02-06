package rs.ac.uns.ftn.xml.tim11.authoritybodyservice.repository.xml;

import org.springframework.stereotype.Repository;
import org.xml.sax.SAXException;
import org.xmldb.api.base.XMLDBException;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.model.user.Account;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.util.properties.AccountProperties;
import rs.ac.uns.ftn.xml.tim11.xmllib.exist.XmlRepository;
import rs.ac.uns.ftn.xml.tim11.xmllib.exist.util.DbConnection;

import javax.xml.bind.JAXBException;
import java.util.Optional;

@Repository
public class AccountXmlRepository extends XmlRepository<Account> {
    public AccountXmlRepository(DbConnection conn, AccountProperties properties)
            throws JAXBException, SAXException {
        super(conn, properties);
    }

    public Optional<Account> findByEmail(String email) throws XMLDBException, JAXBException {
        for(Account account: this.findAll()) {
            if(account.getEmail().equals(email))
                return Optional.ofNullable(account);
        }
        return Optional.empty();
    }
}
