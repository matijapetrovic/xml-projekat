package rs.ac.uns.ftn.xml.tim11.authoritybodyservice.soap.resenje;

import org.xmldb.api.base.XMLDBException;
import rs.ac.uns.ftn.xml.tim11.xmllib.model.resenje.Resenje;
import rs.ac.uns.ftn.xml.tim11.xmllib.exist.exception.XmlResourceNotFoundException;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.JAXBException;
import javax.xml.bind.annotation.XmlSeeAlso;

@WebService(targetNamespace = "http://soap.spring.com/ws/resenje", name = "ResenjePort")
@XmlSeeAlso({rs.ac.uns.ftn.xml.tim11.xmllib.model.resenje.ObjectFactory.class,
        /*com.spring.soap.ws.address.data.ObjectFactory.class*/   })
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface ResenjePort {

    @WebMethod
    @WebResult(name = "return", targetNamespace = "http://soap.spring.com/ws/resenje", partName = "return")
    public Resenje receiveResenje(
            @WebParam(partName = "text", name = "text") Resenje resenje
    ) throws XMLDBException, JAXBException, XmlResourceNotFoundException;

}