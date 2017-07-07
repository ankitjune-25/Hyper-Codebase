package pr.practice.design.connection.factory;

public class CassanraConnection implements NoSqlConnection{
	
	@Override
	public void getConnection(){
		System.out.println("Get Cassandra Connection");
	}
}
