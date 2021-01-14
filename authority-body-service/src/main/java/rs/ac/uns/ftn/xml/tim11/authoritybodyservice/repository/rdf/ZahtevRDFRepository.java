package rs.ac.uns.ftn.xml.tim11.authoritybodyservice.repository.rdf;

import org.springframework.stereotype.Repository;
import org.xml.sax.SAXException;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.model.zahtev.Zahtev;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.util.ZahtevProperties;
import rs.ac.uns.ftn.xml.tim11.xmllib.fuseki.RDFRepository;
import rs.ac.uns.ftn.xml.tim11.xmllib.fuseki.util.RDFDbConnection;

import javax.xml.bind.JAXBException;

@Repository
public class ZahtevRDFRepository extends RDFRepository<Zahtev> {

    public ZahtevRDFRepository(RDFDbConnection connection, ZahtevProperties properties) throws JAXBException, SAXException {
        super(connection, properties);
    }

}
