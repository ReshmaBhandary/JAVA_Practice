package com.clone;

import java.util.ArrayList;

public class Car implements Cloneable {
	private String carName;
	private int carId;
	private Engine engine;
	private ArrayList< String> list=null;
	

	public ArrayList<String> getList() {
		return list;
	}

	public void setList(ArrayList<String> list) {
		this.list = list;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public int getCarId() {
		return carId;
	}

	public void setCarId(int carId) {
		this.carId = carId;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public Car(String carName, int carId, Engine engine,ArrayList<String> list) {
		super();
		this.carName = carName;
		this.carId = carId;
		this.engine = engine;
		this.list=list;
	}

	public Object clone() throws CloneNotSupportedException {
	Car car=(Car)super.clone();
		  car.engine=(Engine) engine.clone();
		 
	     
		return car;

	//	return super.clone();
	}

	@Override
	public String toString() {
		return "Car [carName=" + carName + ", carId=" + carId + ", engine=" + engine + ", list=" + list + "]";
	}

	
	
}
