package rs.ac.uns.ftn.xml.tim11.commissionerservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;
import org.xml.sax.SAXException;
import org.xmldb.api.base.XMLDBException;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.model.resenje.Resenje;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.service.resenje.ResenjeService;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.util.ResenjeProperties;
import rs.ac.uns.ftn.xml.tim11.xmllib.exist.exception.XmlResourceNotFoundException;
import rs.ac.uns.ftn.xml.tim11.xmllib.jaxb.JaxbMarshaller;

import javax.xml.bind.JAXBException;
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

    @PostMapping("")
    public ResponseEntity<Void> createResenje(@RequestBody Resenje resenje, UriComponentsBuilder uriBuilder) throws XMLDBException, IOException, TransformerException, JAXBException {
        Long id = resenjeService.create(resenje);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Resenje> getResenje(@PathVariable Long id) throws XMLDBException, JAXBException, XmlResourceNotFoundException {
        return ResponseEntity.ok(resenjeService.findXmlById(id));
    }
}
