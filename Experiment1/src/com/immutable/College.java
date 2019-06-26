package com.immutable;

import java.util.Date;

public final class College implements Cloneable{
	private final String name;
	
	private final Date dob;
	private final Departments dept;
	public College(String name, Date dob, Departments dept) {
		super();
		this.name = name;
		Date d=new Date(dob.getTime());
		this.dob = d;
		Departments dep=new Departments(dept.getDeptName(), dept.getDeptId(),dept.getI());
		this.dept = dep;
	}
	public String getName() {
		return name;
	}
	public Date getDob() {
		return new Date(this.dob.getTime());
	}
	public Departments getDept() {
		Departments dep=new Departments(dept.getDeptName(), dept.getDeptId(),dept.getI());
		return dep;
	}
	
	protected Object clone()  throws CloneNotSupportedException{
		return null;
		
	}

	

}
