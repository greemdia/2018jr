package org.zerock.web;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class DatabaseConnectTests {
	
	final String DRIVER ="com.mysql.jdbc.Driver";
	final String URL ="jdbc:mysql://10.10.10.14:3306/jr01?useSSL=false";
	
	final String USER = "study";
	final String PW ="study";
	
	
	@Test
	public void testConnection()throws Exception {
		Class.forName(DRIVER);
		
		try(Connection con = DriverManager.getConnection(URL, USER, PW)){
			System.out.println(con);
		}catch(Exception e) {
			e.printStackTrace();
		}	
		
	}
}
