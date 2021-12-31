package project.quarkus.panache.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import project.quarkus.panache.dto.RegiaoDTO;

@Entity
@Cacheable
public class RegiaoEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public RegiaoEntity() { }
	
	public RegiaoEntity (final RegiaoDTO regiaoDTO) { 
		this.uf = regiaoDTO.uf;
		this.nomeEstado = regiaoDTO.nomeEstado;
		this.nuMatricula = regiaoDTO.nuMatricula;
	}

	@Id
	@Column(name = "NU")
	public Long nuMatricula;

	@Column(name = "SG", length = 2)
	public String uf;

	@Column(name = "NO", length = 30)
	public String nomeEstado;
	
	@Column(name = "TS_ATUALIZACAO")
	public Timestamp tsAtualizacao = new Timestamp(System.currentTimeMillis());
	
}