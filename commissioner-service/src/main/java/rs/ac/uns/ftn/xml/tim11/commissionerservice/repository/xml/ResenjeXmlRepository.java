package rs.ac.uns.ftn.xml.tim11.commissionerservice.repository.xml;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.model.resenje.Resenje;
import rs.ac.uns.ftn.xml.tim11.xmllib.exist.XmlRepository;
import rs.ac.uns.ftn.xml.tim11.xmllib.exist.util.DbConnection;
import rs.ac.uns.ftn.xml.tim11.xmllib.exist.util.XQueryExpressions;

import javax.xml.bind.JAXBException;

@Repository
public class ResenjeXmlRepository extends XmlRepository<Resenje> {
    @Value("${xml.collectionId.resenje}")
    private String collectionId;

    @Value("${xml.namespace.resenje}")
    private String namespace;

    public ResenjeXmlRepository(DbConnection conn) throws JAXBException {
        super(conn);
    }

    @Override
    protected String collectionId() {
        return collectionId;
    }

    @Override
    protected String contextPath() {
        return Resenje.class.getPackage().getName();
    }

    @Override
    protected XQueryExpressions expressions() {
        return new XQueryExpressions(
                namespace,
                collectionId,
                Resenje.class.getSimpleName()
        );
    }
}
