package project.quarkus.panache.repository;

import java.util.List;
import java.util.Objects;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.NotFoundException;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import project.quarkus.panache.dto.RegiaoDTO;
import project.quarkus.panache.entity.RegiaoEntity;

@ApplicationScoped
public class RegiaoRepository implements PanacheRepository<RegiaoEntity> {
	
	// Busca todas as regiões
	public List<RegiaoEntity> all() {
		return listAll();
	}
	
	// Busca a região pelo ID
	public RegiaoEntity findByIdNu(final Long id) {
		return findById(id);
	}
	
	// Busca a região pela sigla da unidade federativa
	public RegiaoEntity findByState(final String UF) {
		return find("uf", UF).firstResult();
	}
	
	// Cria uma região
	public void create(final RegiaoDTO regiaoDTO) {
		persist(new RegiaoEntity(regiaoDTO));
	}
	
	//atualiza o nome do estado
	public RegiaoEntity updateNameState(final Long id, RegiaoEntity regiao, final String nameState) {
        regiao.nomeEstado = nameState;
        
        return regiao;
	}
	
	// Deleta uma região
	public void delete(final Long id) {
		deleteById(id);
	}
	
}
