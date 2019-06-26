package com.java8.method.refering;

public class MethodReferenceMainTest {
	
	
	public static int express() {
		return 2;
	}
	

	public static void main(String[] args) {
//		MethodReferenceMainTest obj=new MethodReferenceMainTest();
//		MethodReferenceInterface m=obj::add;
//		m.display();
		MethodReferenceInterface m1=MethodReferenceMainTest::express;
		m1.display();
		System.out.println(m1.display1());
		}

}
