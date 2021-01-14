package rs.ac.uns.ftn.xml.tim11.commissionerservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.xml.sax.SAXException;
import org.xmldb.api.base.XMLDBException;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.model.resenje.Resenje;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.model.zalbacutanje.ZalbaCutanje;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.model.zalbanaodluku.ZalbaNaOdluku;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.repository.rdf.ResenjeRDFRepository;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.repository.rdf.ZalbaCutanjeRDFRepository;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.repository.rdf.ZalbaNaOdlukuRDFRepository;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.repository.xml.ResenjeXmlRepository;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.repository.xml.ZalbaCutanjeXmlRepository;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.repository.xml.ZalbaNaOdlukuXmlRepository;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.util.ResenjeProperties;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.util.ZalbaCutanjeProperties;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.util.ZalbaNaOdlukuProperties;
import rs.ac.uns.ftn.xml.tim11.xmllib.jaxb.JaxbMarshaller;

import javax.xml.bind.JAXBException;
import javax.xml.transform.TransformerException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

@SpringBootApplication
public class CommissionerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommissionerServiceApplication.class, args);
	}

	@Bean
	public CommandLineRunner run(
			ZalbaCutanjeXmlRepository zalbaCutanjeXmlRepository,
			ZalbaNaOdlukuXmlRepository zalbaNaOdlukuXmlRepository,
			ResenjeXmlRepository resenjeXmlRepository,
			ZalbaCutanjeRDFRepository zalbaCutanjeRDFRepository,
			ZalbaNaOdlukuRDFRepository zalbaNaOdlukuRDFRepository,
			ResenjeRDFRepository resenjeRDFRepository,
			ZalbaCutanjeProperties zalbaCutanjeProperties,
			ZalbaNaOdlukuProperties zalbaNaOdlukuProperties,
			ResenjeProperties resenjeProperties) {
		return args -> {
			testZalbaCutanje(zalbaCutanjeXmlRepository, zalbaCutanjeRDFRepository, zalbaCutanjeProperties);
			testZalbaNaOdluku(zalbaNaOdlukuXmlRepository, zalbaNaOdlukuRDFRepository, zalbaNaOdlukuProperties);
			testResenje(resenjeXmlRepository, resenjeRDFRepository, resenjeProperties);
		};
	}

	public void testZalbaCutanje(ZalbaCutanjeXmlRepository xmlRepository, ZalbaCutanjeRDFRepository rdfRepository, ZalbaCutanjeProperties properties) throws JAXBException, SAXException, FileNotFoundException, TransformerException, XMLDBException {
		JaxbMarshaller<ZalbaCutanje> m = new JaxbMarshaller<>(properties);
		ZalbaCutanje resenje = m.unmarshal(new FileInputStream("data/xml/zalbacutanje1.xml"));

		Long id = xmlRepository.create(resenje);
		resenje = xmlRepository.findById(id).get();

		rdfRepository.saveMetadata(resenje);
	}

	public void testZalbaNaOdluku(ZalbaNaOdlukuXmlRepository xmlRepository, ZalbaNaOdlukuRDFRepository rdfRepository, ZalbaNaOdlukuProperties properties) throws JAXBException, SAXException, FileNotFoundException, TransformerException, XMLDBException {
		JaxbMarshaller<ZalbaNaOdluku> m = new JaxbMarshaller<>(properties);
		ZalbaNaOdluku resenje = m.unmarshal(new FileInputStream("data/xml/zalbanaodluku1.xml"));

		Long id = xmlRepository.create(resenje);
		resenje = xmlRepository.findById(id).get();

		rdfRepository.saveMetadata(resenje);
	}

	public void testResenje(ResenjeXmlRepository xmlRepository, ResenjeRDFRepository rdfRepository, ResenjeProperties properties) throws JAXBException, SAXException, FileNotFoundException, TransformerException, XMLDBException {
		JaxbMarshaller<Resenje> m = new JaxbMarshaller<>(properties);
		Resenje resenje = m.unmarshal(new FileInputStream("data/xml/resenje1.xml"));

		Long id = xmlRepository.create(resenje);
		resenje = xmlRepository.findById(id).get();

		rdfRepository.saveMetadata(resenje);
	}
}
