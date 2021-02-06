package rs.ac.uns.ftn.xml.tim11.commissionerservice.repository.xml;

import org.springframework.stereotype.Repository;
import org.xml.sax.SAXException;
import org.xmldb.api.base.Collection;
import org.xmldb.api.base.ResourceIterator;
import org.xmldb.api.base.ResourceSet;
import org.xmldb.api.base.XMLDBException;
import org.xmldb.api.modules.XMLResource;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.model.zalbacutanje.ZalbaCutanje;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.util.ZalbaCutanjeProperties;
import rs.ac.uns.ftn.xml.tim11.xmllib.exist.XmlRepository;
import rs.ac.uns.ftn.xml.tim11.xmllib.exist.util.DbConnection;

import javax.xml.bind.JAXBException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ZalbaCutanjeXmlRepository extends XmlRepository<ZalbaCutanje> {

    public ZalbaCutanjeXmlRepository(DbConnection dbConnection, ZalbaCutanjeProperties properties)
            throws JAXBException, SAXException {
        super(dbConnection, properties);
    }

    public List<ZalbaCutanje> findAllByGradjanin(String email) throws XMLDBException, JAXBException {
        Collection collection = conn.getCollection(properties.collectionId());
        String query = String.format("/ZalbaCutanje/PodnosilacZalbe[@href[contains(., '%s')]]/ancestor::ZalbaCutanje", email);
        ResourceSet resourceSet = executeXPathQuery(collection, query);
        ResourceIterator resourceIterator = resourceSet.getIterator();

        List<ZalbaCutanje> result = new ArrayList<>();

        while (resourceIterator.hasMoreResources()){
            XMLResource xmlResource = (XMLResource) resourceIterator.nextResource();
            ZalbaCutanje zahtev = marshaller.unmarshal(xmlResource.getContentAsDOM());
            result.add(zahtev);
        }

        return result;
    }
}
