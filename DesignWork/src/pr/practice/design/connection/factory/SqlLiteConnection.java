package pr.practice.design.connection.factory;

import java.sql.Connection;

public class SqlLiteConnection implements SqlConenction{
	
	@Override
	public Connection getConnection(){
		System.out.println("Get SqlLite Connection");
		return null;
	}

}
