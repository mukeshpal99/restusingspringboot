package com.learning.rest.learningrest.helloworld;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@Autowired
	MessageSource messageSource;
	
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
	
	@GetMapping("/hello-world/i18n")
	public String helloWorldI18n(@RequestHeader(name="Accept-Language", required=false) Locale locale){
		return messageSource.getMessage("good.morning.message", null, locale);
	}
	
	

}
