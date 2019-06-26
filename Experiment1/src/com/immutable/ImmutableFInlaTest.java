package com.immutable;

import java.util.Date;

public class ImmutableFInlaTest {
	public static void main(String... args) {
		Departments d1=new Departments("ISE", 1,123);
		College c1=new College("MGM", new Date(), d1);
		System.out.println(c1.getDept().getDeptId());
		c1.getDept().setDeptId(2);
		System.out.println(c1.getDept().getDeptId());
		System.out.println(c1.getDept().getI());
		swap(c1);
		System.out.println(c1.getDept().getI());
	}
	private static void swap(College c1) {
c1.getDept().setI(190);
	}

	

}
