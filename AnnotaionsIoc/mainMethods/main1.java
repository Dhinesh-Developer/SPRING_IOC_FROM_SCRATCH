package com.AnnotaionsIoc.mainMethods;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.AnnotaionsIoc.classes.goldCustomer;
import com.AnnotaionsIoc.classes.platinumCustomer;

public class main1 {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext cpx = new ClassPathXmlApplicationContext("IocAnnotaions.xml");
		goldCustomer gc = (goldCustomer)cpx.getBean("goldCustomer");
		platinumCustomer pc = (platinumCustomer)cpx.getBean("platinumCustomer");
		
		System.out.println(gc.getMembershiptype());
		System.out.println(pc.getMembershiptype());
		
	}
//GoldCustomer 	Platinum Customer


}
