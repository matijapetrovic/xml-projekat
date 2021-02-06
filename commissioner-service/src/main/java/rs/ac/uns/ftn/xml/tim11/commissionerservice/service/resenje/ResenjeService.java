package rs.ac.uns.ftn.xml.tim11.commissionerservice.service.resenje;

import lombok.RequiredArgsConstructor;
import org.apache.fop.apps.FOPException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.xml.sax.SAXException;
import org.xmldb.api.base.XMLDBException;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.core.AuthenticationService;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.model.resenje.Resenje;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.model.user.Account;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.repository.rdf.ResenjeRDFRepository;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.repository.xml.ResenjeXmlRepository;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.util.ResenjeProperties;
import rs.ac.uns.ftn.xml.tim11.xmllib.email.EmailSender;
import rs.ac.uns.ftn.xml.tim11.xmllib.exist.exception.XmlResourceNotFoundException;
import rs.ac.uns.ftn.xml.tim11.xmllib.jaxb.JaxbMarshaller;
import rs.ac.uns.ftn.xml.tim11.xmllib.xslfo.XSLTransformer;

import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.*;
import java.util.List;

@Service
public class ResenjeService {
    private final AuthenticationService authenticationService;
    private final ResenjeProperties properties;
    private final ResenjeRDFRepository rdfRepository;
    private final ResenjeXmlRepository xmlRepository;

    private final JaxbMarshaller<Resenje> marshaller;
    private final EmailSender emailSender;
    private final XSLTransformer XSLTransformer;

    @Value("${email.service}")
    private String emailService;

    public ResenjeService(AuthenticationService authenticationService, ResenjeProperties properties, ResenjeRDFRepository rdfRepository, ResenjeXmlRepository xmlRepository) throws JAXBException, SAXException, IOException {
        this.emailSender = new EmailSender();
        this.properties = properties;
        this.rdfRepository = rdfRepository;
        this.xmlRepository = xmlRepository;
        this.marshaller = new JaxbMarshaller<>(properties);
        this.XSLTransformer = new XSLTransformer(properties);
        this.authenticationService = authenticationService;
    }

    public List<Resenje> findAll() throws XMLDBException, JAXBException {
//        Account account = authenticationService.getAuthenticated();
//        if(account.hasRole("ROLE_USER"))
//            return xmlRepository.findAllByGradjanin(account.getEmail());

        return xmlRepository.findAll();
    }

    public Long create(long zahtevId, Resenje resenje) throws JAXBException, XMLDBException, IOException, TransformerException {
        Long createdId = xmlRepository.create(resenje);
        rdfRepository.saveMetadata(resenje);
        return createdId;
    }

    public Resenje getExampleDocument() throws FileNotFoundException, JAXBException {
        return marshaller.unmarshal(new FileInputStream(new File("data/xml/resenje1.xml")));
    }

    public Resenje findXmlById(Long id ) throws XMLDBException, JAXBException, XmlResourceNotFoundException {
        return xmlRepository.findById(id).orElseThrow( () -> new XmlResourceNotFoundException(String.format("Entity with %d not found", id)));
    }

    public byte[] generatePdf(Long id) throws XMLDBException, JAXBException, XmlResourceNotFoundException, TransformerException, FOPException, FileNotFoundException {
        Resenje resenje = xmlRepository.findById(id)
                .orElseThrow( () -> new XmlResourceNotFoundException(String.format("Entity with %d not found",id)));
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        this.marshaller.marshal(resenje, out);
        return XSLTransformer.generatePdf(new ByteArrayInputStream(out.toByteArray()));
    }

    public byte[] generateXHtml(Long id) throws XMLDBException, JAXBException, XmlResourceNotFoundException, TransformerException, SAXException, IOException, ParserConfigurationException {
        Resenje resenje = xmlRepository.findById(id)
                .orElseThrow( () -> new XmlResourceNotFoundException(String.format("Entity with %d not found",id)));
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        this.marshaller.marshal(resenje, out);
        return XSLTransformer.generateXHtml(new ByteArrayInputStream(out.toByteArray()));
    }
}
