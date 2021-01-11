package rs.ac.uns.ftn.xml.tim11.commissionerservice.repository.XML;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.model.zalbanaodluku.ZalbaNaOdluku;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.util.XML.DbConnection;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.util.XML.XQueryExpressions;

import javax.xml.bind.JAXBException;

@Repository
public class ZalbaNaOdlukuXmlRepository extends XmlRepository<ZalbaNaOdluku> {
    @Value("${xml.collectionId.zalba-na-odluku}")
    private String collectionId;

    @Value("${xml.namespace.zalba-na-odluku}")
    private String namespace;

    public ZalbaNaOdlukuXmlRepository(DbConnection conn) throws JAXBException {
        super(conn);
    }

    @Override
    protected String collectionId() {
        return collectionId;
    }

    @Override
    protected String contextPath() {
        return ZalbaNaOdluku.class.getPackage().getName();
    }

    @Override
    protected XQueryExpressions expressions() {
        return new XQueryExpressions(
                namespace,
                collectionId,
                ZalbaNaOdluku.class.getSimpleName()
        );
    }
}