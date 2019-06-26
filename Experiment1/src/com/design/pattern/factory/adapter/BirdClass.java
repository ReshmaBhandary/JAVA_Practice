package com.design.pattern.factory.adapter;

public class BirdClass implements Bird {

	@Override
	public void fly() {
		System.out.println("bird is flying");
		
	}

	@Override
	public void makSound() {
		System.out.println("bird is making sound");		
	}

}
