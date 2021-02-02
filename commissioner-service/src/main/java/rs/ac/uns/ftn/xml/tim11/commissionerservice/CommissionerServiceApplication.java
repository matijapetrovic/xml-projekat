package rs.ac.uns.ftn.xml.tim11.commissionerservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.xml.sax.SAXException;
import org.xmldb.api.base.XMLDBException;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.model.user.Account;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.model.user.Authority;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.model.user.User;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.repository.xml.AccountXmlRepository;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.repository.xml.AuthorityXmlRepository;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.repository.xml.UserXmlRepository;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.util.AccountProperties;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.util.AuthorityProperties;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.util.UserProperties;
import rs.ac.uns.ftn.xml.tim11.xmllib.jaxb.JaxbMarshaller;

import javax.xml.bind.JAXBException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

@SpringBootApplication
public class CommissionerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommissionerServiceApplication.class, args);
	}


//	@Bean
//	public CommandLineRunner run(
//			ZalbaCutanjeXmlRepository zalbaCutanjeXmlRepository,
//			ZalbaNaOdlukuXmlRepository zalbaNaOdlukuXmlRepository,
//			ResenjeXmlRepository resenjeXmlRepository,
//			ZalbaCutanjeRDFRepository zalbaCutanjeRDFRepository,
//			ZalbaNaOdlukuRDFRepository zalbaNaOdlukuRDFRepository,
//			ResenjeRDFRepository resenjeRDFRepository,
//			ZalbaCutanjeProperties zalbaCutanjeProperties,
//			ZalbaNaOdlukuProperties zalbaNaOdlukuProperties,
//			ResenjeProperties resenjeProperties) {
//		return args -> {
//			testZalbaCutanje(zalbaCutanjeXmlRepository, zalbaCutanjeRDFRepository, zalbaCutanjeProperties);
//			testZalbaNaOdluku(zalbaNaOdlukuXmlRepository, zalbaNaOdlukuRDFRepository, zalbaNaOdlukuProperties);
//			testResenje(resenjeXmlRepository, resenjeRDFRepository, resenjeProperties);
//		};
//	}
//
//	public void testZalbaCutanje(ZalbaCutanjeXmlRepository xmlRepository, ZalbaCutanjeRDFRepository rdfRepository, ZalbaCutanjeProperties properties) throws JAXBException, SAXException, FileNotFoundException, TransformerException, XMLDBException {
//		JaxbMarshaller<ZalbaCutanje> m = new JaxbMarshaller<>(properties);
//		ZalbaCutanje resenje = m.unmarshal(new FileInputStream("data/xml/zalbacutanje1.xml"));
//
//		Long id = xmlRepository.create(resenje);
//		resenje = xmlRepository.findById(id).get();
//
//		rdfRepository.saveMetadata(resenje);
//	}
//
//	public void testZalbaNaOdluku(ZalbaNaOdlukuXmlRepository xmlRepository, ZalbaNaOdlukuRDFRepository rdfRepository, ZalbaNaOdlukuProperties properties) throws JAXBException, SAXException, FileNotFoundException, TransformerException, XMLDBException {
//		JaxbMarshaller<ZalbaNaOdluku> m = new JaxbMarshaller<>(properties);
//		ZalbaNaOdluku resenje = m.unmarshal(new FileInputStream("data/xml/zalbanaodluku1.xml"));
//
//		Long id = xmlRepository.create(resenje);
//		resenje = xmlRepository.findById(id).get();
//
//		rdfRepository.saveMetadata(resenje);
//	}
//
//	public void testResenje(ResenjeXmlRepository xmlRepository, ResenjeRDFRepository rdfRepository, ResenjeProperties properties) throws JAXBException, SAXException, FileNotFoundException, TransformerException, XMLDBException {
//		JaxbMarshaller<Resenje> m = new JaxbMarshaller<>(properties);
//		Resenje resenje = m.unmarshal(new FileInputStream("data/xml/resenje1.xml"));
//
//		Long id = xmlRepository.create(resenje);
//		resenje = xmlRepository.findById(id).get();
//
//		rdfRepository.saveMetadata(resenje);
//	}

//	public void insertAuthority(AuthorityXmlRepository xmlRepository, AuthorityProperties properties) throws JAXBException, SAXException, IOException, XMLDBException {
//		JaxbMarshaller<Authority> m = new JaxbMarshaller<>(properties);
//
//		Authority authority = m.unmarshal(new FileInputStream("data/xml/authority.xml"));
//
//		Long id = xmlRepository.createWithId(authority, 1L);
//		authority = xmlRepository.findById(id).get();
//	}
//
//	public void insertAccount(AccountXmlRepository xmlRepository, AccountProperties properties) throws JAXBException, XMLDBException, FileNotFoundException, SAXException {
//		JaxbMarshaller<Account> m = new JaxbMarshaller<>(properties);
//
//		Account authority = m.unmarshal(new FileInputStream("data/xml/account.xml"));
//
//		Long id = xmlRepository.createWithId(authority, 1L);
//		authority = xmlRepository.findById(id).get();
//	}
//
//	public void insertUser(UserXmlRepository xmlRepository, UserProperties properties) throws FileNotFoundException, JAXBException, XMLDBException, SAXException {
//		JaxbMarshaller<User> m = new JaxbMarshaller<>(properties);
//
//		User authority = m.unmarshal(new FileInputStream("data/xml/user.xml"));
//
//		Long id = xmlRepository.createWithId(authority, 1L);
//		authority = xmlRepository.findById(id).get();
//	}
}
