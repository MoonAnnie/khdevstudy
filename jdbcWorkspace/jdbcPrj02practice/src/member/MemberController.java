package member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import util.JDBCTemplate;

public class MemberController {
	
	/*
	 * <회원가입>
	 * 
	 * 아이디, 패스워드, 닉네임 전달받고
	 * 
	 * 아이디, 닉네임 검사(중복, 글자수, 특수문자)
	 * 
	 * DB에 insert
	 * 
	 * insert 성공 ? 성공했다고 알려주기 : 실패했다고 알려주기
	 */
	
	//join 메소드 만들기
	public int join() { //아래 return 이 있으니까 join 메소드의 타입을 void -> int 로 변경
		
		MemberDto dto = showJoinView();
				
		Connection conn = JDBCTemplate.getConnection(); //getConnection 은 JDBCTemplate 클래스에 존재
		
		//커넥션 이용해서 SQL 실행
		String sql = "INSERT INTO MEMBER(ID, PWD, NICK, ENROLL_DATE, QUIT_YN) VALUES(?,?,?,SYSDATE,'N')";
		
		int result = 0;
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getId());
			pstmt.setString(2, dto.getPwd());
			pstmt.setString(3, dto.getNick());
			
			result = pstmt.executeUpdate(); //실행 결과가 숫자 타입으로 나오는거는 무조건 Update로 하면 됨
						
					 
			
		} catch (SQLException e) {
			System.out.println("회원가입 중 예외 발생 !");
			e.printStackTrace();
		}
		
		return result; //try 블럭 안에 있으면 에러 발생 시 return 안 하고 catch 로 넘어가니까 여기 아래로 옮김
	}

	private MemberDto showJoinView() { //아래 return 이 있으니까 void -> MemberDto 로 바꿈
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 : ");
		String pwd = sc.nextLine();
		System.out.print("닉네임 : ");
		String nick = sc.nextLine();
		
		MemberDto dto = new MemberDto(); //id, pwd, nickname 을 하나씩 전달하기 번거로우니까 객체 하나로 뭉쳐서 보내기 위함
		dto.setId(id);
		dto.setPwd(pwd);
		dto.setNick(nick);
		
		return dto;


	}//showJoinView
	
	/*
	 * id, pwd 받아서 회원 닉네임 조회
	 * 
	 * 닉네임 님 안녕하세요 출력
	 */

	public ResultSet login() {
	
		MemberDto dto = showLoginView();
		
		Connection conn = JDBCTemplate.getConnection(); 
		
		//커넥션 이용해서 SQL 실행
		String sql = "SELECT * FROM MEMBER WHERE ID = ?";
		
		ResultSet result = null;
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getId());
//			pstmt.setString(2, dto.getPwd());
//			pstmt.setString(3, dto.getNick());
			
			result = pstmt.executeQuery(); 
			
		} catch (SQLException e) {
			System.out.println("회원가입 중 예외 발생 !");
			e.printStackTrace();
		}
		
		return result;
		
	}

	private MemberDto showLoginView() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 : ");
		String pwd = sc.nextLine();
		System.out.print("닉네임 : ");
		String nick = sc.nextLine();
		
		MemberDto dto = new MemberDto();
		dto.getId();
		dto.getPwd();
		dto.getNick();
		
		return dto;
	}

	/*
	 * 0. 로그인 여부 체크
	 * 1. 현재 회원 정보 보여주기
	 * 2. 변경할 건지 물어보기 (1) 닉네임 변경, 2) 비밀번호 변경)
	 * 3. 변경할 데이터 입력받기
	 * 4. SQL 실행
	 * 5. 실행 결과에 따라, 서비스 로직 실행 (~~~로 수정되었습니다.) or (회원 정보 수정이 완료되었습니다. -> 메인페이지) 등등
	 */
	public void edit() {
		// TODO Auto-generated method stub
		
	}

}//class
