package rs.ac.uns.ftn.xml.tim11.commissionerservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.xmldb.api.base.XMLDBException;
import rs.ac.uns.ftn.xml.tim11.xmllib.exist.util.DbConnection;
import rs.ac.uns.ftn.xml.tim11.xmllib.fuseki.util.RDFDbConnection;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.validation.SchemaFactory;
import java.io.IOException;

@Configuration
public class BeanConfiguration {

    private DbConnection dbConnection;
    private RDFDbConnection rdfDbConnection;

    @Bean
    public DbConnection dbConnection() throws
            XMLDBException, ClassNotFoundException, InstantiationException, IllegalAccessException, IOException {
        if (dbConnection == null)
            dbConnection = new DbConnection();
        return dbConnection;
    }

    @Bean
    public RDFDbConnection rdfDbConnection() throws IOException {
        if (rdfDbConnection == null)
            rdfDbConnection = new RDFDbConnection();
        return rdfDbConnection;
    }

}
