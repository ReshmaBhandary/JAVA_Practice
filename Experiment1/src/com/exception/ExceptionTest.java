package com.exception;

public class ExceptionTest {
	static String a="a";

	public static void main(String[] args) {
		try {
			m1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void m1() throws Exception {
		try {
			a+="b";
			throw new Exception();
		} catch (Exception e) {
			a+="c";
			throw new Exception();
		}finally{
			a+="d";
		}
	}

}
