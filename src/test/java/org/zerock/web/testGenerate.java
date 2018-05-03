package org.zerock.web;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Types;

import org.junit.Test;



public class testGenerate {
	final String DRIVER ="com.mysql.jdbc.Driver";
	final String URL ="jdbc:mysql://10.10.10.14:3306/jr01?useSSL=false";
	
	final String USER = "study";
	final String PW ="study";
	
	
	@Test
	public void testGetMem()throws Exception {
		
		
		
		Class.forName(DRIVER);
		Connection con = DriverManager.getConnection(URL, USER, PW);
		
		String tableName ="tbl_member2";
		
		String query = "select * from " + tableName;
		
		PreparedStatement pstmt = con.prepareStatement(query);
		
		ResultSet rs = pstmt.executeQuery();
		
		ResultSetMetaData meta = rs.getMetaData();
		
		int colCount = meta.getColumnCount();
		
		for(int i=1; i<=colCount; i++) {
			System.out.println("private ");
			
			String colName = meta.getColumnLabel(i);
			
			int type = meta.getColumnType(i);
			
			if(type == Types.VARCHAR) {
				System.out.println("String ");
			}else if(type == Types.TIMESTAMP) {
				System.out.println("Date ");
			}else if(type == Types.INTEGER) {
				System.out.println("Integer ");
			}else if(type == Types.LONGNVARCHAR || type == Types.LONGVARCHAR) {
				System.out.println("String ");
			}
			System.out.println(colName+";");
			System.out.println("컬럼의 개수입니다 :" + colCount);
		}
		
		rs.close();
		pstmt.close();
		con.close();
	}
	
	@Test
	public void testGetBoard() throws Exception{
		Class.forName(DRIVER);
		Connection con = DriverManager.getConnection(URL, USER, PW);
		
		String tableName = "tbl_board2";
		
		String query = "select * from " + tableName;
		PreparedStatement psmt = con.prepareStatement(query);
		
		ResultSet rs = psmt.executeQuery();
		
		ResultSetMetaData meta = rs.getMetaData();
		
		int colCount = meta.getColumnCount();
		
		for(int i = 1; i<colCount; i++) {
			System.out.println("private ");
			
			String colName = meta.getColumnLabel(i);
			
			int type = meta.getColumnType(i);
			
			if(type == Types.VARCHAR) {
				System.out.println("String ");
			}else if(type == Types.INTEGER) {
				System.out.println("Integer ");
			}else if(type == Types.LONGNVARCHAR || type == Types.LONGVARCHAR) {
				System.out.println("String ");
			}else if(type == Types.TIMESTAMP) {
				System.out.println("Date ");
			}
			System.out.println(colName+";");
		}
		rs.close();
		psmt.close();
		con.close();
	}

}
