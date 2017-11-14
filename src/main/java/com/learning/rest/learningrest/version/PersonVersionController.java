package com.learning.rest.learningrest.version;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonVersionController {
	
	@GetMapping("v1/person")
	public PersonV1 personV1(){
		return new PersonV1("Rahul Yadav");
	}
	
	
	@GetMapping("/v2/person")
	public PersonV2 personV2(){
		return new PersonV2(new Name("Rajesh", "Kumar"));
	}

}
