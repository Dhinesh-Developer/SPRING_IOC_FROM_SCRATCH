package com.dk.sb.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="user")
public class Employee {
	
	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="u_Id")
	private int uId;
	@Column(name="u_Name")
	private String uName;
	@Column(name="u_Email")
	private String uEmail;
	@Column(name="u_Desig")
	private String uDesig;
	public int getuId() {
		return uId;
	}
	public void setuId(int uId) {
		this.uId = uId;
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public String getuEmail() {
		return uEmail;
	}
	public void setuEmail(String uEmail) {
		this.uEmail = uEmail;
	}
	public String getuDesig() {
		return uDesig;
	}
	public void setuDesig(String uDesig) {
		this.uDesig = uDesig;
	}
	@Override
	public String toString() {
		return "Employee [uId=" + uId + ", uName=" + uName + ", uEmail=" + uEmail + ", uDesig=" + uDesig + "]";
	}
	public Employee(int uId, String uName, String uEmail, String uDesig) {
		super();
		this.uId = uId;
		this.uName = uName;
		this.uEmail = uEmail;
		this.uDesig = uDesig;
	}
	public Employee(String uName, String uEmail, String uDesig) {
		super();
		this.uName = uName;
		this.uEmail = uEmail;
		this.uDesig = uDesig;
	}
	public Employee() {
	}
	
}
