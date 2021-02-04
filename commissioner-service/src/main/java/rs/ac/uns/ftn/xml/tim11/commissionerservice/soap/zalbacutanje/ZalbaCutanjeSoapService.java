package rs.ac.uns.ftn.xml.tim11.commissionerservice.soap.zalbacutanje;


import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import java.net.URL;

@WebServiceClient(name = "ZalbaCutanjeSoapService",
        wsdlLocation = "classpath:wsdl/Zalbacutanje.wsdl",
        targetNamespace = "http://soap.spring.com/ws/zalbacutanje")
public class ZalbaCutanjeSoapService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://soap.spring.com/ws/zalbacutanje", "ZalbaCutanjeSoapService");
    public final static QName ZalbaCutanjeServicePort = new QName("http://soap.spring.com/ws/zalbacutanje", "ZalbaCutanjeServicePort");
    static {
        URL url = ZalbaCutanjeSoapService.class.getClassLoader().getResource("wsdl/Zalbacutanje.wsdl");
        if (url == null) {
            java.util.logging.Logger.getLogger(ZalbaCutanjeSoapService.class.getName())
                    .log(java.util.logging.Level.INFO,
                            "Can not initialize the default wsdl from {0}", "classpath:wsdl/Zalbacutanje.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public ZalbaCutanjeSoapService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ZalbaCutanjeSoapService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ZalbaCutanjeSoapService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public ZalbaCutanjeSoapService(WebServiceFeature... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public ZalbaCutanjeSoapService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public ZalbaCutanjeSoapService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }


    /**
     *
     * @return
     *     returns ZalbaCutanjePort
     */
    @WebEndpoint(name = "ZalbaCutanjeServicePort")
    public ZalbaCutanjePort getResenjePort() {
        return super.getPort(ZalbaCutanjeServicePort, ZalbaCutanjePort.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ResenjePort
     */
    @WebEndpoint(name = "ZalbaCutanjeServicePort")
    public ZalbaCutanjePort getResenjePort(WebServiceFeature... features) {
        return super.getPort(ZalbaCutanjeServicePort, ZalbaCutanjePort.class, features);
    }
}
