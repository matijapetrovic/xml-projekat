package rs.ac.uns.ftn.xml.tim11.authoritybodyservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.xml.sax.SAXException;
import org.xmldb.api.base.XMLDBException;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.model.obavestenje.Obavestenje;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.model.user.Account;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.model.user.Authority;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.model.user.User;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.model.zahtev.Zahtev;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.repository.rdf.ObavestenjeRDFRepository;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.repository.rdf.ZahtevRDFRepository;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.repository.xml.*;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.util.*;
import rs.ac.uns.ftn.xml.tim11.xmllib.jaxb.JaxbMarshaller;

import javax.xml.bind.JAXBException;
import javax.xml.transform.TransformerException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

@SpringBootApplication
public class AuthorityBodyServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthorityBodyServiceApplication.class, args);
	}


//	@Bean
//	public CommandLineRunner run(
//			ObavestenjeXmlRepository obavestenjeXmlRepository,
//			ZahtevXmlRepository zahtevXmlRepository,
//			ObavestenjeRDFRepository obavestenjeRDFRepository,
//			ZahtevRDFRepository zahtevRDFRepository,
//			ObavestenjeProperties obavestenjeProperties,
//			ZahtevProperties zahtevProperties) {
//		return args -> {
//			testObavestenje(obavestenjeXmlRepository, obavestenjeRDFRepository, obavestenjeProperties);
//			testZahtev(zahtevXmlRepository, zahtevRDFRepository, zahtevProperties);
//		};
//	}
	@Bean
	public CommandLineRunner run(
			AuthorityXmlRepository authorityXmlRepository,
			AuthorityProperties authorityProperties,
			AccountXmlRepository accountXmlRepository,
			AccountProperties accountProperties,
			UserXmlRepository userXmlRepository,
			UserProperties userProperties) {
		return args -> {
//			insertAuthority(authorityXmlRepository, authorityProperties);
//			insertAccount(accountXmlRepository, accountProperties);
//			insertUser(userXmlRepository, userProperties);
		};
	}

//	@Bean
//	public CommandLineRunner run(
//			ObavestenjeXmlRepository obavestenjeXmlRepository,
//			ZahtevXmlRepository zahtevXmlRepository,
//			ObavestenjeRDFRepository obavestenjeRDFRepository,
//			ZahtevRDFRepository zahtevRDFRepository,
//			ObavestenjeProperties obavestenjeProperties,
//			ZahtevProperties zahtevProperties) {
//		return args -> {
//			//testObavestenje(obavestenjeXmlRepository, obavestenjeRDFRepository, obavestenjeProperties);
//			//testZahtev(zahtevXmlRepository, zahtevRDFRepository, zahtevProperties);
//
//		};
//	}
//
//	public void testObavestenje(ObavestenjeXmlRepository xmlRepository, ObavestenjeRDFRepository rdfRepository, ObavestenjeProperties properties) throws JAXBException, SAXException, FileNotFoundException, TransformerException, XMLDBException {
//		JaxbMarshaller<Obavestenje> m = new JaxbMarshaller<>(properties);
//		Obavestenje resenje = m.unmarshal(new FileInputStream("data/xml/obavestenje1.xml"));
//
//		rdfRepository.saveMetadata(resenje);
//	}
//
//	public void testZahtev(ZahtevXmlRepository xmlRepository, ZahtevRDFRepository rdfRepository, ZahtevProperties properties) throws JAXBException, SAXException, FileNotFoundException, TransformerException, XMLDBException {
//		JaxbMarshaller<Zahtev> m = new JaxbMarshaller<>(properties);
//		Zahtev resenje = m.unmarshal(new FileInputStream("data/xml/zahtev1.xml"));
//
//		rdfRepository.saveMetadata(resenje);
//	}

		public void insertAuthority(AuthorityXmlRepository xmlRepository, AuthorityProperties properties) throws JAXBException, SAXException, IOException, XMLDBException {
		JaxbMarshaller<Authority> m = new JaxbMarshaller<>(properties);

		Authority authority = m.unmarshal(new FileInputStream("data/xml/authority.xml"));

		Long id = xmlRepository.createWithId(authority, 1L);
		authority = xmlRepository.findById(id).get();
	}

	public void insertAccount(AccountXmlRepository xmlRepository, AccountProperties properties) throws JAXBException, XMLDBException, FileNotFoundException, SAXException {
		JaxbMarshaller<Account> m = new JaxbMarshaller<>(properties);

		Account authority = m.unmarshal(new FileInputStream("data/xml/account.xml"));

		Long id = xmlRepository.createWithId(authority, 1L);
		authority = xmlRepository.findById(id).get();
	}

	public void insertUser(UserXmlRepository xmlRepository, UserProperties properties) throws FileNotFoundException, JAXBException, XMLDBException, SAXException {
		JaxbMarshaller<User> m = new JaxbMarshaller<>(properties);

		User authority = m.unmarshal(new FileInputStream("data/xml/user.xml"));

		Long id = xmlRepository.createWithId(authority, 1L);
		authority = xmlRepository.findById(id).get();
	}

}
