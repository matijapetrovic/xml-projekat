package rs.ac.uns.ftn.xml.tim11.commissionerservice.repository;

import rs.ac.uns.ftn.xml.tim11.commissionerservice.model.zalbacutanje.Zalba;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.util.DbConnection;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.util.XQueryExpressions;

import javax.xml.bind.JAXBException;

public class ZalbaCutanjeXmlRepository extends XmlRepository<Zalba>{

    public ZalbaCutanjeXmlRepository(DbConnection dbConnection) throws JAXBException {
        super(dbConnection);
    }

    @Override
    protected String collectionId() {
        return "db/sample/zalbe";
    }

    @Override
    protected String contextPath() {
        return "rs.ac.uns.ftn.xml.tim11.commissionerservice.model.zalbacutanje.Zalba";
    }

    @Override
    protected XQueryExpressions expressions() {
        return new XQueryExpressions(
                "zalbacutanje",
                collectionId(),
                "Zalba"
        );
    }

}
