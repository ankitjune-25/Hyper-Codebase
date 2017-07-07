package pr.practice.design.connection.factory;


public class SqlConnectionFactory extends ConnectionAbstractFactory{

	private boolean presto;
	private boolean sqlLite;
	
	public SqlConnectionFactory(Builder builder) {
		if(builder.type.equals("presto"))
			this.presto = true;
		if(builder.type.equals("sqlLite"))
			this.sqlLite = true;
	}
	
	
	@Override
	SqlConenction getSqlConnection() {
		if(this.presto==true)
		{
			return new PrestoConnection();
		}
		else if(this.sqlLite==true)
		{
			return new SqlLiteConnection();
		}	
		else
			return null;
	}

	@Override
	NoSqlConnection getNoSqlConnection() {		
			return null;
	}
	
	public static class Builder{
		private String type;
		
		public Builder setType(String flag)
		{
			this.type = flag;
			return this;
		}
		
		public SqlConnectionFactory build()
		{
			return new SqlConnectionFactory(this);
		}
	}
}
