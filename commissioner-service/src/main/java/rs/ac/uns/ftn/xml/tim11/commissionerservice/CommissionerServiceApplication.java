package rs.ac.uns.ftn.xml.tim11.commissionerservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.xml.sax.SAXException;
import org.xmldb.api.base.XMLDBException;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.core.PasswordEncoder;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.model.user.Account;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.model.user.Authority;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.model.user.User;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.model.zalbacutanje.ZalbaCutanje;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.repository.rdf.ZalbaCutanjeRDFRepository;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.repository.xml.AccountXmlRepository;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.repository.xml.AuthorityXmlRepository;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.repository.xml.UserXmlRepository;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.repository.xml.ZalbaCutanjeXmlRepository;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.util.AccountProperties;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.util.AuthorityProperties;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.util.UserProperties;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.util.ZalbaCutanjeProperties;
import rs.ac.uns.ftn.xml.tim11.xmllib.jaxb.JaxbMarshaller;

import javax.xml.bind.JAXBException;
import javax.xml.transform.TransformerException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
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
			PasswordEncoder encoder) {
		return args -> {
			insertAuthority(authorityXmlRepository, authorityProperties);
			insertAccount(accountXmlRepository, accountProperties, encoder);
			insertUser(userXmlRepository, userProperties, encoder);
		};
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
