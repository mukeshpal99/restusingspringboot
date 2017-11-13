package com.learning.rest.learningrest.filter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilteringController {
	
	@GetMapping("/filter")
	public FilterBean getFIlteredBean(){
		return new FilterBean("field 1", "field 2", "field 3");
	}

}
