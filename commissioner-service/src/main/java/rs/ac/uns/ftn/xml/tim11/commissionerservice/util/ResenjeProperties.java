package rs.ac.uns.ftn.xml.tim11.commissionerservice.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.model.resenje.Resenje;
import rs.ac.uns.ftn.xml.tim11.xmllib.XmlResourceProperties;
import rs.ac.uns.ftn.xml.tim11.xmllib.exist.util.XQueryExpressions;

@Component
public class ResenjeProperties implements XmlResourceProperties {
    @Value("${rdf.named-graph.resenje}")
    private String namedGraph;

    @Value("${xml.collectionId.resenje}")
    private String collectionId;

    @Value("${xml.namespace.resenje}")
    private String namespace;

    @Value("${xml.schema.resenje}")
    private String schemaPath;

    @Override
    public String contextPath() {
        return Resenje.class.getPackage().getName();
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
                Resenje.class.getSimpleName()
        );
    }
}
