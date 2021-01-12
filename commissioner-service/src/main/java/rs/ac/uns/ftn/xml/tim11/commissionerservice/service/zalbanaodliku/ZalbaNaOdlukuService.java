package rs.ac.uns.ftn.xml.tim11.commissionerservice.service.zalbanaodliku;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.xmldb.api.base.XMLDBException;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.model.zalbanaodluku.ZalbaNaOdluku;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.repository.rdf.ZalbaNaOdlukuRDFRepository;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.repository.xml.ZalbaNaOdlukuXmlRepository;
import rs.ac.uns.ftn.xml.tim11.xmllib.exist.exception.XmlResourceNotFoundException;

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

    public ZalbaNaOdluku findXmlById(Long id ) throws XMLDBException, JAXBException, XmlResourceNotFoundException {
        return xmlRepository.findById(id).orElseThrow( () -> new XmlResourceNotFoundException(String.format("Entity with %d not found", id)));
    }

    public void findRdf(){
        rdfRepository.read();
    }

    public void update(Long id, ZalbaNaOdluku entity) throws XMLDBException, XmlResourceNotFoundException, JAXBException {
        xmlRepository.update(id, entity);
    }

    public void delete(Long id) throws XMLDBException, XmlResourceNotFoundException {
        xmlRepository.deleteById(id);
    }
}
