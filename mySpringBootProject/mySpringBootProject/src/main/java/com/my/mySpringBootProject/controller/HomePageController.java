package com.my.mySpringBootProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomePageController {

	@RequestMapping("/HomePage")
	public String LoginPage(@RequestParam String LoginName, ModelMap model){
		model.put("name", LoginName);
		return "LoginPage";
	}
}
