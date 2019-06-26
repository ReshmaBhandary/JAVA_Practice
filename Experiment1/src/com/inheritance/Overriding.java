package com.inheritance;


import java.util.*;

public class Overriding {

	public static void main(String[] args) {
//		Parent p = new Child();
//		p.addInteger();
//		p.add();
//		
//		Child a=new Child(10);
//		System.out.println(a.i);
//		for (int index = 0; true; index++) {
//            System.out.println("Welcome");
//            break;
//        }
		Child ch=new Child();
		ch.setIi(123);
		
	
		//Child ch1=new Child();
		ch.dispaly(null);
		System.out.println("**********************");
		ch.setNum(1111);
		ch.setSalary(1234555);
		System.out.println(ch);

		
		System.out.println("((((((((((((((((((((((((((((((((((((((((((((((");
		Parent pp=new Child();
		Object a=new Object();
		pp.m2(a);
		
		
		
		
		
		System.out.println("**************************Clear All*************************************************");
		Parent p=new Child();
		p.setNum(1);
		System.out.println(p.getNum());
		Child c=new Child();
		c.setNum(2);
		System.out.println(c.getNum());
		Parent d=new Child();
		d.m3(null);
		
		
		
		
		System.out.println("**************************Clear All*************************************************");
		Child abc=new Child();
		Parent ppp=new Parent();
		ppp.disp();
		Parent.disp();
		
		//display(null);
		
	}

	private static void display(Object obj) {
System.out.println("Object");		
	}
	private static void display(String obj) {
		System.out.println("String");			
	}
	private static void display(Double obj) {
		System.out.println("Double");			
	}

}
