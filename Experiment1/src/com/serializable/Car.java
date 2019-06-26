package com.serializable;

import java.beans.Transient;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;

public class Car implements Serializable{
	/**
	 * 
	 */
	private String name;
	private int id;
	private Engine engine;
	private static int carNumber;
	private transient  String transientVariable="Sushma";
	private transient int[] arrays;
	
	public static int getCarNumber() {
		return carNumber;
	}
	public static void setCarNumber(int carNumber) {
		Car.carNumber = carNumber;
	}
	public int[] getArrays() {
		return arrays;
	}
	public void setArrays(int[] arrays) {
		this.arrays = arrays;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public String getTransientVariable() {
		return transientVariable;
	}
	public void setTransientVariable(String transientVariable) {
		this.transientVariable = transientVariable;
	}
	public Car(String name, int id, Engine engine,String trans,int crNumb,int[] arrays) {
		super();
		this.name = name;
		this.id = id;
		this.engine = engine;
		this.transientVariable=trans;
		this.carNumber=crNumb;
		this.arrays=arrays;
	}
	
	
	@Override
	public String toString() {
		return "Car [name=" + name + ", id=" + id + ", engine=" + engine + ", transientVariable=" + transientVariable
				+ ", arrays=" + Arrays.toString(arrays) + "]";
	}
	private void readObject(ObjectInputStream inStream) throws IOException, ClassNotFoundException {
		inStream.defaultReadObject();
		transientVariable = (String) inStream.readObject();
		arrays=(int[])inStream.readObject();
		
	}
	
	private void writeObject(ObjectOutputStream outStream) throws IOException  {
		outStream.defaultWriteObject();
		outStream.writeObject(transientVariable);
		outStream.writeObject(arrays);
	 }
	
	
	

}
