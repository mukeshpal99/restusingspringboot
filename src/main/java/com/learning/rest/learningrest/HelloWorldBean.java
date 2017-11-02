package com.learning.rest.learningrest;

public class HelloWorldBean {
	
	String message;
	String day;
	
	public HelloWorldBean(String msg, String day){
		this.message = msg;
		this.day=day;
	}
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	@Override
	public String toString() {
		return "HelloWorldBean [message=" + message + "]";
	}
	
	

}
