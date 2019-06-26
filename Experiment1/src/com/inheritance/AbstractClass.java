package com.inheritance;

public abstract class AbstractClass {
	int i=0;
	public AbstractClass() {
		i=10;
		System.out.println("AbstractClass inside cons");
	}
	public AbstractClass(int a) {
		i=20;
		System.out.println("AbstractClass inside cons");
	}
	
	public abstract void display() ;
	public int add(int a,int b) {
		return a+b+i;
	}

}
