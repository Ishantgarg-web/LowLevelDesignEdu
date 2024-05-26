package DesignPatterns.creational.factory;

/**
 * 
 * @author ishant
 * -> Comes under creational design pattern(where we are creating object)
 * -> use cases:
 * 		-> if you want to provide a particular DB connection to client based on given types from the Database
 *         Connection Factoris, you can use factory design pattern.
 */
public class Main {
	public static void main(String[] args) {
		DBConnection dbConnection = DBConnectionFactory.getDBConnection("MONGO");
		dbConnection.getDBConnection();
	}
}
