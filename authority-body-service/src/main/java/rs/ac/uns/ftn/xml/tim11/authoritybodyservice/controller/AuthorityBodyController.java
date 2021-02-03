package rs.ac.uns.ftn.xml.tim11.authoritybodyservice.controller;

import lombok.RequiredArgsConstructor;
import org.apache.fop.apps.FOPException;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.xml.sax.SAXException;
import org.xmldb.api.base.XMLDBException;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.model.obavestenje.Obavestenje;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.model.zahtev.Zahtev;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.service.obavestenje.ObavestenjeService;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.service.zahtev.ZahtevService;
import rs.ac.uns.ftn.xml.tim11.xmllib.exist.exception.XmlResourceNotFoundException;

import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.FileNotFoundException;
import java.io.IOException;

@RequiredArgsConstructor
@RestController
@RequestMapping(value="", produces = MediaType.APPLICATION_XML_VALUE)
public class AuthorityBodyController {

    private final ObavestenjeService obavestenjeService;
    private final ZahtevService zahtevService;

    @PostMapping("/zahtev")
    public ResponseEntity<Void> addXMLZahtev(@RequestBody Zahtev enitity) throws XMLDBException, IOException, TransformerException, JAXBException {
        zahtevService.create(enitity);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/zahtev")
    public ResponseEntity<Zahtev> findXMLZahtevById(Long id) throws XMLDBException, JAXBException, XmlResourceNotFoundException {
        return ResponseEntity.ok(zahtevService.findXmlById(id));
    }

    @GetMapping("/obavestenje/example")
    public ResponseEntity<Obavestenje> getExampleObavestenje() throws FileNotFoundException, JAXBException {
        return ResponseEntity.ok(obavestenjeService.getExampleDocument());
    }

    @PostMapping("/obavestenje")
    public ResponseEntity<Void> addXMLObavestenje(@RequestBody Obavestenje enitity) throws XMLDBException, TransformerException, JAXBException {
        obavestenjeService.create(enitity);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/obavestenje/{id}")
    public ResponseEntity<Obavestenje> findXMLObavestenjeById(@PathVariable Long id) throws XMLDBException, JAXBException, XmlResourceNotFoundException {
        return ResponseEntity.ok(obavestenjeService.findXmlById(id));
    }

    @GetMapping(value = "/obavestenje/{id}", produces = MediaType.APPLICATION_PDF_VALUE)
    public ResponseEntity<byte[]> generatePdfDocument(@PathVariable Long id)
            throws XMLDBException, TransformerException, FOPException, XmlResourceNotFoundException, JAXBException, FileNotFoundException {
        return ResponseEntity.ok(obavestenjeService.generatePdf(id));
    }

    @GetMapping(value = "/obavestenje/{id}", produces = MediaType.APPLICATION_XHTML_XML_VALUE)
    public ResponseEntity<byte[]> generateXHtmlDocument(@PathVariable Long id)
            throws XMLDBException, TransformerException, SAXException, XmlResourceNotFoundException, JAXBException, IOException, ParserConfigurationException {
        return ResponseEntity.ok(obavestenjeService.generateXHtml(id));
    }
}
