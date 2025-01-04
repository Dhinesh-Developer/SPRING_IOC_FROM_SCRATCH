package com.springWithHiberante.springWithHIb.ORM;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.swh.config.beanConfig;
import com.swh.entity.Customer;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

	AnnotationConfigApplicationContext ac = 
			new AnnotationConfigApplicationContext(beanConfig.class);
	Customer c = (Customer)ac.getBean("customer");
	
	
	Session session = new Configuration().configure().addAnnotatedClass(Customer.class)
			.buildSessionFactory().openSession();
	
	session.beginTransaction();
	session.persist(c);
	session.getTransaction().commit();
	System.out.println("Data inserted in customer table");
	
	}

}
