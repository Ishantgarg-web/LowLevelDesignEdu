package DesignPatterns.creational.singletonDesignPattern;

/**
 * 
 * @author ishant
 * Singleton Design Pattern: it ensures a class only has one instance and provide a global point of to
 * access it.
 * 
 * There can be many ways for creating Singleton class(that has atmost 1 instance across the application).
 * -> 1st way -> see code: ClassicalSingletonPattern(not complete gurantee)
 * -> 2nd way -> see code: Way2SingletonPattern(performance issue)
 * -> 3rd way -> see code: Way3EagerSingletonPattern(Eager initialization)
 * -> 4th way -> see code: Way4DCLSingletonPattern(uses DCL, not used in java 5 or earlier versions)
 * 
 * Problem with the Singleton Design Pattern(or with all the above implementations):
 * -> Class loaders:
 * 		=> these are part of JRE and dynamically loads the classes into the JVM.
 * 		=> Lets say if you two or more class Loaders they will load the class multiple times,
 *         and that will create multiple instance of the class even if use DCL or other 100% gurantee
 *         technique.
 * -> problem can be occur with reflection, and serialization/deserialization.
 * -> SingletonDesignPattern do not follow the loosely-coupled priciple, classes that are getting the
 *    object from singleton class are dependent on this class.
 * -> SingletonDesignPattern also do not follow SRP.
 * 
 * -> Test a scenario: if parent class have private static constructor, then a subclass can be make for
 *    this parent class.
 * 		  Result: no, we can not make the subclass for a class whose constructor is private.
 * -> Test a scenario: if parent class have not-private constructor, but have multiple static methods
 *    so in subclass, can they be overrided?
 *    	  Result: no, you can not override the static method of parent class in child class.
 * 
 * -> So, to solve class loader, reflection, and serialization/deserialization issue, we can use
 *    enum to create the singleton.
 */

public class Main {
	public static void main(String[] args) {
		// to use Way5EnumSingletonDesignPattern
		Way5EnumSingletonDesignPattern way5EnumSingletonDesignPattern = Way5EnumSingletonDesignPattern.UNIQUE_INSTANCE;
		
	}
}
