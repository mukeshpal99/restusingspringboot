package com.learning.rest.learningrest.version;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PersonV2 {
	
	private Name name;

	public PersonV2(Name name) {
		super();
		this.name = name;
	}

}
