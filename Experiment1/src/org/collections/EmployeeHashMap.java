package org.collections;

public class EmployeeHashMap {
	private int empID;
	private String empName;
	private int mangId;
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getMangId() {
		return mangId;
	}
	public void setMangId(int mangId) {
		this.mangId = mangId;
	}
	public EmployeeHashMap(int empID, String empName, int mangId) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.mangId = mangId;
	}

	
	

}
