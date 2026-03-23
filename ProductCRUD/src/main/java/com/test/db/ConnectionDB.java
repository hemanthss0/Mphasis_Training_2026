package com.test.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionDB {
	public static Connection getCon()
	{
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/mlaa";	
		String user = "root";
		String pas = "root@39";
		Connection con = null;	
		try
		{
			Class.forName(driver);			
			con = DriverManager.getConnection(url, user, pas);			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}	
		return con;
	}
	
}
