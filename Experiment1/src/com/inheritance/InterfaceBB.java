package com.inheritance;

public interface InterfaceBB {
	public void m1();
	default void m3() {
		System.out.println("hi inside interfaceBB");
	}

}
