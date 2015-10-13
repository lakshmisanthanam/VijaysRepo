package org.vijay.services.libraryservice;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.vijay.services.rest.libraryservice.AddBookRequest;
import org.vijay.services.rest.libraryservice.AddBookResponse;
import org.vijay.services.rest.libraryservice.DeleteBookRequest;
import org.vijay.services.rest.libraryservice.DeleteBookResponse;
import org.vijay.services.rest.libraryservice.FindBookRequest;
import org.vijay.services.rest.libraryservice.FindBookResponse;
import org.vijay.services.rest.libraryservice.GetBookRequest;
import org.vijay.services.rest.libraryservice.GetBookResponse;
import org.vijay.services.rest.libraryservice.UpdateBookRequest;
import org.vijay.services.rest.libraryservice.UpdateBookResponse;

@Path("/")
@Produces(MediaType.APPLICATION_XML)
@Consumes(MediaType.APPLICATION_XML)
public class VijayLibraryService {

	private VijayLibraryServiceBinding bInterface;

	@POST
	@Path("addBook")
	public AddBookResponse addBook(AddBookRequest req) {
		AddBookResponse resp = bInterface.addBook(req);
		System.out.println(resp.getStatusCode() + "," + resp.getStatusMessage());
		return resp;
	}

	@POST
	@Path("updateBook")
	public UpdateBookResponse updateBook(UpdateBookRequest req) {
		return bInterface.updateBook(req);
	}

	@POST
	@Path("deleteBook")
	public DeleteBookResponse deleteBook(DeleteBookRequest req) {
		return bInterface.deleteBook(req);
	}

	@POST
	@Path("findBook")
	public FindBookResponse findBook(FindBookRequest req) {
		return bInterface.findBook(req);
	}

	@POST
	@Path("getBook")
	public GetBookResponse getBook(GetBookRequest req) {
		System.out.println("INTO GETBOOK REQUEST");
		GetBookResponse resp = bInterface.getBook(req);
		System.out.println(resp);
		return resp;
	}

	public void setbInterface(VijayLibraryServiceBinding bInterface) {
		this.bInterface = bInterface;
	}

}
