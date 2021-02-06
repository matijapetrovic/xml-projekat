package rs.ac.uns.ftn.xml.tim11.commissionerservice.soap.zalbacutanje;

import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.xmldb.api.base.XMLDBException;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.model.zalbacutanje.ZalbaCutanje;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.service.zalbacutanje.ZalbaCutanjeService;
import rs.ac.uns.ftn.xml.tim11.xmllib.exist.exception.XmlResourceNotFoundException;

import javax.xml.bind.JAXBException;


@javax.jws.WebService(
        serviceName = "ZalbaCutanjeSoapService",
        portName = "ZalbaCutanjeServicePort",
        targetNamespace = "http://soap.spring.com/ws/zalbacutanje",
        // wsdlLocation = "classpath:wsdl/Resenje.wsdl",
        endpointInterface = "rs.ac.uns.ftn.xml.tim11.commissionerservice.soap.zalbacutanje.ZalbaCutanjePort")
@Service
@NoArgsConstructor
public class ZalbaCutanjePortImpl implements ZalbaCutanjePort{

    @Autowired
    ZalbaCutanjeService service;

    @Override
    public ZalbaCutanje findZalbaCutanjeById(String id) {
        try {
            ZalbaCutanje zalbaCutanje = service.findXmlById(Long.parseLong(id));
            return zalbaCutanje;
        } catch (XMLDBException e) {
            e.printStackTrace();
        } catch (XmlResourceNotFoundException e) {
            e.printStackTrace();
        }catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }
}
