package project.quarkus.panache.restclient.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EnderecoContato {

	 public String cep;
	 public String municipio;
	 public String bairro;
	 
	 @JsonProperty("tipo-logradouro") 
	 public String tipoLogradouro;
	 
	 @JsonProperty("nome-logradouro") 
	 public String nomeLogradouro;
	 
	 @JsonProperty("sigla-posicao-determinante") 
	 public String siglaPosicaoDeterminante;
	 
	 @JsonProperty("posicao-determinante") 
	 public String posicaoDeterminante;
	 
	 @JsonProperty("complemento-posicao-determinante") 
	 public String complementoPosicaoDeterminante;
	 
	 public String uf;
	 public String pais;
	 
	 @JsonProperty("e-mail") 
	 public String eMail;
	 
	 @JsonProperty("telefone-principal") 
	 public String telefonePrincipal;
	 
	 @JsonProperty("telefone-secundario") 
	 public String telefoneSecundario;
	 
	 @JsonProperty("telefone-fax") 
	 public String telefoneFax;
	
}
