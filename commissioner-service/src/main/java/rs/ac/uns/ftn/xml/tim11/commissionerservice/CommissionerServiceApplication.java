package rs.ac.uns.ftn.xml.tim11.commissionerservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.xml.sax.SAXException;
import org.xmldb.api.base.XMLDBException;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.soap.resenje.ResenjePort;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.soap.resenje.ResenjeSoapService;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.core.PasswordEncoder;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.model.user.Account;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.model.user.Authority;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.model.user.User;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.model.zalbacutanje.ZalbaCutanje;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.repository.rdf.ZalbaCutanjeRDFRepository;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.repository.xml.*;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.util.*;
import rs.ac.uns.ftn.xml.tim11.xmllib.exist.exception.XmlResourceNotFoundException;
import rs.ac.uns.ftn.xml.tim11.xmllib.jaxb.JaxbMarshaller;
import rs.ac.uns.ftn.xml.tim11.xmllib.model.resenje.Resenje;

import javax.xml.bind.JAXBException;
import javax.xml.namespace.QName;
import javax.xml.transform.TransformerException;
import javax.xml.ws.Service;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

@SpringBootApplication
public class CommissionerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommissionerServiceApplication.class, args);
	}


	@Bean
	public CommandLineRunner run(
			AuthorityXmlRepository authorityXmlRepository,
			AuthorityProperties authorityProperties,
			AccountXmlRepository accountXmlRepository,
			AccountProperties accountProperties,
			UserXmlRepository userXmlRepository,
			UserProperties userProperties,
			ResenjeXmlRepository xmlRepository,
			ResenjeProperties resenjeProperties,
			PasswordEncoder encoder) {
		return args -> {
			sendResenjeToAuthority(xmlRepository, resenjeProperties);
//			insertAuthority(authorityXmlRepository, authorityProperties);
//			insertAccount(accountXmlRepository, accountProperties, encoder);
//			insertUser(userXmlRepository, userProperties, encoder);
		};
	}

	public void sendResenjeToAuthority(ResenjeXmlRepository xmlRepository, ResenjeProperties properties) throws JAXBException, SAXException, FileNotFoundException, MalformedURLException, XMLDBException, XmlResourceNotFoundException, MalformedURLException, XmlResourceNotFoundException {
		JaxbMarshaller<Resenje> m = new JaxbMarshaller<>(properties);
		Resenje resenje = m.unmarshal(new FileInputStream("data/xml/resenje1.xml"));

//
//		URL wsdlLocation = new URL("http://localhost:8082/ws/resenje?wsdl");
//		QName serviceName = new QName("http://soap.spring.com/ws/resenje", "ResenjeSoapService");
//		QName portName = new QName("http://soap.spring.com/ws/resenje", "ResenjeServicePort");
//
//		Service service = Service.create(wsdlLocation, serviceName);
//
//		ResenjePort resenjePort = service.getPort(portName, ResenjePort.class);

//		resenjePort.receiveResenje(resenje) ;
		ResenjeSoapService service = new ResenjeSoapService(new URL("http://localhost:8082/ws/resenje?wsdl"));
		ResenjePort resenjePort = service.getResenjePort();
		resenjePort.receiveResenje(resenje);
	}

	public void insertAuthority(AuthorityXmlRepository xmlRepository, AuthorityProperties properties) throws JAXBException, SAXException, IOException, XMLDBException {
		JaxbMarshaller<Authority> m = new JaxbMarshaller<>(properties);

		Authority authority = new Authority();
		authority.setName("ROLE_USER");
		Long id = xmlRepository.createWithId(authority, 1L);

		authority = xmlRepository.findById(id).get();
		authority = new Authority();
		authority.setName("ROLE_COMMISSIONER");

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
		authority.setName("ROLE_COMMISSIONER");
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
		authority.setName("ROLE_COMMISSIONER");
		account = new Account();
		account.setEmail("admin@gmail.com");
		account.setPassword(encoder.encode("admin"));
		authorities = new Account.Authorities();
		authorities.setAuthority(List.of(authority));
		account.setAuthorities(authorities);
		user = new User();
		user.setAccount(account);
		user.setFirstName("Commissioner Name");
		user.setLastName("Commissioner Last name");
		id = xmlRepository.createWithId(user, 2L);
		xmlRepository.findById(id);
	}
}
