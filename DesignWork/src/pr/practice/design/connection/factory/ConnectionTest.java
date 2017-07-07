package pr.practice.design.connection.factory;


public class ConnectionTest {
	

	public static void main(String[] args) {
		
		/*ConnectionProducer noSqlCon =new ConnectionProducer.Builder().setNoSql(true).build();		
		noSqlCon.getDBConnection("astyanax").getNoSqlConnection().getConnection();
				
		ConnectionProducer sqlCon =new ConnectionProducer.Builder().setSql(true).build();
		sqlCon.getDBConnection("presto").getSqlConnection().getConnection();
		sqlCon.getDBConnection("sqlLite").getSqlConnection().getConnection();*/
		
		PrestoDBConnection.prestoConnection();
		PrestoDBConnection.prestoConnection();
		PrestoDBConnection.prestoConnection();
		PrestoDBConnection.prestoConnection();
	}
}
