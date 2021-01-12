package rs.ac.uns.ftn.xml.tim11.authoritybodyservice.repository.xml;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.model.obavestenje.Obavestenje;
import rs.ac.uns.ftn.xml.tim11.xmllib.exist.XmlRepository;
import rs.ac.uns.ftn.xml.tim11.xmllib.exist.util.DbConnection;
import rs.ac.uns.ftn.xml.tim11.xmllib.exist.util.XQueryExpressions;

import javax.xml.bind.JAXBException;

@Repository
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
