package com.koreait.board4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBUtils {

	public static Connection getCon() throws Exception
	{
		final String DB_NAME = "boardver4";
		final String DRIVER = "com.mysql.cj.jdbc.Driver"; 
		final String DB_URL = "jdbc:mysql://localhost:3308/" +DB_NAME;
		final String USER_NAME = "root";
		final String PASSWORD = "koreait";
		
		Class.forName(DRIVER);
		Connection con = DriverManager.getConnection(DB_URL,USER_NAME,PASSWORD);
		
		
		System.out.println("연결성공");
		return con;
		
	}
	
	public static void close(Connection con, PreparedStatement ps)
	{
		close(con, ps, null);
	}
	
	public static void close(Connection con, PreparedStatement ps , ResultSet rs) 
	{
			if (rs != null) {
				try {
					rs.close();
				
				} catch (Exception e) {
					e.printStackTrace();
					// TODO: handle exception
				}
			}
			if (ps != null) {
				try {
					ps.close();
				
				} catch (Exception e) {
					e.printStackTrace();
					// TODO: handle exception
				}
			if (con != null) {
				try {
					con.close();
				
				} catch (Exception e) {
					e.printStackTrace();
					// TODO: handle exception
				}
			}
			
		}
		
	}
}

