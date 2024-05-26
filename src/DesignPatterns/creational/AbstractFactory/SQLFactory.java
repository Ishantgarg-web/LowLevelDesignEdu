package DesignPatterns.creational.AbstractFactory;

public class SQLFactory implements DBConnectionFactory{

	@Override
	public DBConnection getDBConnection(String value) {
		System.out.println("connecting to SQL Databases...");
		if(value.equals("ORACLE")) {
			return new OracleDBConnection();
		}else {
			return null;
		}
	}

	

}
