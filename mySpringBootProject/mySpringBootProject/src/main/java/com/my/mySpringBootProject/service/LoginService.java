package com.my.mySpringBootProject.service;

import org.springframework.stereotype.Component;

@Component
public class LoginService {
	
	public boolean ValidateUser(String user, String password) {
		return user.equalsIgnoreCase("in28minutes")&&password.equalsIgnoreCase("mySecretPassword");
	}

}
