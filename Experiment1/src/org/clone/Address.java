package org.clone;

public class Address implements Cloneable {
	private String ccity;
	private String state;

	public String getCcity() {
		return ccity;
	}

	public void setCcity(String ccity) {
		this.ccity = ccity;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Address(String ccity, String state) {
		super();
		this.ccity = ccity;
		this.state = state;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
	    return super.clone();
	}

	@Override
	public String toString() {
		return "Address [ccity=" + ccity + ", state=" + state + "]";
	}

}
