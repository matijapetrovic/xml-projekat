package rs.ac.uns.ftn.xml.tim11.authoritybodyservice.util;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.model.obavestenje.Obavestenje;
import rs.ac.uns.ftn.xml.tim11.xmllib.XmlResourceProperties;
import rs.ac.uns.ftn.xml.tim11.xmllib.exist.util.XQueryExpressions;

@Component
public class ObavestenjeProperties implements XmlResourceProperties {
    @Value("${rdf.named-graph.obavestenje}")
    private String namedGraph;

    @Value("${xml.collectionId.obavestenje}")
    private String collectionId;

    @Value("${xml.namespace.obavestenje}")
    private String namespace;

    @Value("${xml.schema.obavestenje}")
    private String schemaPath;

    @Override
    public String contextPath() {
        return Obavestenje.class.getPackage().getName();
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
                Obavestenje.class.getSimpleName()
        );
    }
}

