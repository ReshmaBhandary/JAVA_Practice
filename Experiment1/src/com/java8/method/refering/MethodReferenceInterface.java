package com.java8.method.refering;
@FunctionalInterface
public interface MethodReferenceInterface {
	public void display();
	default int display1() {
		return 1;
	}
	

}
