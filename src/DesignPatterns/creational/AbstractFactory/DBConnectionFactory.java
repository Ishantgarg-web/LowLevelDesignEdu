package DesignPatterns.creational.AbstractFactory;

public interface DBConnectionFactory {
	
	public DBConnection getDBConnection(String value);
	
}
