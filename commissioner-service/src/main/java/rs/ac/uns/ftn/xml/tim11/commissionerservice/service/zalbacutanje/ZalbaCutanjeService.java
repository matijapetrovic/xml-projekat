package rs.ac.uns.ftn.xml.tim11.commissionerservice.service.zalbacutanje;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.xmldb.api.base.XMLDBException;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.model.zalbacutanje.ZalbaCutanje;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.repository.rdf.ZalbaCutanjeRDFRepository;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.repository.xml.ZalbaCutanjeXmlRepository;
import rs.ac.uns.ftn.xml.tim11.xmllib.exist.exception.XmlResourceNotFoundException;

import javax.xml.bind.JAXBException;
import javax.xml.transform.TransformerException;
import java.io.IOException;

@Service
@RequiredArgsConstructor
public class ZalbaCutanjeService {
    private final ZalbaCutanjeRDFRepository rdfRepository;
    private final ZalbaCutanjeXmlRepository xmlRepository;

    public Long create(ZalbaCutanje entity) throws JAXBException, XMLDBException, IOException, TransformerException {
        Long createdId = xmlRepository.create(entity);
        rdfRepository.saveMetadata(entity);
        return createdId;
    }

    public ZalbaCutanje findXmlById(Long id ) throws XMLDBException, JAXBException, XmlResourceNotFoundException {
        return xmlRepository.findById(id).orElseThrow( () -> new XmlResourceNotFoundException(String.format("Entity with %d not found", id)));
    }

    public void findRdf(){
        rdfRepository.read();
    }

    public void update(Long id, ZalbaCutanje entity) throws XMLDBException, XmlResourceNotFoundException, JAXBException {
        xmlRepository.update(id, entity);
    }

    public void delete(Long id) throws XMLDBException, XmlResourceNotFoundException {
        xmlRepository.deleteById(id);
    }
}
