package com.learning.rest.learningrest.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@GetMapping("/hello-world")
	public String helloWorld(){
		return "Helllo World";
	}
	
	
	// return a hello world bean
	@GetMapping("/hello-world-bean")
	public HelloWorldBean helloWorldBean(){
		return new HelloWorldBean("Hello World Bean", "Monday");
	}
	
	
	// return a hello world bean
		@GetMapping("/hello-world-bean/{name}")
		public HelloWorldBean helloWorldBeanPathVariable(@PathVariable String name){
			return new HelloWorldBean(String.format("Hello %s", name), "Monday");
		}

}
