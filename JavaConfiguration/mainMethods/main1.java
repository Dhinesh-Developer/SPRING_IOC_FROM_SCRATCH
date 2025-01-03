package com.JavaConfiguration.mainMethods;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.JavaConfiguration.goldCustomer;
import com.JavaConfiguration.platinumCustomer;
import com.JavaConfiguration.config.appConfig;

public class main1 {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = 
				new AnnotationConfigApplicationContext(appConfig.class);
		
		goldCustomer gc = (goldCustomer)ac.getBean("goldCustomer");
		platinumCustomer pc = (platinumCustomer)ac.getBean("platinumCustomer");
		gc.disp();
		pc.disp();
		
	}
	/*
	This is Gold Customer
	This is platinum Customer */
}
