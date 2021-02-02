package rs.ac.uns.ftn.xml.tim11.authoritybodyservice.service.obavestenje;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.xmldb.api.base.XMLDBException;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.model.obavestenje.Obavestenje;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.repository.rdf.ObavestenjeRDFRepository;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.repository.xml.ObavestenjeXmlRepository;
import rs.ac.uns.ftn.xml.tim11.xmllib.exist.exception.XmlResourceNotFoundException;

import javax.xml.bind.JAXBException;
import javax.xml.transform.TransformerException;
import java.io.IOException;

@Service
@RequiredArgsConstructor
public class ObavestenjeService {

    private final ObavestenjeRDFRepository rdfRepository;
    private final ObavestenjeXmlRepository xmlRepository;

    public Long create(Obavestenje obavestenje) throws JAXBException, XMLDBException, IOException, TransformerException {
        Long createdId = xmlRepository.create(obavestenje);
        rdfRepository.saveMetadata(obavestenje);
        return createdId;
    }

    public Obavestenje findXmlById(Long id ) throws XMLDBException, JAXBException, XmlResourceNotFoundException {
        return xmlRepository.findById(id).orElseThrow( () -> new XmlResourceNotFoundException(String.format("Entity with %d not found",id)));
    }

    public Obavestenje findXmlByNumber(String number) throws XMLDBException, JAXBException, XmlResourceNotFoundException {
        return xmlRepository.findByNumber(number).orElseThrow( () -> new XmlResourceNotFoundException(String.format("Entity with %s not found", number)) );
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
