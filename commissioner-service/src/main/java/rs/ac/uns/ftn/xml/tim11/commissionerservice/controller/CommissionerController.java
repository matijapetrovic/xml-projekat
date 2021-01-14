package rs.ac.uns.ftn.xml.tim11.commissionerservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;
import org.xmldb.api.base.XMLDBException;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.model.resenje.Resenje;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.model.zalbacutanje.ZalbaCutanje;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.model.zalbanaodluku.ZalbaNaOdluku;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.service.resenje.ResenjeService;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.service.zalbacutanje.ZalbaCutanjeService;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.service.zalbanaodliku.ZalbaNaOdlukuService;
import rs.ac.uns.ftn.xml.tim11.xmllib.exist.exception.XmlResourceNotFoundException;

import javax.xml.bind.JAXBException;
import javax.xml.transform.TransformerException;
import java.io.IOException;

@RequiredArgsConstructor
@RestController
@RequestMapping(value="", produces = MediaType.APPLICATION_XML_VALUE, consumes = MediaType.APPLICATION_XML_VALUE)
public class CommissionerController {
    private final ZalbaNaOdlukuService zalbaNaOdlukuService;
    private final ZalbaCutanjeService zalbaCutanjeService;
    private final ResenjeService resenjeService;

    @PostMapping("/resenje")
    public ResponseEntity<Void> createResenje(@RequestBody Resenje resenje, UriComponentsBuilder uriBuilder) throws XMLDBException, IOException, TransformerException, JAXBException {
        Long id = resenjeService.create(resenje);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/resenje/{id}")
    public ResponseEntity<Resenje> getResenje(@PathVariable Long id) throws XMLDBException, JAXBException, XmlResourceNotFoundException {
        return ResponseEntity.ok(resenjeService.findXmlById(id));
    }

    @PostMapping("/zalba-cutanje")
    public ResponseEntity<Void> createZalbaCutanje(@RequestBody ZalbaCutanje zalba) throws XMLDBException, IOException, TransformerException, JAXBException {
        Long id = zalbaCutanjeService.create(zalba);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/zalba-cutanje/{id}")
    public ResponseEntity<ZalbaCutanje> getZalbaCutanje(@PathVariable Long id) throws XMLDBException, JAXBException, XmlResourceNotFoundException {
        return ResponseEntity.ok(zalbaCutanjeService.findXmlById(id));
    }

    @PostMapping("/zalba-odluka")
    public ResponseEntity<Void> createZalbaOdluka(@RequestBody ZalbaNaOdluku zalba) throws XMLDBException, IOException, TransformerException, JAXBException {
        Long id = zalbaNaOdlukuService.create(zalba);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/zalba-odluka/{id}")
    public ResponseEntity<ZalbaNaOdluku> getZalbaOdluka(@PathVariable Long id) throws XMLDBException, JAXBException, XmlResourceNotFoundException {
        return ResponseEntity.ok(zalbaNaOdlukuService.findXmlById(id));
    }
}
