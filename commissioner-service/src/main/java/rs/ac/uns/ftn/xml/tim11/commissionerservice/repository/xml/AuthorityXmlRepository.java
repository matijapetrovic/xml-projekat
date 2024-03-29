package rs.ac.uns.ftn.xml.tim11.commissionerservice.repository.xml;

import org.springframework.stereotype.Repository;
import org.xml.sax.SAXException;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.model.user.Authority;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.util.AuthorityProperties;
import rs.ac.uns.ftn.xml.tim11.xmllib.exist.XmlRepository;
import rs.ac.uns.ftn.xml.tim11.xmllib.exist.util.DbConnection;

import javax.xml.bind.JAXBException;

@Repository
public class AuthorityXmlRepository extends XmlRepository<Authority> {

    public AuthorityXmlRepository(DbConnection conn, AuthorityProperties properties)
            throws JAXBException, SAXException {
        super(conn, properties);
    }
}