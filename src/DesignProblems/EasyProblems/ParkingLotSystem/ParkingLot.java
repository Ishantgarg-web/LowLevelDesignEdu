package DesignProblems.EasyProblems.ParkingLotSystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import DesignProblems.EasyProblems.ParkingLotSystem.Vehicle.Vehicle;
import DesignProblems.EasyProblems.ParkingLotSystem.Vehicle.VehicleType;

public class ParkingLot {
	
	private List<Level> levels;
	private String name;
	
	public void entryVehicle(Vehicle vehicle) {
		// First, we need to find out details
		// HashMap(Level, List<EmptyParkingSpot>) for this given vehicle.
		// it is extensible also for future updation, if we want to give priority to 
		// lower levels first.
		HashMap<Level, List<ParkingSpot>> emptyParkingSpotMapDetails = getEmptyParkingSpotDetails(vehicle.getVehicleType());
		if(emptyParkingSpotMapDetails.isEmpty()) {
			System.out.println("There is no space for the given vehicle Type: "+vehicle.getVehicleType());
		}else {
			// need to allocate the space to the given vehicle.
			// Logic for allocating the space is to the first empty spot from lower level to upper levels.
			for (Level level :levels) {
				if(emptyParkingSpotMapDetails.containsKey(level)) {
					// it means this level is present.
					List<ParkingSpot> parkingSpots = emptyParkingSpotMapDetails.get(level);
					// We will allocate the vehicle to the parkingSpots.get(0)
					ParkingSpot parkingSpot = parkingSpots.get(0);
					parkingSpot.setParkedVehicle(vehicle);
					parkingSpot.setVehicleType(vehicle.getVehicleType());
					System.out.println("Please park your vehicle to the level: "+level.getNumber()+" and parking spot number is: "+parkingSpot.getParkingSpotNumber());
					return;
				}
			}
		}
	}
	
	private HashMap<Level, List<ParkingSpot>> getEmptyParkingSpotDetails(VehicleType vehicleType) {
		HashMap<Level, List<ParkingSpot>> emptyParkingSpotMapDetails = new HashMap<>();
		for (Level level: levels) {
			for (ParkingSpot parkingSpot: level.getParkingSpots()) {
				if(parkingSpot.getParkedVehicle() == null && parkingSpot.getVehicleType().equals(vehicleType)) {
					List<ParkingSpot> parkingSpots = null;
					if(emptyParkingSpotMapDetails.containsKey(level)) {
						parkingSpots = emptyParkingSpotMapDetails.get(level);
					}else {
						parkingSpots = new ArrayList<>();	
					}
					parkingSpots.add(parkingSpot);
					emptyParkingSpotMapDetails.put(level, parkingSpots);
				}
			}
		}
		return emptyParkingSpotMapDetails;
	}

	public void exitVehicle(Vehicle vehicle) {
		// Check this vehicle exist or not, if not then throw excpetion else empty that parkingLotSpace.
		for (Level level: levels) {
			for (ParkingSpot parkingSpot: level.getParkingSpots()) {
				if(parkingSpot.getParkedVehicle()!=null && 
						parkingSpot.getParkedVehicle().getVehicleNumber().equals(vehicle.getVehicleNumber()) &&
						parkingSpot.getVehicleType().equals(vehicle.getVehicleType())) {
					// it means, we find out that vehichle.
					parkingSpot.setParkedVehicle(null);
					parkingSpot.setVehicleType(null);
					System.out.println("Given vehicle: "+vehicle.getVehicleNumber()+" is un parked successfully");
					return;
				}
			}
		}
		System.out.println("This vehichle is not present in this parking Lot: "+this.getName());
	}
	
	public void getNumberOfLevels() {
		System.out.println("Levels in this parking lot are: "+levels.size());
	}
	
	public void getParkingLotDetails() {
		System.out.println("\n******** PARKING LOT DETAILS ****** ");
		this.getNumberOfLevels();
		System.out.println("*****");
		for (Level level: levels) {
			System.out.println("Level "+level.getNumber()+" details: ");
			for (ParkingSpot parkingSpot: level.getParkingSpots()) {
				if(parkingSpot.getParkedVehicle() == null) {
					System.out.println("  Parking Spot details: \n"
							+ "   Parking spot number: "+parkingSpot.getParkingSpotNumber()+""
									+ "   it is empty");
				}else {
					System.out.println("  Parking Spot details: \n"
							+ "   Parking spot number: "+parkingSpot.getParkingSpotNumber()+" "
									+ " and vehicle Number: "+parkingSpot.getParkedVehicle().getVehicleNumber()+" "
											+ "    and vehicle Type: "+parkingSpot.getVehicleType());
				}
			}
		}
	}
	
	public List<Level> getLevels() {
		return levels;
	}

	public void setLevels(List<Level> levels) {
		this.levels = levels;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ParkingLot(List<Level> levels, String name) {
		super();
		this.levels = levels;
		this.name = name;
	}
	
	
}
