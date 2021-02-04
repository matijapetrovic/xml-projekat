package rs.ac.uns.ftn.xml.tim11.authoritybodyservice.soap.obavestenje;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import java.net.URL;

@WebServiceClient(name = "ObavestenjeSoapService",
        wsdlLocation = "classpath:wsdl/Obavestenje.wsdl",
        targetNamespace = "http://soap.spring.com/ws/obavestenje")
public class ObavestenjeSoapService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://soap.spring.com/ws/obavestenje", "ObavestenjeSoapService");
    public final static QName ObavestenjePort = new QName("http://soap.spring.com/ws/obavestenje", "ObavestenjePort");
    static {
        URL url = ObavestenjeSoapService.class.getClassLoader().getResource("wsdl/Obavestenje.wsdl");
        if (url == null) {
            java.util.logging.Logger.getLogger(ObavestenjeSoapService.class.getName())
                    .log(java.util.logging.Level.INFO,
                            "Can not initialize the default wsdl from {0}", "classpath:wsdl/Obavestenje.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public ObavestenjeSoapService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ObavestenjeSoapService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ObavestenjeSoapService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public ObavestenjeSoapService(WebServiceFeature... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public ObavestenjeSoapService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public ObavestenjeSoapService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns ObavestenjePort (interface)
     */
    @WebEndpoint(name = "ObavestenjePort")
    public ObavestenjePort getObavestenjePort() {
        return super.getPort(ObavestenjePort, ObavestenjePort.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ObavestenjePort
     */
    @WebEndpoint(name = "ObavestenjePort")
    public ObavestenjePort getObavestenjePort(WebServiceFeature... features) {
        return super.getPort(ObavestenjePort, ObavestenjePort.class, features);
    }
}
