package DesignPatterns.creational.AbstractFactory;

public class MongoDBConnection implements DBConnection{

	@Override
	public void getDBConnection() {
		System.out.println("Mongo db connection");
	}

}
