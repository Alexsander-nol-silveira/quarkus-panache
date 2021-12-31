package project.quarkus.panache.resource;

import java.net.URI;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PATCH;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import project.quarkus.panache.dto.RegiaoDTO;
import project.quarkus.panache.entity.RegiaoEntity;
import project.quarkus.panache.repository.RegiaoRepository;
import project.quarkus.panache.service.RegiaoService;

@Path("/regiao/")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class RegiaoResource {

	@Inject 
	RegiaoService regiaoService;
	
	@GET
	@Path("{id}")
	public RegiaoEntity findById(@PathParam("id") final Long id) {
		return regiaoService.findById(id);
	}
	
	@GET
	@Path("all")
	public List<RegiaoEntity> all() {
		return regiaoService.all();
	}
	
	@GET
	@Path("state/{UF}")
	public RegiaoEntity findByState(@PathParam("UF") final String UF) {
		return regiaoService.findByState(UF);
	}
	
	@POST
	public Response create(final RegiaoDTO regiaoDTO) {
		regiaoService.create(regiaoDTO);
		
		return Response.created(URI.create("/regiao/" + regiaoDTO.nuMatricula)).build();
	}
	
	@PATCH
	@Path("{id}")
	public RegiaoEntity updateNameState(@PathParam("id") final Long id, final RegiaoDTO regiaoDTO) {		
		return regiaoService.updateNameState(id, regiaoDTO.nomeEstado);
	}
	
	@DELETE
	@Path("{id}")
	public Response delete(@PathParam("id") final Long id) {
		regiaoService.delete(id);
		
		return Response.status(Status.NO_CONTENT).build();
	}
	
	
}
