package DesignPatterns.creational.factory;

public class OracleDBConnection implements DBConnection{

	@Override
	public void getDBConnection() {
		System.out.println("oracle db connection");
	}

}
