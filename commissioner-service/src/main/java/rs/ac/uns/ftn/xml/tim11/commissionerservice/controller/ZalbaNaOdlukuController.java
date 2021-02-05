package rs.ac.uns.ftn.xml.tim11.commissionerservice.controller;

import lombok.RequiredArgsConstructor;

import org.apache.fop.apps.FOPException;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.xml.sax.SAXException;
import org.xmldb.api.base.XMLDBException;

import rs.ac.uns.ftn.xml.tim11.commissionerservice.model.zalbanaodluku.ZalbaNaOdluku;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.service.zalbanaodliku.ZalbaNaOdlukuService;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.util.ZalbaNaOdlukuProperties;
import rs.ac.uns.ftn.xml.tim11.xmllib.exist.exception.XmlResourceNotFoundException;
import rs.ac.uns.ftn.xml.tim11.xmllib.jaxb.JaxbMarshaller;

import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import java.io.FileNotFoundException;
import java.io.IOException;

@RequiredArgsConstructor
@RestController
@RequestMapping(value="/zalba-na-odluku", produces = MediaType.APPLICATION_XML_VALUE)
public class ZalbaNaOdlukuController {
    private final ZalbaNaOdlukuService zalbaNaOdlukuService;
    private final ZalbaNaOdlukuProperties properties;

    @GetMapping("/example")
    public ResponseEntity<String> getExample() throws FileNotFoundException, JAXBException, SAXException {
        String res = new JaxbMarshaller<ZalbaNaOdluku>(properties).marshal(zalbaNaOdlukuService.getExampleDocument());
        return ResponseEntity.ok(res);
    }

    @PostMapping("")
    public ResponseEntity<Void> add(@RequestBody ZalbaNaOdluku enitity) throws XMLDBException, TransformerException, JAXBException, IOException {
    	zalbaNaOdlukuService.create(enitity);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ZalbaNaOdluku> get(@PathVariable Long id) throws XMLDBException, JAXBException, XmlResourceNotFoundException, FileNotFoundException {
        return ResponseEntity.ok(zalbaNaOdlukuService.findById(id));
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_PDF_VALUE)
    public ResponseEntity<byte[]> generatePdfDocument(@PathVariable Long id)
            throws XMLDBException, TransformerException, FOPException, XmlResourceNotFoundException, JAXBException, FileNotFoundException {
        return ResponseEntity.ok(zalbaNaOdlukuService.generatePdf(id));
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_XHTML_XML_VALUE)
    public ResponseEntity<byte[]> generateXHtmlDocument(@PathVariable Long id)
            throws XMLDBException, TransformerException, SAXException, XmlResourceNotFoundException, JAXBException, IOException, ParserConfigurationException {
        return ResponseEntity.ok(zalbaNaOdlukuService.generateXHtml(id));
    }
}
