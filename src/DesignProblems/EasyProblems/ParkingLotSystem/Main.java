package DesignProblems.EasyProblems.ParkingLotSystem;

import java.util.Arrays;

import DesignProblems.EasyProblems.ParkingLotSystem.Vehicle.Car;
import DesignProblems.EasyProblems.ParkingLotSystem.Vehicle.Truck;
import DesignProblems.EasyProblems.ParkingLotSystem.Vehicle.VehicleType;

public class Main {
	public static void main(String[] args) {
		
		ParkingSpot parkingSpot1 = new ParkingSpot(null, 1, VehicleType.CAR);
		ParkingSpot parkingSpot2 = new ParkingSpot(null, 1, VehicleType.TRUCK);
		ParkingSpot parkingSpot3 = new ParkingSpot(null, 1, VehicleType.MOTOR_CYCLE);
		
		Level level1 = new Level(Arrays.asList(parkingSpot1), 1);
		Level level2 = new Level(Arrays.asList(parkingSpot2), 2);
		Level level3 = new Level(Arrays.asList(parkingSpot3), 3);
		
		
		
		ParkingLot parkingLot = new ParkingLot(Arrays.asList(level1, level2, level3), "Hisar Jindal");
		
		parkingLot.getParkingLotDetails();
		
		parkingLot.entryVehicle(new Car("Car1"));
		parkingLot.entryVehicle(new Truck("Truck1"));
		parkingLot.entryVehicle(new Car("Car2"));
		
		parkingLot.getParkingLotDetails();
		
		parkingLot.exitVehicle(new Car("Car1"));
		
		parkingLot.getParkingLotDetails();
	}
}
