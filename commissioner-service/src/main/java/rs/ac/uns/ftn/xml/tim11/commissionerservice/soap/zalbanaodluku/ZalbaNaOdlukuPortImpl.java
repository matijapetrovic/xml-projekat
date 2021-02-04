package rs.ac.uns.ftn.xml.tim11.commissionerservice.soap.zalbanaodluku;

import org.springframework.beans.factory.annotation.Autowired;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.model.zalbacutanje.ZalbaCutanje;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.service.zalbanaodliku.ZalbaNaOdlukuService;

@javax.jws.WebService(
        serviceName = "ZalbaNaOdlukuSoapService",
        portName = "ZalbaNaOdlukuServicePort",
        targetNamespace = "http://soap.spring.com/ws/zalbanaodluku",
        // wsdlLocation = "classpath:wsdl/Resenje.wsdl",
        endpointInterface = "rs.ac.uns.ftn.xml.tim11.commissionerservice.soap.zalbanaodluku.ZalbaNaOdlukuPort")
public class ZalbaNaOdlukuPortImpl implements ZalbaNaOdlukuPort{

    @Autowired
    private ZalbaNaOdlukuService service;

    @Override
    public ZalbaCutanje findZalbaNaOdlukuById(String id) {
        return null;
    }
}
