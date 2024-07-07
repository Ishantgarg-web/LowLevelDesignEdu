package DesignPatterns.Behavioral.commandDesignPattern.concreteCommands;

import DesignPatterns.Behavioral.commandDesignPattern.Command;
import DesignPatterns.Behavioral.commandDesignPattern.receiver.GarageDoor;

public class GarageDoorCloseCommand implements Command{
	private GarageDoor garageDoor;
	public GarageDoorCloseCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}
	@Override
	public void execute() {
		this.garageDoor.off();
	}

}
