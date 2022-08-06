package com.kh.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTemplate {
	
	//1. 커넥션 가져오기
	public static Connection getConnection() throws Exception {
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "C##MINI";
		String pwd = "MINI";
		
		Class.forName(driver);
		Connection conn = DriverManager.getConnection(url, id, pwd);
		conn.setAutoCommit(false);
		
		return conn; //방금 얻어온 connection 객체를 return 해줌
		
	}
	
	//2. 커밋
	public static void commit(Connection conn) {
		try {
			if(conn != null) conn.commit(); //connection이 null 인 상태에서 만약 commit 을 한다면 null point error 가 나니까..
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//3. 롤백
	public static void rollback(Connection conn) {
		try {
			if(conn != null) conn.rollback();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//4. close : conn, rs, stmt
	public static void close(Connection conn) {
		try {
			if(conn != null) conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void close(ResultSet rs) {
		try {
			if(rs != null) rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void close(Statement stmt) {
		try {
			if(stmt != null) stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	

}//class
