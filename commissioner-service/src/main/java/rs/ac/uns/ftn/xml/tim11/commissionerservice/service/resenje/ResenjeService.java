package rs.ac.uns.ftn.xml.tim11.commissionerservice.service.resenje;

import org.springframework.stereotype.Service;
import org.xml.sax.SAXException;
import org.xmldb.api.base.XMLDBException;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.model.resenje.Resenje;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.repository.rdf.ResenjeRDFRepository;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.repository.xml.ResenjeXmlRepository;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.util.ResenjeProperties;
import rs.ac.uns.ftn.xml.tim11.xmllib.exist.exception.XmlResourceNotFoundException;
import rs.ac.uns.ftn.xml.tim11.xmllib.jaxb.JaxbMarshaller;

import javax.xml.bind.JAXBException;
import javax.xml.transform.TransformerException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

@Service
public class ResenjeService {

    private final ResenjeRDFRepository rdfRepository;
    private final ResenjeXmlRepository xmlRepository;
    private final JaxbMarshaller<Resenje> marshaller;

    public ResenjeService(ResenjeRDFRepository rdfRepository, ResenjeXmlRepository xmlRepository, ResenjeProperties properties) throws JAXBException, SAXException {
        this.rdfRepository = rdfRepository;
        this.xmlRepository = xmlRepository;
        this.marshaller = new JaxbMarshaller<>(properties);
    }

    public Long create(Resenje resenje) throws JAXBException, XMLDBException, IOException, TransformerException {
        Long createdId = xmlRepository.create(resenje);
        rdfRepository.saveMetadata(resenje);
        return createdId;
    }

    public Resenje getExampleDocument() throws FileNotFoundException, JAXBException {
        return marshaller.unmarshal(new FileInputStream(new File("data/xml/resenje1.xml")));
    }

    public Resenje findXmlById(Long id ) throws XMLDBException, JAXBException, XmlResourceNotFoundException {
        return xmlRepository.findById(id).orElseThrow( () -> new XmlResourceNotFoundException(String.format("Entity with %d not found", id)));
    }

    public Resenje findXmlByNumber(String number) throws XMLDBException, JAXBException, XmlResourceNotFoundException {
        return xmlRepository.findByNumber(number).orElseThrow( () -> new XmlResourceNotFoundException(String.format("Entity with %s not found", number)));
    }

    public void findRdf(){
        rdfRepository.read();
    }

    public void update(Long id, Resenje entity) throws XMLDBException, XmlResourceNotFoundException, JAXBException {
        xmlRepository.update(id, entity);
    }

    public void delete(Long id) throws XMLDBException, XmlResourceNotFoundException {
        xmlRepository.deleteById(id);
    }
}
