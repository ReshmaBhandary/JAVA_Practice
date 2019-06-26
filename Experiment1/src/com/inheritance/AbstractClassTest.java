package com.inheritance;

public class AbstractClassTest extends AbstractClass {
	AbstractClassTest(){
		super(20);
		System.out.println("AbstractClassTest inside");
	}

	public void display() {
		System.out.println("hi inside display in AbstractClassTest");
	}

	public static void main(String[] args) {
		AbstractClassTest obj=new AbstractClassTest();
		
		System.out.println(obj.add(1, 2));
		obj.display();

	}

}
