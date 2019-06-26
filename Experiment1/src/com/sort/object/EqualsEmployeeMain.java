package com.sort.object;

import java.util.ArrayList;

public class EqualsEmployeeMain {

	public static void main(String[] args) {
		Employee emp=new Employee("reshma", 123, "kar");
		System.out.println("******************************");
		System.out.println("After");
		System.out.println(emp);
		System.out.println("******************************");
		trymodifyEmp(emp.getEmpInt(),emp.getEmpName());
		System.out.println("Before");
		System.out.println(emp);
		
		Employee emp1=new Employee("reshma1", 1231, "kar1");
		Employee emp2=new Employee("reshma2", 1232, "kar2");
		ArrayList<Employee> emplist=new ArrayList<>();
		emplist.add(emp);
		emplist.add(emp1);
		emplist.add(emp2);
		if(emplist.contains(emp)) {
			System.out.println("true");
			
		}
		if(emp.equals(emp)) {
			System.out.println("true");
		}
	}

	private static void trymodifyEmp(int empInt, String empName) {
		empInt=1;
		empName="sushma";
		
	}

}
