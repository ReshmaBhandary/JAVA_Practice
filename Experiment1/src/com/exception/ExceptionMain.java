package com.exception;

import java.io.IOException;
import java.sql.SQLException;

public class ExceptionMain {

	public static void main(String[] args) {
		
		try {
			//add(123);
			System.out.println("hi");
			throw new RuntimeException();
		/*} catch (Exception e1) {
			System.out.println("hi reshma ");
		*/	
		} catch (Exception e) {
			// TODO Auto-generated catch block
System.out.println("hi");		}
		
		
		
		
		
		System.out.println("***************************");
			try {
				test(-1);
			}
			catch (IOException e) {
				System.out.println("IO ****");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			/*catch (Exception e) {
				System.out.println("****");
			}*/
		
		
	}

	private static void add(int i) throws Exception {
		if (i > 0) {
			throw new Exception();
		}
		
	}

	private static void test(int i) throws Exception {
		try {
			if (i < 0) {
				throw new Exception();
			}

		} catch (Exception e) {
			System.out.println("hiiiiiiiiiiiiiiiiiiii");
			throw new IOException();
		}

	}

}
