package com.classifieds.app.model;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Component;

import javax.validation.constraints.Size;

/**
 * Developer: YSalmin
 * Date: 11.04.2015
 */
@Component
public class UserLogin {

	@NotEmpty
	@Size(min=4, max=20)
	private String userName;
		
	@NotEmpty
	@Size(min=4, max=8)
	private String password;

	public String getPassword() {
		return password;
	}

	public String getUserName() {
		return userName;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}	
}
