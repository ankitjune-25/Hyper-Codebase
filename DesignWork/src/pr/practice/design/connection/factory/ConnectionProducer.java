package pr.practice.design.connection.factory;


public class ConnectionProducer {

	private  boolean sql;
	private  boolean noSql;
	
	public ConnectionProducer(Builder build) {
		sql = build.sql;
		noSql = build.noSql;
	}
	
	public ConnectionAbstractFactory getDBConnection(String type)
	{
		if(sql==true)
		{
			return new SqlConnectionFactory.Builder().setType(type).build();
		}
		if(noSql==true)
		{
			return new NoSqlConnectionFactory.Builder().setType(type).build();
		}
		return null;
	}
	
	public static class Builder
	{
		private boolean sql;
		private boolean noSql;
		
		public Builder setSql(boolean flag)
		{
			this.sql = flag;
			return this;
		}
		
		public Builder setNoSql(boolean flag)
		{
			this.noSql = flag;
			return this;
		}
		
		public ConnectionProducer build()
		{
			return new ConnectionProducer(this);
		}		
	}
}
