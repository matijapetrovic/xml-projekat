package rs.ac.uns.ftn.xml.tim11.xmllib;

import rs.ac.uns.ftn.xml.tim11.xmllib.exist.util.XQueryExpressions;

public interface XmlResourceProperties {
    String contextPath();
    String namespace();
    String schemaPath();
    String xslFoPath();
    String xslPath();
    String namedGraph();
    String collectionId();
    XQueryExpressions xQueryExpressions();
}
