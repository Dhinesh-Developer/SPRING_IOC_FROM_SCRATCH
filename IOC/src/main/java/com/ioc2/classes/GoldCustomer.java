package com.ioc2.classes;

import com.ioc2.interfaces.Customer;

public class GoldCustomer implements Customer{
//	String type="Gold Customer";
	String type; // bean Factory to set the type/data
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public void showDetails() {
		System.out.println("the Customer Type is:"+type);
	}

}
