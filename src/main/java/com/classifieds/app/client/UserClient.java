package com.classifieds.app.client;

import javax.ws.rs.core.Response;

/**
 * Developer: YSalmin
 * Date: 11.04.2015
 */
public interface UserClient {

	Response getSignup();

	Response postSignup(String userName, String password,
						String firstName, String lastName, String dateOfBirth,
						String emailAddress) throws Exception;

	Response getLogin();

	Response postLogin(String userName, String password);

}