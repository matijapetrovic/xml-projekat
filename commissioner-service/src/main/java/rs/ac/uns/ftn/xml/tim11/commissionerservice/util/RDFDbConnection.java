package rs.ac.uns.ftn.xml.tim11.commissionerservice.util;

import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.HttpClient;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;
import org.apache.jena.sparql.modify.UpdateProcessRemote;
import org.apache.jena.update.UpdateProcessor;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class RDFDbConnection {
    FusekiAuthenticationUtilities.ConnectionProperties connectionProperties;

    public RDFDbConnection() throws IOException {
        connectionProperties = FusekiAuthenticationUtilities.loadProperties();
    }

    public void setClient(UpdateProcessor processor) {
        CredentialsProvider provider = new BasicCredentialsProvider();

        provider.setCredentials(new AuthScope(AuthScope.ANY_HOST, AuthScope.ANY_PORT),
                new UsernamePasswordCredentials(connectionProperties.user, connectionProperties.password));
        HttpContext httpContext = new BasicHttpContext();
        httpContext.setAttribute(HttpClientContext.CREDS_PROVIDER, provider);

        ((UpdateProcessRemote) processor).setHttpContext(httpContext);
        HttpClient test = ((UpdateProcessRemote) processor).getClient();
    }

    public String getUpdateEndpoint() {
        return connectionProperties.updateEndpoint;
    }

    public String getDataEndpoint() {
        return connectionProperties.dataEndpoint;
    }
}
