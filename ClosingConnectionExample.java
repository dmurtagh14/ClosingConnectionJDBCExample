package com.collabera.jdbc;

import java.sql.*;

public class ClosingConnectionExample {
	
	static final String URL = "jdbc:mysql://localhost:3306/testdb";
	static final String USERNAME = "root";
	static final String PASSWORD = "root";
	
	public static Connection getConnection() {
		Connection conn = null;
		
		try {
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			System.out.println("Connection was made");
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
		
	}
	
	public static void closingConnection(Connection conn) {
//		if(conn == null) {
//			try {
//				conn.close();
//				System.out.println("----------Connection was closed--------------");
//			}
//			
//		}
	}
	
	//-----------------------------Main-----------------------------------
	public static void main(String[] args) {
		Connection conn = ClosingConnectionExample.getConnection();
		
		// We did work
		
		
		// Close connection
		try {
			
			
			
			conn.close();
			System.out.println("Connection was closed");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
