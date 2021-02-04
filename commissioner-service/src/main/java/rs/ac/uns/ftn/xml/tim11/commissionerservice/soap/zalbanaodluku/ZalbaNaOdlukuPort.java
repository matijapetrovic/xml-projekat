package rs.ac.uns.ftn.xml.tim11.commissionerservice.soap.zalbanaodluku;

import rs.ac.uns.ftn.xml.tim11.commissionerservice.model.zalbacutanje.ZalbaCutanje;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

@WebService(targetNamespace = "http://soap.spring.com/ws/zalbanaodluku", name = "ZalbaNaOdlukuPort")
@XmlSeeAlso({rs.ac.uns.ftn.xml.tim11.commissionerservice.model.zalbanaodluku.ObjectFactory.class})
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface ZalbaNaOdlukuPort {

    @WebMethod
    @WebResult(name = "return", targetNamespace = "http://soap.spring.com/ws/zalbanaodluku", partName = "return")
    public ZalbaCutanje findZalbaNaOdlukuById(
            @WebParam(partName = "text", name = "text") String id
    );
}
