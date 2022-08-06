package com.kh.board;

import java.sql.Connection;

import static com.kh.common.JDBCTemplate.*; //모든 static 메소드를 가져다 쓰겠다는 의미로 static ~~ .* 붙임

public class BoardService {
	
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
	
	public int write(BoardVo vo) { //vo 전달 받아서 sql 날리는 곳에 vo 전달
		
		//비지니스 로직 (제목, 내용 1글자 이상인지)
		if(vo.getTitle().length() < 1) {
			//제목이 비어있음. 다음단계 진행 x
			return -1;
		}
		
		if(vo.getContent().length() < 1) {
			//내용이 비어있음. 다음단계 진행 x
			return -2;
		}
		
		Connection conn = null;
		int result = 0;
		
		try {
			conn = getConnection();
			result = new BoardDao().write(vo, conn); //connection도 같이 전달
			
			if(result == 1) {
				commit(conn);
			}else {
				rollback(conn);
			}
		}catch(Exception e) {
			rollback(conn);
		}finally {
			close(conn);
			
		}

		
		
		return result;
		
	}

	
	
}//class