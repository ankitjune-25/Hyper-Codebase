package pr.practice.design.connection.factory;

public class NoSqlConnectionFactory extends ConnectionAbstractFactory{

	public boolean astyanax;
	
	public NoSqlConnectionFactory(Builder builder) {
		if(builder.type.equals("astyanax"))
		this.astyanax = true;
	}
	
	
	@Override
	SqlConenction getSqlConnection() {
		return null;
	}

	@Override
	NoSqlConnection getNoSqlConnection() {
		
		if(this.astyanax==true)
		{
			return new CassanraConnection();
		}
		else 
		{
			System.out.println("Null value find");
			return null;
		}		
	}
	
	public static class Builder{
		private String type;
		
		public Builder setType(String flag)
		{
			this.type = flag;
			return this;
		}
		
		public NoSqlConnectionFactory build()
		{
			return new NoSqlConnectionFactory(this);
		}
	}
}
