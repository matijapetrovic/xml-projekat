package rs.ac.uns.ftn.xml.tim11.authoritybodyservice.service.obavestenje;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.xml.sax.SAXException;
import org.xmldb.api.base.XMLDBException;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.model.obavestenje.Obavestenje;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.repository.rdf.ObavestenjeRDFRepository;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.repository.xml.ObavestenjeXmlRepository;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.util.ObavestenjeProperties;
import rs.ac.uns.ftn.xml.tim11.xmllib.exist.exception.XmlResourceNotFoundException;
import rs.ac.uns.ftn.xml.tim11.xmllib.jaxb.JaxbMarshaller;

import javax.xml.bind.JAXBException;
import javax.xml.transform.TransformerException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

@Service
public class ObavestenjeService {

    private final ObavestenjeRDFRepository rdfRepository;
    private final ObavestenjeXmlRepository xmlRepository;
    private final JaxbMarshaller<Obavestenje> marshaller;

    public ObavestenjeService(ObavestenjeRDFRepository rdfRepository, ObavestenjeXmlRepository xmlRepository, ObavestenjeProperties properties) throws JAXBException, SAXException {
        this.rdfRepository = rdfRepository;
        this.xmlRepository = xmlRepository;
        this.marshaller = new JaxbMarshaller<>(properties);
    }

    public Long create(Obavestenje obavestenje) throws JAXBException, XMLDBException, TransformerException {
        Long createdId = xmlRepository.create(obavestenje);
        rdfRepository.saveMetadata(obavestenje);
        return createdId;
    }

    public Obavestenje findXmlById(Long id ) throws XMLDBException, JAXBException, XmlResourceNotFoundException {
        return xmlRepository.findById(id).orElseThrow( () -> new XmlResourceNotFoundException(String.format("Entity with %d not found",id)));
    }

    public Obavestenje getExampleDocument() throws FileNotFoundException, JAXBException {
        return marshaller.unmarshal(new FileInputStream(new File("data/xml/obavestenje1.xml")));
    }

    public void findRdf(){
        rdfRepository.read();
    }

    public void update(Long id, Obavestenje entity) throws XMLDBException, XmlResourceNotFoundException, JAXBException {
        xmlRepository.update(id, entity);
    }

    public void delete(Long id) throws XMLDBException, XmlResourceNotFoundException {
        xmlRepository.deleteById(id);
    }
}
