package rs.ac.uns.ftn.xml.tim11.authoritybodyservice.repository.xml;


import org.springframework.stereotype.Repository;
import org.xml.sax.SAXException;
import org.xmldb.api.base.Collection;
import org.xmldb.api.base.ResourceIterator;
import org.xmldb.api.base.ResourceSet;
import org.xmldb.api.base.XMLDBException;
import org.xmldb.api.modules.XMLResource;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.model.zahtev.Zahtev;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.util.properties.ZahtevProperties;
import rs.ac.uns.ftn.xml.tim11.xmllib.exist.XmlRepository;
import rs.ac.uns.ftn.xml.tim11.xmllib.exist.util.DbConnection;

import javax.xml.bind.JAXBException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ZahtevXmlRepository extends XmlRepository<Zahtev> {

    public ZahtevXmlRepository(DbConnection dbConnection, ZahtevProperties properties)
            throws JAXBException, SAXException {
        super(dbConnection, properties);
    }

    public List<Zahtev> findAllByGradjanin(String email) throws XMLDBException, JAXBException {
        Collection collection = conn.getCollection(properties.collectionId());
        String query = String.format("/Zahtev/TrazilacInformacija[@href[contains(., '%s')]]/ancestor::Zahtev", email);
        ResourceSet resourceSet = executeXPathQuery(collection, query);
        ResourceIterator resourceIterator = resourceSet.getIterator();

        List<Zahtev> result = new ArrayList<>();

        while (resourceIterator.hasMoreResources()){
            XMLResource xmlResource = (XMLResource) resourceIterator.nextResource();
            Zahtev zahtev = marshaller.unmarshal(xmlResource.getContentAsDOM());
            result.add(zahtev);
        }

        return result;
    }
}
