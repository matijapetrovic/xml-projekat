package rs.ac.uns.ftn.xml.tim11.commissionerservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.xmldb.api.base.XMLDBException;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.model.zalbanaodluku.ZalbaNaOdluku;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.service.zalbanaodliku.ZalbaNaOdlukuService;
import rs.ac.uns.ftn.xml.tim11.xmllib.exist.exception.XmlResourceNotFoundException;

import javax.xml.bind.JAXBException;
import javax.xml.transform.TransformerException;
import java.io.IOException;

@RequiredArgsConstructor
@RestController
@RequestMapping(value="/zalba-na-odluku", produces = MediaType.APPLICATION_XML_VALUE, consumes = MediaType.APPLICATION_XML_VALUE)
public class ZalbaNaOdlukuController {
    private final ZalbaNaOdlukuService zalbaNaOdlukuService;


    @PostMapping("")
    public ResponseEntity<Void> createZalbaOdluka(@RequestBody ZalbaNaOdluku zalba) throws XMLDBException, IOException, TransformerException, JAXBException {
        Long id = zalbaNaOdlukuService.create(zalba);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ZalbaNaOdluku> getZalbaOdluka(@PathVariable Long id) throws XMLDBException, JAXBException, XmlResourceNotFoundException {
        return ResponseEntity.ok(zalbaNaOdlukuService.findXmlById(id));
    }
}
