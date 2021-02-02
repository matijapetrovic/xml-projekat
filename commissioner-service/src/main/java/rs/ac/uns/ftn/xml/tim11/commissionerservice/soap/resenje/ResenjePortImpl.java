package rs.ac.uns.ftn.xml.tim11.commissionerservice.soap.resenje;


import org.springframework.beans.factory.annotation.Autowired;
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
public class ResenjePortImpl implements ResenjePort {

    @Autowired
    private ResenjeService service;

    @Override
    public Resenje findResenjeByNumber(String brojResenja) {
        System.out.println("Inovked findResenjeByNumber method");
        System.out.println(brojResenja);
        Resenje resenje = new Resenje();
        resenje.setBrojResenja("BROJRESENJA");
//        try {
//            //return service.findXmlById(1L);   //treba nam metoda koja trazi po broju
//
//        } catch (XMLDBException e) {
//            e.printStackTrace();
//        } catch (XmlResourceNotFoundException e) {
//            e.printStackTrace();
//        }catch (JAXBException e) {
//            e.printStackTrace();
//        }
        return resenje;
    }

}
