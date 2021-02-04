package rs.ac.uns.ftn.xml.tim11.commissionerservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.xmldb.api.base.XMLDBException;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.model.zalbacutanje.ZalbaCutanje;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.service.zalbacutanje.ZalbaCutanjeService;
import rs.ac.uns.ftn.xml.tim11.xmllib.exist.exception.XmlResourceNotFoundException;

import javax.xml.bind.JAXBException;
import javax.xml.transform.TransformerException;
import java.io.IOException;

@RequiredArgsConstructor
@RestController
@RequestMapping(value="/zalba-cutanje", produces = MediaType.APPLICATION_XML_VALUE, consumes = MediaType.APPLICATION_XML_VALUE)
public class ZalbaCutanjeController {
    private final ZalbaCutanjeService zalbaCutanjeService;


    @PostMapping("")
    public ResponseEntity<Void> createZalbaCutanje(@RequestBody ZalbaCutanje zalba) throws XMLDBException, IOException, TransformerException, JAXBException {
        Long id = zalbaCutanjeService.create(zalba);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ZalbaCutanje> getZalbaCutanje(@PathVariable Long id) throws XMLDBException, JAXBException, XmlResourceNotFoundException {
        return ResponseEntity.ok(zalbaCutanjeService.findXmlById(id));
    }
}
