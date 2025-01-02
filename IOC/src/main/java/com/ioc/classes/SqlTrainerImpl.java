package com.ioc.classes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ioc.interfaces.SqlTrainer;

public class SqlTrainerImpl implements SqlTrainer{
	private String name;
	private String message;
	private PraticeTime pt;
	@Override
	public String giveTask(ClassPathXmlApplicationContext cpx) {
		pt = (PraticeTime)cpx.getBean("pt");
		return name+" says "+message+" for "+pt.PraticeTiming;
	}
	public SqlTrainerImpl(String name, String message) {
		super();
		this.name = name;
		this.message = message;
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
	
}
