package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import dto.EmployeeDto;

public class EmployeeController {
	
	//메소드 생성
	public void selectEmployeeList() {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			
			//클래스 파일 준비
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//접속 정보
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id = "C##KH";
			String pwd = "KH";
			
			//연결 얻기 (url, id, pwd 전달 받기)
//			Connection conn = DriverManager.getConnection(url, id, pwd);
			//Connection 은 위에서 이미 선언 했으니 아래처럼 바꾸기 (pstmt, rs 도 동일)
			conn = DriverManager.getConnection(url, id, pwd);
			
			//쿼리 준비
			String sql = "SELECT * FROM EMPLOYEE";
			
			//statement 준비
			pstmt = conn.prepareStatement(sql);

			//쿼리 실행 및 실행결과 저장
			rs = pstmt.executeQuery();

			while(rs.next()) {
			EmployeeDto dto = new EmployeeDto();
			dto.setEmpId(     rs.getString(    "EMP_ID"));
			dto.setEmpName(   rs.getString(    "EMP_NAME"));
			dto.setEmail(     rs.getString(    "EMAIL"));
			dto.setHiredate(  rs.getTimestamp( "HIRE_DATE"));
			dto.setPhone(     rs.getString(    "PHONE"));
			dto.setSalary(    rs.getInt(       "SALARY"));

			System.out.println(dto);
		}
			
		}catch(Exception e) {
			System.out.println("사원 조회 중 예외 발생 !");
			e.printStackTrace(); //콘솔창에 로그를 출력하도록 해서 어떤 오류인지 알게 해줌
		}finally {                                                         //스트림은 자바와 외부의 것을 연결해주는 것 -> 스트림은 사용 후 꼭 닫아줘야 한다
			try{ if(conn != null) conn.close(); }catch(Exception e) {}    //conn, pstmt, rs는 try 블럭 안에서 생성됐기 때문에 그냥 close 를 쓰면
			try{ if(pstmt != null) pstmt.close(); }catch(Exception e) {} // 빨간줄이 생김 -> try 블럭 위에 변수를 생성해줘야 함
			try{ if(rs != null) rs.close(); }catch(Exception e) {}
		}

		
	}//method
	
	public void selectEmployeeById(String empId) { //id 를 가지고 사원을 검색할 수 있도록 하는 메소드
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			
			//클래스 파일 준비
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//접속 정보
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id = "C##KH";
			String pwd = "KH";
			
			//연결 얻기 (url, id, pwd 전달 받기)
			conn = DriverManager.getConnection(url, id, pwd);
			
			//쿼리 준비
			String sql = "SELECT * FROM EMPLOYEE WHERE EMP_ID = ?";
			
			//statement 준비
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, empId); //쓴 이유? -> 위 sql 의 물음표를 채워줘야 함

			//쿼리 실행 및 실행결과 저장
			rs = pstmt.executeQuery();

			while(rs.next()) {
			EmployeeDto dto = new EmployeeDto();
			dto.setEmpId(     rs.getString(    "EMP_ID"));
			dto.setEmpName(   rs.getString(    "EMP_NAME"));
			dto.setEmail(     rs.getString(    "EMAIL"));
			dto.setHiredate(  rs.getTimestamp( "HIRE_DATE"));
			dto.setPhone(     rs.getString(    "PHONE"));
			dto.setSalary(    rs.getInt(       "SALARY"));

			System.out.println(dto);
		}
			
		}catch(Exception e) {
			System.out.println("사원 조회 중 예외 발생 !");
			e.printStackTrace(); 
		}finally {                                                      
			try{ if(conn != null) conn.close(); }catch(Exception e) {}
			try{ if(pstmt != null) pstmt.close(); }catch(Exception e) {}                                           
			try{ if(rs != null) rs.close(); }catch(Exception e) {}
		}
		
		
	}//method

	
	
}//class
