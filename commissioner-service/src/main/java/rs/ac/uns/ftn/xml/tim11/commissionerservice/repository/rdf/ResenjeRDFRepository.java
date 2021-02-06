package rs.ac.uns.ftn.xml.tim11.commissionerservice.repository.rdf;

import org.springframework.stereotype.Repository;
import org.xml.sax.SAXException;
import rs.ac.uns.ftn.xml.tim11.xmllib.model.resenje.Resenje;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.util.ResenjeProperties;
import rs.ac.uns.ftn.xml.tim11.xmllib.fuseki.RDFRepository;
import rs.ac.uns.ftn.xml.tim11.xmllib.fuseki.util.RDFDbConnection;

import javax.xml.bind.JAXBException;

@Repository
public class ResenjeRDFRepository extends RDFRepository<Resenje> {

    public ResenjeRDFRepository(RDFDbConnection connection, ResenjeProperties properties)
            throws JAXBException, SAXException {
        super(connection, properties);
    }

}
