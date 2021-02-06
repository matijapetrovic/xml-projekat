package rs.ac.uns.ftn.xml.tim11.commissionerservice.endpoint;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.soap.zalbacutanje.ZalbaCutanjePortImpl;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.soap.zalbanaodluku.ZalbaNaOdlukuPortImpl;

import javax.xml.ws.Endpoint;

@Configuration
public class EndpointConfig {
    @Autowired
    private Bus bus;
//    @Autowired
//    private ResenjePortImpl resenjePort;
//    @Autowired
//    private ZalbaNaOdlukuPortImpl zalbaNaOdlukuPort;
//    @Autowired
//    private ZalbaCutanjePortImpl zalbaCutanjePort;

    @Bean
    public Endpoint zalbaCutanjeEndpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, new ZalbaCutanjePortImpl());
        endpoint.publish("/zalbacutanje");
        return endpoint;
    }

//    @Bean
//    public Endpoint zalbaNaOdlukuEndpoint() {
//        EndpointImpl endpoint = new EndpointImpl(bus, new ZalbaNaOdlukuPortImpl());
//        endpoint.publish("/zalbanaodluku");
//        return endpoint;
//    }

}
