package project.quarkus.panache.restclient.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Estabelecimento {
	
	 public String pesnu;
	 public String cnpj;
	 
	 @JsonProperty("data-abertura") 
	 public String dataAbertura;
	 
	 @JsonProperty("razao-social") 
	 public String razaoSocial;
	 
	 @JsonProperty("nome-fantasia") 
	 public String nomeFantasia;
	 
	 @JsonProperty("capital-social") 
	 public String capitalSocial;
	 
	 @JsonProperty("tipo-estabelecimento") 
	 public String tipoEstabelecimento;
	 
	 @JsonProperty("natureza-juridica") 
	 public String naturezaJuridica;
	 
	 @JsonProperty("descricao-njur") 
	 public String descricaoNjur;
	 
	 @JsonProperty("cnae-principal") 
	 public String cnaePrincipal;
	 
	 @JsonProperty("descricao-cnae-principal") 
	 public String descricaoCnaePrincipal;
	 
	 @JsonProperty("tipo-porte") 
	 public String tipoPorte;
	 
	 @JsonProperty("descricao-porte") 
	 public String descricaoPorte;
	 
	 @JsonProperty("identificador-opcao-simples") 
	 public String identificadorOpcaoSimples;
	 
	 @JsonProperty("opcao-simples") 
	 public String opcaoSimples;
	 
	 @JsonProperty("data-inicio-simples") 
	 public String dataInicioSimples;
	 
	 @JsonProperty("data-fim-simples") 
	 public String dataFimSimples;
	 
	 @JsonProperty("codigo-situacao-cadastral") 
	 public String codigoSituacaoCadastral;
	 
	 @JsonProperty("codigo-situacao-cadastral-receita") 
	 public String codigoSituacaoCadastralReceita;
	 
	 @JsonProperty("descricao-situacao-cadastral") 
	 public String descricaoSituacaoCadastral;
	 
	 @JsonProperty("motivo-situacao-cadastral") 
	 public String motivoSituacaoCadastral;
	 
	 @JsonProperty("codigo-motivo-situacao") 
	 public String codigoMotivoSituacao;
	 
	 @JsonProperty("cpf-responsavel-legal") 
	 public String cpfResponsavelLegal;
	 
	 @JsonProperty("nome-responsavel-legal") 
	 public String nomeResponsavelLegal;
	 
	 @JsonProperty("descricao-qualificacao-responsavel") 
	 public String descricaoQualificacaoResponsavel;
	 
	 @JsonProperty("cnae-secundario") 
	 public List<Object> cnaeSecundario;
	
}
