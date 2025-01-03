package com.AnnotaionsIoc.mainMethods;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.AnnotaionsIoc.classes.javaTrainer;
import com.AnnotaionsIoc.classes.sqlTrainer;
import com.AnnotaionsIoc.classes.webTrainer;

public class main2 {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext cpx = new ClassPathXmlApplicationContext("IocAnnotaions.xml");

		javaTrainer jt = (javaTrainer)cpx.getBean("javaTrainer");
		sqlTrainer st = (sqlTrainer)cpx.getBean("sqlTrainer");
		webTrainer wt = (webTrainer)cpx.getBean("webTrainer");
		
		jt.giveTask();
		st.giveTask();
		wt.giveTask();
	}

}
