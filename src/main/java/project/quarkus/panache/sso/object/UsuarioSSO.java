package project.quarkus.panache.sso.object;

import javax.validation.constraints.NotNull;

import org.eclipse.microprofile.jwt.JsonWebToken;

public class UsuarioSSO {

	private String nome;
	private String credencial;
	
	
	public UsuarioSSO(@NotNull final JsonWebToken token) {
		this.nome = token.claim("given_name").get().toString();
		this.credencial = token.claim("preferred_username").get().toString();
	}

	/**
	 * nome do usuário autenticado
	 * 
	 * @return nome do usuário
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * código da credencial do usuário autenticado
	 * 
	 * @return credencial
	 */
	public String getCredencial() {
		return credencial;
	}
	
}
