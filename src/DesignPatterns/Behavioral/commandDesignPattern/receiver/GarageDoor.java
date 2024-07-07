package DesignPatterns.Behavioral.commandDesignPattern.receiver;

public class GarageDoor {
	private String garageDoorName;
	
	public GarageDoor(String garageDoorName) {
		this.garageDoorName = garageDoorName;
	}
	
	public void on() {
		System.out.println(this.garageDoorName+" opening...");
	}
	
	public void off() {
		System.out.println(this.garageDoorName+" closing...");
	}
}
