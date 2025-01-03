package com.AnnotaionsIoc.classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
//setter injection.
@Component
public class javaTrainer {
	@Autowired
	@Value("kumar")
	String name;
	
	@Autowired
	@Value("pratice coding")
	String message;
	
	@Autowired
	praticeTime pt;
	public void giveTask() {
		System.out.println(name+" says "+message+" for "+pt.getPt());
	}
	
/*
 * 	
	public String getName() {
		return name;
	}*/
	
//	public javaTrainer() {
//		System.out.println("Java Trainer created");
//	}
	
	/*
	 * @Autowired
	public void setName(@Value("kumar")String name) {
		this.name = name;
	}
	public String getMessage() {
		return message;
	}
	@Autowired
	public void setMessage(@Value("Pratice coding")String message) {
		this.message = message;
	}
	public praticeTime getPt() {
		return pt;
	}*/
	
	/* simply add pratice time pt   to set auto wired no need set like this.
	 * @Autowired
	public void setPt(@Qualifier("praticeTime") praticeTime pt) {
		this.pt = pt;
	}
	*/
	
}
