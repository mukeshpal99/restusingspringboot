package com.learning.rest.learningrest.filter;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

@RestController
public class FilteringController {
	
	@GetMapping("/filter-static")
		public FilterBeanForStaticFiltering getFIlteredBeanStatic(){
			return new FilterBeanForStaticFiltering("field 1", "field 2", "field 3");
		}
	
	//return only field 1
	@GetMapping("/filter-dynamic-bean")
	public MappingJacksonValue getFIlteredBean(){
		FilterBeanForDynamicFiltering tempBean= new FilterBeanForDynamicFiltering("field 1", "field 2", "field 3");
		
		Set<String> filterList = new TreeSet<String>();
		filterList.add("field1");
		
		SimpleBeanPropertyFilter filter = new SimpleBeanPropertyFilter.FilterExceptFilter(filterList);
		FilterProvider filters = new SimpleFilterProvider().addFilter("filterBeanID", filter);
		
		MappingJacksonValue mapping = new MappingJacksonValue(tempBean);
		mapping.setFilters(filters);
		
		return mapping;
	}
	
	//return only field 2
	@GetMapping("/filter-dynamic-bean-list")
	public MappingJacksonValue getFIlteredBeanList(){
		List<FilterBeanForDynamicFiltering> beanList=  Arrays.asList(
				new FilterBeanForDynamicFiltering("field 1", "field 2", "field 3"),
				new FilterBeanForDynamicFiltering("field 12", "field 22", "field 32"),
				new FilterBeanForDynamicFiltering("field 13", "field 23", "field 33"));
		
		Set<String> filterList = new TreeSet<String>();
		filterList.add("field2");
		
		SimpleBeanPropertyFilter filter = new SimpleBeanPropertyFilter.FilterExceptFilter(filterList);
		FilterProvider filters = new SimpleFilterProvider().addFilter("filterBeanID", filter);
		
		MappingJacksonValue mapping = new MappingJacksonValue(beanList);
		mapping.setFilters(filters);
		return mapping;
	}

}
