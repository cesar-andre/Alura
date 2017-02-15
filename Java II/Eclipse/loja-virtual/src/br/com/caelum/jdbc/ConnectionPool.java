package br.com.caelum.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

public class ConnectionPool {
	
	private DataSource dataSource;

	ConnectionPool() {
		MysqlDataSource pool = new MysqlDataSource();
		pool.setUrl("jdbc:mysql://localhost/loja-virtual");
		pool.setUser("root");
		pool.setPassword("");
		this.dataSource = pool;
	}
	
	Connection getConnection() throws SQLException {
		Connection connection = this.dataSource.getConnection();
		return connection;
	}
}
