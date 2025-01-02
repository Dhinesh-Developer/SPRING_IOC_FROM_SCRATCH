package com.ioc.mainMethods;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ioc.interfaces.JavaTrainer;
import com.ioc.interfaces.SqlTrainer;
import com.ioc.interfaces.WebTrainer;

public class main1 {

	public static void main(String[] args) {
		//		Spring IOC default follows the single Ton Design Pattern.
		//		same object will create again and again.

		ClassPathXmlApplicationContext cpx = new ClassPathXmlApplicationContext("beans.xml");
		JavaTrainer jt =(JavaTrainer)cpx.getBean("javaT");
		SqlTrainer st =(SqlTrainer)cpx.getBean("sqlT");
		WebTrainer wt =(WebTrainer)cpx.getBean("webT");

		System.out.println(jt.giveTask(cpx));
		System.out.println(st.giveTask(cpx));
		System.out.println(wt.giveTask(cpx));
		/*
		  	kumar says Pratice OOPS Concept for 2 hours
			Dhinesh says Pratice sql queries for 2 hours
			Dk says Pratice web development for 2 hours

		 */
		/*
		 * 	Java Trainer tolds pratice OOPS concept 
			Sql Trainer Told pratice sql queries
			Web Trainer told pratice Front end part*/

		/* For Getting an object.
		 * 	System.out.println(jt);
			System.out.println(st);
			System.out.println(wt);
			------------------output--------------- bean Factory Address.
			com.ioc.classes.JavaTrainerImpl@71c8becc
			com.ioc.classes.SqlTrainerImpl@19d37183
			com.ioc.classes.WebTrainerImpl@1a0dcaa
		 */


		//		when we need different types of object create a another classPathXmlApplications.
		/*
		ClassPathXmlApplicationContext cpx1 = new ClassPathXmlApplicationContext("beans.xml");
		JavaTrainer jt1 =(JavaTrainer)cpx1.getBean("javaT");
		SqlTrainer st1 =(SqlTrainer)cpx1.getBean("sqlT");
		WebTrainer wt1 =(WebTrainer)cpx1.getBean("webT");

		System.out.println(jt1);
		System.out.println(st1);
		System.out.println(wt1);

		----------output-------------------
		com.ioc.classes.JavaTrainerImpl@1460a8c0
		com.ioc.classes.SqlTrainerImpl@4f638935
		com.ioc.classes.WebTrainerImpl@4387b79e
		 */

		/*
		 // Using the constructor injection
	  	Java Trainer tolds pratice OOPS concept 
		Sql Trainer Told pratice sql queries
		Web Trainer told pratice Front end part*/

		cpx.close();
	}

}
