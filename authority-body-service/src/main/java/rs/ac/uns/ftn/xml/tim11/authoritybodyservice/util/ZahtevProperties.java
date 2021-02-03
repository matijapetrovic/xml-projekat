package rs.ac.uns.ftn.xml.tim11.authoritybodyservice.util;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.model.zahtev.Zahtev;
import rs.ac.uns.ftn.xml.tim11.xmllib.XmlResourceProperties;
import rs.ac.uns.ftn.xml.tim11.xmllib.exist.util.XQueryExpressions;

@Component
public class ZahtevProperties implements XmlResourceProperties {
    @Value("${rdf.named-graph.zahtev}")
    private String namedGraph;

    @Value("${xml.collectionId.zahtev}")
    private String collectionId;

    @Value("${xml.namespace.zahtev}")
    private String namespace;

    @Value("${xml.schema.zahtev}")
    private String schemaPath;

    @Value("${xml.xslfo.zahtev}")
    private String xslFoPath;

    @Value("${xml.xsl.zahtev}")
    private String xslPath;

    @Override
    public String contextPath() {
        return Zahtev.class.getPackage().getName();
    }

    @Override
    public String schemaPath() {
        return schemaPath;
    }

    @Override
    public String xslFoPath() {
        return xslFoPath;
    }

    @Override
    public String xslPath() {
        return xslPath;
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
                Zahtev.class.getSimpleName()
        );
    }
}

