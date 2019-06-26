package com.clone;

import java.util.ArrayList;
import java.util.Collections;

public class ShallowCloneTest {

	public static void main(String[] args) {
		Engine engine=new Engine("Good",10);
		ArrayList<String> list=new ArrayList<>();
		list.add("reshma");
		list.add("sushma");
		Collections.unmodifiableList(list);
		Car car=new Car("Maruthi",123,engine,list);
	//	list.add("j");
		Car car2=null;
		try {
			car2=(Car) car.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		System.out.println(car);
		System.out.println(car2);
		car2.setCarId(12345678);
		car2.getEngine().setEngineSPeed(120);
		car.getList().add("dd");
		System.out.println("**************");
		System.out.println(car);
		System.out.println(car2);
	}

}
