package DesignPatterns.Behavioral.commandDesignPattern.concreteCommands;

import DesignPatterns.Behavioral.commandDesignPattern.Command;
import DesignPatterns.Behavioral.commandDesignPattern.receiver.CeilingFan;

public class CeilingFanOffCommand implements Command{
	
	private CeilingFan ceilingFan;
	public CeilingFanOffCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}
	
	@Override
	public void execute() {
		this.ceilingFan.off();
	}

}
