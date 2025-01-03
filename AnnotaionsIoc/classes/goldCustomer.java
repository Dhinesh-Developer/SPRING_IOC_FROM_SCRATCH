package com.AnnotaionsIoc.classes;

import org.springframework.stereotype.Component;

import com.AnnotaionsIoc.interfaces.Customer;

@Component("goldCustomer")
public class goldCustomer implements Customer{

	@Override
	public String getMembershiptype() {
		return "GoldCustomer";
	}

}
