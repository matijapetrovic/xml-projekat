package rs.ac.uns.ftn.xml.tim11.authoritybodyservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.xml.sax.SAXException;
import org.xmldb.api.base.XMLDBException;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.core.AuthenticationService;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.core.PasswordEncoder;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.model.obavestenje.Obavestenje;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.model.user.Account;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.model.user.Authority;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.model.user.User;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.model.zahtev.Zahtev;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.repository.rdf.ObavestenjeRDFRepository;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.repository.rdf.ZahtevRDFRepository;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.repository.xml.*;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.service.zahtev.ZahtevService;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.util.properties.*;
import rs.ac.uns.ftn.xml.tim11.xmllib.exist.exception.XmlResourceNotFoundException;
import rs.ac.uns.ftn.xml.tim11.xmllib.jaxb.JaxbMarshaller;

import javax.xml.bind.JAXBException;
import javax.xml.transform.TransformerException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

@SpringBootApplication
public class AuthorityBodyServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthorityBodyServiceApplication.class, args);
	}

	@Bean
	public CommandLineRunner run(
			AuthorityXmlRepository authorityXmlRepository,
			AuthorityProperties authorityProperties,
			AccountXmlRepository accountXmlRepository,
			AccountProperties accountProperties,
			UserXmlRepository userXmlRepository,
			UserProperties userProperties,
			PasswordEncoder encoder
//			ZahtevRDFRepository zahtevRDFRepository,
//			ZahtevXmlRepository zahtevXmlRepository,
//			ZahtevProperties zahtevProperties,
//			ZahtevService zahtevService,
//			AuthenticationService authenticationService
	) {
		return args -> {
			insertAuthority(authorityXmlRepository, authorityProperties);
			insertAccount(accountXmlRepository, accountProperties, encoder);
			insertUser(userXmlRepository, userProperties, encoder);
//			authenticationService.authenticate("admin@gmail.com", "admin");
//			testZahtev(zahtevXmlRepository, zahtevRDFRepository, zahtevProperties, zahtevService);
		};
	}

	public void insertAuthority(AuthorityXmlRepository xmlRepository, AuthorityProperties properties) throws JAXBException, SAXException, IOException, XMLDBException {
		JaxbMarshaller<Authority> m = new JaxbMarshaller<>(properties);

		Authority authority = new Authority();
		authority.setName("ROLE_USER");
		Long id = xmlRepository.createWithId(authority, 1L);

		authority = xmlRepository.findById(id).get();
		authority = new Authority();
		authority.setName("ROLE_AUTHORITY_BODY");

		id = xmlRepository.createWithId(authority, 2L);

		authority = xmlRepository.findById(id).get();
	}

	public void insertAccount(AccountXmlRepository xmlRepository, AccountProperties properties, PasswordEncoder encoder) throws JAXBException, XMLDBException, FileNotFoundException, SAXException {
		Authority authority = new Authority();
		authority.setName("ROLE_USER");
		Account account = new Account();
		account.setEmail("user@gmail.com");
		account.setPassword(encoder.encode("admin"));
		Account.Authorities authorities = new Account.Authorities();
		authorities.setAuthority(List.of(authority));
		account.setAuthorities(authorities);
		Long id = xmlRepository.createWithId(account, 1L);
		account = xmlRepository.findById(id).get();

		authority = new Authority();
		authority.setName("ROLE_AUTHORITY_BODY");
		account = new Account();
		account.setEmail("admin@gmail.com");
		account.setPassword(encoder.encode("admin"));
		authorities = new Account.Authorities();
		authorities.setAuthority(List.of(authority));
		account.setAuthorities(authorities);
		id = xmlRepository.createWithId(account, 2L);
		account = xmlRepository.findById(id).get();

	}

	public void insertUser(UserXmlRepository xmlRepository, UserProperties properties, PasswordEncoder encoder) throws FileNotFoundException, JAXBException, XMLDBException, SAXException {
		Authority authority = new Authority();
		authority.setName("ROLE_USER");
		Account account = new Account();
		account.setEmail("user@gmail.com");
		account.setPassword(encoder.encode("admin"));
		Account.Authorities authorities = new Account.Authorities();
		authorities.setAuthority(List.of(authority));
		account.setAuthorities(authorities);
		User user = new User();
		user.setAccount(account);
		user.setFirstName("User Name");
		user.setLastName("User Last name");
		Long id = xmlRepository.createWithId(user, 1L);
		xmlRepository.findById(id);


		authority = new Authority();
		authority.setName("ROLE_AUTHORITY_BODY");
		account = new Account();
		account.setEmail("admin@gmail.com");
		account.setPassword(encoder.encode("admin"));
		authorities = new Account.Authorities();
		authorities.setAuthority(List.of(authority));
		account.setAuthorities(authorities);
		user = new User();
		user.setAccount(account);
		user.setFirstName("Authority body Name");
		user.setLastName("Authority body  Last name");
		id = xmlRepository.createWithId(user, 2L);
		xmlRepository.findById(id);
	}

//	@Bean
//	public CommandLineRunner run(
//			ObavestenjeXmlRepository obavestenjeXmlRepository,
//			ZahtevXmlRepository zahtevXmlRepository,
//			ObavestenjeRDFRepository obavestenjeRDFRepository,
//			ZahtevRDFRepository zahtevRDFRepository,
//			ObavestenjeProperties obavestenjeProperties,
//			ZahtevProperties zahtevProperties,
//			ZahtevService zahtevService) {
//		return args -> {
//			testObavestenje(obavestenjeXmlRepository, obavestenjeRDFRepository, obavestenjeProperties);
//			testZahtev(zahtevXmlRepository, zahtevRDFRepository, zahtevProperties, zahtevService);
//		};
//	}

	public void testObavestenje(ObavestenjeXmlRepository xmlRepository, ObavestenjeRDFRepository rdfRepository, ObavestenjeProperties properties) throws JAXBException, SAXException, FileNotFoundException, TransformerException, XMLDBException {
		JaxbMarshaller<Obavestenje> m = new JaxbMarshaller<>(properties);
		Obavestenje resenje = m.unmarshal(new FileInputStream("data/xml/obavestenje1.xml"));

		rdfRepository.saveMetadata(resenje);
	}

	public void testZahtev(ZahtevXmlRepository xmlRepository, ZahtevRDFRepository rdfRepository, ZahtevProperties properties, ZahtevService zahtevService) throws JAXBException, SAXException, IOException, TransformerException, XMLDBException {
		JaxbMarshaller<Zahtev> m = new JaxbMarshaller<>(properties);
		Zahtev resenje = m.unmarshal(new FileInputStream("data/xml/zahtev1.xml"));
		zahtevService.create(resenje);

	}

}
