package rs.ac.uns.ftn.xml.tim11.commissionerservice.soap.zalbacutanje;

import rs.ac.uns.ftn.xml.tim11.commissionerservice.model.zalbacutanje.ZalbaCutanje;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

@WebService(targetNamespace = "http://soap.spring.com/ws/zalbacutanje", name = "ZalbaCutanjePort")
@XmlSeeAlso({rs.ac.uns.ftn.xml.tim11.commissionerservice.model.zalbacutanje.ObjectFactory.class})
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface ZalbaCutanjePort {

    @WebMethod
    @WebResult(name = "return", targetNamespace = "http://soap.spring.com/ws/zalbacutanje", partName = "return")
    public ZalbaCutanje findZalbaCutanjeById(
            @WebParam(partName = "text", name = "text") String id
    );

}
