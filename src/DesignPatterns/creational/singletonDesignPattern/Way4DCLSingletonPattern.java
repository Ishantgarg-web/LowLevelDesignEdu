package DesignPatterns.creational.singletonDesignPattern;

/**
 * 
 * @author ishant
 * Here, we will use DCL(double-checked locking) mechanism for creating the single instance of the class.
 * 
 * According to this DCL technique, we will use synchronized block in if loop(where we checked instance
 * is null or not).
 * 
 * pros:
 * -> Lazy initialisation
 * -> you will get only atmost 1 instance
 * 
 * cons:
 * -> does not work in Java 5 and earlier version.
 */


public class Way4DCLSingletonPattern {
	
	// volatile keyword ensures that multiple threads handle the way4dclSingletonPattern variable
	// correctly when it is being initialised to the Way4DCLSingletonPattern instance.
	
	private volatile static Way4DCLSingletonPattern way4dclSingletonPattern;
	
	// make Constructor private, so other classes can not instatiate.
	private Way4DCLSingletonPattern() {
		
	}
	
	public static Way4DCLSingletonPattern getInstance() {
		if(way4dclSingletonPattern == null) {
			synchronized (Way4DCLSingletonPattern.class) {
				if(way4dclSingletonPattern == null) {
					way4dclSingletonPattern = new Way4DCLSingletonPattern();
				}
			}
		}
		return way4dclSingletonPattern;
	}
}
