package DesignPatterns.Behavioral.commandDesignPattern.receiver;

public class Stereo {
	private String stereoName;
	
	public Stereo(String stereoName) {
		this.stereoName = stereoName;
	}
	
	public void on() {
		System.out.println(this.stereoName+" turn to the on");
	}
	public void setCD() {
		System.out.println(this.stereoName+" setting the CD");
	}
	public void setVolume(int volume) {
		System.out.println(this.stereoName+" setting the volume to "+volume);
	}
	
	public void off() {
		System.out.println(this.stereoName+" closing...");
	}
}
