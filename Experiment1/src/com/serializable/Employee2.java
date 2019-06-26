package com.serializable;

import java.io.Serializable;

public class Employee2 implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3456074228397274248L;
	private String empName;
	private int empInt;
	private transient String city;
	private Address address;
	
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpInt() {
		return empInt;
	}
	public void setEmpInt(int empInt) {
		this.empInt = empInt;
	}
	public Employee2(String empName, int empInt,String city,Address adr) {
		super();
		this.empName = empName;
		this.empInt = empInt;
		this.city=city;
		this.address=adr;
	}
	@Override
	public String toString() {
		return "Employee2 [empName=" + empName + ", empInt=" + empInt + ", city=" + city + ", address=" + address + "]";
	}
	
	
	
	
	

}
