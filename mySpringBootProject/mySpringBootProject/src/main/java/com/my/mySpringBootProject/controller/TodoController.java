package com.my.mySpringBootProject.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.my.mySpringBootProject.model.Todo;
import com.my.mySpringBootProject.service.TodoService;

@Controller
@SessionAttributes("name")
public class TodoController {

	@Autowired
	TodoService todoService;
	 
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(
					dateFormat, false));
	}
	
	@RequestMapping(value="/list-todos", method=RequestMethod.GET)
 	public String showTodos(ModelMap model) {		
		String name = getLoggedInUser(model);
		System.out.println("getLoggedInUser in Todo controller " + model.toString());
		model.put("todos", todoService.retreiveTodList( name ));
		return "list-todos";
	}
	
 
	@RequestMapping(value="/add-todo", method=RequestMethod.GET)
 	public String showAddTodoPage(ModelMap model) {		
		model.addAttribute("todo", new Todo(0,getLoggedInUser(model),"Default Desc",new Date(),false));
		return "add-todo";
	}
	
	@RequestMapping(value="/add-todo", method=RequestMethod.POST)
 	public String addTodoItem(ModelMap model, @Valid Todo todo, BindingResult result) {
		if(result.hasErrors()) {
			System.out.println("result has errors true in add todo " + result.toString());
			return "add-todo";
		}		
		todoService.addTodo(getLoggedInUser(model), todo.getDesc(), todo.getTargetDate(), false);
		return "redirect:/list-todos";
	}
	 
	
	@RequestMapping(value="/delete-todo", method=RequestMethod.GET)
 	public String deleteTodoList(ModelMap model, @RequestParam int id) {
		String name = getLoggedInUser(model);
		String deletedTodo = todoService.deleteTodo(id); 
		model.put("todos", todoService.retreiveTodList(name));
		model.put("todoMessage", deletedTodo);
		return "redirect:/list-todos";
	}

	private String getLoggedInUser(ModelMap model) {
		return (String) model.get("name");
	}
	
}
