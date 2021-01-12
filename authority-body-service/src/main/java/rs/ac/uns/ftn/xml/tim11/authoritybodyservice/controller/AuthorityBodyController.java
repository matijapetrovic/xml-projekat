package rs.ac.uns.ftn.xml.tim11.authoritybodyservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.xmldb.api.base.XMLDBException;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.model.obavestenje.Obavestenje;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.model.zahtev.Zahtev;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.service.obavestenje.ObavestenjeService;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.service.zahtev.ZahtevService;
import rs.ac.uns.ftn.xml.tim11.xmllib.exist.exception.XmlResourceNotFoundException;

import javax.xml.bind.JAXBException;
import javax.xml.transform.TransformerException;
import java.io.IOException;

@RequiredArgsConstructor
@RestController
@RequestMapping(value="") // produces = MediaType.APPLICATION_JSON_VALUE) sta treba ?
public class AuthorityBodyController {

    private final ObavestenjeService obavestenjeService;
    private final ZahtevService zahtevService;

    @PostMapping("/xml/zahtev")
    public ResponseEntity<Void> addXMLZahtev(Zahtev enitity) throws XMLDBException, IOException, TransformerException, JAXBException {
        zahtevService.create(enitity);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/xml/zahtev")
    public Zahtev findXMLZahtevById(Long id) throws XMLDBException, JAXBException, XmlResourceNotFoundException {
        return zahtevService.findXmlById(id);
    }

    @PostMapping("/xml/obavestenje")
    public ResponseEntity<Void> addXMLObavestenje(Obavestenje enitity) throws XMLDBException, IOException, TransformerException, JAXBException {
        obavestenjeService.create(enitity);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/xml/obavestenje")
    public Obavestenje findXMLObavestenjeById(Long id) throws XMLDBException, JAXBException, XmlResourceNotFoundException {
        return obavestenjeService.findXmlById(id);
    }
}
