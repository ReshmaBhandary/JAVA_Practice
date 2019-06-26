package org.comparable;

import java.util.Comparator;

public class VehicleCompareBySpeed implements Comparator<Vehicle>{

	@Override
	public int compare(Vehicle o1, Vehicle o2) {
		
		return o1.getSpeed()-o2.getSpeed();
	}

}
