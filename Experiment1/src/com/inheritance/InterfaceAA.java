package com.inheritance;

public interface InterfaceAA {
	public void m1();
	default void m2() {
		System.out.println("hi inside interfaceAA");
	}

}
