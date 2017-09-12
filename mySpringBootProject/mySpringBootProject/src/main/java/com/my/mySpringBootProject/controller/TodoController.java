package com.my.mySpringBootProject.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.my.mySpringBootProject.service.TodoService;

@Controller
@SessionAttributes("name")
public class TodoController {

	@Autowired
	TodoService todoService;
	 
	
	@RequestMapping(value="/todo-list", method=RequestMethod.GET)
 	public String getTodoList(ModelMap model) {		
		String name = (String) model.get("name");
		model.put("todos", todoService.retreiveTodList( name ));
		return "todo-list";
	}
	
 
	@RequestMapping(value="/add-todo", method=RequestMethod.GET)
 	public String addTodoList(ModelMap model) {		
		String name = (String) model.get("name");
		model.put("todos", todoService.retreiveTodList(name));
		return "add-todo";
	}
	
	@RequestMapping(value="/add-todo", method=RequestMethod.POST)
 	public String addTodoList(ModelMap model, @RequestParam String desc) {
		String name = (String) model.get("name");
		todoService.addTodo("in28Minutes", desc, new Date(), false);
		model.put("todos", todoService.retreiveTodList(name));
		return "add-todo";
	}
	
	
//	@RequestMapping(value="/delete-todo", method=RequestMethod.GET)
// 	public String deleteTodo(ModelMap model) {
//		String name = (String) model.get("name");
//		model.put("todos", todoService.retreiveTodList(name));
//		return "delete-todo";
//	}
	
	@RequestMapping(value="/delete-todo", method=RequestMethod.GET)
 	public String deleteTodoList(ModelMap model, @RequestParam int id) {
		String name = (String) model.get("name");
		String deletedTodo = todoService.deleteTodo(id); 
		model.put("todos", todoService.retreiveTodList(name));
		model.put("todoMessage", deletedTodo);
		return "redirect:/todo-list";
	}
	
}
