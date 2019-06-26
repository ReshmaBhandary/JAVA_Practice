package com.inheritance;

public class Car extends Vehicle {
	private int id;
	private String type;
	private String wheeler;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getWheeler() {
		return wheeler;
	}
	public void setWheeler(String wheeler) {
		this.wheeler = wheeler;
	}
	public Car(int id, String name, String type, String wheeler) {
		super(id, name);
		this.type = type;
		this.wheeler = wheeler;
		this.id=id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Car [id=" + id + ", type=" + type + ", wheeler=" + wheeler + ", getType()=" + getType()
				+ ", getWheeler()=" + getWheeler() + ", getId()=" + getId() + ", getName()=" + getName()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	

}
