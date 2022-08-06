package com.kh.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.kh.common.JDBCTemplate;

public class MemberDao {
								//사용자로부터 입력받은 id, pwd 라는 의미로 input~
	public MemberVo login(String inputId, String inputPwd) throws Exception { //문자열 2개(id, pwd) 전달 받아서 작업 진행한다는 뜻
		//DB 가서, id pwd 일치하는 행 조회
		
		//1. CONNECTION 준비 (driver, url, id, pwd)
		Connection conn = JDBCTemplate.getConnection();
		
		//2. SQL 작성
		String sql = "SELECT NO , ID , NICK FROM MEMBER WHERE ID = ? AND PWD = ? AND QUIT_YN = 'N'";
		
		//3. SQL 객체에 담기
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, inputId);
		pstmt.setString(2, inputPwd);
		
		//4. SQL 실행
		ResultSet rs = pstmt.executeQuery();
		
		MemberVo vo = null; //return 때문에 if 문 바깥인 여기다가 선언 함
		
//		boolean selectResult = rs.next(); //rs.next(); -> 테이블 스키마를 가르키는 커서를 한 줄 내리기
//		if(selectResult == true) {
		if(rs.next()) {
			String no = rs.getString("NO");
			String id = rs.getString("ID");
			String nick = rs.getString("NICK");
			
			//위 3개의 데이터를 MemberVo 객체 만들어서 담아둠
//			MemberVo vo = new MemberVo(); //위에다가 선언함
			vo = new MemberVo();
			vo.setNo(no);
			vo.setId(id);
			vo.setNick(nick);
		}

		return vo;
		
	}

	public int join(MemberVo vo, Connection conn) throws Exception {
		//DB insert
		
		int result = 0;
		PreparedStatement pstmt = null;
		
		try {
			//커넥션 준비 -> MemberService 에서 만듬
			
			//SQL 준비
			String sql = "INSERT INTO MEMBER(NO, ID, PWD, NICK) VALUES(SEQ_MEMBER_NO.NEXTVAL, ?, ?, ?)";
			
			//SQL 담을 객체 만들기
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getId()); //vo에서 id 가져와야함
			pstmt.setString(2, vo.getPwd());
			pstmt.setString(3, vo.getNick());

			//SQL 실행 및 결과 저장 (선택지 2개 : executeQuery(SELECT) / executeUpdate (INSERT, UPDATE, DELETE)
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			//예외.. 롤백해야 하는데... 근데 난(dao) 못함..
			//서비스한테 예외났다고 알려주면? 서비스가 롤백해주겠지? -> 내가 예외 만들어서, 서비스한테 던지기
			throw e; //내가 잡아온 exception 던지기
		} finally {
			JDBCTemplate.close(pstmt); //result set 은 없으니까 이 두 개만 닫기
		}
		
		return result;
		
		
	}//join method end

}//class
