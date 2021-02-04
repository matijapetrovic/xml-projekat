package rs.ac.uns.ftn.xml.tim11.commissionerservice.soap.zalbanaodluku;

import javax.xml.ws.Service;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import java.net.URL;

@WebServiceClient(name = "ZalbaNaOdlukuSoapService",
        wsdlLocation = "classpath:wsdl/Zalbanaodluku.wsdl",
        targetNamespace = "http://soap.spring.com/ws/zalbanaodluku")
public class ZalbaNaOdlukuSoapService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://soap.spring.com/ws/zalbanaodluku", "ZalbaNaOdlukuSoapService");
    public final static QName ZalbaNaOdlukuServicePort = new QName("http://soap.spring.com/ws/zalbanaodluku", "ZalbaNaOdlukuServicePort");
    static {
        URL url = ZalbaNaOdlukuSoapService.class.getClassLoader().getResource("wsdl/Zalbanaodluku.wsdl");
        if (url == null) {
            java.util.logging.Logger.getLogger(ZalbaNaOdlukuSoapService.class.getName())
                    .log(java.util.logging.Level.INFO,
                            "Can not initialize the default wsdl from {0}", "classpath:wsdl/Zalbanaodluku.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public ZalbaNaOdlukuSoapService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ZalbaNaOdlukuSoapService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ZalbaNaOdlukuSoapService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public ZalbaNaOdlukuSoapService(WebServiceFeature... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public ZalbaNaOdlukuSoapService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public ZalbaNaOdlukuSoapService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }


    /**
     *
     * @return
     *     returns ZalbaNaOdlukuPort
     */
    @WebEndpoint(name = "ZalbaNaOdlukuServicePort")
    public ZalbaNaOdlukuPort getResenjePort() {
        return super.getPort(ZalbaNaOdlukuServicePort, ZalbaNaOdlukuPort.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ZalbaNaOdlukuPort
     */
    @WebEndpoint(name = "ZalbaCutanjeServicePort")
    public ZalbaNaOdlukuPort getResenjePort(WebServiceFeature... features) {
        return super.getPort(ZalbaNaOdlukuServicePort, ZalbaNaOdlukuPort.class, features);
    }
}
