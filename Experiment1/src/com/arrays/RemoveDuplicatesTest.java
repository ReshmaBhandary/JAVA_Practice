package com.arrays;

import java.util.*;

public class RemoveDuplicatesTest {

	public static void main(String[] args) {
		Employee[] emp = new Employee[4];
		emp[0] = new Employee("Reshma1", 1);
		emp[1] = new Employee("Reshma2", 2);
		emp[2] = new Employee("Reshma3", 3);
		emp[3] = new Employee("Reshma1", 1);

		Set<Employee> set = new HashSet<>();
		for (Employee e : emp) {
			set.add(e);
		}
		for (Employee q : set) {
			System.out.println(q);
		}
		int[] spam = new int[] { 1, 2, 3 };
		List list = (List) Arrays.asList(spam);
		// list.add("7");
		System.out.println(list);
		System.out.println("**************************************************************************");
		Employee e1=new Employee("Reshma1", 1);
		Employee e2=new Employee("Reshma2", 2);
		Employee e3=new Employee("Reshma3", 3);
		Employee e4=new Employee("Reshma1", 1);
		Employee e5=e2;

		
		set = new HashSet<>();
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		e5.setEmpInt(4);
		set.add(e5);
		System.out.println(e2);
		System.out.println(set.size());
		
		
		
		
	}

}
