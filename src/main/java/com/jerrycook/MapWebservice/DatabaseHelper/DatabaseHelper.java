package com.jerrycook.MapWebservice.DatabaseHelper;

import java.sql.*;

public class DatabaseHelper {

	
	public DatabaseHelper() {
		
	}
	
	public Connection getConnection()
	{
		String userName = "root";
		String password = "jerry111";
		String url = "jdbc:mysql://localhost/mapdatabase";
		
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, userName, password);
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
}
