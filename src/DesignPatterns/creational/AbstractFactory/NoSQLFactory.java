package DesignPatterns.creational.AbstractFactory;

public class NoSQLFactory implements DBConnectionFactory{

	@Override
	public DBConnection getDBConnection(String value) {
		System.out.println("connecting to NoSQL Databases...");
		if(value.equals("MONGO")) {
			return new MongoDBConnection();
		}else {
			return new GraphDBConnection();
		}
	}

	

}
