package rs.ac.uns.ftn.xml.tim11.commissionerservice.util.XML;

import org.springframework.stereotype.Component;
import org.xmldb.api.DatabaseManager;
import org.xmldb.api.base.Collection;
import org.xmldb.api.base.Database;
import org.xmldb.api.base.XMLDBException;
import org.xmldb.api.modules.CollectionManagementService;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.util.XML.AuthenticationUtilities;

import java.io.IOException;

@Component
public class DbConnection {
    AuthenticationUtilities.ConnectionProperties connectionProperties;

    public DbConnection() throws
            IOException,
            XMLDBException,
            ClassNotFoundException,
            InstantiationException,
            IllegalAccessException {
        connectionProperties = AuthenticationUtilities.loadProperties();
        initDriver();
    }

    private void initDriver() throws
            XMLDBException,
            ClassNotFoundException,
            IllegalAccessException,
            InstantiationException {
        System.out.println("[INFO] Loading driver class: " + connectionProperties.driver);
        Class<?> cl = Class.forName(connectionProperties.driver);

        Database database = (Database) cl.newInstance();
        database.setProperty("create-database", "true");

        DatabaseManager.registerDatabase(database);
    }

    public Collection getCollection(String collectionId) throws XMLDBException {
        return getOrCreateCollection(collectionId);
    }

    private Collection getOrCreateCollection(String collectionUri) throws XMLDBException {
        return getOrCreateCollection(collectionUri, 0);
    }

    private Collection getOrCreateCollection(String collectionUri, int pathSegmentOffset) throws XMLDBException {
        Collection col = DatabaseManager.getCollection(formatCollectionUri(collectionUri), connectionProperties.user, connectionProperties.password);

        // create the collection if it does not exist
        if (col == null) {

            if (collectionUri.startsWith("/")) {
                collectionUri = collectionUri.substring(1);
            }

            String[] pathSegments = collectionUri.split("/");

            if (pathSegments.length > 0) {
                StringBuilder path = new StringBuilder();

                for (int i = 0; i <= pathSegmentOffset; i++) {
                    path.append("/").append(pathSegments[i]);
                }

                Collection startCol = DatabaseManager.getCollection(this.formatCollectionUri(path.toString()), connectionProperties.user, connectionProperties.password);

                if (startCol == null) {

                    // child collection does not exist

                    String parentPath = path.substring(0, path.lastIndexOf("/"));
                    Collection parentCol = DatabaseManager.getCollection(this.formatCollectionUri(parentPath), connectionProperties.user, connectionProperties.password);

                    CollectionManagementService mgt = (CollectionManagementService) parentCol.getService("CollectionManagementService", "1.0");

                    System.out.println("[INFO] Creating the collection: " + pathSegments[pathSegmentOffset]);
                    col = mgt.createCollection(pathSegments[pathSegmentOffset]);

                    col.close();
                    parentCol.close();

                } else {
                    startCol.close();
                }
            }
            return getOrCreateCollection(collectionUri, ++pathSegmentOffset);
        } else {
            return col;
        }
    }

    private String formatCollectionUri(String collectionUri) {
        return connectionProperties.uri + collectionUri;
    }
}
