package rs.ac.uns.ftn.xml.tim11.authoritybodyservice.controller;

import lombok.RequiredArgsConstructor;
import org.apache.fop.apps.FOPException;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.xml.sax.SAXException;
import org.xmldb.api.base.XMLDBException;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.controller.dto.ObavestenjeListDTO;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.controller.dto.ZahtevListDTO;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.controller.requests.ObavestenjeMetadataSearchRequest;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.model.obavestenje.Obavestenje;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.service.obavestenje.ObavestenjeService;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.util.properties.ObavestenjeProperties;
import rs.ac.uns.ftn.xml.tim11.xmllib.exist.exception.XmlResourceNotFoundException;
import rs.ac.uns.ftn.xml.tim11.xmllib.jaxb.JaxbMarshaller;

import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping(value="/obavestenje", produces = MediaType.APPLICATION_XML_VALUE)
public class ObavestenjeController {
    private final ObavestenjeService obavestenjeService;
    private final ObavestenjeProperties properties;

    @GetMapping("/search/metadata")
    public ResponseEntity<ObavestenjeListDTO> searchMetadata(@RequestBody ObavestenjeMetadataSearchRequest request) throws XMLDBException, IOException {
        ObavestenjeListDTO response = new ObavestenjeListDTO();
        response.setObavestenje(obavestenjeService.searchMetadata(request));
        return ResponseEntity.ok(response);
    }

    @GetMapping("/example")
    public ResponseEntity<String> getExample() throws FileNotFoundException, JAXBException, SAXException {
        String res = new JaxbMarshaller<Obavestenje>(properties).marshal(obavestenjeService.getExampleDocument());
        return ResponseEntity.ok(res);
    }

    @PostMapping("")
    public ResponseEntity<Void> add(@RequestParam(value = "zahtevId") long zahtevId, @RequestBody Obavestenje obavestenje) throws XMLDBException, TransformerException, JAXBException, IOException, SAXException, ParserConfigurationException, XmlResourceNotFoundException {
        obavestenjeService.create(zahtevId, obavestenje);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Obavestenje> get(@PathVariable Long id) throws XMLDBException, JAXBException, XmlResourceNotFoundException, FileNotFoundException {
        return ResponseEntity.ok(obavestenjeService.findById(id));
    }

    @GetMapping("/")
    public ResponseEntity<Obavestenje> getAll() throws XMLDBException, JAXBException, XmlResourceNotFoundException, FileNotFoundException {
        return ResponseEntity.ok(obavestenjeService.getExampleDocument());
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_PDF_VALUE)
    public ResponseEntity<byte[]> generatePdfDocument(@PathVariable Long id)
            throws XMLDBException, TransformerException, FOPException, XmlResourceNotFoundException, JAXBException, FileNotFoundException {
        return ResponseEntity.ok(obavestenjeService.generatePdf(id));
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_XHTML_XML_VALUE)
    public ResponseEntity<byte[]> generateXHtmlDocument(@PathVariable Long id)
            throws XMLDBException, TransformerException, SAXException, XmlResourceNotFoundException, JAXBException, IOException, ParserConfigurationException {
        return ResponseEntity.ok(obavestenjeService.generateXHtml(id));
    }
}
