package com.AnnotaionsIoc.classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class webTrainer {
	String name;
	String message;
	
	@Autowired
	praticeTime pt;
	public void giveTask() {
		System.out.println(name+" says "+message+" for "+pt.getPt());
	}
	public String getName() {
		return name;
	}
	@Autowired
	public void setName(@Value("DK")String name) {
		this.name = name;
	}
	public String getMessage() {
		return message;
	}
	@Autowired
	public void setMessage(@Value("DK says pratice web page")String message) {
		this.message = message;
	}
//	@Autowired
//	public void setPt(@Qualifier("praticeTime") praticeTime pt) {
//		this.pt = pt;
//	}
	
}
