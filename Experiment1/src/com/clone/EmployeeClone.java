package com.clone;

import java.util.ArrayList;

public class EmployeeClone implements Cloneable{
	private int id;
	private String name;
	private ArrayList<String> list=null;
	
	public EmployeeClone(int id, String name,ArrayList<String> list) {
		super();
		this.id = id;
		this.name = name; 
		this.list=list;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
		
	}
	
	public ArrayList<String> getList() {
		return list;
	}
	public void setList(ArrayList<String> list) {
		this.list = list;
	}
	@Override
	public String toString() {
		return "EmployeeClone [id=" + id + ", name=" + name + ", list=" + list + "]";
	}
	


}
