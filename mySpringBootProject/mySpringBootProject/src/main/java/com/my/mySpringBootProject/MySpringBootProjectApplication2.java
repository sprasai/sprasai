package com.my.mySpringBootProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class MySpringBootProjectApplication2 {
	
	@RequestMapping("/home")
	String home() {
		return "Hellow world";
	}

	public static void main(String[] args) {
		SpringApplication.run(MySpringBootProjectApplication2.class, args);
	}
}
