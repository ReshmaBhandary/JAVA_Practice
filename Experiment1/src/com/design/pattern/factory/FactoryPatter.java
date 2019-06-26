package com.design.pattern.factory;

public class FactoryPatter {
	
	public static FoodInterface getInstance(int i) {
		FoodInterface fd=null;
		if(i==1) {
			fd=new HoomFood();
		}else {
			fd=new HotelFood();
		}
		return fd;
		
	}

}
