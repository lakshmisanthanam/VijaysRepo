package org.vijay.services.checkoutservice.rest;

import java.util.Date;

import org.services.vijay.shoppingcartcheckout.ShoppingCartCheckout;
import org.vijay.services.rest.AddProductRequest;
import org.vijay.services.rest.AddProductResponse;
import org.vijay.services.rest.CreateSessionRequest;
import org.vijay.services.rest.CreateSessionResponse;

public class CheckoutServicesRESTImplApproach3 implements CheckoutServiceREST {

	private ShoppingCartCheckout soapService;

	@Override
	public AddProductResponse addProduct(AddProductRequest req) {
		System.out.println("TEST1 for REST : " + req.getSessionId());
		AddProductResponse resp = new AddProductResponse();
		resp.setSessionId(req.getSessionId());
		resp.setStatus("Added successfully" + new Date());
		return resp;
	}

	@Override
	public CreateSessionResponse createSession(CreateSessionRequest req) {
		org.services.vijay.shoppingcartcheckout.CreateSessionRequest request = new org.services.vijay.shoppingcartcheckout.CreateSessionRequest();
		request.setSourceName(req.getSourceName());

		org.services.vijay.shoppingcartcheckout.CreateSessionResponse response = soapService
				.createSession(request);
		CreateSessionResponse resp = new CreateSessionResponse();
		resp.setSessionId(response.getSessionId());
		return resp;
	}

	public void setSoapService(ShoppingCartCheckout soapService) {
		this.soapService = soapService;
	}

}
