package rs.ac.uns.ftn.xml.tim11.commissionerservice.controller;

import lombok.RequiredArgsConstructor;
import org.apache.fop.apps.FOPException;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;
import org.xml.sax.SAXException;
import org.xmldb.api.base.XMLDBException;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.controller.dto.ResenjeListDTO;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.model.resenje.Resenje;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.service.resenje.ResenjeService;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.util.ResenjeProperties;
import rs.ac.uns.ftn.xml.tim11.xmllib.exist.exception.XmlResourceNotFoundException;
import rs.ac.uns.ftn.xml.tim11.xmllib.jaxb.JaxbMarshaller;

import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.FileNotFoundException;
import java.io.IOException;

@RequiredArgsConstructor
@RestController
@RequestMapping(value="/resenje", produces = MediaType.APPLICATION_XML_VALUE, consumes = MediaType.APPLICATION_XML_VALUE)
public class ResenjeController {
    private final ResenjeService resenjeService;
    private final ResenjeProperties properties;

    @GetMapping("/example")
    public ResponseEntity<String> getExample() throws FileNotFoundException, JAXBException, SAXException {
        String res = new JaxbMarshaller<Resenje>(properties).marshal(resenjeService.getExampleDocument());
        return ResponseEntity.ok(res);
    }

    @GetMapping("")
    public ResponseEntity<ResenjeListDTO> findAll() throws XMLDBException, JAXBException {
        ResenjeListDTO response = new ResenjeListDTO();
        response.setResenje(resenjeService.findAll());
        return ResponseEntity.ok(response);
    }

    @PostMapping("/zalba-cutanje")
    @PreAuthorize("hasRole('ROLE_COMMISSIONER')")
    public ResponseEntity<Void> createCutanjeResenje(@RequestParam("zalbaId") long zalbaId, @RequestBody Resenje resenje, UriComponentsBuilder uriBuilder) throws XMLDBException, IOException, TransformerException, JAXBException, SAXException, ParserConfigurationException, XmlResourceNotFoundException {
        resenjeService.createCutanje(zalbaId, resenje);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PostMapping("/zalba-odluka")
    @PreAuthorize("hasRole('ROLE_COMMISSIONER')")
    public ResponseEntity<Void> createOdlukaResenje(@RequestParam("zalbaId") long zalbaId, @RequestBody Resenje resenje, UriComponentsBuilder uriBuilder) throws XMLDBException, IOException, TransformerException, JAXBException, SAXException, ParserConfigurationException, XmlResourceNotFoundException {
        resenjeService.createOdluka(zalbaId, resenje);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Resenje> getResenje(@PathVariable Long id) throws XMLDBException, JAXBException, XmlResourceNotFoundException {
        return ResponseEntity.ok(resenjeService.findXmlById(id));
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_PDF_VALUE)
    public ResponseEntity<byte[]> generatePdfDocument(@PathVariable Long id)
            throws XMLDBException, TransformerException, FOPException, XmlResourceNotFoundException, JAXBException, FileNotFoundException {
        return ResponseEntity.ok(resenjeService.generatePdf(id));
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_XHTML_XML_VALUE)
    public ResponseEntity<byte[]> generateXHtmlDocument(@PathVariable Long id)
            throws XMLDBException, TransformerException, SAXException, XmlResourceNotFoundException, JAXBException, IOException, ParserConfigurationException {
        return ResponseEntity.ok(resenjeService.generateXHtml(id));
    }
}
