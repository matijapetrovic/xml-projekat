package rs.ac.uns.ftn.xml.tim11.commissionerservice.service.resenje;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.xmldb.api.base.XMLDBException;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.exception.EntityNotFoundException;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.model.resenje.Resenje;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.repository.RDF.ResenjeRDFRepository;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.repository.XML.ResenjeXmlRepository;

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
        rdfRepository.create();
        return createdId;
    }

    public Resenje findXmlById(Long id ) throws XMLDBException, JAXBException, EntityNotFoundException {
        Resenje found = xmlRepository.findById(id).orElseThrow( () -> new EntityNotFoundException(String.format("Entity with %d not found", id)));
        return found;
    }

    public void findRdf(){
        rdfRepository.read();
    }

    public void update(Long id, Resenje entity) throws XMLDBException, EntityNotFoundException, JAXBException {
        xmlRepository.update(id, entity);
    }

    public void delete(Long id) throws XMLDBException, EntityNotFoundException {
        xmlRepository.deleteById(id);
    }
}
