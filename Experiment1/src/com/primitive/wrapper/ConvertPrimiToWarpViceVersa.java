package com.primitive.wrapper;

import java.util.HashMap;

public class ConvertPrimiToWarpViceVersa {

	public static void main(String[] args) {
		int i = 10;
		Integer a = new Integer(i);
		System.out.println(a);
		Integer bb = 123;
		System.out.println("********" + bb.intValue());

		Integer aa = Integer.valueOf(309876542);
		System.out.println(aa);
		System.out.println(Integer.parseInt(aa.toString()));

		// Integer to int
		Integer key = Integer.valueOf(2147483647);
		int ii = aa.intValue();
		int keyint = key;
		System.out.println(keyint);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(1/0.0);
		System.out.println("**********************************************************************");
		try {
			System.out.println(doStuff(args));
		}
		catch(Exception e) {
			System.out.println("exc");
			doStuff(args);
		}

		//System.out.println(Integer.parseInt(args[0]));
	}

	 static int doStuff(String[] args) {
		return Integer.parseInt(args[0]); 
		// TODO Auto-generated method stub
	}

}
