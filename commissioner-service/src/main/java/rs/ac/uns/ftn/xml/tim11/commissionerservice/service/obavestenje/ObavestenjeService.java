package rs.ac.uns.ftn.xml.tim11.commissionerservice.service.obavestenje;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.xmldb.api.base.XMLDBException;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.exception.EntityNotFoundException;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.model.obavestenje.Obavestenje;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.repository.ObavestenjeRDFRepository;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.repository.ObavestenjeXmlRepository;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.repository.RDFRepository;

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
        rdfRepository.create();
        return createdId;
    }

    public Obavestenje findXmlById(Long id ) throws XMLDBException, JAXBException, EntityNotFoundException {
        Obavestenje found = xmlRepository.findById(id).orElseThrow( () -> new EntityNotFoundException(String.format("Entity with %d not found",id)));
        return found;
    }

    public void findRdf(){
        rdfRepository.read();
    }

    public void update(Long id, Obavestenje entity) throws XMLDBException, EntityNotFoundException, JAXBException {
        xmlRepository.update(id, entity);
    }

    public void delete(Long id) throws XMLDBException, EntityNotFoundException {
        xmlRepository.deleteById(id);
    }
}
