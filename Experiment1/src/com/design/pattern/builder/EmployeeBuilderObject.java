package com.design.pattern.builder;

public class EmployeeBuilderObject {
	private final String employeeName;
	private final String employeeLastName;
	private final int age;

	public String getEmployeeName() {
		return employeeName;
	}

	public String getEmployeeLastName() {
		return employeeLastName;
	}

	public int getAge() {
		return age;
	}

	public EmployeeBuilderObject(EmployeeBuilder builder) {
		this.employeeName = builder.employeeName;
		this.employeeLastName = builder.employeeLastName;
		this.age = builder.age;
	}
	

	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", employeeLastName=" + employeeLastName + ", age=" + age
				+ "]";
	}


	public static class EmployeeBuilder {
		private  String employeeName;
		private  String employeeLastName;
		private int age;

		public EmployeeBuilder(String employeeName, String employeeLastName) {
			this.employeeName = employeeName;
			this.employeeLastName = employeeLastName;

		}

		public EmployeeBuilder age(int age) {
			this.age = age;
			return this;
		}

		public EmployeeBuilderObject build() {
			EmployeeBuilderObject emp = new EmployeeBuilderObject(this);
			return emp;
		}

	}

}
