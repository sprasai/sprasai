package com.my.mySpringBootProject.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;

import com.my.mySpringBootProject.model.Todo;

@Component
public class TodoService {
	private static List <Todo> todos = new ArrayList<Todo>();
	private static int todoCount=5;
	static {
		todos.add(new Todo(1,"in28minutes","learn something 1", new Date(), false));
		todos.add(new Todo(2,"in28minutes","learn something 2", new Date(), false));
		todos.add(new Todo(3,"in28minutes","learn something 3", new Date(), false));
		todos.add(new Todo(4,"in28minutes","learn something 4", new Date(), false));
		todos.add(new Todo(5,"in28minutes","learn something 5", new Date(), false));
	}
	 
	
	public List<Todo> retreiveTodList(String user) {
		List<Todo> filteredTodos = new ArrayList<Todo>();
		for(Todo todo: todos) {
			if(todo.getName().equalsIgnoreCase(user)) {
				
				filteredTodos.add(todo);
			}
		}
		return filteredTodos;
	}

	public void addTodo(String name, String desc, Date targetDate, boolean isDone) {
		todos.add(new Todo(++todoCount, name, desc, targetDate, isDone));
	}
	
	public String deleteTodo(int id) {
		Iterator<Todo> iterator = todos.iterator();
		String deletedTodo = "No items Deleted";
		while(iterator.hasNext()) {
			Todo todo = iterator.next();
			if(todo.getId()==id) {
				iterator.remove();				
				deletedTodo="removed 1 item: " + todo.toString();
			}
		}
		 
		return deletedTodo;
	}
}
