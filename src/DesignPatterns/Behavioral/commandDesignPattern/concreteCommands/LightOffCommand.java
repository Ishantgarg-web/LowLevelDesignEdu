package DesignPatterns.Behavioral.commandDesignPattern.concreteCommands;

import DesignPatterns.Behavioral.commandDesignPattern.Command;
import DesignPatterns.Behavioral.commandDesignPattern.receiver.Light;

public class LightOffCommand implements Command{
	
	// it will behave like cook and it can makeOrder().
	Light light;
	public LightOffCommand(Light light) {
		this.light = light;
	}
	
	@Override
	public void execute() { // makeOrder()
		light.off();
	}

	@Override
	public void undo() {
		light.on();
	}

}
