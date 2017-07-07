package pr.practice.design.connection.factory;

public abstract class ConnectionAbstractFactory {

	abstract SqlConenction getSqlConnection();
	
	abstract NoSqlConnection getNoSqlConnection();
}
