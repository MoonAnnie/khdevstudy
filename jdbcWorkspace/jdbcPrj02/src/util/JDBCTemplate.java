package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTemplate {
	
	//getConnection 메소드 만들기
	public static Connection getConnection() { //Connection을 얻어온 다음 return 해주기 때문에 void -> Connection
		
		Connection conn = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id = "C##KH";
			String pwd = "KH";
			
			conn = DriverManager.getConnection(url, id, pwd);
			conn.setAutoCommit(false); //자동 커밋할지 설정하는 것(false : 꺼진 거라 수동으로 커밋을 해줘야 함)
			
		} catch (Exception e) {
			System.out.println("커넥션 가져오기 실패 !");
			e.printStackTrace();
		}
		
		return conn; //return conn 을 try 블럭에 넣으면 예외처리 발생 시 return 건너 뛰고 catch 로 넘어가기 때문에 맨 마지막에 씀

	}//getConnection
	
	public static void close(Connection conn) { //connection 을 가지고 close 하는 메소드를 만들기
		try {
			if(conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void close(Statement stmt) { //statement 를 가지고 close 하는 메소드
		try {
			if(stmt != null) {
				stmt.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void close(ResultSet rs) {
		try {
			if(rs != null) {
				rs.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void commit(Connection conn) {
		if(conn != null) {
			try {
				conn.commit();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void rollback(Connection conn) {
		if(conn != null) {
			try {
				conn.rollback();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
	
}//class
