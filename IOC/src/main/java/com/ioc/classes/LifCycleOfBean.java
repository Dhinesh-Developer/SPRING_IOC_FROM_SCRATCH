package com.ioc.classes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ioc.interfaces.JavaTrainer;
/* life cycle of bean.
 * 1.Construct method
 * 2.name,message in inject
 * 3.praticeTime is inject
 * 4.init method
 * 5.giveTask
 * 6.destriy method
 * */
public class LifCycleOfBean implements JavaTrainer {
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
		System.out.println("Name dependicies is injected");
		this.name = name;
	}
	public String getMessage() {
		System.out.println("message dependicies is injected");
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public LifCycleOfBean() {
		System.out.println("Java Trainer has bean created");
	}
	public PraticeTime getPt() {
		return pt;
	}
	public void setPt(PraticeTime pt) {
		System.out.println("Pratice time is injected");
		this.pt = pt;
	}
	
	public void javaTrainerInit(PraticeTime pt) {
		System.out.println("init method is called");
		this.pt = pt;
	}
	public void javaTrainerDestroy(PraticeTime pt) {
		System.out.println("Destroy method is called");
		this.pt = pt;
	}

	
}
