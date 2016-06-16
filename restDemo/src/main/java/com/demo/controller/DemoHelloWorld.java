package com.demo.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
 
/*
 * author: chari
 * 
 */

@SpringBootApplication 
@RestController
public class DemoHelloWorld {
 
	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {
 
		String message = "<br><div style='text-align:center;'>"
				+ "<h3>********** Hello World, Spring MVC Demo</h3>This message is coming from DemoHelloWorld.java **********</div><br><br>";
		return new ModelAndView("welcome", "message", message);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(DemoHelloWorld.class, args);
	}
}
