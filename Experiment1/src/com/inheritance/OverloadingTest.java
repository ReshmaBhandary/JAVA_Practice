package com.inheritance;

public class OverloadingTest {
	public void add(int i,long f) {
		System.out.println("long");
	}
	protected int add(int i,double d) {
		System.out.println("double");
		return 1;
	}

	public static void main(String[] args) {
		OverloadingTest obj=new OverloadingTest();
		float a=(float) 1.0;
		obj.add(1,a);
	

	}

}
