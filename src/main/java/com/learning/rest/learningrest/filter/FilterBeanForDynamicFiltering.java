package com.learning.rest.learningrest.filter;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@JsonFilter("filterBeanID")
public class FilterBeanForDynamicFiltering {
	
	String field1;
	String field2;
	String field3;
	
	
	public FilterBeanForDynamicFiltering(String field1, String field2, String field3) {
		super();
		this.field1 = field1;
		this.field2 = field2;
		this.field3 = field3;
	}
	
	

}
