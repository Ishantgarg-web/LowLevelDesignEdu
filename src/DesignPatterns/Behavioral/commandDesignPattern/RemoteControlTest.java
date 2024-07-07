package DesignPatterns.Behavioral.commandDesignPattern;

import DesignPatterns.Behavioral.commandDesignPattern.concreteCommands.CeilingFanOffCommand;
import DesignPatterns.Behavioral.commandDesignPattern.concreteCommands.CeilingFanOnCommand;
import DesignPatterns.Behavioral.commandDesignPattern.concreteCommands.GarageDoorCloseCommand;
import DesignPatterns.Behavioral.commandDesignPattern.concreteCommands.GarageDoorOpenCommand;
import DesignPatterns.Behavioral.commandDesignPattern.concreteCommands.LightOffCommand;
import DesignPatterns.Behavioral.commandDesignPattern.concreteCommands.LightOnCommand;
import DesignPatterns.Behavioral.commandDesignPattern.concreteCommands.StereoOffCommand;
import DesignPatterns.Behavioral.commandDesignPattern.concreteCommands.StereoWithCDCommand;
import DesignPatterns.Behavioral.commandDesignPattern.receiver.CeilingFan;
import DesignPatterns.Behavioral.commandDesignPattern.receiver.GarageDoor;
import DesignPatterns.Behavioral.commandDesignPattern.receiver.Light;
import DesignPatterns.Behavioral.commandDesignPattern.receiver.Stereo;

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
 * till now commit is: dc3b19c(modify comments)
 * Original requirement:
 * Now, we will make seven slots in our remote control, and each slot has an on and off button.
 */

public class RemoteControlTest {
	public static void main(String[] args) {
		Invoker invoker = new Invoker();
		
		Light livingRoomLight = new Light("Living Room Light"); // receiver
		Light kitchenLight = new Light("Kitchen Light"); // receiver
		CeilingFan ceilingFan = new CeilingFan("Living Room"); // receiver
		GarageDoor garageDoor = new GarageDoor("Garage"); // receiver
		Stereo stereo = new Stereo("Living Room"); // receiver
		
		LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight); // order
		LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
		
		LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight); // order
		LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
		
		CeilingFanOnCommand livingRoomCeilingFanOn = new CeilingFanOnCommand(ceilingFan);
		CeilingFanOffCommand livingRoomCeilingFanOff = new CeilingFanOffCommand(ceilingFan);
		
		GarageDoorOpenCommand doorOpenCommand = new GarageDoorOpenCommand(garageDoor);
		GarageDoorCloseCommand doorCloseCommand = new GarageDoorCloseCommand(garageDoor);
		
		StereoWithCDCommand stereoWithCDCommand = new StereoWithCDCommand(stereo);
		StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);
		
		invoker.setCommand(0,livingRoomLightOn,livingRoomLightOff);
		invoker.setCommand(1,kitchenLightOn,kitchenLightOff);
		invoker.setCommand(2,livingRoomCeilingFanOn,livingRoomCeilingFanOff);
		invoker.setCommand(3,doorOpenCommand,doorCloseCommand);
		invoker.setCommand(4,stereoWithCDCommand,stereoOffCommand);
		
		invoker.onButtonWasPressed(0);
		invoker.offButtonWasPressed(3);
		invoker.onButtonWasPressed(6);
	}
}
