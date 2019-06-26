package com.exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class MultipleExceptionCatchBlock {

	public static void main(String[] args) throws IOException {
		System.out.println( m1());
	}

	private static int m1() throws IOException {
		try {
			throw new IOException();
		} catch (IOException |ArithmeticException w) {
			return 1;
			//throw new IOException();
			
		} 
	}

}
