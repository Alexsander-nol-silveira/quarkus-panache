package project.quarkus.panache.restclient;

import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.annotation.RegisterClientHeaders;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import project.quarkus.panache.restclient.model.PessoaJuridica;

@RegisterRestClient(configKey = "restClient-caixa-api")
@RegisterClientHeaders(RequestPermissionsHeaderFactory.class)
@Produces(MediaType.APPLICATION_JSON)
public interface PortalApiRestClient {
	
	@GET
	@Path("/cadastro-receita/v4/pessoas-juridicas/{CNPJ}")
	PessoaJuridica search(@PathParam("CNPJ") String cnpj);
	
}
