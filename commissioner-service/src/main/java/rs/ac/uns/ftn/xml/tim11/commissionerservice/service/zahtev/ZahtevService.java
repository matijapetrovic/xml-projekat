package rs.ac.uns.ftn.xml.tim11.commissionerservice.service.zahtev;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.xmldb.api.base.XMLDBException;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.exception.EntityNotFoundException;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.model.zahtev.Zahtev;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.model.zalbacutanje.ZalbaCutanje;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.repository.RDF.ZahtevRDFRepository;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.repository.XML.ZahtevXmlRepository;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.repository.XML.ZalbaCutanjeXmlRepository;

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

    public Zahtev findXmlById(Long id ) throws XMLDBException, JAXBException, EntityNotFoundException {
        Zahtev entity = xmlRepository.findById(id).orElseThrow( () -> new EntityNotFoundException(String.format("Entity with %d not found", id)));
        return entity;
    }

    public void findRdf(){
        rdfRepository.read();
    }

    public void update(Long id, Zahtev entity) throws XMLDBException, EntityNotFoundException, JAXBException {
        xmlRepository.update(id, entity);
    }

    public void delete(Long id) throws XMLDBException, EntityNotFoundException {
        xmlRepository.deleteById(id);
    }
}
