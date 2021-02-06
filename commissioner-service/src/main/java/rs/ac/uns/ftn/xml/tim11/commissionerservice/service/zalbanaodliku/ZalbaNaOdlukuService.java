package rs.ac.uns.ftn.xml.tim11.commissionerservice.service.zalbanaodliku;

import org.apache.fop.apps.FOPException;
import org.springframework.stereotype.Service;
import org.xml.sax.SAXException;
import org.xmldb.api.base.XMLDBException;

import rs.ac.uns.ftn.xml.tim11.commissionerservice.controller.requests.ZalbaNaOdlukuMetadataSearchRequest;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.core.AuthenticationService;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.model.user.Account;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.model.zalbanaodluku.ZalbaNaOdluku;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.repository.rdf.ZalbaNaOdlukuRDFRepository;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.repository.xml.ZalbaNaOdlukuXmlRepository;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.util.ZalbaNaOdlukuProperties;
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
public class ZalbaNaOdlukuService {
    private final ZalbaNaOdlukuRDFRepository rdfRepository;
    private final ZalbaNaOdlukuXmlRepository xmlRepository;
    private final JaxbMarshaller<ZalbaNaOdluku> marshaller;
    private final ZalbaNaOdlukuProperties properties;

    private final XSLTransformer XSLTransformer;

    private final AuthenticationService authenticationService;
    
    public ZalbaNaOdlukuService(AuthenticationService authenticationService, ZalbaNaOdlukuRDFRepository rdfRepository, ZalbaNaOdlukuXmlRepository xmlRepository, ZalbaNaOdlukuProperties properties)
            throws JAXBException, SAXException, IOException {
        this.authenticationService = authenticationService;
        this.rdfRepository = rdfRepository;
        this.xmlRepository = xmlRepository;
        this.properties = properties;
        this.marshaller = new JaxbMarshaller<>(properties);
        this.XSLTransformer = new XSLTransformer(properties);
    }

    public List<ZalbaNaOdluku> findAll() throws XMLDBException, JAXBException {
        Account account = authenticationService.getAuthenticated();
        if(account.hasRole("ROLE_USER"))
            return xmlRepository.findAllByGradjanin(account.getEmail());

        return xmlRepository.findAll();
    }

    public Long create(long zahtevId, ZalbaNaOdluku zalba) throws JAXBException, XMLDBException, IOException, TransformerException {
        Account account = authenticationService.getAuthenticated();

        long id = Math.abs(UUID.randomUUID().getLeastSignificantBits());
        zalba.setAbout(properties.namespace() + "/" + id);
        zalba.getPodnosilacZalbe().setHref(
                String.format("http://www.ftn.uns.ac.rs/xml/tim11/gradjanin/%s", account.getEmail()));
        zalba.setHref("http://www.ftn.uns.ac.rs/xml/tim11/zahtev/" + zahtevId);

        Long createdId = xmlRepository.createWithId(zalba, id);
        rdfRepository.saveMetadata(zalba);
        return createdId;
    }
    
    public ZalbaNaOdluku findById(Long id ) throws XMLDBException, JAXBException, XmlResourceNotFoundException, FileNotFoundException {
        return xmlRepository.findById(id).orElseThrow( () -> new XmlResourceNotFoundException(String.format("Entity with %d not found", id)));
    }
    public ZalbaNaOdluku getExampleDocument() throws FileNotFoundException, JAXBException {
        return marshaller.unmarshal(new FileInputStream(new File("data/xml/zalbanaodluku1.xml")));
    }
    
    public byte[] generatePdf(Long id) throws XMLDBException, JAXBException, XmlResourceNotFoundException, TransformerException, FOPException, FileNotFoundException {
      ZalbaNaOdluku zalba = xmlRepository.findById(id)
              .orElseThrow( () -> new XmlResourceNotFoundException(String.format("Entity with %d not found",id)));

      ByteArrayOutputStream out = new ByteArrayOutputStream();
      this.marshaller.marshal(zalba, out);
      return XSLTransformer.generatePdf(new ByteArrayInputStream(out.toByteArray()));
  }

  public byte[] generateXHtml(Long id) throws XMLDBException, JAXBException, XmlResourceNotFoundException, TransformerException, SAXException, IOException, ParserConfigurationException {
      ZalbaNaOdluku zalba = xmlRepository.findById(id)
              .orElseThrow( () -> new XmlResourceNotFoundException(String.format("Entity with %d not found",id)));
      ByteArrayOutputStream out = new ByteArrayOutputStream();
      this.marshaller.marshal(zalba, out);
      return XSLTransformer.generateXHtml(new ByteArrayInputStream(out.toByteArray()));
  }
  
  public List<ZalbaNaOdluku> searchMetadata(ZalbaNaOdlukuMetadataSearchRequest request) throws XMLDBException, IOException {
      QueryBuilder queryBuilder = new QueryBuilder(properties.namedGraph(), "zalba-odluka");
      if(request.getImePodnosioca() != null)
          queryBuilder = queryBuilder.addParam("imePodnosioca", request.getImePodnosioca());
      if(request.getPrezimePodnosioca() != null)
          queryBuilder = queryBuilder.addParam("prezimePodnosioca", request.getPrezimePodnosioca());
      if(request.getNazivOrganaVlasti() != null)
          queryBuilder = queryBuilder.addParam("nazivOrganaVlasti", request.getNazivOrganaVlasti());
      if(request.getPodnesenDatuma() != null)
          queryBuilder = queryBuilder.addParam("podnesenoDatuma", request.getPodnesenDatuma());
      if(request.getPodnesenU() != null)
          queryBuilder = queryBuilder.addParam("podnesenoU", request.getPodnesenU());

      String query = queryBuilder.build();
      System.out.println(query);
      List<String> ids = rdfRepository.query(query);
      return xmlRepository.findAllByIds(ids);
  }
}
