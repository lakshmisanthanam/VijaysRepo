package org.vijay.services.libraryservice;

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

public interface VijayLibraryServiceBinding {

	AddBookResponse addBook(AddBookRequest req);
	UpdateBookResponse updateBook(UpdateBookRequest req);
	DeleteBookResponse deleteBook(DeleteBookRequest req);
	FindBookResponse findBook(FindBookRequest req);
	GetBookResponse getBook(GetBookRequest req);
}
