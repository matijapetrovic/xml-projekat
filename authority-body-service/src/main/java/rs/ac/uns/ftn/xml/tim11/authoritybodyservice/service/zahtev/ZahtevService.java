package rs.ac.uns.ftn.xml.tim11.authoritybodyservice.service.zahtev;

import org.apache.fop.apps.FOPException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.xml.sax.SAXException;
import org.xmldb.api.base.XMLDBException;

import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.controller.requests.RejectZahtevRequest;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.controller.requests.ZahtevMetadataSearchRequest;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.core.AuthenticationService;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.model.user.Account;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.model.zahtev.Zahtev;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.repository.rdf.ZahtevRDFRepository;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.repository.xml.ZahtevXmlRepository;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.util.properties.ZahtevProperties;
import rs.ac.uns.ftn.xml.tim11.xmllib.email.EmailMessage;
import rs.ac.uns.ftn.xml.tim11.xmllib.email.EmailSender;
import rs.ac.uns.ftn.xml.tim11.xmllib.exist.exception.XmlResourceNotFoundException;
import rs.ac.uns.ftn.xml.tim11.xmllib.fuseki.queries.QueryBuilder;
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
import java.util.List;
import java.util.UUID;

@Service
public class ZahtevService {
    private final AuthenticationService authenticationService;

    private final ZahtevRDFRepository rdfRepository;
    private final ZahtevXmlRepository xmlRepository;
    private final JaxbMarshaller<Zahtev> marshaller;
    private final ZahtevProperties properties;

    private final XSLTransformer XSLTransformer;

    private final EmailSender emailSender;

    @Value("${email.service}")
    private String emailService;
    
    public ZahtevService(AuthenticationService authenticationService, ZahtevRDFRepository rdfRepository, ZahtevXmlRepository xmlRepository, ZahtevProperties properties)
            throws JAXBException, SAXException, IOException {
        this.emailSender = new EmailSender();
        this.authenticationService = authenticationService;
        this.rdfRepository = rdfRepository;
        this.xmlRepository = xmlRepository;
        this.properties = properties;
        this.marshaller = new JaxbMarshaller<>(properties);
        this.XSLTransformer = new XSLTransformer(properties);
    }

    public void rejectZahtev(long id, RejectZahtevRequest request) throws XMLDBException, JAXBException, XmlResourceNotFoundException, IOException {
        Zahtev zahtev = xmlRepository.findById(id)
                .orElseThrow( () -> new XmlResourceNotFoundException(String.format("Entity with %d not found",id)));
        zahtev.setPrihvacen(false);
        xmlRepository.createWithId(zahtev, id);

        String mail = zahtev.getTrazilacInformacija().getHref();
        mail = mail.substring(mail.lastIndexOf("/") + 1);

        emailSender.sendEmail(emailService, buildEmail(mail, request.getPoruka()));
    }

    private EmailMessage buildEmail(String userEmail, String poruka) {
        return new EmailMessage(
                userEmail,
                "Odbijen zahtev",
                poruka,
                null,
                null
        );
    }

    public List<Zahtev> findAll() throws XMLDBException, JAXBException {
        Account account = authenticationService.getAuthenticated();
        if(account.hasRole("ROLE_USER"))
            return xmlRepository.findAllByGradjanin(account.getEmail());

        return xmlRepository.findAll();
    }

    public Long create(Zahtev zahtev) throws JAXBException, XMLDBException, IOException, TransformerException {
        Account account = authenticationService.getAuthenticated();
    	long id = Math.abs(UUID.randomUUID().getLeastSignificantBits());

        zahtev.setAbout(properties.namespace() + "/" + id);
        zahtev.getTrazilacInformacija().setHref(
                String.format("http://www.ftn.uns.ac.rs/xml/tim11/gradjanin/%s", account.getEmail()));

        xmlRepository.createWithId(zahtev, id);
        rdfRepository.saveMetadata(zahtev);
        return id;
    }

    public Zahtev findById(Long id ) throws XMLDBException, JAXBException, XmlResourceNotFoundException, FileNotFoundException {
    	return xmlRepository.findById(id).orElseThrow( () -> new XmlResourceNotFoundException(String.format("Entity with %d not found", id)));
    }
    
    public Zahtev getExampleDocument() throws FileNotFoundException, JAXBException {
        return marshaller.unmarshal(new FileInputStream(new File("data/xml/zahtev1.xml")));
    }
    
    public byte[] generatePdf(Long id) throws XMLDBException, JAXBException, XmlResourceNotFoundException, TransformerException, FOPException, FileNotFoundException {
        Zahtev zahtev = xmlRepository.findById(id)
                .orElseThrow( () -> new XmlResourceNotFoundException(String.format("Entity with %d not found",id)));
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        this.marshaller.marshal(zahtev, out);
        return XSLTransformer.generatePdf(new ByteArrayInputStream(out.toByteArray()));
    }

    public byte[] generateXHtml(Long id) throws XMLDBException, JAXBException, XmlResourceNotFoundException, TransformerException, SAXException, IOException, ParserConfigurationException {
        Zahtev zahtev = xmlRepository.findById(id)
              .orElseThrow( () -> new XmlResourceNotFoundException(String.format("Entity with %d not found",id)));
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        this.marshaller.marshal(zahtev, out);
        return XSLTransformer.generateXHtml(new ByteArrayInputStream(out.toByteArray()));
    }
  
  public List<Zahtev> searchMetadata(ZahtevMetadataSearchRequest request) throws XMLDBException, IOException {
      QueryBuilder queryBuilder = new QueryBuilder(properties.namedGraph(), "zahtev");
      if(request.getNazivOrganaVlasti() != null)
          queryBuilder = queryBuilder.addParam("nazivOrganaVlasti", request.getNazivOrganaVlasti());
      if(request.getPodnesenU() != null)
          queryBuilder = queryBuilder.addParam("podnesenU", request.getPodnesenU());
      if(request.getPodnesenDatuma() != null)
          queryBuilder = queryBuilder.addParam("podnesenDatuma", request.getPodnesenDatuma());
      if(request.getImePodnosioca() != null)
          queryBuilder = queryBuilder.addParam("imePodnosioca", request.getImePodnosioca());
      if(request.getPrezimePodnosioca() != null)
          queryBuilder = queryBuilder.addParam("prezimePodnosioca", request.getPrezimePodnosioca());
      
      String query = queryBuilder.build();
      System.out.println(query);
      List<String> ids = rdfRepository.query(query);
      return xmlRepository.findAllByIds(ids);
  }
}
