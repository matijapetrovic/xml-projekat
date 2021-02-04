package rs.ac.uns.ftn.xml.tim11.commissionerservice.soap.resenje;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import java.net.URL;

@WebServiceClient(name = "ResenjeSoapService",
        wsdlLocation = "classpath:wsdl/Resenje.wsdl",
        targetNamespace = "http://soap.spring.com/ws/resenje")
public class ResenjeSoapService extends Service{

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://soap.spring.com/ws/resenje", "ResenjeSoapService");
    public final static QName ResenjeServicePort = new QName("http://soap.spring.com/ws/resenje", "ResenjeServicePort");
    static {
        URL url = ResenjeSoapService.class.getClassLoader().getResource("wsdl/Resenje.wsdl");
        if (url == null) {
            java.util.logging.Logger.getLogger(ResenjeSoapService.class.getName())
                    .log(java.util.logging.Level.INFO,
                            "Can not initialize the default wsdl from {0}", "classpath:wsdl/Resenje.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public ResenjeSoapService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ResenjeSoapService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ResenjeSoapService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public ResenjeSoapService(WebServiceFeature... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public ResenjeSoapService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public ResenjeSoapService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }


    /**
     *
     * @return
     *     returns Hello
     */
    @WebEndpoint(name = "ResenjePort")
    public ResenjePort getResenjePort() {
        return super.getPort(ResenjeServicePort, ResenjePort.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ResenjePort
     */
    @WebEndpoint(name = "ResenjePort")
    public ResenjePort getResenjePort(WebServiceFeature... features) {
        return super.getPort(ResenjeServicePort, ResenjePort.class, features);
    }
}
