package rs.ac.uns.ftn.xml.tim11.commissionerservice.service;

import lombok.RequiredArgsConstructor;
import org.xmldb.api.base.XMLDBException;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.exception.EntityNotFoundException;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.model.obavestenje.Obavestenje;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.repository.ObavestenjeRDFRepository;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.repository.ObavestenjeXmlRepository;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.repository.RDFRepository;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.repository.XmlRepository;

import javax.xml.bind.JAXBException;
import javax.xml.transform.TransformerException;
import java.io.IOException;

@org.springframework.stereotype.Service
@RequiredArgsConstructor
public class Service<T> {

    private RDFRepository rdfRepository;
    private XmlRepository<T> xmlRepository;

    public Long create(T t) throws JAXBException, XMLDBException, IOException, TransformerException {
        Long createdId = xmlRepository.create(t);
        rdfRepository.create();
        return createdId;
    }

    public T findXmlById(Long id ) throws XMLDBException, JAXBException, EntityNotFoundException {
        T found = xmlRepository.findById(id).orElseThrow( () -> new EntityNotFoundException(String.format("Entity with %d not found",id)));
        return found;
    }

    public void findRdf(){
        rdfRepository.read();
    }

    public void update(Long id, T entity) throws XMLDBException, EntityNotFoundException, JAXBException {
        xmlRepository.update(id, entity);
    }

    public void delete(Long id) throws XMLDBException, EntityNotFoundException {
        xmlRepository.deleteById(id);
    }
}
