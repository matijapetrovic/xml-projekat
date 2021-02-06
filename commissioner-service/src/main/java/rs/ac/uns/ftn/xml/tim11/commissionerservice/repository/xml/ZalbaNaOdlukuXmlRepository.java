package rs.ac.uns.ftn.xml.tim11.commissionerservice.repository.xml;

import org.springframework.stereotype.Repository;
import org.xml.sax.SAXException;
import org.xmldb.api.base.Collection;
import org.xmldb.api.base.ResourceIterator;
import org.xmldb.api.base.ResourceSet;
import org.xmldb.api.base.XMLDBException;
import org.xmldb.api.modules.XMLResource;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.model.zalbanaodluku.ZalbaNaOdluku;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.util.ZalbaNaOdlukuProperties;
import rs.ac.uns.ftn.xml.tim11.xmllib.exist.XmlRepository;
import rs.ac.uns.ftn.xml.tim11.xmllib.exist.util.DbConnection;

import javax.xml.bind.JAXBException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ZalbaNaOdlukuXmlRepository extends XmlRepository<ZalbaNaOdluku> {

    public ZalbaNaOdlukuXmlRepository(DbConnection conn, ZalbaNaOdlukuProperties properties)
            throws JAXBException, SAXException {
        super(conn, properties);
    }

    public List<ZalbaNaOdluku> findAllByGradjanin(String email) throws XMLDBException, JAXBException {
        Collection collection = conn.getCollection(properties.collectionId());
        String query = String.format("/ZalbaNaOdluku/PodnosilacZalbe[@href[contains(., '%s')]]/ancestor::ZalbaNaOdluku", email);
        ResourceSet resourceSet = executeXPathQuery(collection, query);
        ResourceIterator resourceIterator = resourceSet.getIterator();

        List<ZalbaNaOdluku> result = new ArrayList<>();

        while (resourceIterator.hasMoreResources()){
            XMLResource xmlResource = (XMLResource) resourceIterator.nextResource();
            ZalbaNaOdluku zalba = marshaller.unmarshal(xmlResource.getContentAsDOM());
            result.add(zalba);
        }

        return result;
    }
}
