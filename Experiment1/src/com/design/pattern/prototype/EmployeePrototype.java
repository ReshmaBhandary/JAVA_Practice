package com.design.pattern.prototype;

public class EmployeePrototype  implements EmployeeInterface{
	private String name;
	private Double salary;

	@Override
	public EmployeeInterface getClone() {
		EmployeePrototype empProto=new EmployeePrototype(name,salary);
		return empProto;
	}
	public EmployeePrototype(String name,Double salary) {
		this.name=name;
		this.salary=salary;
		
	}
	@Override
	public String toString() {
		return "EmployeePrototype [name=" + name + ", salary=" + salary + "]";
	}
	

}
