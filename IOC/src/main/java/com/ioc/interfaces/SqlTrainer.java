package com.ioc.interfaces;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public interface SqlTrainer {
	String giveTask(ClassPathXmlApplicationContext cpx);
}
