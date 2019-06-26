package com.exception;

public class CustomisedExceptionMain {

	public static void main(String[] args) throws CustomisedException  {
		try {
		validate();
//		}catch(CustomisedException es) {
//			System.out.println(1);
//			System.out.println(es.getMessage());
//			
		}
		catch(CustomisedException es) {
			System.out.println(2);
			System.out.println(es.getMessage());
			//throw new CustomisedException("hhhhhhhhhhhhhi");
			
		}
		finally {
			System.out.println("done-------------");
		}
		
		
		
		int i=0;
		if(0==i) {
			throw new CustomisedException("hiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
		}
		System.out.println("end");
		
	}

	private static void validate() throws CustomisedException  {
		//try {
			throw new CustomisedException("oh no exception");
//		}catch(CustomisedException e) {
//			System.out.println(e.getMessage());
//			
//		}
		
	}

}
