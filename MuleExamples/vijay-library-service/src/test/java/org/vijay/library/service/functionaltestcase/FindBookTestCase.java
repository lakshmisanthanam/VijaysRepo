package org.vijay.library.service.functionaltestcase;

import org.junit.Assert;
import org.junit.Test;
import org.mule.api.MuleException;
import org.mule.api.MuleMessage;
import org.mule.module.client.MuleClient;
import org.mule.tck.junit4.FunctionalTestCase;

public class FindBookTestCase extends FunctionalTestCase {

	@Override
	protected String[] getConfigFiles() {
		return new String[]{"vijay-library-service.xml"};
	}
	
	@Test
	public void testUpdateBook() throws MuleException {
		MuleClient client = new MuleClient(muleContext);
		MuleMessage result = client.send("vm://updateBookVM", "", null);
		Assert.assertNotNull(result);
		Assert.assertTrue(result.getPayload() instanceof org.vijay.services.rest.libraryservice.UpdateBookResponse);
		Assert.assertEquals("200", ((org.vijay.services.rest.libraryservice.UpdateBookResponse)result.getPayload()).getStatusCode());
		Assert.assertEquals("TEST Upd", ((org.vijay.services.rest.libraryservice.UpdateBookResponse)result.getPayload()).getStatusMessage());
		System.out.println("ALL CLEAR.. TESTED AND DONE....");
	}

	@Test
	public void getBookIdFlow() throws Exception {
		MuleClient client = new MuleClient(muleContext);
		MuleMessage msg = getTestMuleMessage();
		msg.setInvocationProperty("bookName", "Test");
		client.send("vm://get-bookid-flow", msg);
	}
}
