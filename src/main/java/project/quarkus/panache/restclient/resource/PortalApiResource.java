package project.quarkus.panache.restclient.resource;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import io.quarkus.security.Authenticated;
import project.quarkus.panache.restclient.PortalApiRestClient;
import project.quarkus.panache.restclient.model.PessoaJuridica;

@Path("/portal/")
@Authenticated
public class PortalApiResource {
	
	@Inject
	@RestClient
	PortalApiRestClient portalApiRestClient;
	
	@GET
	@Path("receita/pessoajuridica/{CNPJ}")
	public PessoaJuridica receitaPessoaJuridica(@PathParam("CNPJ") String cnpj) {		
		return portalApiRestClient.search(cnpj);
	}
	
	
}
