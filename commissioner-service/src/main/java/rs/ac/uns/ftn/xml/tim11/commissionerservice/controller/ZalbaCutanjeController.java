package rs.ac.uns.ftn.xml.tim11.commissionerservice.controller;

import lombok.RequiredArgsConstructor;

import org.apache.fop.apps.FOPException;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.xml.sax.SAXException;
import org.xmldb.api.base.XMLDBException;

import rs.ac.uns.ftn.xml.tim11.commissionerservice.controller.dto.ZalbaNaCutanjeListDTO;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.controller.requests.ZalbaNaCutanjeMetadataSearchRequest;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.model.zalbacutanje.ZalbaCutanje;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.service.zalbacutanje.ZalbaCutanjeService;
import rs.ac.uns.ftn.xml.tim11.xmllib.exist.exception.XmlResourceNotFoundException;

import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import java.io.FileNotFoundException;
import java.io.IOException;

@RequiredArgsConstructor
@RestController
@RequestMapping(value="/zalba-cutanje", produces = MediaType.APPLICATION_XML_VALUE)
public class ZalbaCutanjeController {
    private final ZalbaCutanjeService zalbaCutanjeService;

    @GetMapping("")
    public ResponseEntity<ZalbaNaCutanjeListDTO> findAll() throws XMLDBException, JAXBException {
        ZalbaNaCutanjeListDTO response = new ZalbaNaCutanjeListDTO();
        response.setZalbaNaCutanje(zalbaCutanjeService.findAll());
        return ResponseEntity.ok(response);
    }

    @PostMapping("/search/metadata")
    public ResponseEntity<ZalbaNaCutanjeListDTO> searchMetadata(@RequestBody ZalbaNaCutanjeMetadataSearchRequest request) throws XMLDBException, IOException {
    	ZalbaNaCutanjeListDTO response = new ZalbaNaCutanjeListDTO();
        response.setZalbaNaCutanje(zalbaCutanjeService.searchMetadata(request));
        return ResponseEntity.ok(response);
    }
    
    @GetMapping("/example")
    public ResponseEntity<ZalbaCutanje> getExample() throws FileNotFoundException, JAXBException {
        return ResponseEntity.ok(zalbaCutanjeService.getExampleDocument());
    }
    
    @PostMapping("")
    public ResponseEntity<Void> add(@RequestParam(value="zahtevId") long zahtevId, @RequestBody ZalbaCutanje zalba) throws XMLDBException, TransformerException, JAXBException {
    	zalbaCutanjeService.create(zahtevId, zalba);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<ZalbaCutanje> get(@PathVariable Long id) throws XMLDBException, JAXBException, XmlResourceNotFoundException, FileNotFoundException {
        return ResponseEntity.ok(zalbaCutanjeService.findById(id));
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_PDF_VALUE)
    public ResponseEntity<byte[]> generatePdfDocument(@PathVariable Long id)
            throws XMLDBException, TransformerException, FOPException, XmlResourceNotFoundException, JAXBException, FileNotFoundException {
        return ResponseEntity.ok(zalbaCutanjeService.generatePdf(id));
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_XHTML_XML_VALUE)
    public ResponseEntity<byte[]> generateXHtmlDocument(@PathVariable Long id)
            throws XMLDBException, TransformerException, SAXException, XmlResourceNotFoundException, JAXBException, IOException, ParserConfigurationException {
        return ResponseEntity.ok(zalbaCutanjeService.generateXHtml(id));
    }
    
//    @PostMapping("")
//    public ResponseEntity<Void> createZalbaCutanje(@RequestBody ZalbaCutanje zalba) throws XMLDBException, IOException, TransformerException, JAXBException {
//        Long id = zalbaCutanjeService.create(zalba);
//        return ResponseEntity.status(HttpStatus.CREATED).build();
//    }
//
//    @GetMapping("/{id}")
//    public ResponseEntity<ZalbaCutanje> getZalbaCutanje(@PathVariable Long id) throws XMLDBException, JAXBException, XmlResourceNotFoundException {
//        return ResponseEntity.ok(zalbaCutanjeService.findXmlById(id));
//    }
}
