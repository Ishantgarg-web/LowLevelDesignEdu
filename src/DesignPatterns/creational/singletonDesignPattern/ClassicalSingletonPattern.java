package DesignPatterns.creational.singletonDesignPattern;

/**
 * 
 * @author ishant
 * Here, we will be define the classic way to create a singleton class.
 * 
 * Here, we define the getInstance() method as static, that will return the single instance of this class.
 * 
 * Advantage:
 * -> you will get single instance of this class, but not always.
 * 
 * Disadvantage:
 * -> in multi-threaded env, there might be a chance you will get two instance for this class.
 */

public class ClassicalSingletonPattern {
	private static ClassicalSingletonPattern classicalSingletonPattern; // it is hold only one instance.
	
	// make Constructor private, so other classes can not instatiate.
	private ClassicalSingletonPattern() {
		
	}
	
	// make a static getInstance() method that is responsible for returning the unique instance of the class.
	public static ClassicalSingletonPattern getInstance() {
		if(classicalSingletonPattern == null) {
			classicalSingletonPattern = new ClassicalSingletonPattern();
		}
		return classicalSingletonPattern;
	}
}
