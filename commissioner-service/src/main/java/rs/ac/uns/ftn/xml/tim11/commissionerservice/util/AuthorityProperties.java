package rs.ac.uns.ftn.xml.tim11.commissionerservice.util;

import org.springframework.beans.factory.annotation.Value;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.model.resenje.Resenje;
import rs.ac.uns.ftn.xml.tim11.xmllib.XmlResourceProperties;
import rs.ac.uns.ftn.xml.tim11.xmllib.exist.util.XQueryExpressions;

public class AuthorityProperties implements XmlResourceProperties {
    @Value("${rdf.named-graph.authority}")
    private String namedGraph;

    @Value("${xml.collectionId.authority}")
    private String collectionId;

    @Value("${xml.namespace.authority}")
    private String namespace;

    @Value("${xml.schema.authority}")
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
