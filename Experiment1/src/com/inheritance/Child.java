package com.inheritance;

public class Child extends Parent {
	private int ii;
	private int salary;
	private int num;
	private void reshma() {
		System.out.println("private child reshma");
	}
	
	public int getIi() {
		return ii;
	}

	public void setIi(int ii) {
		this.ii = ii;
	}

	public int dislay(){
		System.out.println(super.i);
		return num;
	}
	
	
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	Child(){
		System.out.println("hi constructor:child");
	}
	static {
		System.out.println("hi inside static block:child");
	}
	{
		System.out.println("hi inside initialize block:child");
	}
	Child(int i){
		i=i;
	}
	public String add() {
		System.out.println("Child ");
		return null;
		
	}
	
	public String add(int a) {
		System.out.println("Child aaaaaaa");
		return null;
		
	}
	public void dispaly(Integer a) {
		System.out.println("insdei child integer");
	}
	public void dispaly(Object a) {
		System.out.println("insdei child object");
	}
	@Override
	public String toString() {
		return "Child [salary=" + salary + "]";
	}
	@Override
	public int hashCode() {
		System.out.println("hi inside hashcode");
		final int prime = 31;
		int result = 1;
		result = prime * result + salary;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("hi inside equals");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Child other = (Child) obj;
		if (salary != other.salary)
			return false;
		return true;
	
	}
	
	public Integer m2(Object a) {
		System.out.println("insdei child object");
		return null;
	}
	public final Integer m3(Object a) {
		System.out.println("insdei child object");
		return null;
	}
	
	
}
