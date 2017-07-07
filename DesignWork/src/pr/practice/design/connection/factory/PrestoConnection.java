package pr.practice.design.connection.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PrestoConnection implements SqlConenction{

	Connection con;
	@Override
	public Connection getConnection(){
		System.out.println("Get Presto Connection");
		/*try {
			return null;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		return con;
	}
}
