package com.exception;

import java.io.IOException;

public class ReturnWithTryCatchFinally {

	public static void main(String[] args) {
		int i = -5;
		System.out.println(returnStatementException(i));
	}

	private static int returnStatementException(int i) {

		try {
			if (i < 0) {
				throw new IOException();
				
			}return 8;
		} catch (IOException e) {
			System.out.println("hi in catch block");
			return 10;
		}
		finally {
			System.out.println("hi in finally block");
			//return 25;
		}

	}
}
