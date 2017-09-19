package com.my.mySpringBootProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.my.mySpringBootProject.service.LoginService;

@Controller
@SessionAttributes("name")
public class LoginController {

	@Autowired
	LoginService loginService;
	
	 
	
	@RequestMapping(value="/", method=RequestMethod.GET)
 	//@ResponseBody
	public String showLoginPage(ModelMap model) {
		model.put("name", "in28Minutes");
		return "WelcomePage";
	}
	
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String showWelcomePage(@RequestParam String nameLogin, @RequestParam String password, ModelMap model) {
		boolean isValidUser = loginService.ValidateUser(nameLogin, password);
		if(!isValidUser) { 
			model.put("errroMessage", "Check Username Password");
			return "LoginPage";
		}
		model.put("name", nameLogin);
//		System.out.println(model.toString());
		return "WelcomePage";
	}
}
