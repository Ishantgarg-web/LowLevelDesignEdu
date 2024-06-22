package DesignProblems.EasyProblems.ParkingLotSystem.Vehicle;

public abstract class Vehicle {
	
	private String vehicleNumber;
	private VehicleType vehicleType;
	
	
	
	public Vehicle(String vehicleNumber, VehicleType vehicleType) {
		super();
		this.vehicleNumber = vehicleNumber;
		this.vehicleType = vehicleType;
	}



	public String getVehicleNumber() {
		return vehicleNumber;
	}



	public VehicleType getVehicleType() {
		return vehicleType;
	}
	
	
	
}
