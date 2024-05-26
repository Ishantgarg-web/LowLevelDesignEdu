package DesignPatterns.creational.factory;

public class Main {
	public static void main(String[] args) {
		DBConnection dbConnection = DBConnectionFactory.getDBConnection("MONGO");
		dbConnection.getDBConnection();
	}
}
