package org.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableTest {

	public static void main(String[] args) {
		Vehicle v1 = new Vehicle(1, "Alto", 1234);
		Vehicle v2 = new Vehicle(99, "Skoda", 1235);
		Vehicle v3 = new Vehicle(45, "Ritz", 1236);
		Vehicle v4 = new Vehicle(1, "Alto", 1234);
		List<Vehicle> list=new ArrayList<>();
		list.add(v1);
		list.add(v2);
		list.add(v3);
		list.add(v4);
		Collections.sort(list);
		for(Vehicle v:list)
		System.out.println(v);
		System.out.println("*******************");
		Collections.sort(list,new VehicleCompareBySpeed());
		for(Vehicle v:list)
			System.out.println(v);
	}

}
