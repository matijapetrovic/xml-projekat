package rs.ac.uns.ftn.xml.tim11.authoritybodyservice.soap.zahtev;

import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.model.obavestenje.Obavestenje;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.model.zahtev.Zahtev;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

@WebService(targetNamespace = "http://soap.spring.com/ws/zahtev", name = "ZahtevPort")
@XmlSeeAlso({rs.ac.uns.ftn.xml.tim11.authoritybodyservice.model.zahtev.ObjectFactory.class})
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface ZahtevPort {

    @WebMethod
    @WebResult(name = "return", targetNamespace = "http://soap.spring.com/ws/zahtev", partName = "return")
    public Zahtev findZahtevById(
            @WebParam(partName = "text", name = "text") Long zahtevId
    );
}
