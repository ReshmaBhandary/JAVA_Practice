package org.clone;

public class copyTest {

	public static void main(String[] args) throws CloneNotSupportedException {
	/*	System.out.println("Shallow Copy");
		Address ad=new Address("udupi", "Karnataka");
		Employee e1=new Employee("reshma", 1234, ad);
		Employee e2= (Employee) e1.clone();
		System.out.println(e1);
		System.out.println(e2);
		e2.getAddress().setCcity("Kundapura");
		System.out.println(e1);
		System.out.println(e2);*/
		
		
		
		System.out.println("Deep Copy");
		Address ad=new Address("udupi", "Karnataka");
		Employee e1=new Employee("reshma", 1234, ad);
		Employee e2= (Employee) e1.clone();
		System.out.println(e1);
		System.out.println(e2);
		e2.getAddress().setCcity("Kundapura");
		System.out.println(e1);
		System.out.println(e2);

		
	}

	

}
