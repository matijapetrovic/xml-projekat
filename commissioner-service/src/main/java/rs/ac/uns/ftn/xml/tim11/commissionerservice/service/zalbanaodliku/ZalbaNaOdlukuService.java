package rs.ac.uns.ftn.xml.tim11.commissionerservice.service.zalbanaodliku;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.xmldb.api.base.XMLDBException;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.exception.EntityNotFoundException;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.model.zalbanaodluku.ZalbaNaOdluku;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.repository.RDF.ZalbaNaOdlukuRDFRepository;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.repository.XML.ZalbaNaOdlukuXmlRepository;

import javax.xml.bind.JAXBException;
import javax.xml.transform.TransformerException;
import java.io.IOException;

@Service
@RequiredArgsConstructor
public class ZalbaNaOdlukuService {
    private final ZalbaNaOdlukuRDFRepository rdfRepository;
    private final ZalbaNaOdlukuXmlRepository xmlRepository;

    public Long create(ZalbaNaOdluku entity) throws JAXBException, XMLDBException, IOException, TransformerException {
        Long createdId = xmlRepository.create(entity);
        rdfRepository.create();
        return createdId;
    }

    public ZalbaNaOdluku findXmlById(Long id ) throws XMLDBException, JAXBException, EntityNotFoundException {
        ZalbaNaOdluku entity = xmlRepository.findById(id).orElseThrow( () -> new EntityNotFoundException(String.format("Entity with %d not found", id)));
        return entity;
    }

    public void findRdf(){
        rdfRepository.read();
    }

    public void update(Long id, ZalbaNaOdluku entity) throws XMLDBException, EntityNotFoundException, JAXBException {
        xmlRepository.update(id, entity);
    }

    public void delete(Long id) throws XMLDBException, EntityNotFoundException {
        xmlRepository.deleteById(id);
    }
}
