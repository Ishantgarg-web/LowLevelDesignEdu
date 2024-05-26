package DesignPatterns.creational.factory;

public class GraphDBConnection implements DBConnection{

	@Override
	public void getDBConnection() {
		System.out.println("Graph db connection");
	}
	
}
