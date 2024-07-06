package DesignPatterns.Behavioral.commandDesignPattern;

public class Invoker {
	// This is waitress and can do things -> takeOrder(), orderUp()
	// it can do things for a slot(Command) and on order.
	
	Command slot;
	public Invoker() {
		
	}
	
	public void setCommand(Command command) {
		slot = command;
	}
	public void buttonPressed() {
		slot.execute();
	}
}
