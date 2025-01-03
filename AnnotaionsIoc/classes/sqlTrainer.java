package com.AnnotaionsIoc.classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
// Constructor injection
@Component
public class sqlTrainer {
	String name;
	String message;
	
	@Autowired
	praticeTime pt;
	public void giveTask() {
		System.out.println(name+" says "+message+" for "+pt.getPt());
	}
	
	@Autowired
	public sqlTrainer(@Value("dhinesh") String name,@Value("pratice queries") String message) {
		super();
		this.name = name;
		this.message = message;
	}
/*
 * 	public String getName() {
		return name;
	}
	@Autowired
	public void setName(@Value("Dhinesh")String name) {
		this.name = name;
	}
	public String getMessage() {
		return message;
	}
	@Autowired
	public void setMessage(@Value("pratice Complex Queries")String message) {
		this.message = message;
	}*/
//	@Autowired
//	public void setPt(@Qualifier("praticeTime") praticeTime pt) {
//		this.pt = pt;
//	}
//	
	
}
