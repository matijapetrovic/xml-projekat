package rs.ac.uns.ftn.xml.tim11.authoritybodyservice.endpoint;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.soap.obavestenje.ObavestenjePortImpl;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.soap.zahtev.ZahtevPortImpl;

import javax.xml.ws.Endpoint;

@Configuration
public class EndpointConfig {
    @Autowired
    private Bus bus;

    @Bean
    public Endpoint obavestenjeEndpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, new ObavestenjePortImpl());
        endpoint.publish("/obavestenje");
        return endpoint;
    }

    @Bean
    public Endpoint zahtevEndpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, new ZahtevPortImpl());
        endpoint.publish("/zahtev");
        return endpoint;
    }
}
