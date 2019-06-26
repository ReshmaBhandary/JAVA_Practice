package com.inheritance;

public class Test {
	void disp(int a, double b) {
		System.out.println("Method A");
	}

	void disp(int a, double b, double c) {
		System.out.println("Method B");
	}

	void disp(int a, float b) {
		System.out.println("Method C");
	}

	static {
		System.out.println("2");
	}
	{
		System.out.println("3");
	}

	public static void main(String[] args) {
		Test t=new Test();
		System.out.println("1");
		t.disp(1, 1.0d);

	}

}
