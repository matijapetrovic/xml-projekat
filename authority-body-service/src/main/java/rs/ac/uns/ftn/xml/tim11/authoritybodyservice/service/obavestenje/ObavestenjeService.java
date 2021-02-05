package rs.ac.uns.ftn.xml.tim11.authoritybodyservice.service.obavestenje;

import org.apache.fop.apps.FOPException;
import org.springframework.stereotype.Service;
import org.xml.sax.SAXException;
import org.xmldb.api.base.XMLDBException;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.controller.requests.ObavestenjeMetadataSearchRequest;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.core.AuthenticationService;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.model.obavestenje.Obavestenje;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.model.user.Account;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.repository.rdf.ObavestenjeRDFRepository;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.repository.xml.ObavestenjeXmlRepository;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.util.properties.ObavestenjeProperties;
import rs.ac.uns.ftn.xml.tim11.xmllib.exist.exception.XmlResourceNotFoundException;
import rs.ac.uns.ftn.xml.tim11.xmllib.fuseki.queries.QueryBuilder;
import rs.ac.uns.ftn.xml.tim11.xmllib.jaxb.JaxbMarshaller;
import rs.ac.uns.ftn.xml.tim11.xmllib.xslfo.XSLTransformer;

import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class ObavestenjeService {

    private final ObavestenjeRDFRepository rdfRepository;
    private final ObavestenjeXmlRepository xmlRepository;
    private final JaxbMarshaller<Obavestenje> marshaller;

    private final ObavestenjeProperties properties;
    private final XSLTransformer XSLTransformer;

    public ObavestenjeService(
            ObavestenjeRDFRepository rdfRepository,
            ObavestenjeXmlRepository xmlRepository,
            ObavestenjeProperties properties,
            AuthenticationService authenticationService)
            throws JAXBException, SAXException, IOException {
        this.rdfRepository = rdfRepository;
        this.xmlRepository = xmlRepository;
        this.properties = properties;
        this.marshaller = new JaxbMarshaller<>(properties);
        this.XSLTransformer = new XSLTransformer(properties);
    }

    public Long create(Obavestenje obavestenje) throws JAXBException, XMLDBException, TransformerException, IOException {
        long id = Math.abs(UUID.randomUUID().getLeastSignificantBits());
        String self = properties.namespace() + "/" + id;
        obavestenje.setAbout(self);
        obavestenje.getPodnosilacZahteva().setHref("http://placholder/gradjanin/123");
        obavestenje.getOrgan().setHref("http://placholder/organ/123");
        xmlRepository.createWithId(obavestenje, id);
        rdfRepository.saveMetadata(obavestenje);
        return id;
    }

    public Obavestenje findById(Long id ) throws XMLDBException, JAXBException, XmlResourceNotFoundException, FileNotFoundException {
//        return xmlRepository.findById(id).orElseThrow( () -> new XmlResourceNotFoundException(String.format("Entity with %d not found",id)));
        return marshaller.unmarshal(new FileInputStream(new File("data/xml/obavestenje1.xml")));
    }

    public Obavestenje findXmlByNumber(String number) throws XMLDBException, JAXBException, XmlResourceNotFoundException {
        return xmlRepository.findByNumber(number).orElseThrow( () -> new XmlResourceNotFoundException(String.format("Entity with %s not found", number)) );
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

    public List<Obavestenje> searchMetadata(ObavestenjeMetadataSearchRequest request) throws XMLDBException, IOException {
        QueryBuilder queryBuilder = new QueryBuilder(properties.namedGraph(), "obavestenje");
        if(request.getImePodnosioca() != null)
            queryBuilder = queryBuilder.addParam("imePodnosioca", request.getImePodnosioca());
        if(request.getPrezimePodnosioca() != null)
            queryBuilder = queryBuilder.addParam("prezimePodnosioca", request.getPrezimePodnosioca());
        if(request.getNazivOrganaVlasti() != null)
            queryBuilder = queryBuilder.addParam("nazivOrganaVlasti", request.getNazivOrganaVlasti());
        if(request.getPodnesenoDatuma() != null)
            queryBuilder = queryBuilder.addParam("podnesenoDatuma", request.getPodnesenoDatuma());

        String query = queryBuilder.build();
        System.out.println(query);
        List<String> ids = rdfRepository.query(query);
        return xmlRepository.findAllByIds(ids);
    }
}
