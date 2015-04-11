package com.classifieds.app.client;

import javax.ws.rs.client.ClientBuilder;

import com.classifieds.app.client.impl.UserClientImpl;
import org.junit.Before;
import org.junit.Test;

/**
 * Developer: YSalmin
 * Date: 11.04.2015
 */
public class UserClientImplIntegrationTest {
	private UserClientImpl client;
		
	@Before
	public void beforeEachTest() {
		this.client = new UserClientImpl(ClientBuilder.newClient().target("http://localhost:8080/StudentEnrollmentWithREST/webapi/studentResource/"));
	}
		
	@Test(expected=RuntimeException.class)
	public void PostSignupFailureForExistingUserTest() throws Exception {
		client.postSignup("j2ee", "j2ee", "jersey", "jersey", "12/15/2013", "jersey@gmail.com");	
	}
	
	@Test(expected=Exception.class)
	public void PostSignupInvalidDateTest() throws Exception {
		client.postSignup("jersey", "jersey", "jersey", "jersey", "12-15-2013", "jersey@gmail.com");
	}
	
	@Test(expected=RuntimeException.class)
	public void PostSignupBadRequestTest() throws Exception {
		client.postSignup(null, null, null, null, null, null);
	}
		
	@Test(expected=RuntimeException.class)
	public void PostLoginFailureTest() {
		client.postLogin("jersey", "jersey123");
	}
	
	@Test(expected=RuntimeException.class)
	public void PostLoginBadRequestTest() {
		client.postLogin(null, null);
	}

}
