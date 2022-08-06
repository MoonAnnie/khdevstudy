package com.kh.board;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.kh.common.JDBCTemplate;

public class BoardDao {
	
	/*
	 * 게시글 작성
	 * 
	 * 데이터 받기 (컨트롤러)
	 * 
	 * 비지니스 로직 (서비스)
	 * 
	 * DB에 insert (DAO)
	 * 
	 */
	
	public int write(BoardVo vo, Connection conn) throws Exception { //vo를 전달 받아서 vo를 이용해서 sql 날릴 예정 , Connection 받아오기
		//커넥션 준비 -> service 에 만들고 거기서 받아오기
		
		int result = 0;
		PreparedStatement pstmt = null;
		
		try {
			//SQL 작성
			String sql = "INSERT INTO BOARD(NO, TITLE, CONTENT, WRITER_NO) VALUES(SEQ_BOARD_NO.NEXTVAL, ?, ?, ?)";
			
			//SQL 객체에 담기 및 완성(물음표 채우기)
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getTitle());
			pstmt.setString(2, vo.getContent());
			pstmt.setString(3, vo.getWriter());

			
			//SQL 실행 및 결과 저장
			result = pstmt.executeUpdate();
			
		}catch(Exception e) {
			
		}finally {
			JDBCTemplate.close(pstmt);
		}
		

		
		return result; //실행 결과 return
		
	}

}