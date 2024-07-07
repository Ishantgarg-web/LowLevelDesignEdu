package DesignPatterns.Behavioral.commandDesignPattern.receiver;

public class Light {
	
	private String lightName;
	public Light(String lightName) {
		this.lightName = lightName;
	}
	
	public void on() {
		System.out.println(this.lightName+"Turn the light on");
	}
	
	public void off() {
		System.out.println(this.lightName+"Turn the light off");
	}
	
}
