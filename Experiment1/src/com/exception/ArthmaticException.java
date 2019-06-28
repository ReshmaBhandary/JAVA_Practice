package com.exception;

public class ArthmaticException {
	public static void main (String... args) {
		method1();
	}

	private static void method1() throws ArithmeticException {
		try {
			int i=30/0;
			
		}
		catch(RuntimeException e){
			System.out.println(1);
		//	e.printStackTrace();
		}
		finally {
			System.out.println("hi");
		}
		System.out.println('A');
		
	}

}
