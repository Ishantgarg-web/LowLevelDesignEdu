package DesignPatterns.creational.singleton;


public class Main {
	public static void main(String[] args) {
		SingletonClass sg = SingletonClass.getInstance();
		System.out.println(sg.hashCode());
		SingletonClass sg1 = SingletonClass.getInstance();
		System.out.println(sg1.hashCode());
		// it will print same hashcode for both the objects.
	}
}
