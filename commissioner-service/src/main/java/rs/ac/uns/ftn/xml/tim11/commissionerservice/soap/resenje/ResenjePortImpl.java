package rs.ac.uns.ftn.xml.tim11.commissionerservice.soap.resenje;


import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.xmldb.api.base.XMLDBException;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.model.resenje.Resenje;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.service.resenje.ResenjeService;
import rs.ac.uns.ftn.xml.tim11.xmllib.exist.exception.XmlResourceNotFoundException;

import javax.xml.bind.JAXBException;

@javax.jws.WebService(
        serviceName = "ResenjeSoapService",
        portName = "ResenjeServicePort",
        targetNamespace = "http://soap.spring.com/ws/resenje",
        // wsdlLocation = "classpath:wsdl/Resenje.wsdl",
        endpointInterface = "rs.ac.uns.ftn.xml.tim11.commissionerservice.soap.resenje.ResenjePort")
@NoArgsConstructor
@Service
public class ResenjePortImpl implements ResenjePort {

    private ResenjeService service;

    @Override
    public Resenje recieveResenje(Resenje brojResenja) throws XMLDBException, JAXBException, XmlResourceNotFoundException {
        //Resenje resenje = service.findXmlByNumber(brojResenja);
        return null;
    }

    @Autowired
    public void setService(ResenjeService service){
        this.service = service;
    }

}
