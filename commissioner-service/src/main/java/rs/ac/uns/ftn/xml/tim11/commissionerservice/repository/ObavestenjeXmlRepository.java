package rs.ac.uns.ftn.xml.tim11.commissionerservice.repository;

import org.springframework.beans.factory.annotation.Value;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.model.obavestenje.Obavestenje;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.model.resenje.Resenje;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.util.DbConnection;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.util.XQueryExpressions;

import javax.xml.bind.JAXBException;

public class ObavestenjeXmlRepository extends XmlRepository<Obavestenje> {

    @Value("${xml.collectionId.obavestenje}")
    private String collectionId;

    @Value("${xml.namespace.obavestenje}")
    private String namespace;

    public ObavestenjeXmlRepository(DbConnection conn) throws JAXBException {
        super(conn);
    }

    @Override
    protected String collectionId() {
        return collectionId;
    }

    @Override
    protected String contextPath() {
        return Obavestenje.class.getPackage().getName();
    }

    @Override
    protected XQueryExpressions expressions() {
        return new XQueryExpressions(
                namespace,
                collectionId,
                Obavestenje.class.getSimpleName()
        );
    }
}
