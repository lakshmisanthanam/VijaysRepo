package org.vijay.services.checkoutservice.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.vijay.services.rest.AddProductRequest;
import org.vijay.services.rest.AddProductResponse;
import org.vijay.services.rest.CreateSessionRequest;
import org.vijay.services.rest.CreateSessionResponse;


@Path("/")
public interface CheckoutServiceREST {

	@POST
	@Path("addProduct")
	@Produces(MediaType.APPLICATION_XML)
	@Consumes(MediaType.APPLICATION_XML)
	public AddProductResponse addProduct(AddProductRequest req);
	
	@POST
	@Path("createSession")
	@Produces(MediaType.APPLICATION_XML)
	@Consumes(MediaType.APPLICATION_XML)
	public CreateSessionResponse createSession(CreateSessionRequest req);
	
}
