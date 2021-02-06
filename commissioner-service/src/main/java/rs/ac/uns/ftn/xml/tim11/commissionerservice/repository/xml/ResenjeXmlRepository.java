package rs.ac.uns.ftn.xml.tim11.commissionerservice.repository.xml;

import org.springframework.stereotype.Repository;
import org.xml.sax.SAXException;
import org.xmldb.api.base.XMLDBException;
import rs.ac.uns.ftn.xml.tim11.xmllib.model.resenje.Resenje;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.util.ResenjeProperties;
import rs.ac.uns.ftn.xml.tim11.xmllib.exist.XmlRepository;
import rs.ac.uns.ftn.xml.tim11.xmllib.exist.util.DbConnection;

import javax.xml.bind.JAXBException;
import java.util.Optional;

@Repository
public class ResenjeXmlRepository extends XmlRepository<Resenje> {


    public ResenjeXmlRepository(DbConnection conn, ResenjeProperties properties)
            throws JAXBException, SAXException {
        super(conn, properties);
    }

    public Optional<Resenje> findByNumber(String number) throws XMLDBException, JAXBException {
        for(Resenje resenje: this.findAll()) {
            if(resenje.getBrojResenja().equals(number))
                return Optional.ofNullable(resenje);
        }
        return Optional.empty();
    }
}
