package rs.ac.uns.ftn.xml.tim11.commissionerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.xml.sax.SAXException;
import org.xmldb.api.base.XMLDBException;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.repository.RDFRepository;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.util.CustomMetadataExtractor;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.util.DbConnection;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.util.MetadataExtractor;

import javax.xml.transform.TransformerException;
import java.io.IOException;

@SpringBootApplication
public class CommissionerServiceApplication {

	public static void main(String[] args) throws XMLDBException, ClassNotFoundException, InstantiationException, IllegalAccessException, IOException, SAXException, TransformerException {
		SpringApplication.run(CommissionerServiceApplication.class, args);
		DbConnection connection = new DbConnection();
		MetadataExtractor mdextractor = new MetadataExtractor();
		CustomMetadataExtractor extractor = new CustomMetadataExtractor(connection, mdextractor);
		RDFRepository repository = new RDFRepository(extractor);

		String xml = "data/xml/zalbacutanjecir.xml";
		String rdf = "gen/zalbacutanjecir.rdf";
		String XSLT_FILE = "/example/sparql/metadata";

		extractor.extract(xml, rdf, XSLT_FILE);
	}

}
