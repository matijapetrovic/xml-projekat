package rs.ac.uns.ftn.xml.tim11.commissionerservice.service.resenje;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.xmldb.api.base.XMLDBException;
import rs.ac.uns.ftn.xml.tim11.xmllib.model.resenje.Resenje;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.repository.rdf.ResenjeRDFRepository;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.repository.xml.ResenjeXmlRepository;
import rs.ac.uns.ftn.xml.tim11.xmllib.exist.exception.XmlResourceNotFoundException;

import javax.xml.bind.JAXBException;
import javax.xml.transform.TransformerException;
import java.io.IOException;

@Service
@RequiredArgsConstructor
public class ResenjeService {

    private final ResenjeRDFRepository rdfRepository;
    private final ResenjeXmlRepository xmlRepository;

    public Long create(Resenje resenje) throws JAXBException, XMLDBException, IOException, TransformerException {
        Long createdId = xmlRepository.create(resenje);
        rdfRepository.saveMetadata(resenje);
        return createdId;
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
