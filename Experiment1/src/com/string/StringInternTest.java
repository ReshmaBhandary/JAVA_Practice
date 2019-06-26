package com.string;

public class StringInternTest {

	public static void main(String[] args) {
		String s1 = "reshma";
		String s2 = new String(s1);
		s2=s2.intern();
		if (s1 == s2) {
			System.out.println("equal");
		} else {
			System.out.println("not equal");
		}
		
		System.out.println(10/0.0);
		System.out.println("***********************************");
		String a="heloo world";
		a=a.replaceAll("o", "x");
		System.out.println(a);
		Integer i=99;
		//Integer oa=printMe(i);
		System.out.println(i++);
		System.out.println(i);
		System.out.println("***********************************");
		StringBuffer strbuf=new StringBuffer();
		strbuf=strbuf.append("ReshmaReshmaReshma");
		System.out.println("len"+ strbuf.length()+","+ strbuf.capacity());
	}

	private static void printMe(Integer i) {
		i=i+1;
		
	}

}
