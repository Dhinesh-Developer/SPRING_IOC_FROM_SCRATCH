package com.ioc2.classes;

import com.ioc2.interfaces.Customer;

public class PlatinumCustomer implements Customer{
//	String type="Platinum Customer";
	String type;
	@Override
	public void showDetails() {
		System.out.println("the Customer Type is:"+type);
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	
}
