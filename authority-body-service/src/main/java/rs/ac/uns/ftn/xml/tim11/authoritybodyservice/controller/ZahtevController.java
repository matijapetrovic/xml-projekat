package rs.ac.uns.ftn.xml.tim11.authoritybodyservice.controller;

import lombok.RequiredArgsConstructor;

import org.apache.fop.apps.FOPException;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.xml.sax.SAXException;
import org.xmldb.api.base.XMLDBException;

import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.controller.dto.ZahtevListDTO;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.controller.requests.RejectZahtevRequest;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.controller.requests.ZahtevMetadataSearchRequest;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.model.zahtev.Zahtev;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.service.zahtev.ZahtevService;
import rs.ac.uns.ftn.xml.tim11.xmllib.exist.exception.XmlResourceNotFoundException;

import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import java.io.FileNotFoundException;
import java.io.IOException;

@RequiredArgsConstructor
@RestController
@RequestMapping(value="/zahtev", produces = MediaType.APPLICATION_XML_VALUE)
public class ZahtevController {
    private final ZahtevService zahtevService;

    @GetMapping("")
    public ResponseEntity<ZahtevListDTO> getAll() throws XMLDBException, JAXBException {
        ZahtevListDTO response = new ZahtevListDTO();
        response.setZahtev(zahtevService.findAll());
        return ResponseEntity.ok(response);
    }
    
    @PostMapping("/search/metadata")
    public ResponseEntity<ZahtevListDTO> searchMetadata(@RequestBody ZahtevMetadataSearchRequest request) throws XMLDBException, IOException {
    	ZahtevListDTO response = new ZahtevListDTO();
        response.setZahtev(zahtevService.searchMetadata(request));
        return ResponseEntity.ok(response);
    }

    @GetMapping("/example")
    public ResponseEntity<Zahtev> getExample() throws FileNotFoundException, JAXBException {
        return ResponseEntity.ok(zahtevService.getExampleDocument());
    }
    
    @PostMapping(value = "", consumes = MediaType.APPLICATION_XML_VALUE)
    @PreAuthorize("hasRole('ROLE_USER')")
    public ResponseEntity<Void> addXMLZahtev(@RequestBody Zahtev zahtev) throws XMLDBException, IOException, TransformerException, JAXBException {
        zahtevService.create(zahtev);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PostMapping(value = "/{id}/reject", consumes = MediaType.APPLICATION_XML_VALUE)
    @PreAuthorize("hasRole('ROLE_AUTHORITY_BODY')")
    public ResponseEntity<Void> rejectZahtev(@PathVariable(value="id") long id, @RequestBody RejectZahtevRequest request) throws XMLDBException, IOException, XmlResourceNotFoundException, JAXBException {
        zahtevService.rejectZahtev(id, request);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Zahtev> findXMLZahtevById(@PathVariable Long id) throws XMLDBException, JAXBException, XmlResourceNotFoundException, FileNotFoundException {
        return ResponseEntity.ok(zahtevService.findById(id));
    }
    
    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_PDF_VALUE)
    public ResponseEntity<byte[]> generatePdfDocument(@PathVariable Long id)
            throws XMLDBException, TransformerException, FOPException, XmlResourceNotFoundException, JAXBException, FileNotFoundException {
        return ResponseEntity.ok(zahtevService.generatePdf(id));
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_XHTML_XML_VALUE)
    public ResponseEntity<byte[]> generateXHtmlDocument(@PathVariable Long id)
            throws XMLDBException, TransformerException, SAXException, XmlResourceNotFoundException, JAXBException, IOException, ParserConfigurationException {
        return ResponseEntity.ok(zahtevService.generateXHtml(id));
    }
}
