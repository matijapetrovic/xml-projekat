package rs.ac.uns.ftn.xml.tim11.commissionerservice.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.model.zalbanaodluku.ZalbaNaOdluku;
import rs.ac.uns.ftn.xml.tim11.xmllib.XmlResourceProperties;
import rs.ac.uns.ftn.xml.tim11.xmllib.exist.util.XQueryExpressions;

@Component
public class ZalbaNaOdlukuProperties implements XmlResourceProperties {
    @Value("${rdf.named-graph.zalba-na-odluku}")
    private String namedGraph;

    @Value("${xml.collectionId.zalba-na-odluku}")
    private String collectionId;

    @Value("${xml.namespace.zalba-na-odluku}")
    private String namespace;

    @Value("${xml.schema.zalba-na-odluku}")
    private String schemaPath;

    @Override
    public String contextPath() {
        return ZalbaNaOdluku.class.getPackage().getName();
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
                ZalbaNaOdluku.class.getSimpleName()
        );
    }
}
