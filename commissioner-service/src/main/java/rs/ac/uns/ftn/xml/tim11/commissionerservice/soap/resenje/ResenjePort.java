package rs.ac.uns.ftn.xml.tim11.commissionerservice.soap.resenje;

import rs.ac.uns.ftn.xml.tim11.commissionerservice.model.resenje.Resenje;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

@WebService(targetNamespace = "http://soap.spring.com/ws/resenje", name = "ResenjePort")
@XmlSeeAlso({rs.ac.uns.ftn.xml.tim11.commissionerservice.model.resenje.ObjectFactory.class,
            /*com.spring.soap.ws.address.data.ObjectFactory.class*/   })
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface ResenjePort {

    @WebMethod
    @WebResult(name = "return", targetNamespace = "http://soap.spring.com/ws/resenje", partName = "return")
    public Resenje findResenjeByNumber(
        @WebParam(partName = "text", name = "text") String brojResenja
    );

}
