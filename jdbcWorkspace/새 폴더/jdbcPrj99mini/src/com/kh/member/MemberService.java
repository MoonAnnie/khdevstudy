package com.kh.member;

import java.sql.Connection;

import com.kh.common.JDBCTemplate;

public class MemberService { //프로젝트의 비즈니스 로직을 작성하는 곳
	
	public int join(MemberVo vo) { //파라미터로 id, pwd, pwd2, nick가 담긴 vo 받기 위해 추가
		//아이디 4글자 이상인지 검사
		if(vo.getId().length() < 4) {
			//다음 단계 진행하면 안됨. 실패라고 알려줘야 함
			return -1; //성공을 의미하는 return 1 말고 다른 값을 넣어줘야 함
		}
		
		//패스워드 4글자 이상인지 검사
		if(vo.getPwd().length() < 4) {
			//다음 단계 진행하면 안됨. 실패라고 알려줘야 함
			return -2;
		}
		//패스워드 일치하는지 (비밀번호 확인)
		if(vo.getPwd().equals(vo.getPwd2()) == false) {
			//다음 단계 진행하면 안됨. 실패라고 알려줘야 함
			return -3;
		}
		//아이디 중복확인
		
		//위의 조건들 모두 통과하면? -> insert 진행
		
		Connection conn = null;
		int result = 0;
		
		try {
			conn = JDBCTemplate.getConnection();
			result = new MemberDao().join(vo, conn); //DB에 insert 쿼리 날리고 result 에 담음
			
			if(result == 1) { //result == 1 이 나오면 성공 / 0 : sql fail / -1 : id fail / -2 : pwd fail / -3 : pwd !=
				JDBCTemplate.commit(conn);
			}else {
				JDBCTemplate.rollback(conn);
			}
			
			
		} catch (Exception e) {
			//예외가 왔다는 건 롤백해야 하는 상황
			e.printStackTrace();
			JDBCTemplate.rollback(conn);
		} finally {
			JDBCTemplate.close(conn);
		}
		
		return result;
		
	}//join

}