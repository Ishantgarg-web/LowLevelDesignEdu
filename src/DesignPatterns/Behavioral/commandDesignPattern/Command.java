package DesignPatterns.Behavioral.commandDesignPattern;

public interface Command {

	void execute();
	void undo(); // for undo the changes.
	
}
