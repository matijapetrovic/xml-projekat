package rs.ac.uns.ftn.xml.tim11.xmllib.jaxb;

import org.w3c.dom.Node;
import org.xml.sax.SAXException;
import rs.ac.uns.ftn.xml.tim11.xmllib.XmlResourceProperties;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.validation.SchemaFactory;
import java.io.*;

public class JaxbMarshaller<T> {

    private final XmlResourceProperties properties;

    private final Marshaller marshaller;
    private final Unmarshaller unmarshaller;

    public JaxbMarshaller(XmlResourceProperties properties) throws JAXBException, SAXException {
        this.properties = properties;

        JAXBContext context = JAXBContext.newInstance(properties.contextPath());
        this.marshaller = createMarshaller(context);
        this.unmarshaller = createUnmarshaller(context);
    }

    private Unmarshaller createUnmarshaller(JAXBContext context) throws JAXBException, SAXException {
        Unmarshaller unmarshaller = context.createUnmarshaller();
        SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        unmarshaller.setSchema(schemaFactory.newSchema(new File(properties.schemaPath())));
        return unmarshaller;
    }

    private Marshaller createMarshaller(JAXBContext context) throws JAXBException {
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        return marshaller;
    }

    @SuppressWarnings("unchecked")
    public T unmarshal(InputStream in) throws JAXBException {
        return (T) unmarshaller.unmarshal(in);
    }

    @SuppressWarnings("unchecked")
    public T unmarshal(String s) throws JAXBException {
        return (T) unmarshaller.unmarshal(new ByteArrayInputStream(s.getBytes()));
    }

    @SuppressWarnings("unchecked")
    public T unmarshal(Node node) throws JAXBException {
        return (T) unmarshaller.unmarshal(node);
    }

    public void marshal(T entity, OutputStream out) throws JAXBException {
        marshaller.marshal(entity, out);
    }

    public String marshal(T entity) throws JAXBException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        marshaller.marshal(entity, out);
        return new String(out.toByteArray());
    }

    public void marshal(T entity, Node node) throws JAXBException {
        marshaller.marshal(entity, node);
    }

    public void marshal(T entity, StringWriter writer) throws JAXBException {
        marshaller.marshal(entity, writer);
    }
}
