package org.vijay.services.checkoutservice.soap;

import org.services.vijay.shoppingcartcheckout.AddProductRequest;
import org.services.vijay.shoppingcartcheckout.AddProductResponse;
import org.services.vijay.shoppingcartcheckout.CreateSessionRequest;
import org.services.vijay.shoppingcartcheckout.CreateSessionResponse;
import org.services.vijay.shoppingcartcheckout.ShoppingCartCheckout;
import org.vijay.services.checkoutservice.rest.CheckoutServiceREST;

public class CheckoutServiceImpl implements ShoppingCartCheckout {

	CheckoutServiceREST restService;
	
	@Override
	public CreateSessionResponse createSession(CreateSessionRequest req) {
		System.out.println("Request received");
		CreateSessionResponse resp = new CreateSessionResponse();
		resp.setSessionId("" + System.currentTimeMillis());
		return resp;
	}

	@Override
	public AddProductResponse addProduct(AddProductRequest req) {
		org.vijay.services.rest.AddProductRequest request = new org.vijay.services.rest.AddProductRequest();
		request.setProductId(req.getProductId());
		request.setQuantity(req.getQuantity());
		request.setRequestType(req.getRequestType());
		request.setSessionId(req.getSessionId());
		
		org.vijay.services.rest.AddProductResponse response = restService.addProduct(request);
		AddProductResponse resp = new AddProductResponse();
		resp.setSessionId(response.getSessionId());
		resp.setStatus(response.getStatus());
		return resp;
		
	}

	public void setRestService(CheckoutServiceREST restService) {
		this.restService = restService;
	}

	

}
