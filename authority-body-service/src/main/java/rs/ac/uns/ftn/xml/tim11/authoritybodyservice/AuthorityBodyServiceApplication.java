package rs.ac.uns.ftn.xml.tim11.authoritybodyservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.xml.sax.SAXException;
import org.xmldb.api.base.XMLDBException;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.model.obavestenje.Obavestenje;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.model.zahtev.Zahtev;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.repository.rdf.ObavestenjeRDFRepository;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.repository.rdf.ZahtevRDFRepository;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.repository.xml.ObavestenjeXmlRepository;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.repository.xml.ZahtevXmlRepository;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.util.ObavestenjeProperties;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.util.ZahtevProperties;
import rs.ac.uns.ftn.xml.tim11.xmllib.jaxb.JaxbMarshaller;

import javax.xml.bind.JAXBException;
import javax.xml.transform.TransformerException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

@SpringBootApplication
public class AuthorityBodyServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthorityBodyServiceApplication.class, args);
	}


	@Bean
	public CommandLineRunner run(
			ObavestenjeXmlRepository obavestenjeXmlRepository,
			ZahtevXmlRepository zahtevXmlRepository,
			ObavestenjeRDFRepository obavestenjeRDFRepository,
			ZahtevRDFRepository zahtevRDFRepository,
			ObavestenjeProperties obavestenjeProperties,
			ZahtevProperties zahtevProperties) {
		return args -> {
			testObavestenje(obavestenjeXmlRepository, obavestenjeRDFRepository, obavestenjeProperties);
			testZahtev(zahtevXmlRepository, zahtevRDFRepository, zahtevProperties);
		};
	}

	public void testObavestenje(ObavestenjeXmlRepository xmlRepository, ObavestenjeRDFRepository rdfRepository, ObavestenjeProperties properties) throws JAXBException, SAXException, FileNotFoundException, TransformerException, XMLDBException {
		JaxbMarshaller<Obavestenje> m = new JaxbMarshaller<>(properties);
		Obavestenje resenje = m.unmarshal(new FileInputStream("data/xml/obavestenje1.xml"));

		Long id = xmlRepository.create(resenje);
		resenje = xmlRepository.findById(id).get();

		rdfRepository.saveMetadata(resenje);
	}

	public void testZahtev(ZahtevXmlRepository xmlRepository, ZahtevRDFRepository rdfRepository, ZahtevProperties properties) throws JAXBException, SAXException, FileNotFoundException, TransformerException, XMLDBException {
		JaxbMarshaller<Zahtev> m = new JaxbMarshaller<>(properties);
		Zahtev resenje = m.unmarshal(new FileInputStream("data/xml/zahtev1.xml"));

		Long id = xmlRepository.create(resenje);
		resenje = xmlRepository.findById(id).get();

		rdfRepository.saveMetadata(resenje);
	}

}
