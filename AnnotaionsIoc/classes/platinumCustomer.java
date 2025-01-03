package com.AnnotaionsIoc.classes;

import org.springframework.stereotype.Component;

import com.AnnotaionsIoc.interfaces.Customer;
@Component("platinumCustomer")
public class platinumCustomer implements Customer{

	@Override
	public String getMembershiptype() {
		return "Platinum Customer";
	}

}
