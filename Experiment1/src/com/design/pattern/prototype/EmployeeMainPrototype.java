package com.design.pattern.prototype;

public class EmployeeMainPrototype {

	public static void main(String[] args) {
		EmployeePrototype empPt=new EmployeePrototype("reshma", (double) 22000);
		System.out.println(empPt);
		
		EmployeePrototype empPt2=(EmployeePrototype) empPt.getClone();
		System.out.println(empPt2);

	}

}
