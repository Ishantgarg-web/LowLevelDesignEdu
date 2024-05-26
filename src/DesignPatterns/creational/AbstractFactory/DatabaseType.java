package DesignPatterns.creational.AbstractFactory;

public class DatabaseType {
	public static DBConnectionFactory getDatabaseBasedOnType(String type) {
		if(type.equals("SQL")) {
			return new SQLFactory();
		}else {
			return new NoSQLFactory();
		}
	}
}
