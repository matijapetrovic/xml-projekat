package rs.ac.uns.ftn.xml.tim11.authoritybodyservice.soap.zahtev;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import java.net.URL;

@WebServiceClient(name = "ZahtevSoapService",
        wsdlLocation = "classpath:wsdl/Zahtev.wsdl",
        targetNamespace = "http://soap.spring.com/ws/zahtev")
public class ZahtevSoapService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://soap.spring.com/ws/zahtev", "ZahtevSoapService");
    public final static QName ZahtevPort = new QName("http://soap.spring.com/ws/zahtev", "ZahtevPort");
    static {
        URL url = ZahtevSoapService.class.getClassLoader().getResource("wsdl/Zahtev.wsdl");
        if (url == null) {
            java.util.logging.Logger.getLogger(ZahtevSoapService.class.getName())
                    .log(java.util.logging.Level.INFO,
                            "Can not initialize the default wsdl from {0}", "classpath:wsdl/Zahtev.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public ZahtevSoapService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ZahtevSoapService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ZahtevSoapService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public ZahtevSoapService(WebServiceFeature... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public ZahtevSoapService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public ZahtevSoapService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns ZahtevPort (interface)
     */
    @WebEndpoint(name = "ZahtevPort")
    public ZahtevPort getZahtevPort() {
        return super.getPort(ZahtevPort, ZahtevPort.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ZahtevPort
     */
    @WebEndpoint(name = "ZahtevPort")
    public ZahtevPort getZahtevPort(WebServiceFeature... features) {
        return super.getPort(ZahtevPort, ZahtevPort.class, features);
    }
}
