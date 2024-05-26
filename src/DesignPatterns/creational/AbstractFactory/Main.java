package DesignPatterns.creational.AbstractFactory;

/**
 * 
 * @author ishant
 * -> comes under creational design pattern, here we will be creating objects
 * -> it is factory of factories.
 * -> In Factory Design Pattern, if we add one more layer that differs SQL and NoSQL Databases.
 */

public class Main {
	public static void main(String[] args) {
		DBConnectionFactory dbConnectionFactory = DatabaseType.getDatabaseBasedOnType("SQL");
		DBConnection dbConnection =  dbConnectionFactory.getDBConnection("ORACLE");
		dbConnection.getDBConnection();
	}
}
