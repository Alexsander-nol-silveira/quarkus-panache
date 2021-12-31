package project.quarkus.panache.exception;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

/**
 * classe de exceção para lançamento de resposta nas requisições
 * 
 * @author f790517
 */
public class RequestException extends WebApplicationException {
	
	private static final long serialVersionUID = 1L;
	
	public RequestException(String message) {
        super(Response.status(Status.EXPECTATION_FAILED).entity(message).type(MediaType.TEXT_PLAIN).build());
    }

	public RequestException(String message, Response.Status status) {
        super(Response.status(status).entity(message).type(MediaType.TEXT_PLAIN).build());
    }
    
}