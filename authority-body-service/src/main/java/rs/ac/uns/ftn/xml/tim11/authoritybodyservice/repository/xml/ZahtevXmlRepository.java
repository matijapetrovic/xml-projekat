package rs.ac.uns.ftn.xml.tim11.authoritybodyservice.repository.xml;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.model.zahtev.Zahtev;
import rs.ac.uns.ftn.xml.tim11.xmllib.exist.XmlRepository;
import rs.ac.uns.ftn.xml.tim11.xmllib.exist.util.DbConnection;
import rs.ac.uns.ftn.xml.tim11.xmllib.exist.util.XQueryExpressions;

import javax.xml.bind.JAXBException;

@Repository
public class ZahtevXmlRepository extends XmlRepository<Zahtev> {
    @Value("${xml.collectionId.zahtev}")
    private String collectionId;

    @Value("${xml.namespace.zahtev}")
    private String namespace;

    public ZahtevXmlRepository(DbConnection dbConnection) throws JAXBException {
        super(dbConnection);
    }

    @Override
    protected String collectionId() {
        return collectionId;
    }

    @Override
    protected String contextPath() {
        return Zahtev.class.getPackage().getName();
    }

    @Override
    protected XQueryExpressions expressions() {
        return new XQueryExpressions(
                namespace,
                collectionId,
                Zahtev.class.getSimpleName()
        );
    }
}
