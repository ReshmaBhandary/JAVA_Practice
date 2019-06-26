package com.immutable;

public class Departments {
	private String deptName;
	private int deptId;
	private Integer i;
	public String getDeptName() {
		return deptName;
	}
	
	public Integer getI() {
		return i;
	}

	public void setI(Integer i) {
		this.i = i;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public Departments(String deptName, int deptId,Integer i) {
		super();
		this.deptName = deptName;
		this.deptId = deptId;
		this.i=i;
	}
	public Departments() {
		super();
	}
	
	

}
