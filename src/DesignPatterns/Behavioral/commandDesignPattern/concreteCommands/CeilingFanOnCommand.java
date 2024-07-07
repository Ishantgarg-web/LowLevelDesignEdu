package DesignPatterns.Behavioral.commandDesignPattern.concreteCommands;

import DesignPatterns.Behavioral.commandDesignPattern.Command;
import DesignPatterns.Behavioral.commandDesignPattern.receiver.CeilingFan;

public class CeilingFanOnCommand implements Command{
	
	private CeilingFan ceilingFan;
	public CeilingFanOnCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}
	
	@Override
	public void execute() {
		this.ceilingFan.on();
	}

}
