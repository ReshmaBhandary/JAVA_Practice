package com.java8.method.refering;

public class TestMethodRefernce {
	public void add() {
		System.out.println("hahahahha");
	}

	public static void main(String[] args) {
		TestMethodRefernce object=new TestMethodRefernce();
		MethodReferencestage2 obj=object::add;
				obj.dis();

	}

}
