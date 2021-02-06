package rs.ac.uns.ftn.xml.tim11.commissionerservice.repository.xml;

import org.springframework.stereotype.Repository;
import org.xml.sax.SAXException;
import org.xmldb.api.base.Collection;
import org.xmldb.api.base.ResourceIterator;
import org.xmldb.api.base.ResourceSet;
import org.xmldb.api.base.XMLDBException;
import org.xmldb.api.modules.XMLResource;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.model.resenje.Resenje;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.util.ResenjeProperties;
import rs.ac.uns.ftn.xml.tim11.xmllib.exist.XmlRepository;
import rs.ac.uns.ftn.xml.tim11.xmllib.exist.util.DbConnection;

import javax.xml.bind.JAXBException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ResenjeXmlRepository extends XmlRepository<Resenje> {


    public ResenjeXmlRepository(DbConnection conn, ResenjeProperties properties)
            throws JAXBException, SAXException {
        super(conn, properties);
    }

    public Optional<Resenje> findByNumber(String number) throws XMLDBException, JAXBException {
        for(Resenje resenje: this.findAll()) {
            if(resenje.getBrojResenja().equals(number))
                return Optional.ofNullable(resenje);
        }
        return Optional.empty();
    }

    public List<Resenje> findAllByGradjanin(String email) throws XMLDBException, JAXBException {
        Collection collection = conn.getCollection(properties.collectionId());
        String query = String.format("/Resebhe/PodnosilacZalbe[@href[contains(., '%s')]]/ancestor::Resenje", email);
        ResourceSet resourceSet = executeXPathQuery(collection, query);
        ResourceIterator resourceIterator = resourceSet.getIterator();

        List<Resenje> result = new ArrayList<>();

        while (resourceIterator.hasMoreResources()){
            XMLResource xmlResource = (XMLResource) resourceIterator.nextResource();
            Resenje resenje = marshaller.unmarshal(xmlResource.getContentAsDOM());
            result.add(resenje);
        }

        return result;
    }
}
