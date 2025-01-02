package com.ioc2.MainMethods;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ioc2.classes.GoldCustomer;
import com.ioc2.classes.PlatinumCustomer;

public class main2 {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext cpx = new ClassPathXmlApplicationContext("beans1.xml");
		GoldCustomer gc= (GoldCustomer)cpx.getBean("gc");
		PlatinumCustomer pc= (PlatinumCustomer)cpx.getBean("pc");

		gc.showDetails();
		pc.showDetails();
		//the Customer Type is:Gold Customer
		//	the Customer Type is:Platinum Customer
		
//		Setter Injection
		/* using setter and getter and property in beans1.xml
		 	the Customer Type is:Gold Customer
			the Customer Type is:Platinum Customer
		*/

	}

}
