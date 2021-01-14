package rs.ac.uns.ftn.xml.tim11.commissionerservice.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.model.zalbacutanje.ZalbaCutanje;
import rs.ac.uns.ftn.xml.tim11.xmllib.XmlResourceProperties;
import rs.ac.uns.ftn.xml.tim11.xmllib.exist.util.XQueryExpressions;

@Component
public class ZalbaCutanjeProperties implements XmlResourceProperties {
    @Value("${rdf.named-graph.zalba-cutanje}")
    private String namedGraph;

    @Value("${xml.collectionId.zalba-cutanje}")
    private String collectionId;

    @Value("${xml.namespace.zalba-cutanje}")
    private String namespace;

    @Value("${xml.schema.zalba-cutanje}")
    private String schemaPath;

    @Override
    public String contextPath() {
        return ZalbaCutanje.class.getPackage().getName();
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
                ZalbaCutanje.class.getSimpleName()
        );
    }
}
