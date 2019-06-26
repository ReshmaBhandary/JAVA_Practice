package org.generics;


public class Employee{

	/**
	 * 
	 */
	private String empName;
	private int empInt;
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
	public Employee(String empName, int empInt,String city) {
		super();
		this.empName = empName;
		this.empInt = empInt;
	}
	
	
	
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empInt=" + empInt + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empInt;
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empInt != other.empInt)
			return false;
		if (empName == null) {
			if (other.empName != null)
				return false;
		} else if (!empName.equals(other.empName))
			return false;
		return true;
	}
	
	
	
	

}
