package com.design.pattern.builder;

import com.design.pattern.builder.EmployeeBuilderObject.EmployeeBuilder;

public class EmployeeBuilderPatterMain {

	public static void main(String[] args) {
	
		EmployeeBuilderObject emp=new EmployeeBuilderObject.EmployeeBuilder("Reshma", "Bhandary").age(22).build();
		System.out.println(emp);
	}

}
