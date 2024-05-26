package DesignPatterns.creational.singleton;

public class SingletonClass {
	/**
	 * This class will be singleton class, means we can only make single object for this class.
	 */
	
	private static SingletonClass obj;

	private SingletonClass() {
		// TODO Auto-generated constructor stub
	}
	
	public static SingletonClass getInstance() {
		if(obj == null) {
			obj = new SingletonClass();
			return obj;
		}
		return obj;
	}

}
