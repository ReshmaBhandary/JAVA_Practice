package com.clone;

import java.util.ArrayList;

public class EmployeeCloneTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		ArrayList<String> li=new ArrayList<String>();
		li.add("A");
		li.add("B");
		EmployeeClone shalowCopy = new EmployeeClone(1, "Reshma",li);
		EmployeeClone e2 = (EmployeeClone) shalowCopy.clone();
		System.out.println(shalowCopy);
		System.out.println(e2);
		e2.setId(2);
		e2.getList().add("C");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println(shalowCopy);
		System.out.println(e2);
		

	}

}
