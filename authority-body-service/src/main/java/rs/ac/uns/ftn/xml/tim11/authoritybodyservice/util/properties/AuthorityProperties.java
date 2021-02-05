package rs.ac.uns.ftn.xml.tim11.authoritybodyservice.util.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.model.user.Authority;
import rs.ac.uns.ftn.xml.tim11.xmllib.XmlResourceProperties;
import rs.ac.uns.ftn.xml.tim11.xmllib.exist.util.XQueryExpressions;

@Component
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
    public String namespace() {
        return namespace;
    }

    @Override
    public String contextPath() {
        return Authority.class.getPackage().getName();
    }

    @Override
    public String schemaPath() {
        return schemaPath;
    }

    @Override
    public String xslFoPath() {
        return null;
    }

    @Override
    public String xslPath() {
        return null;
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
                Authority.class.getSimpleName()
        );
    }
}
