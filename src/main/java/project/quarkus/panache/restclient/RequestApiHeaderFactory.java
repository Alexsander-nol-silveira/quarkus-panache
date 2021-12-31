package project.quarkus.panache.restclient;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.core.MultivaluedHashMap;
import javax.ws.rs.core.MultivaluedMap;

import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.eclipse.microprofile.jwt.JsonWebToken;
import org.eclipse.microprofile.rest.client.ext.ClientHeadersFactory;

@ApplicationScoped
public class RequestApiHeaderFactory implements ClientHeadersFactory {
	
	@Inject
	JsonWebToken token;
	
	@ConfigProperty(name = "apikey")
	String apikey;

    @Override
    public MultivaluedMap<String, String> update(MultivaluedMap<String, String> incomingHeaders, MultivaluedMap<String, String> clientOutgoingHeaders) {
        MultivaluedMap<String, String> result = new MultivaluedHashMap<>();
        
        result.add("apikey", apikey);
        result.add("Authorization", "Bearer " + token.getRawToken());
        
        return result;
    }
}