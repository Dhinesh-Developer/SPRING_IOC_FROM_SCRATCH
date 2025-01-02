package com.ioc.classes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ioc.interfaces.JavaTrainer;

public class JavaTrainerImpl implements JavaTrainer {
	private String name;
	private String message;
	private PraticeTime pt;
	@Override
	public String giveTask(ClassPathXmlApplicationContext cpx) {
		pt = (PraticeTime)cpx.getBean("pt");
		return name+" says "+message+" for "+pt.PraticeTiming;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public JavaTrainerImpl(String name, String message) {
		super();
		this.name = name;
		this.message = message;
	}

	
}
