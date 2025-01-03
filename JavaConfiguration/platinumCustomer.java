package com.JavaConfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class platinumCustomer {
	@Autowired
	@Value("Platinum Customer")
	String type;
	
	public void disp() {
		System.out.println("This is "+type);
	}

}
