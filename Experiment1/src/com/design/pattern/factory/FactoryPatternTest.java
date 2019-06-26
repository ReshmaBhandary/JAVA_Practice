package com.design.pattern.factory;

public class FactoryPatternTest {

	public static void main(String[] args) {
		FoodInterface foodInterface=FactoryPatter.getInstance(-1);
		foodInterface.display();


	}

}
