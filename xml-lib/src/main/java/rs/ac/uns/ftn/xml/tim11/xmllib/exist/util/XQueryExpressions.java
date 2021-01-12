package rs.ac.uns.ftn.xml.tim11.xmllib.exist.util;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class XQueryExpressions {
    private final String namespace;
    private final String collectionId;
    private final String documentName;

    public String findAllExpression() {
        String findAllExpression = "xquery version \"3.1\";\n" +
                "declare default element namespace \"%s\";\n" +
                "for $x in collection(\"%s\")\n" +
                "return $x";
        return String.format(findAllExpression, namespace, collectionId);
    }

    public String updateByIdExpression(String id, String xmlResource) {
        String updateByIdExpression = "xquery version \"3.1\";\n" +
                "xmldb:update(\"%s\",\n" +
                "    <xu:modifications version=\"1.0\"\n" +
                "    \txmlns:xu=\"http://www.xmldb.org/xupdate\"\n" +
                "    \txmlns=\"%s\">\n" +
                "    \t<xu:update select=\"doc('%s/%s')/%s\">\n" +
                "    \t%s\n" +
                "    \t</xu:update>\n" +
                "    </xu:modifications>)\n";
        return String.format(updateByIdExpression, collectionId, namespace, collectionId, id, documentName, xmlResource);
    }

    public String removeByIdExpression(String id) {
        String removeByIdExpression =
                "xquery version \"3.1\";\n" +
                        "xmldb:remove('%s', '%s')";
        return String.format(removeByIdExpression, collectionId, id);
    }
}
