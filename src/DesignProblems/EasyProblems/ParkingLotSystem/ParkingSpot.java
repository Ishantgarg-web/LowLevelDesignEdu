package DesignProblems.EasyProblems.ParkingLotSystem;

import DesignProblems.EasyProblems.ParkingLotSystem.Vehicle.Vehicle;
import DesignProblems.EasyProblems.ParkingLotSystem.Vehicle.VehicleType;

public class ParkingSpot {
	
	private Vehicle parkedVehicle;
	private int parkingSpotNumber;
	private VehicleType vehicleType;
	
	public Vehicle getParkedVehicle() {
		return parkedVehicle;
	}
	public void setParkedVehicle(Vehicle parkedVehicle) {
		this.parkedVehicle = parkedVehicle;
	}
	public int getParkingSpotNumber() {
		return parkingSpotNumber;
	}
	public void setParkingSpotNumber(int parkingSpotNumber) {
		this.parkingSpotNumber = parkingSpotNumber;
	}
	public VehicleType getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(VehicleType vehicleType) {
		this.vehicleType = vehicleType;
	}
	public ParkingSpot(Vehicle parkedVehicle, int parkingSpotNumber, VehicleType vehicleType) {
		super();
		this.parkedVehicle = parkedVehicle;
		this.parkingSpotNumber = parkingSpotNumber;
		this.vehicleType = vehicleType;
	}
	@Override
	public String toString() {
		return "ParkingSpot [parkedVehicle=" + parkedVehicle + ", parkingSpotNumber=" + parkingSpotNumber
				+ ", vehicleType=" + vehicleType + "]";
	}
	
	
	
}
