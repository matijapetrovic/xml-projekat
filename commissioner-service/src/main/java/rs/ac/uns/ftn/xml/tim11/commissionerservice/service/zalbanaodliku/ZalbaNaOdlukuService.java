package rs.ac.uns.ftn.xml.tim11.commissionerservice.service.zalbanaodliku;

import org.apache.fop.apps.FOPException;
import org.springframework.stereotype.Service;
import org.xml.sax.SAXException;
import org.xmldb.api.base.XMLDBException;

import rs.ac.uns.ftn.xml.tim11.commissionerservice.model.zalbanaodluku.ZalbaNaOdluku;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.repository.rdf.ZalbaNaOdlukuRDFRepository;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.repository.xml.ZalbaNaOdlukuXmlRepository;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.util.ZalbaNaOdlukuProperties;
import rs.ac.uns.ftn.xml.tim11.xmllib.exist.exception.XmlResourceNotFoundException;
import rs.ac.uns.ftn.xml.tim11.xmllib.jaxb.JaxbMarshaller;
import rs.ac.uns.ftn.xml.tim11.xmllib.xslfo.XSLTransformer;

import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.UUID;

@Service
public class ZalbaNaOdlukuService {
    private final ZalbaNaOdlukuRDFRepository rdfRepository;
    private final ZalbaNaOdlukuXmlRepository xmlRepository;
    private final JaxbMarshaller<ZalbaNaOdluku> marshaller;
    private final ZalbaNaOdlukuProperties properties;

    private final XSLTransformer XSLTransformer;
    
    public ZalbaNaOdlukuService(ZalbaNaOdlukuRDFRepository rdfRepository, ZalbaNaOdlukuXmlRepository xmlRepository, ZalbaNaOdlukuProperties properties)
            throws JAXBException, SAXException, IOException {
        this.rdfRepository = rdfRepository;
        this.xmlRepository = xmlRepository;
        this.properties = properties;
        this.marshaller = new JaxbMarshaller<>(properties);
        this.XSLTransformer = new XSLTransformer(properties);
    }

    public Long create(ZalbaNaOdluku entity) throws JAXBException, XMLDBException, IOException, TransformerException {
    	long id = Math.abs(UUID.randomUUID().getLeastSignificantBits());
        entity.setAbout(properties.namespace() + "/" + id);
    	Long createdId = xmlRepository.create(entity);
        rdfRepository.saveMetadata(entity);
        return createdId;
    }
    
    public ZalbaNaOdluku findById(Long id ) throws XMLDBException, JAXBException, XmlResourceNotFoundException, FileNotFoundException {
    	//return xmlRepository.findById(id).orElseThrow( () -> new XmlResourceNotFoundException(String.format("Entity with %d not found", id)));
        return marshaller.unmarshal(new FileInputStream(new File("data/xml/zalbanaodluku1.xml")));
    }
    public ZalbaNaOdluku getExampleDocument() throws FileNotFoundException, JAXBException {
        return marshaller.unmarshal(new FileInputStream(new File("data/xml/zalbanaodluku1.xml")));
    }
    
    public byte[] generatePdf(Long id) throws XMLDBException, JAXBException, XmlResourceNotFoundException, TransformerException, FOPException, FileNotFoundException {
//      Zahtev obavestenje = xmlRepository.findById(id)
//              .orElseThrow( () -> new XmlResourceNotFoundException(String.format("Entity with %d not found",id)));
    	ZalbaNaOdluku zahtev = marshaller.unmarshal(new FileInputStream(new File("data/xml/zalbanaodluku1.xml")));
      ByteArrayOutputStream out = new ByteArrayOutputStream();
      this.marshaller.marshal(zahtev, out);
      return XSLTransformer.generatePdf(new ByteArrayInputStream(out.toByteArray()));
  }

  public byte[] generateXHtml(Long id) throws XMLDBException, JAXBException, XmlResourceNotFoundException, TransformerException, SAXException, IOException, ParserConfigurationException {
//      Zahtev obavestenje = xmlRepository.findById(id)
//              .orElseThrow( () -> new XmlResourceNotFoundException(String.format("Entity with %d not found",id)));
	  ZalbaNaOdluku zahtev = marshaller.unmarshal(new FileInputStream(new File("data/xml/zalbanaodluku1.xml")));
      ByteArrayOutputStream out = new ByteArrayOutputStream();
      this.marshaller.marshal(zahtev, out);
      return XSLTransformer.generateXHtml(new ByteArrayInputStream(out.toByteArray()));
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
