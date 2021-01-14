package rs.ac.uns.ftn.xml.tim11.commissionerservice.repository.xml;

import org.springframework.stereotype.Repository;
import org.xml.sax.SAXException;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.model.resenje.Resenje;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.util.ResenjeProperties;
import rs.ac.uns.ftn.xml.tim11.xmllib.exist.XmlRepository;
import rs.ac.uns.ftn.xml.tim11.xmllib.exist.util.DbConnection;

import javax.xml.bind.JAXBException;

@Repository
public class ResenjeXmlRepository extends XmlRepository<Resenje> {


    public ResenjeXmlRepository(DbConnection conn, ResenjeProperties properties)
            throws JAXBException, SAXException {
        super(conn, properties);
    }
}
