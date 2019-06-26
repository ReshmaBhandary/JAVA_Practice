package com.exception;

public class MutipleTryCatchFinally {
	static String str = "a";

	public static void main(String[] args) {

		MutipleTryCatchFinally mutipleTryCatchFinally = new MutipleTryCatchFinally();
		mutipleTryCatchFinally.method1();
		System.out.println(str);

		System.out.println("*************************************");
		int i = below();
		System.out.println(i);

	}

	private static int below() {
		int a = 0;
		try {
			throw new NullPointerException();

		} catch (Exception e) {
			return 1;
		} finally {
			return 3;
		}
	}

	private void method1() {
		try {
			method2();
		} catch (Exception e) {
			str += "b";
		}
	}

	private void method2() throws Exception {
		try {
			method3();
			str += "c";

		} catch (Exception e) {
			throw new Exception();
		} finally {
			str += "d";
		}
		method3();
		str += "e";

	}

	private void method3() throws Exception {
		throw new Exception();

	}

}
