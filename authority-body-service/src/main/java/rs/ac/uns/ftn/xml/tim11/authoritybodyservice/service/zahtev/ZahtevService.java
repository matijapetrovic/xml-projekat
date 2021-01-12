package rs.ac.uns.ftn.xml.tim11.authoritybodyservice.service.zahtev;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.xmldb.api.base.XMLDBException;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.model.zahtev.Zahtev;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.repository.rdf.ZahtevRDFRepository;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.repository.xml.ZahtevXmlRepository;
import rs.ac.uns.ftn.xml.tim11.xmllib.exist.exception.XmlResourceNotFoundException;

import javax.xml.bind.JAXBException;
import javax.xml.transform.TransformerException;
import java.io.IOException;

@Service
@RequiredArgsConstructor
public class ZahtevService {
    private final ZahtevRDFRepository rdfRepository;
    private final ZahtevXmlRepository xmlRepository;

    public Long create(Zahtev entity) throws JAXBException, XMLDBException, IOException, TransformerException {
        Long createdId = xmlRepository.create(entity);
        rdfRepository.create();
        return createdId;
    }

    public Zahtev findXmlById(Long id ) throws XMLDBException, JAXBException, XmlResourceNotFoundException {
        return xmlRepository.findById(id).orElseThrow( () -> new XmlResourceNotFoundException(String.format("Entity with %d not found", id)));
    }

    public void findRdf(){
        rdfRepository.read();
    }

    public void update(Long id, Zahtev entity) throws XMLDBException, XmlResourceNotFoundException, JAXBException {
        xmlRepository.update(id, entity);
    }

    public void delete(Long id) throws XMLDBException, XmlResourceNotFoundException {
        xmlRepository.deleteById(id);
    }
}
