package com.ioc.classes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ioc.interfaces.WebTrainer;

public class WebTrainerImpl implements WebTrainer{
	private String name;
	private String message;
	private PraticeTime pt;
	@Override
	public String giveTask(ClassPathXmlApplicationContext cpx) {
		pt = (PraticeTime)cpx.getBean("pt");
		return name+" says "+message+" for "+pt.PraticeTiming;
	}
	public WebTrainerImpl(String name, String message) {
		super();
		this.name = name;
		this.message = message;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

}
