package DesignPatterns.creational.singleton;

/**
 * 
 * @author ishant
 * Problem statement: 
 * 	Let's say, you have class SingletonClass, this is in used in big project. but there are many developers
 *  that are using the object of SingletonClass, but how do you know if someone else created the instance
 *  of SingletonClass or not. if already created then we have to return the already created instance or
 *  if not, then create new instance and return it.
 *  
 */

public class Main {
	public static void main(String[] args) {
		SingletonClass sg = SingletonClass.getInstance();
		System.out.println(sg.hashCode());
		SingletonClass sg1 = SingletonClass.getInstance();
		System.out.println(sg1.hashCode());
		// it will print same hashcode for both the objects.
	}
}
