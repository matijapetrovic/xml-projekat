package rs.ac.uns.ftn.xml.tim11.commissionerservice.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.model.user.User;
import rs.ac.uns.ftn.xml.tim11.xmllib.XmlResourceProperties;
import rs.ac.uns.ftn.xml.tim11.xmllib.exist.util.XQueryExpressions;

@Component
public class UserProperties implements XmlResourceProperties {
    @Value("${rdf.named-graph.user}")
    private String namedGraph;

    @Value("${xml.collectionId.user}")
    private String collectionId;

    @Value("${xml.namespace.user}")
    private String namespace;

    @Value("${xml.schema.user}")
    private String schemaPath;

    @Override
    public String contextPath() {
        return User.class.getPackage().getName();
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
                User.class.getSimpleName()
        );
    }
}
