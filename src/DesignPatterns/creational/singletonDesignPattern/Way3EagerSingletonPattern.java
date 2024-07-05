package DesignPatterns.creational.singletonDesignPattern;

/**
 * 
 * @author ishant
 * 
 * In this, we will be trying to create Singleton single instance by using Eager initialization part
 * not through Lazy initialization.
 * 
 * pros:
 * -> You will always get single instance of the class, JVM gurantees that when class is loaded
 * before any thread access, it will create one and only instance of this.
 * 
 * cons:
 * -> it will create the instance when class is loaded, either we do not require.
 */

public class Way3EagerSingletonPattern {
	
	private static Way3EagerSingletonPattern way3EagerSingletonPattern = new Way3EagerSingletonPattern();
	
	// make Constructor private, so other classes can not instatiate.
	private Way3EagerSingletonPattern() {
		
	}
	
	// make a static getInstance() method that is responsible for returning the unique instance of the class.
	public static Way3EagerSingletonPattern getInstance() {
		return way3EagerSingletonPattern;
	}
}
