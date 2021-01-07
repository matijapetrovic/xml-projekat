package rs.ac.uns.ftn.xml.tim11.commissionerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.xml.sax.SAXException;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.repository.ZalbaCutanjeRDFRepository;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.util.FusekiReader;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.util.FusekiWriter;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.util.MetadataExtractor;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.util.RDFDbConnection;

import javax.xml.transform.TransformerException;
import java.io.IOException;

@SpringBootApplication
public class CommissionerServiceApplication {

	public static void main(String[] args) throws IOException, SAXException, TransformerException {
		SpringApplication.run(CommissionerServiceApplication.class, args);

		MetadataExtractor metadataExtractor = new MetadataExtractor();
		RDFDbConnection rdfDbConnection = new RDFDbConnection();
		FusekiWriter writer = new FusekiWriter(rdfDbConnection);
		FusekiReader reader = new FusekiReader(rdfDbConnection);

		ZalbaCutanjeRDFRepository repository = new ZalbaCutanjeRDFRepository(metadataExtractor, writer, reader);

		repository.create();
		repository.read();
	}
}
