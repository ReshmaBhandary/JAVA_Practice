package com.inheritance;


import java.io.IOException;
import java.util.*;

public class Overriding2 {

	public static void main(String[] args) throws Exception {


		
		Parent2 pp=new Child2();
		Object a=new Object();
		pp.m2(a);
		
		
		Child2 ch=new Child2();
		Parent2 p=ch;
		p.m2(null);		
		
//		System.out.println("*******************");
//		Child c1ch=(Child) new Parent();
//		c1ch.m1(null);
		
		
	}

}
