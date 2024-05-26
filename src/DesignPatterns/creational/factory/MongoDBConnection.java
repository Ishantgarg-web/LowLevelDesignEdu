package DesignPatterns.creational.factory;

public class MongoDBConnection implements DBConnection{

	@Override
	public void getDBConnection() {
		System.out.println("Mongo db connection");
	}

}
