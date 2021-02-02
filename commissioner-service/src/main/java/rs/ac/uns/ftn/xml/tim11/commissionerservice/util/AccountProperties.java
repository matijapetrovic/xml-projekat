package rs.ac.uns.ftn.xml.tim11.commissionerservice.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.model.user.Account;
import rs.ac.uns.ftn.xml.tim11.xmllib.XmlResourceProperties;
import rs.ac.uns.ftn.xml.tim11.xmllib.exist.util.XQueryExpressions;

@Component
public class AccountProperties implements XmlResourceProperties {
    @Value("${rdf.named-graph.account}")
    private String namedGraph;

    @Value("${xml.collectionId.account}")
    private String collectionId;

    @Value("${xml.namespace.account}")
    private String namespace;

    @Value("${xml.schema.account}")
    private String schemaPath;

    @Override
    public String contextPath() {
        return Account.class.getPackage().getName();
    }

    @Override
    public String schemaPath() {
        return schemaPath;
    }

    @Override
    public String namedGraph() {
        return namedGraph;
    }

    @Override
    public String collectionId() {
        return collectionId;
    }

    @Override
    public XQueryExpressions xQueryExpressions() {
        return new XQueryExpressions(
                namespace,
                collectionId,
                Account.class.getSimpleName()
        );
    }
}
