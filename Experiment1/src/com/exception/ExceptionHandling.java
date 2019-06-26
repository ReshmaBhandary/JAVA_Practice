package com.exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling {

	public static void main(String[] args) throws FileNotFoundException ,IOException {
		
		String a="";
		System.out.println(a.trim().isEmpty());
			try{
				testException(15);
				testException(-5);
				testException(-10);
			}catch(Exception e){
				System.out.println("*********"+e.getMessage());
			}finally{
				System.out.println("Releasing resources");			
			}
		//	testException(15);
		}
		
		public static void testException(int i) throws FileNotFoundException ,IOException{
			if(i < 0){
			//	FileNotFoundException myException = new FileNotFoundException("Negative Integer "+i);
				throw new FileNotFoundException("Negative Integer "+i);
			}else if(i > 10){
				throw new IOException("Only supported for index 0 to 10");
			}

		}

	
}
