package util;

import java.sql.Connection;
import java.sql.DriverManager;

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
			
		} catch (Exception e) {
			System.out.println("커넥션 가져오기 실패 !");
			e.printStackTrace();
		}
		
		return conn; //return conn 을 try 블럭에 넣으면 예외처리 발생 시 return 건너 뛰고 catch 로 넘어가기 때문에 맨 마지막에 씀

	}//getConnection

}
