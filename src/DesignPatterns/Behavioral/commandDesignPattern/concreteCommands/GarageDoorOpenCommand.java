package DesignPatterns.Behavioral.commandDesignPattern.concreteCommands;

import DesignPatterns.Behavioral.commandDesignPattern.Command;
import DesignPatterns.Behavioral.commandDesignPattern.receiver.GarageDoor;

public class GarageDoorOpenCommand implements Command{
	private GarageDoor garageDoor;
	public GarageDoorOpenCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}
	@Override
	public void execute() {
		this.garageDoor.on();
	}

}
