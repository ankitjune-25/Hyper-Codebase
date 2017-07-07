package pr.practice.design.connection.factory;

import java.sql.Connection;
import java.sql.SQLException;


public class PrestoDBConnection {

	public static Connection con;
	
	static{
		ConnectionProducer sqlCon =new ConnectionProducer.Builder().setSql(true).build();
		con = sqlCon.getDBConnection("presto").getSqlConnection().getConnection();
	}
	
	public static Connection prestoConnection()
	{
		return con;
	}
	
	public void close()
	{
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			System.out.println("Close the conection");
		}
	}	
}
