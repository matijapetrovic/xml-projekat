package rs.ac.uns.ftn.xml.tim11.authoritybodyservice.service.obavestenje;

import org.apache.fop.apps.FOPException;
import org.springframework.stereotype.Service;
import org.xml.sax.SAXException;
import org.xmldb.api.base.XMLDBException;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.model.obavestenje.Obavestenje;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.repository.rdf.ObavestenjeRDFRepository;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.repository.xml.ObavestenjeXmlRepository;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.util.ObavestenjeProperties;
import rs.ac.uns.ftn.xml.tim11.xmllib.exist.exception.XmlResourceNotFoundException;
import rs.ac.uns.ftn.xml.tim11.xmllib.jaxb.JaxbMarshaller;
import rs.ac.uns.ftn.xml.tim11.xmllib.xslfo.XSLTransformer;

import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.*;

@Service
public class ObavestenjeService {

    private final ObavestenjeRDFRepository rdfRepository;
    private final ObavestenjeXmlRepository xmlRepository;
    private final JaxbMarshaller<Obavestenje> marshaller;

    private final XSLTransformer XSLTransformer;

    public ObavestenjeService(ObavestenjeRDFRepository rdfRepository, ObavestenjeXmlRepository xmlRepository, ObavestenjeProperties properties)
            throws JAXBException, SAXException, IOException {
        this.rdfRepository = rdfRepository;
        this.xmlRepository = xmlRepository;
        this.marshaller = new JaxbMarshaller<>(properties);
        this.XSLTransformer = new XSLTransformer(properties);
    }

    public Long create(Obavestenje obavestenje) throws JAXBException, XMLDBException, TransformerException {
        Long createdId = xmlRepository.create(obavestenje);
        rdfRepository.saveMetadata(obavestenje);
        return createdId;
    }

    public Obavestenje findXmlById(Long id ) throws XMLDBException, JAXBException, XmlResourceNotFoundException {
        return xmlRepository.findById(id).orElseThrow( () -> new XmlResourceNotFoundException(String.format("Entity with %d not found",id)));
    }

    public Obavestenje getExampleDocument() throws FileNotFoundException, JAXBException {
        return marshaller.unmarshal(new FileInputStream(new File("data/xml/obavestenje1.xml")));
    }

    public byte[] generatePdf(Long id) throws XMLDBException, JAXBException, XmlResourceNotFoundException, TransformerException, FOPException, FileNotFoundException {
//        Obavestenje obavestenje = xmlRepository.findById(id)
//                .orElseThrow( () -> new XmlResourceNotFoundException(String.format("Entity with %d not found",id)));
        Obavestenje obavestenje = marshaller.unmarshal(new FileInputStream(new File("data/xml/obavestenje1.xml")));
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        this.marshaller.marshal(obavestenje, out);
        return XSLTransformer.generatePdf(new ByteArrayInputStream(out.toByteArray()));
    }

    public byte[] generateXHtml(Long id) throws XMLDBException, JAXBException, XmlResourceNotFoundException, TransformerException, SAXException, IOException, ParserConfigurationException {
//        Obavestenje obavestenje = xmlRepository.findById(id)
//                .orElseThrow( () -> new XmlResourceNotFoundException(String.format("Entity with %d not found",id)));
        Obavestenje obavestenje = marshaller.unmarshal(new FileInputStream(new File("data/xml/obavestenje1.xml")));
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        this.marshaller.marshal(obavestenje, out);
        return XSLTransformer.generateXHtml(new ByteArrayInputStream(out.toByteArray()));
    }
}
