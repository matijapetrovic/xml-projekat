package rs.ac.uns.ftn.xml.tim11.commissionerservice.repository;

import org.xmldb.api.base.*;
import org.xmldb.api.base.Collection;
import org.xmldb.api.modules.XMLResource;
import org.xmldb.api.modules.XQueryService;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.exception.EntityNotFoundException;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.util.DbConnection;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.util.XQueryExpressions;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.StringWriter;
import java.util.*;

public abstract class XmlRepository<T> {
    protected abstract String collectionId();
    protected abstract String contextPath();
    protected abstract XQueryExpressions expressions();

    protected final DbConnection conn;
    private final Unmarshaller unmarshaller;
    private final Marshaller marshaller;

    public XmlRepository(DbConnection conn) throws JAXBException {
        this.conn = conn;
        JAXBContext context = JAXBContext.newInstance(contextPath());
        unmarshaller = context.createUnmarshaller();
        marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
    }

    @SuppressWarnings("unchecked")
    public List<T> findAll() throws XMLDBException, JAXBException {
        Collection collection = conn.getCollection(collectionId());
        ResourceSet resourceSet = executeXQuery(collection, expressions().findAllExpression());
        ResourceIterator resourceIterator = resourceSet.getIterator();

        List<T> result = new ArrayList<>();

        while (resourceIterator.hasMoreResources()){
            XMLResource xmlResource = (XMLResource) resourceIterator.nextResource();
            T entity = (T) unmarshaller.unmarshal(xmlResource.getContentAsDOM());
            result.add(entity);
        }

        return result;
    }

    @SuppressWarnings("unchecked")
    public Optional<T> findById(Long id) throws XMLDBException, JAXBException {
        Collection collection = conn.getCollection(collectionId());

        XMLResource xmlResource = (XMLResource) collection.getResource(id + ".xml");
        if (xmlResource == null)
            return Optional.empty();

        T entity = (T) unmarshaller.unmarshal(xmlResource.getContentAsDOM());
        return Optional.of(entity);
    }

    public Long create(T entity) throws JAXBException, XMLDBException {
        Collection collection = conn.getCollection(collectionId());

        Long id = Math.abs(UUID.randomUUID().getLeastSignificantBits());
        XMLResource xmlResource = (XMLResource) collection.createResource(id.toString() + ".xml", XMLResource.RESOURCE_TYPE);

        OutputStream os = new ByteArrayOutputStream();
        marshaller.marshal(entity, os);
        xmlResource.setContent(os);
        collection.storeResource(xmlResource);
        return id;
    }

    public void update(Long id, T entity) throws XMLDBException, JAXBException, EntityNotFoundException {
        Collection collection = conn.getCollection(collectionId());
        StringWriter sw = new StringWriter();
        marshaller.marshal(entity, sw);

        String xml = stripOuterTags(sw.toString());
        ResourceSet resourceSet = executeXQuery(collection, expressions().updateByIdExpression(id + ".xml", xml));
        ResourceIterator resourceIterator = resourceSet.getIterator();

        if (!resourceIterator.hasMoreResources())
            throw new EntityNotFoundException(String.format("Entity with id %s not found", id));
    }

    private String stripOuterTags(String xml) {
        String[] xmlFragments = xml.split("\n");
        String[] xmlFragmentsWithoutWrapper = Arrays.copyOfRange(xmlFragments, 2, xmlFragments.length - 1);
        return String.join("\n", xmlFragmentsWithoutWrapper);
    }

    public void deleteById(Long id) throws XMLDBException, EntityNotFoundException {
        Collection collection = conn.getCollection(collectionId());
        try {
            executeXQuery(collection, expressions().removeByIdExpression(id + ".xml"));
        } catch (XMLDBException ex) {
            throw new EntityNotFoundException(String.format("Entity with id %d not found", id));
        }
    }

    private ResourceSet executeXQuery(Collection collection, String query) throws XMLDBException {
        System.out.println("Executing query:\n"+query);
        XQueryService xQueryService = (XQueryService) collection.getService("XQueryService", "1.0");
        CompiledExpression compiledExpression = xQueryService.compile(query);
        return xQueryService.execute(compiledExpression);
    }

}
