package org.collections;

public class NullPointerPersonTest {

	public static void main(String[] args) {
Person name=new Person("Reshma");
Integer number=name.getPhone();// works
int num=name.getPhone();
System.out.println(num);
	}

}
