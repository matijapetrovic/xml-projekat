package rs.ac.uns.ftn.xml.tim11.authoritybodyservice.soap.obavestenje;

import org.xmldb.api.base.XMLDBException;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.model.obavestenje.Obavestenje;
import rs.ac.uns.ftn.xml.tim11.xmllib.exist.exception.XmlResourceNotFoundException;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.JAXBException;
import javax.xml.bind.annotation.XmlSeeAlso;

@WebService(targetNamespace = "http://soap.spring.com/ws/obavestenje", name = "ObavestenjePort")
@XmlSeeAlso({rs.ac.uns.ftn.xml.tim11.authoritybodyservice.model.obavestenje.ObjectFactory.class})
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface ObavestenjePort {

    @WebMethod
    @WebResult(name = "return", targetNamespace = "http://soap.spring.com/ws/obavestenje", partName = "return")
    public Obavestenje findObavestenjeByNumber(
            @WebParam(partName = "text", name = "text") String brojObavestenja
    ) throws XMLDBException, JAXBException, XmlResourceNotFoundException;
}
