package com.design.pattern.factory.adapter;

public class BirdAdapterClass implements ToyInterface {
	public Bird bird;

	public BirdAdapterClass(Bird bird) {
		this.bird = bird;
	}

	@Override
	public void speak() {
		bird.fly();
	}

}
