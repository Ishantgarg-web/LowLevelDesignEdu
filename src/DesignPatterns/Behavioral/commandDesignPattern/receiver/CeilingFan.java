package DesignPatterns.Behavioral.commandDesignPattern.receiver;

public class CeilingFan {
	private String ceilingFanName;
	public CeilingFan(String ceilingFanName) {
		this.ceilingFanName = ceilingFanName;
	}
	
	public void on() {
		System.out.println(this.ceilingFanName+"Turn the on");
	}
	
	public void off() {
		System.out.println(this.ceilingFanName+"Turn the off");
	}
}
