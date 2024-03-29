package org.clone;

public class Employee  implements Cloneable{
	private String name;
	private int id;
	private Address address;
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
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
	public Employee(String name, int id, Address address) {
		super();
		this.name = name;
		this.id = id;
		this.address = address;
	}
	
	protected Object clone() throws CloneNotSupportedException {
		Employee e=(Employee) super.clone();
		Address a=(Address) e.getAddress().clone();
		e.setAddress(a);
	    return e;
	}
	
	/*@Override
	protected Object clone() throws CloneNotSupportedException {
	    return super.clone();
	}*/
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", address=" + address + "]";
	}
	
	

}
