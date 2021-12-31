package project.quarkus.panache.resource;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.eclipse.microprofile.jwt.JsonWebToken;

import project.quarkus.panache.sso.object.UsuarioSSO;

@Path("/auth/")
public class AuthResource {
	
	@Inject
	JsonWebToken token;
	
	@GET
	@Path("info")
	public UsuarioSSO user() {
		return new UsuarioSSO(token);
	}

}
