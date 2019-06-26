package com.java8.method.refering;

public interface MethodRefering {
	
	 default void newMethod(){  
	        System.out.println("Inside Method refering");  
	    }
	 public static void newMethodStatic(){  
	        System.out.println("Inside Method refering static");  
	    }
}
