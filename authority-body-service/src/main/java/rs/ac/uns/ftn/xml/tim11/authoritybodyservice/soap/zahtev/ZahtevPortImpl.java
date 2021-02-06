package rs.ac.uns.ftn.xml.tim11.authoritybodyservice.soap.zahtev;

import org.springframework.beans.factory.annotation.Autowired;
import org.xmldb.api.base.XMLDBException;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.model.obavestenje.Obavestenje;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.model.zahtev.Zahtev;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.service.zahtev.ZahtevService;
import rs.ac.uns.ftn.xml.tim11.xmllib.exist.exception.XmlResourceNotFoundException;

import javax.xml.bind.JAXBException;
import java.io.FileNotFoundException;

@javax.jws.WebService(
        serviceName = "ZahtevSoapService",
        portName = "ZahtevPort",
        targetNamespace = "http://soap.spring.com/ws/zahtev",
        endpointInterface = "rs.ac.uns.ftn.xml.tim11.authoritybodyservice.soap.zahtev.ZahtevPort")
public class ZahtevPortImpl implements ZahtevPort{
    @Autowired
    private ZahtevService service;

    @Override
    public Zahtev findZahtevById(Long zahtevId) {
        Zahtev zahtev;
        try {
            zahtev = service.findById(zahtevId);
            return zahtev;
        } catch (XMLDBException e) {
            e.printStackTrace();
        } catch (JAXBException e) {
            e.printStackTrace();
        } catch (XmlResourceNotFoundException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
