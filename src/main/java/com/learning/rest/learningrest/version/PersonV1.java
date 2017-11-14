package com.learning.rest.learningrest.version;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PersonV1 {
	
	private String name;

	public PersonV1(String name) {
		super();
		this.name = name;
	}
	
	

}
