package org.comparable;

public class Vehicle implements Comparable<Vehicle>{
	private int vehicleId;
	private String vehicleName;
	private int speed;
	public int getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	public String getVehicleName() {
		return vehicleName;
	}
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public Vehicle(int vehicleId, String vehicleName, int speed) {
		super();
		this.vehicleId = vehicleId;
		this.vehicleName = vehicleName;
		this.speed = speed;
	}
	@Override
	public int compareTo(Vehicle o) {
		int number=(this.vehicleId-o.vehicleId)-(this.speed-o.speed);

		return (number);
	}
	
	@Override
	public String toString() {
		return "Vehicle [vehicleId=" + vehicleId + ", vehicleName=" + vehicleName + ", speed=" + speed + "]";
	}

}
