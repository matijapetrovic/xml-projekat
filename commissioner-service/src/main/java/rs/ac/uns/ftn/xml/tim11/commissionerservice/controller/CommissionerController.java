package rs.ac.uns.ftn.xml.tim11.commissionerservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.xmldb.api.base.XMLDBException;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.exception.EntityNotFoundException;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.model.obavestenje.Obavestenje;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.model.resenje.Resenje;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.model.zahtev.Zahtev;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.model.zalbacutanje.ZalbaCutanje;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.model.zalbanaodluku.ZalbaNaOdluku;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.service.obavestenje.ObavestenjeService;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.service.resenje.ResenjeService;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.service.zahtev.ZahtevService;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.service.zalbacutanje.ZalbaCutanjeService;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.service.zalbanaodliku.ZalbaNaOdlukuService;

import javax.xml.bind.JAXBException;
import javax.xml.transform.TransformerException;
import java.io.IOException;

@RequiredArgsConstructor
@RestController
@RequestMapping(value="/api/commissioner") // produces = MediaType.APPLICATION_JSON_VALUE) sta treba ?
public class CommissionerController {
    private final ObavestenjeService obavestenjeService;
    private final ZalbaNaOdlukuService zalbaNaOdlukuService;
    private final ZalbaCutanjeService zalbaCutanjeService;
    private final ResenjeService resenjeService;
    private final ZahtevService zahtevService;


    @PostMapping("/xml/zahtev")
    public ResponseEntity<Void> addXMLZahtev(Zahtev enitity) throws XMLDBException, IOException, TransformerException, JAXBException {
        zahtevService.create(enitity);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/xml/zahtev")
    public Zahtev findXMLZahtevById(Long id) throws XMLDBException, EntityNotFoundException, JAXBException {
        return zahtevService.findXmlById(id);
    }

    @PostMapping("/xml/obavestenje")
    public ResponseEntity<Void> addXMLObavestenje(Obavestenje enitity) throws XMLDBException, IOException, TransformerException, JAXBException {
        obavestenjeService.create(enitity);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/xml/obavestenje")
    public Obavestenje findXMLObavestenjeById(Long id) throws XMLDBException, EntityNotFoundException, JAXBException {
        return obavestenjeService.findXmlById(id);
    }

    @PostMapping("/xml/resenje")
    public ResponseEntity<Void> addXMLResenje() throws XMLDBException, IOException, TransformerException, JAXBException {
        resenjeService.create(new Resenje());
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/xml/resenje")
    public Resenje findXMLResenjeById(Long id) throws XMLDBException, EntityNotFoundException, JAXBException {
        return resenjeService.findXmlById(id);
    }

    @PostMapping("/xml/zalba-cutanje")
    public ResponseEntity<Void> addXMLZalbaCutanje(ZalbaCutanje enitity) throws XMLDBException, IOException, TransformerException, JAXBException {
        zalbaCutanjeService.create(enitity);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/xml/zalba-cutanje")
    public ZalbaCutanje findXMLZalbaCutanjeById(Long id) throws XMLDBException, EntityNotFoundException, JAXBException {
        return zalbaCutanjeService.findXmlById(id);
    }

    @PostMapping("/xml/zalba-odluka")
    public ResponseEntity<Void> addXMLZalbaOdluka(ZalbaNaOdluku enitity) throws XMLDBException, IOException, TransformerException, JAXBException {
        zalbaNaOdlukuService.create(enitity);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/xml/zalba-odluka")
    public ZalbaNaOdluku findXMLZalbaOdlukaById(Long id) throws XMLDBException, EntityNotFoundException, JAXBException {
        return zalbaNaOdlukuService.findXmlById(id);
    }

    @GetMapping("/rdf/resenje")
    public void findRDFResenje() {
        resenjeService.findRdf();
    }
}
