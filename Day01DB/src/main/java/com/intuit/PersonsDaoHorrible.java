package com.intuit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PersonsDaoHorrible {
	public void insert(String name,int age)throws SQLException {
		Connection connection = null;
		try {
			Class.forName("driver class");
			String connectionUrl = "";
			connection = DriverManager.getConnection(connectionUrl,"user","password");
			Statement statement = connection.createStatement();
			String query = "insert into persons(name,age) values('" + name + "'," + age + ")";
			statement.execute(query);
			statement.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		finally {
			connection.close();
		}
	}
}
