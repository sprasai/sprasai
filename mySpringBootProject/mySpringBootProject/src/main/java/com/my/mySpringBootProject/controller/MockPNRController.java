package com.my.mySpringBootProject.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.my.mySpringBootProject.service.TodoService;

@Controller
public class MockPNRController {

	@Autowired
	TodoService todoService;
	
	@RequestMapping(value="/MockPNRs-to-do", method=RequestMethod.GET)
	//@ResponseBody
	public String createMockPNRs(ModelMap model, @RequestParam int count ) {
//		List<String>  MockPNRs = new ArrayList<String>();
//		
//		MockPNRs.add("QPERER");
//		MockPNRs.add("QPERES");
//		MockPNRs.add("QPERET");
//		MockPNRs.add("QPEREU");
//		MockPNRs.add("QPEREN");
//		MockPNRs.add("QPEREE");
//		
//		return MockPNRs.toString();
		model.put("value", todoService.retreiveTodList("in28Minutes").toString());
		return "/mock-todo";
	}
}
