package com.design.pattern.factory.adapter;

public class AdapterMain {

	public static void main(String[] args) {
		BirdClass birdClass = new BirdClass();
		birdClass.fly();
		birdClass.makSound();

		ToyClass toy = new ToyClass();
		toy.speak();

		ToyInterface birdAda = new BirdAdapterClass(birdClass);
		birdAda.speak();

	}

}
