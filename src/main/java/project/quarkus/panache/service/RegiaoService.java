package project.quarkus.panache.service;

import java.util.List;
import java.util.Objects;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response.Status;

import project.quarkus.panache.dto.RegiaoDTO;
import project.quarkus.panache.entity.RegiaoEntity;
import project.quarkus.panache.exception.RequestException;
import project.quarkus.panache.repository.RegiaoRepository;

@ApplicationScoped
public final class RegiaoService {

	@Inject
	RegiaoRepository regiaoRepository;
	
	public List<RegiaoEntity> all() {
		try {
			return regiaoRepository.all();
		} catch (final Exception e) {
			throw new RequestException("Ocorreu um problema ao pesquisar por todas as regiões");
		}
	}
	
	public RegiaoEntity findById(final Long id) {
		try {
			return regiaoRepository.findByIdNu(id);
		} catch (final Exception e) {
			throw new RequestException("Ocorreu um problema ao pesquisar pela região");
		}
	}
	
	public RegiaoEntity findByState(final String UF) {
		try {
			return regiaoRepository.find("uf", UF).firstResult();
		} catch (final Exception e) {
			throw new RequestException("Ocorreu um problema ao pesquisar pelo estado");
		}
	}
	
	@Transactional
	public void create(final RegiaoDTO regiaoDTO) {
		try {
			// TODO implementar tratamento para impedir a persistência quando a região existir
		    regiaoRepository.create(regiaoDTO);
		} catch (final Exception e) {
			throw new RequestException("Ocorreu um problema ao cadastrar uma região");
		}
	}
	
	@Transactional
	public RegiaoEntity updateNameState(final Long id, final String nameState) {
		try {
			return regiaoRepository.updateNameState(id, hasRegiaoRegisted(id), nameState);
		} catch (final NotFoundException e) {
			throw new RequestException(e.getMessage(), Status.BAD_REQUEST);
		} catch (final Exception e) {
			throw new RequestException("Ocorreu um problema ao atualizar a região: ");
		}
	}
	
	@Transactional
	public void delete(final Long id) {
		try {
			regiaoRepository.delete(id);
		} catch (final Exception e) {
			throw new RequestException("Ocorreu um problema ao deletar a região");
		}
	}
	
	/**
	 * verifica se uma região, dado seu número de registro, está cadastrado
	 * 
	 * @param id número de registro da região
	 * @return retorna a entidade caso exista
	 */
	private RegiaoEntity hasRegiaoRegisted(final Long id) {
		final RegiaoEntity regiao = findById(id);
		
		if(Objects.isNull(regiao)) {
			throw new NotFoundException("A região informada não está cadastrada.");
        }
		
		return regiao;
	}
	
}
