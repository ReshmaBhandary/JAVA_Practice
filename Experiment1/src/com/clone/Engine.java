package com.clone;

public class Engine implements Cloneable {
	private String engineType;
	private int engineSPeed;
	public String getEngineType() {
		return engineType;
	}
	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}
	public int getEngineSPeed() {
		return engineSPeed;
	}
	public void setEngineSPeed(int engineSPeed) {
		this.engineSPeed = engineSPeed;
	}
	public Engine(String engineType, int engineSPeed) {
		super();
		this.engineType = engineType;
		this.engineSPeed = engineSPeed;
	}
	public Object clone() throws CloneNotSupportedException {
		return super.clone();

	}
	@Override
	public String toString() {
		return "Engine [engineType=" + engineType + ", engineSPeed=" + engineSPeed + "]";
	}

}
