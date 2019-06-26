package com.serializable;

import java.io.Serializable;

 class ChildEmployee extends Employee implements Serializable{

	
	public ChildEmployee(String empName, int empInt, String city,String name) {
		super(empName, empInt, city);
		this.name=name;
		// TODO Auto-generated constructor stub
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 8074282382721129415L;
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
 

	
