package rs.ac.uns.ftn.xml.tim11.authoritybodyservice.service.zahtev;

import org.apache.fop.apps.FOPException;
import org.springframework.stereotype.Service;
import org.xml.sax.SAXException;
import org.xmldb.api.base.XMLDBException;

import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.model.zahtev.Zahtev;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.repository.rdf.ZahtevRDFRepository;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.repository.xml.ZahtevXmlRepository;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.util.properties.ZahtevProperties;
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
public class ZahtevService {
    private final ZahtevRDFRepository rdfRepository;
    private final ZahtevXmlRepository xmlRepository;
    private final JaxbMarshaller<Zahtev> marshaller;
    private final ZahtevProperties properties;

    private final XSLTransformer XSLTransformer;
    
    public ZahtevService(ZahtevRDFRepository rdfRepository, ZahtevXmlRepository xmlRepository, ZahtevProperties properties)
            throws JAXBException, SAXException, IOException {
        this.rdfRepository = rdfRepository;
        this.xmlRepository = xmlRepository;
        this.properties = properties;
        this.marshaller = new JaxbMarshaller<>(properties);
        this.XSLTransformer = new XSLTransformer(properties);
    }

    public Long create(Zahtev entity) throws JAXBException, XMLDBException, IOException, TransformerException {
    	long id = Math.abs(UUID.randomUUID().getLeastSignificantBits());
        entity.setAbout(properties.namespace() + "/" + id);
    	Long createdId = xmlRepository.create(entity);
        rdfRepository.saveMetadata(entity);
        return createdId;
    }

    public Zahtev findById(Long id ) throws XMLDBException, JAXBException, XmlResourceNotFoundException, FileNotFoundException {
    	//return xmlRepository.findById(id).orElseThrow( () -> new XmlResourceNotFoundException(String.format("Entity with %d not found", id)));
        return marshaller.unmarshal(new FileInputStream(new File("data/xml/zahtev1.xml")));
    }
    
    public Zahtev getExampleDocument() throws FileNotFoundException, JAXBException {
        return marshaller.unmarshal(new FileInputStream(new File("data/xml/zahtev1.xml")));
    }
    
    public byte[] generatePdf(Long id) throws XMLDBException, JAXBException, XmlResourceNotFoundException, TransformerException, FOPException, FileNotFoundException {
//      Zahtev obavestenje = xmlRepository.findById(id)
//              .orElseThrow( () -> new XmlResourceNotFoundException(String.format("Entity with %d not found",id)));
      Zahtev zahtev = marshaller.unmarshal(new FileInputStream(new File("data/xml/zahtev1.xml")));
      ByteArrayOutputStream out = new ByteArrayOutputStream();
      this.marshaller.marshal(zahtev, out);
      return XSLTransformer.generatePdf(new ByteArrayInputStream(out.toByteArray()));
  }

  public byte[] generateXHtml(Long id) throws XMLDBException, JAXBException, XmlResourceNotFoundException, TransformerException, SAXException, IOException, ParserConfigurationException {
//      Zahtev obavestenje = xmlRepository.findById(id)
//              .orElseThrow( () -> new XmlResourceNotFoundException(String.format("Entity with %d not found",id)));
	  Zahtev zahtev = marshaller.unmarshal(new FileInputStream(new File("data/xml/zahtev1.xml")));
      ByteArrayOutputStream out = new ByteArrayOutputStream();
      this.marshaller.marshal(zahtev, out);
      return XSLTransformer.generateXHtml(new ByteArrayInputStream(out.toByteArray()));
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
