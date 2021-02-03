package rs.ac.uns.ftn.xml.tim11.authoritybodyservice.repository.xml;

import org.springframework.stereotype.Repository;
import org.xml.sax.SAXException;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.model.user.User;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.util.UserProperties;
import rs.ac.uns.ftn.xml.tim11.xmllib.exist.XmlRepository;
import rs.ac.uns.ftn.xml.tim11.xmllib.exist.util.DbConnection;

import javax.xml.bind.JAXBException;

@Repository
public class UserXmlRepository extends XmlRepository<User> {

    public UserXmlRepository(DbConnection conn, UserProperties properties)
            throws JAXBException, SAXException {
        super(conn, properties);
    }
}
