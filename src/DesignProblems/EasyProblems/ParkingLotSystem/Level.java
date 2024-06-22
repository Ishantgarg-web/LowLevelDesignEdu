package DesignProblems.EasyProblems.ParkingLotSystem;

import java.util.List;

public class Level {
	
	private List<ParkingSpot> parkingSpots;
	private int number; // floor number
	
	public List<ParkingSpot> getParkingSpots() {
		return parkingSpots;
	}
	public void setParkingSpots(List<ParkingSpot> parkingSpots) {
		this.parkingSpots = parkingSpots;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	public Level(List<ParkingSpot> parkingSpots, int number) {
		super();
		this.parkingSpots = parkingSpots;
		this.number = number;
	}
	
	
}
