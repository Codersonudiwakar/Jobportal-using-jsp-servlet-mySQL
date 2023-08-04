package com.database;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
		
	private static Connection conn;
	
	public static Connection getConn() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jobportal","root","5525");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return conn;
		
	}
	

}
