package DesignPatterns.Behavioral.commandDesignPattern;

public class Invoker {
	// This is waitress and can do things -> takeOrder(), orderUp()
	// it can do things for a slot(Command) and on order.
	
	// Now, we will add 7 slots to RemoteControl(invoker)
	Command[] onCommands;
	Command[] offCommands;
	Command lastCommand; // it will store the reference of lastCommand executed.
	public Invoker() {
		onCommands = new Command[7];
		offCommands = new Command[7];
		
		Command noCommand = new NoCommand();
		for (int i=0;i<7;i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
		lastCommand = noCommand;
	}
	
	public void setCommand(int slot,Command onCommand,Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}
	
	public void onButtonWasPressed(int slot) {
		onCommands[slot].execute();
		lastCommand = onCommands[slot];
	}
	
	public void offButtonWasPressed(int slot) {
		offCommands[slot].execute();
		lastCommand = offCommands[slot];
	}
	
	public void undoButtonPressed() {
		System.out.println("Undo Button pressed");
		lastCommand.execute();
	}
}
