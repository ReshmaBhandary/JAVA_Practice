package com.serializable;

import java.io.Serializable;

public class Employee implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3456074228397274248L;
	private String empName;
	private int empInt;
	private transient String city;
	private Address add;
	
	
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
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
	public Employee(String empName, int empInt,String city,Address aa) {
		super();
		this.empName = empName;
		this.empInt = empInt;
		this.city=city;
		this.add=aa;
	}
	
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empInt=" + empInt + ", city=" + city + "]";
	}
	
	
	

}
