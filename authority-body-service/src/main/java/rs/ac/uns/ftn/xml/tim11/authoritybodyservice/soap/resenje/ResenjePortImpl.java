package rs.ac.uns.ftn.xml.tim11.authoritybodyservice.soap.resenje;

import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;
import org.xmldb.api.base.XMLDBException;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.model.resenje11.Resenje;
import rs.ac.uns.ftn.xml.tim11.xmllib.exist.exception.XmlResourceNotFoundException;

import javax.xml.bind.JAXBException;

@javax.jws.WebService(
        serviceName = "ResenjeSoapService",
        portName = "ResenjeServicePort",
        targetNamespace = "http://soap.spring.com/ws/resenje",
        // wsdlLocation = "classpath:wsdl/Resenje.wsdl",
        endpointInterface = "rs.ac.uns.ftn.xml.tim11.authoritybodyservice.soap.resenje.ResenjePort")
@NoArgsConstructor
@Service
public class ResenjePortImpl implements ResenjePort {

    //private ResenjeService service;

    @Override
    public Resenje findResenjeByNumber(Resenje resenje) throws XMLDBException, JAXBException, XmlResourceNotFoundException {
//        Resenje resenje = service.findXmlByNumber(brojResenja);
        return null;
    }

//    @Autowired
//    public void setService(ResenjeService service){
//        this.service = service;
//    }

}