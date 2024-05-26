package DesignPatterns.creational.factory;

public class DBConnectionFactory {
	
	public static DBConnection getDBConnection(String value) {
		if(value.equals("ORACLE")) {
			return new OracleDBConnection();
		}else if(value.equals("MONGO")) {
			return new MongoDBConnection();
		}else {
			return new GraphDBConnection();
		}
	}
	
}
