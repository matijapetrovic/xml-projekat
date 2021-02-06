package rs.ac.uns.ftn.xml.tim11.authoritybodyservice.repository.rdf;

import org.springframework.stereotype.Repository;
import org.xml.sax.SAXException;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.model.obavestenje.Obavestenje;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.util.properties.ObavestenjeProperties;
import rs.ac.uns.ftn.xml.tim11.xmllib.fuseki.RDFRepository;
import rs.ac.uns.ftn.xml.tim11.xmllib.fuseki.util.RDFDbConnection;

import javax.xml.bind.JAXBException;

@Repository
public class ObavestenjeRDFRepository extends RDFRepository<Obavestenje> {

    public ObavestenjeRDFRepository(RDFDbConnection connection, ObavestenjeProperties properties)
            throws JAXBException, SAXException {
        super(connection, properties);
    }
}
