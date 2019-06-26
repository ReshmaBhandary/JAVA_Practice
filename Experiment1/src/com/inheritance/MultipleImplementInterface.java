package com.inheritance;

public class MultipleImplementInterface  implements InterfaceAA,InterfaceBB{

	public static void main(String[] args) {
		MultipleImplementInterface ob=new MultipleImplementInterface();
		ob.m1();
		ob.m2();
	}

	@Override
	public void m1() {
System.out.println("hi inside main methos");		
	}

	
}
