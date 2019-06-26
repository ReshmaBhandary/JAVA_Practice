package com.inheritance;


public class Parent {
	private int ii;
	
	public int getIi() {
		return ii;
	}
	public void setIi(int ii) {
		this.ii = ii;
	}
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	private int num;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	private void display() {
		System.out.println("private dispaly");
	}
	private void display(int i) {
		System.out.println("private dispaly");
	}
	static {
		System.out.println("Hi static block:parent");
	}
	public static void disp() {
		System.out.println("Parent disp");
	}
	
	public Parent() {
		System.out.println("Hi constructor block:parent");
	}
	{
		System.out.println("Hi initialize block:parent");
	}
	int i=1;
	protected Object add() {
		System.out.println("Parent ");
		return 0;
		
	}
	public Integer addInteger() {
		System.out.println("hi Parent");
		return 0;
		
	}
	@Override
	public String toString() {
		return "Parent [num=" + num + ", i=" + i + "]";
	}
	public Object m2(Object a) {
		System.out.println("insdei child object");
		return null;
	}
	public Integer m1(Object a) {
		System.out.println("insdei child object");
		return null;
	}
	public Integer m3(Object a) {
		System.out.println("insdei child object");
		return null;
	}

}
