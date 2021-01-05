package rs.ac.uns.ftn.xml.tim11.commissionerservice.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Utilities to support and simplify examples.
 */
public class AuthenticationUtilities {

    private static final String connectionUri = "xmldb:exist://%1$s:%2$s/exist/xmlrpc";

    /**
     * Connection parameters.
     */
    static public class ConnectionProperties {

        public String endpoint;
        public String dataset;

        public String host;
        public int port = -1;
        public String user;
        public String password;
        public String driver;
        public String uri;
        public String updateEndpoint;
        public String dataEndpoint;

        public ConnectionProperties(Properties props) {
            super();
            dataset = props.getProperty("conn.dataset").trim();
            endpoint = props.getProperty("conn.endpoint").trim();

            user = props.getProperty("conn.user").trim();
            password = props.getProperty("conn.password").trim();

            host = props.getProperty("conn.host").trim();
            port = Integer.parseInt(props.getProperty("conn.port"));

            uri = String.format(connectionUri, host, port);

            driver = props.getProperty("conn.driver").trim();

            updateEndpoint = String.join("/", endpoint, dataset, props.getProperty("conn.update").trim());
            dataEndpoint = String.join("/", endpoint, dataset, props.getProperty("conn.data").trim());

        }
    }

    /**
     * Read the configuration properties for the example.
     *
     * @return the configuration object
     */
    public static ConnectionProperties loadProperties() throws IOException {
        String propsName = "application.properties";

        InputStream propsStream = openStream(propsName);
        if (propsStream == null)
            throw new IOException("Could not read properties " + propsName);

        Properties props = new Properties();
        props.load(propsStream);

        return new ConnectionProperties(props);
    }

    /**
     * Read a resource for an example.
     *
     * @param fileName
     *            the name of the resource
     * @return an input stream for the resource
     * @throws IOException
     */
    public static InputStream openStream(String fileName) throws IOException {
        return AuthenticationUtilities.class.getClassLoader().getResourceAsStream(fileName);
    }

}
