package rs.ac.uns.ftn.xml.tim11.xmllib.fuseki.queries;

import rs.ac.uns.ftn.xml.tim11.xmllib.fuseki.util.FusekiAuthenticationUtilities;

import java.io.IOException;
import java.util.ArrayList;

public class QueryBuilder {
    private static FusekiAuthenticationUtilities.ConnectionProperties connectionProperties;
    private static final String PREDICATE_NAMESPACE = "http://www.ftn.uns.ac.rs/xml/tim11/predicate/";

    static {
        try {
            connectionProperties =
                    FusekiAuthenticationUtilities.loadProperties();
        } catch (IOException e) {
            e.printStackTrace();
            connectionProperties = null;
        }
    }

    private final ArrayList<KeyValue> params;
    private final String subject;
    private final String endpoint;

    public QueryBuilder(String graphURI, String subject) {
        params = new ArrayList<>();
        this.endpoint = connectionProperties.dataEndpoint + graphURI;
        this.subject = subject;
    }

    public QueryBuilder addParam(String name, String value) {
        params.add(new KeyValue(name, value.trim()));
        return this;
    }

    public String build() {
        StringBuilder sb = new StringBuilder();

        sb.append(String.format("SELECT ?%s FROM <%s>\n", subject, endpoint));
        sb.append("WHERE {\n");
        for (KeyValue kv : params)
            sb.append(String.format("?%s <%s%s> \"%s\" .\n", subject, PREDICATE_NAMESPACE, kv.key, kv.value));
        sb.append("}");

        return sb.toString();
    }

    private static class KeyValue {
        String key;
        String value;

        private KeyValue(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }

}
