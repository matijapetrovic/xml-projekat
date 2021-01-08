package rs.ac.uns.ftn.xml.tim11.commissionerservice.repository.XML;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.model.zalbacutanje.ZalbaCutanje;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.util.XML.DbConnection;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.util.XML.XQueryExpressions;

import javax.xml.bind.JAXBException;

@Repository
public class ZalbaCutanjeXmlRepository extends XmlRepository<ZalbaCutanje> {

    @Value("${xml.collectionId.zalba-cutanje}")
    private String collectionId;

    @Value("${xml.namespace.zalba-cutanje}")
    private String namespace;

    public ZalbaCutanjeXmlRepository(DbConnection dbConnection) throws JAXBException {
        super(dbConnection);
    }

    @Override
    protected String collectionId() {
        return collectionId;
    }

    @Override
    protected String contextPath() {
        return ZalbaCutanje.class.getPackage().getName();
    }

    @Override
    protected XQueryExpressions expressions() {
        return new XQueryExpressions(
                namespace,
                collectionId,
                ZalbaCutanje.class.getSimpleName()
        );
    }

}
