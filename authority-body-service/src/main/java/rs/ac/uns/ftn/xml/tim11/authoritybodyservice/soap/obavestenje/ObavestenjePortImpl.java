package rs.ac.uns.ftn.xml.tim11.authoritybodyservice.soap.obavestenje;

import org.springframework.beans.factory.annotation.Autowired;
import org.xmldb.api.base.XMLDBException;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.model.obavestenje.Obavestenje;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.service.obavestenje.ObavestenjeService;
import rs.ac.uns.ftn.xml.tim11.xmllib.exist.exception.XmlResourceNotFoundException;

import javax.xml.bind.JAXBException;

@javax.jws.WebService(
        serviceName = "ObavestenjeSoapService",
        portName = "ObavestenjePort",
        targetNamespace = "http://soap.spring.com/ws/obavestenje",
        endpointInterface = "rs.ac.uns.ftn.xml.tim11.authoritybodyservice.soap.obavestenje.ObavestenjePort")
public class ObavestenjePortImpl implements ObavestenjePort {
    @Autowired
    private ObavestenjeService service;

    @Override
    public Obavestenje findObavestenjeByNumber(String brojObavestenja) throws XMLDBException, JAXBException, XmlResourceNotFoundException {
        Obavestenje obavestenje = service.findXmlByNumber(brojObavestenja);
        return obavestenje;
    }
}
