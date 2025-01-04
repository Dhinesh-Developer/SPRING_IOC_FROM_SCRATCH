package com.swh.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Component
@Table(name="customer")
public class Customer {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="cId")
	private int cId;
	@Column(name="cName")
	private String cName;
	@Column(name="cType")
	private String cType;
	@Column(name="cEmial")
	private String cEmail;
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getcType() {
		return cType;
	}
	public void setcType(String cType) {
		this.cType = cType;
	}
	public String getcEmail() {
		return cEmail;
	}
	public void setcEmail(String cEmail) {
		this.cEmail = cEmail;
	}
	public Customer(int cId, String cName, String cType, String cEmail) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.cType = cType;
		this.cEmail = cEmail;
	}

	@Autowired
	public Customer(@Value("virat") 
	String cName,@Value("Diamond") String cType,
	@Value("virat@gmail.com") String cEmail) {
		super();
		this.cName = cName;
		this.cType = cType;
		this.cEmail = cEmail;
	}

	public Customer() {
	}
	@Override
	public String toString() {
		return "Customer [cId=" + cId + ", cName=" + cName + ", cType=" + cType + ", cEmail=" + cEmail + "]";
	}


}
