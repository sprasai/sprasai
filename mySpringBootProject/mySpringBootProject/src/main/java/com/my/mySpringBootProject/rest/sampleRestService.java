package com.my.mySpringBootProject.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.my.mySpringBootProject.model.Todo;
import com.my.mySpringBootProject.service.TodoService;

@RestController
public class sampleRestService {

	@Autowired
	TodoService todoService;
	
	@RequestMapping(value="/rest/somevalue")
	public String returnSomeValue() {
		
		return todoService.retreiveTodList("in28Minutes").toString();
	}
}
