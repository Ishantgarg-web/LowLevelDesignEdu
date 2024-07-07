package DesignPatterns.Behavioral.commandDesignPattern;

/**
 * 
 * @author ishant
 * This class will behave like customer. This command pattern based on the principle such that
 * creatingCommand() is encapsulated from executingCommand.
 * 
 * Example: Restaurant
 * Customer -> createOrder()
 * waitress -> takeOrder()
 * waitress -> orderUp() // it means, waitress trying to calling the cook for taking this order.
 * cook -> makeOrder() // it means, cook this order.
 * 
 * ProblemStatement:
 * There is a remote control and in which seven slots are there, each slot has button like on() and off().
 * Slots represents to the different things like RoomLight, DoorOpen etc.
 * 
 * in future, we can add more slots.
 * and for each slot, button also.
 * 
 * Now, we will try to solve this problem using Restaurant example.
 * Restaurant	       CommandDesignPattern
 * Customer      ->     client
 * order		 ->  	Command
 * createOrder() ->     createCommand()
 * waitress      ->     invoker
 * takeOrder() 	 ->     setCommand()
 * orderUp()     ->     buttonPressed()
 * makeOrder()   ->     execute()
 * 
 * 
 */

public class RemoteControlTest {
	public static void main(String[] args) {
		Invoker invoker = new Invoker();
		Light light = new Light(); // receiver
		LightOnCommand lightOnCommand = new LightOnCommand(light); // order
		
		invoker.setCommand(lightOnCommand);
		invoker.buttonPressed();
	}
}
