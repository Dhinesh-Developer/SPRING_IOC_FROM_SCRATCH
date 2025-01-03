package com.JavaConfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class goldCustomer {
	@Autowired
	@Value("Gold Customer")
	String type;
	
	public void disp() {
		System.out.println("This is "+type);
	}

	/*
	 * public void disp() {
		System.out.println("This is Gold Customer");
	}
*/
}
