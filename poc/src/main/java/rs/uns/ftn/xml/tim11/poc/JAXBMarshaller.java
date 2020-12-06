package rs.uns.ftn.xml.tim11.poc;

import org.xml.sax.SAXException;
import rs.uns.ftn.xml.tim11.poc.obavestenje.model.Obavestenje;
import rs.uns.ftn.xml.tim11.poc.zahtev.model.Zahtevcir;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class JAXBMarshaller<T> {
    private final JAXBContext context;

    public JAXBMarshaller(JAXBContext context) {
        this.context = context;
    }

    public T unmarshall(File schemaFile, File xmlFile) throws JAXBException, SAXException {
        Unmarshaller unmarshaller = context.createUnmarshaller();

        SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        Schema schema = schemaFactory.newSchema(schemaFile);

        unmarshaller.setSchema(schema);

        return (T) unmarshaller.unmarshal(xmlFile);
    }

    public void marshall(Obavestenje obavestenje, File outputFile) throws JAXBException, FileNotFoundException {
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        marshaller.marshal(obavestenje, new FileOutputStream(outputFile));
    }

    public void marshall(Zahtevcir zahtev, File outputFile) throws JAXBException, FileNotFoundException {
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        marshaller.marshal(zahtev, new FileOutputStream(outputFile));
    }

}
