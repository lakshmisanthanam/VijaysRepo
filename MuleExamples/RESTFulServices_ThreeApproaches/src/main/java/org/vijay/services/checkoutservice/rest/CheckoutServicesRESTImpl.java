package org.vijay.services.checkoutservice.rest;

import java.util.Date;

import org.vijay.services.rest.AddProductRequest;
import org.vijay.services.rest.AddProductResponse;
import org.vijay.services.rest.CreateSessionRequest;
import org.vijay.services.rest.CreateSessionResponse;


public class CheckoutServicesRESTImpl implements CheckoutServiceREST {

	@Override
	public AddProductResponse addProduct(AddProductRequest req) {
		System.out.println("REST AddProduct: TEST1 for REST : " + req.getSessionId());
		AddProductResponse resp = new AddProductResponse();
		resp.setSessionId(req.getSessionId());
		resp.setStatus("Added successfully" + new Date());
		return resp;
	}

	@Override
	public CreateSessionResponse createSession(CreateSessionRequest req) {
		// TODO Auto-generated method stub
		return null;
	}

}
