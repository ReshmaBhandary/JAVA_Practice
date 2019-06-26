package com.exception;

import java.io.IOException;

public class ExceptionTesting {

	public static void main(String[] args) {
		m1();
		System.out.println("************************");
		int i=m2();
		System.out.println(i);
		System.out.println("*****************************");
		Parent p = new Child();
		p.dis();

	}

	 static void m1() {
		System.out.println("hi");
		try {
			throw new Exception();
		} catch (Exception e) {
			System.out.println("inside exception");
		}

	}
	 static int  m2() {
			System.out.println("hi");
			try {
				throw new Exception();
			} catch (Exception e) {
				System.out.println("inside exception");
				return 1;
			}
			finally {
				return 2;
			}

		}
}

	class Parent {
		void dis() throws RuntimeException {
			System.out.println("parent");
		}
	}

	class Child extends Parent {
		void dis() throws RuntimeException  {
			System.out.println("child");
		}
	}
