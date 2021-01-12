package rs.ac.uns.ftn.xml.tim11.commissionerservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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
@RequestMapping(value="") // produces = MediaType.APPLICATION_JSON_VALUE) sta treba ?
public class CommissionerController {
    private final ZalbaNaOdlukuService zalbaNaOdlukuService;
    private final ZalbaCutanjeService zalbaCutanjeService;
    private final ResenjeService resenjeService;


    @PostMapping("/xml/resenje")
    public ResponseEntity<Void> addXMLResenje(Resenje entity) throws XMLDBException, IOException, TransformerException, JAXBException {
        resenjeService.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/xml/resenje")
    public Resenje findXMLResenjeById(Long id) throws XMLDBException, JAXBException, XmlResourceNotFoundException {
        return resenjeService.findXmlById(id);
    }

    @PostMapping("/xml/zalba-cutanje")
    public ResponseEntity<Void> addXMLZalbaCutanje(ZalbaCutanje enitity) throws XMLDBException, IOException, TransformerException, JAXBException {
        zalbaCutanjeService.create(enitity);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/xml/zalba-cutanje")
    public ZalbaCutanje findXMLZalbaCutanjeById(Long id) throws XMLDBException, JAXBException, XmlResourceNotFoundException {
        return zalbaCutanjeService.findXmlById(id);
    }

    @PostMapping("/xml/zalba-odluka")
    public ResponseEntity<Void> addXMLZalbaOdluka(ZalbaNaOdluku enitity) throws XMLDBException, IOException, TransformerException, JAXBException {
        zalbaNaOdlukuService.create(enitity);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/xml/zalba-odluka")
    public ZalbaNaOdluku findXMLZalbaOdlukaById(Long id) throws XMLDBException, JAXBException, XmlResourceNotFoundException {
        return zalbaNaOdlukuService.findXmlById(id);
    }

    @GetMapping("/rdf/resenje")
    public void findRDFResenje() {
        resenjeService.findRdf();
    }
}
