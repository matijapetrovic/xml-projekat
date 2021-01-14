package rs.ac.uns.ftn.xml.tim11.xmllib.exist;

import org.xml.sax.SAXException;
import org.xmldb.api.base.*;
import org.xmldb.api.base.Collection;
import org.xmldb.api.modules.XMLResource;
import org.xmldb.api.modules.XQueryService;
import rs.ac.uns.ftn.xml.tim11.xmllib.XmlResourceProperties;
import rs.ac.uns.ftn.xml.tim11.xmllib.exist.util.DbConnection;
import rs.ac.uns.ftn.xml.tim11.xmllib.exist.exception.XmlResourceNotFoundException;
import rs.ac.uns.ftn.xml.tim11.xmllib.jaxb.JaxbMarshaller;

import javax.xml.bind.JAXBException;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.StringWriter;
import java.util.*;

public class XmlRepository<T> {
    private final XmlResourceProperties properties;
    private final DbConnection conn;
    private final JaxbMarshaller<T> marshaller;

    public XmlRepository(DbConnection conn, XmlResourceProperties properties)
            throws JAXBException, SAXException {
        this.conn = conn;
        this.properties = properties;
        this.marshaller = new JaxbMarshaller<>(properties);
    }

    @SuppressWarnings("unchecked")
    public List<T> findAll() throws XMLDBException, JAXBException {
        Collection collection = conn.getCollection(properties.collectionId());
        ResourceSet resourceSet = executeXQuery(collection, properties.xQueryExpressions().findAllExpression());
        ResourceIterator resourceIterator = resourceSet.getIterator();

        List<T> result = new ArrayList<>();

        while (resourceIterator.hasMoreResources()){
            XMLResource xmlResource = (XMLResource) resourceIterator.nextResource();
            T entity = marshaller.unmarshal(xmlResource.getContentAsDOM());
            result.add(entity);
        }

        return result;
    }

    @SuppressWarnings("unchecked")
    public Optional<T> findById(Long id) throws XMLDBException, JAXBException {
        Collection collection = conn.getCollection(properties.collectionId());

        XMLResource xmlResource = (XMLResource) collection.getResource(id + ".xml");
        if (xmlResource == null)
            return Optional.empty();

        T entity = marshaller.unmarshal(xmlResource.getContentAsDOM());
        return Optional.of(entity);
    }

    public Long create(T entity) throws JAXBException, XMLDBException {
        Collection collection = conn.getCollection(properties.collectionId());

        Long id = Math.abs(UUID.randomUUID().getLeastSignificantBits());
        XMLResource xmlResource = (XMLResource) collection.createResource(id.toString() + ".xml", XMLResource.RESOURCE_TYPE);

        OutputStream os = new ByteArrayOutputStream();
        marshaller.marshal(entity, os);
        xmlResource.setContent(os);
        collection.storeResource(xmlResource);
        return id;
    }

    public void update(Long id, T entity) throws XMLDBException, JAXBException, XmlResourceNotFoundException {
        Collection collection = conn.getCollection(properties.collectionId());
        StringWriter sw = new StringWriter();
        marshaller.marshal(entity, sw);

        String xml = stripOuterTags(sw.toString());
        ResourceSet resourceSet = executeXQuery(collection, properties.xQueryExpressions().updateByIdExpression(id + ".xml", xml));
        ResourceIterator resourceIterator = resourceSet.getIterator();

        if (!resourceIterator.hasMoreResources())
            throw new XmlResourceNotFoundException(String.format("Entity with id %s not found", id));
    }

    private String stripOuterTags(String xml) {
        String[] xmlFragments = xml.split("\n");
        String[] xmlFragmentsWithoutWrapper = Arrays.copyOfRange(xmlFragments, 2, xmlFragments.length - 1);
        return String.join("\n", xmlFragmentsWithoutWrapper);
    }

    public void deleteById(Long id) throws XMLDBException, XmlResourceNotFoundException {
        Collection collection = conn.getCollection(properties.collectionId());
        try {
            executeXQuery(collection, properties.xQueryExpressions().removeByIdExpression(id + ".xml"));
        } catch (XMLDBException ex) {
            throw new XmlResourceNotFoundException(String.format("Entity with id %d not found", id));
        }
    }

    private ResourceSet executeXQuery(Collection collection, String query) throws XMLDBException {
        System.out.println("Executing query:\n"+query);
        XQueryService xQueryService = (XQueryService) collection.getService("XQueryService", "1.0");
        CompiledExpression compiledExpression = xQueryService.compile(query);
        return xQueryService.execute(compiledExpression);
    }

}
