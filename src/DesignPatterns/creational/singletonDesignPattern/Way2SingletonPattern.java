package DesignPatterns.creational.singletonDesignPattern;

/**
 * 
 * @author ishant
 * 
 * This is the second way for defining the singleton pattern, in this we make sure that only one
 * instance will be created, and we define this using Lazy initialization.
 * 
 * using synchronized keyword. it will make sure only 1 thread will enter into this.
 * But here the problem is, each time when we are trying to call getInstance method, it will go through this synchronized method
 * and it will impact the performance of our code. it can decrease the perfornmace by a factor of 100.
 * 
 * Pros:
 * -> always create single instance
 * -> Lazy initialization
 * 
 * Cons:
 * -> performance issue.
 */

public class Way2SingletonPattern {
	private static Way2SingletonPattern way2SingletonPattern;
	
	// make Constructor private, so other classes can not instatiate.
	private Way2SingletonPattern() {
		
	}
	
	// make a static getInstance() method that is responsible for returning the unique instance of the class.
	public static synchronized Way2SingletonPattern getInstance() {
		if(way2SingletonPattern == null) {
			way2SingletonPattern = new Way2SingletonPattern();
		}
		return way2SingletonPattern;
	}
}
