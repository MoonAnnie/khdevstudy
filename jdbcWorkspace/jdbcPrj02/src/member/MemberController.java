package member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Scanner;

import main.Main;
import util.InputUtil;
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
		PreparedStatement pstmt = null;

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getId());
			pstmt.setString(2, dto.getPwd());
			pstmt.setString(3, dto.getNick());
			
			result = pstmt.executeUpdate(); //실행 결과가 숫자 타입으로 나오는거는 무조건 Update로 하면 됨
			
			if(result > 0) { //result 가 0 보다 크면 insert 가 잘 된 것
//				if(conn != null) conn.commit();
				JDBCTemplate.commit(conn);
			}else {
				JDBCTemplate.rollback(conn);
			}
						
		} catch (SQLException e) {
			JDBCTemplate.rollback(conn);
			System.out.println("회원가입 중 예외 발생 !");
			e.printStackTrace();
		}finally {//connection 이 null 이 아닐 때만 close
//			try {if(conn!= null) conn.close();} catch (SQLException e) {}
			//close 전부 진행
			JDBCTemplate.close(conn);
			JDBCTemplate.close(pstmt);
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
	 * 아이디 패스워드 받기
	 * 
	 * 아이디, 패스워드 일치하는 행찾기
	 * 
	 * 회원정보(아이디, 닉네임, 회원가입일시) 가져오기
	 * 
	 * 회원정보 리턴
	 */
	public MemberDto login(MemberDto data) {
		
		String id = data.getId();
		String pwd = data.getPwd();

		
		//디비와 연결, 아이디 패스워드로 조회
		
		//1. 드라이버 등록
		//2. 드라이버 이용해서 연결 가져오기
		Connection conn = JDBCTemplate.getConnection();
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		//3. 연결된 정보를 이용해서, SQL 실행
		String sql = "SELECT * FROM MEMBER WHERE ID = ? AND PWD = ? AND QUIT_YN = 'N'";
		MemberDto loginMember = null; //loginMember 은 최초로 null 값으로 설정해둠
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, id); //1번째 물음표에 id 로 채워라
			pstmt.setString(2, pwd);
			
			//지금 실행하는 쿼리는 ? SELECT 쿼리 
			rs = pstmt.executeQuery();//실행하기 위한 코드(날리는 sql 종류에 따라 execute 뒤의 내용이 달라짐. SELECT 쿼리의 실행 결과는 ResultSet 으로 나옴)
			
			if(rs.next()) {
				String nick = rs.getString("NICK");
				String memberId = rs.getString("ID");
				Timestamp enrollDate = rs.getTimestamp("ENROLL_DATE");
				
				loginMember = new MemberDto();
				loginMember.setId(memberId);
				loginMember.setNick(nick);
				loginMember.setEnrollDate(enrollDate);
			}
			
		} catch (SQLException e) {
			System.out.println("로그인 에러 !!!");
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(conn);
			JDBCTemplate.close(pstmt);
			JDBCTemplate.close(rs);
		}
		
		//로그인 처리
		Main.loginUser = loginMember; //loginMember 을 리턴하는게 아니라 Main의 loginUser에 넣어주는 것
		

		
		return loginMember;
		
	}//login
	
	public void login() { //다른 곳에도 login 메소드가 있지만.. 다른 login 은 파라미터 값이 있는 login 이라 중복 아님
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 : ");
		String pwd = sc.nextLine();
		
//		String[] strArr = {id, pwd};
		
		MemberDto dto = new MemberDto();
		dto.setId(id);
		dto.setPwd(pwd);
		
		//실제 로그인 처리
		login(dto);
		
		//로그인 성공 여부 판단
		if(Main.loginUser != null) {
			System.out.println("로그인 성공 !");
		}else {
			System.out.println("로그인 실패 ...");
		}
	}
	
	/*
	 * 0. 로그인 여부 체크
	 * 1. 현재 회원 정보 보여주기
	 * 2. 변경할 건지 물어보기 (1) 닉네임 변경, 2) 비밀번호 변경)
	 * 3. 변경할 데이터 입력받기
	 * 4. SQL 실행
	 * 5. 실행 결과에 따라, 서비스 로직 실행 (~~~로 수정되었습니다.) or (회원 정보 수정이 완료되었습니다. -> 메인페이지) 등등
	 */

	public void edit() { //return 값이 없으니까 void 로 놔둬도 됨
		
		//로그인 여부 체크
		if(Main.loginUser == null) {
			System.out.println("로그인을 먼저 해주세요");
			return;
		}
		
		//현재 회원 정보 보여주기
		System.out.println("===== 마이페이지(회원정보) =====");
		System.out.println(Main.loginUser);
		
		//변경할 건지 물어보기
		System.out.println("회원 정보를 수정하시겠습니까? (Y/N) ");
		
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		if(input.equals("Y")) {
			//수정함 ->jdbc 이용해서 바꾸기
			//변경할 데이터 입력받기 -> memberUpdate 메소드 생성
			memberUpdate();
		}else {
			//수정 안 함
			return;
		}
		
	}//edit
	
	private void memberUpdate() { //다른 클래스에서는 memberUpdate 호출하면 안되니까 접근제한자를 private 으로 바꿔줌
		//변경할 데이터 입력받기
		//비번, 닉네임
		System.out.println("변경하실 항목을 선택하세요");
		System.out.println("1. 비밀번호 변경");
		System.out.println("2. 닉네임 변경"); //숙제>> 내가 만들어보기 (비밀번호 변경 참고)
		System.out.println("3. 처음으로 돌아가기");
		
//		int input = InputUtil.sc.nextInt();
//		InputUtil.sc.nextLine();
		
		int n = InputUtil.getInt();
		switch(n) {
		case 1 : 
			updatePwd(); 
			break;
		case 2 : 
			updateNick();
			break;
		case 3 : return; //이전으로 돌아가게끔 return 으로 작성
		default : 
			System.out.println("잘못 입력하셨습니다. 처음으로 돌아갑니다.");
			return;
		};
		
	}
	
	private void updatePwd() {
		//비밀번호 변경
		
		//현재 비밀번호 확인
		System.out.print("현재 비밀번호 : ");
		String pwd = InputUtil.sc.nextLine();
		
		//변경할 비밀번호
		System.out.print("변경할 비밀번호 : ");
		String newPwd = InputUtil.sc.nextLine();

		//변경할 비밀번호 재입력
		System.out.print("변경할 비밀번호 재입력 : ");
		String newPwd2 = InputUtil.sc.nextLine();
		
		//비번 맞는지 체크,
		MemberDto dto = new MemberDto();
		dto.setId(Main.loginUser.getId());
		dto.setPwd(pwd);
		
		MemberDto pwdCheckResult = login(dto); //login 할 때 id 와 pwd 가 담겨있는 dto 를 담아서 전달
		if(pwdCheckResult == null) {
			System.out.println("기존 비밀번호가 일치하지 않음 !!!");
			return; //밑에 else 구문을 따로 안 쓰고 이전으로 돌아가는 return 을 적어둠 (return 은 날 불렀던 곳으로 돌아간다)
		}
		
		//신규 비번 2개가 일치하는지
//		if(newPwd.equals(newPwd2) == false) { //실행 결과가 false 이면..
		if(!newPwd.equals(newPwd2)) {
			System.out.println("신규 비밀번호가 일치하지 않음");
			return;
		}
		//현재 비번과 신규 비번이 같은지
		if(pwd.equals(newPwd)) {
			System.out.println("기존 비밀번호와 신규 비밀번호가 같습니다.");
			return;
		}
		
		//입력받은 정보로 update 진행
		
		updatePwd(Main.loginUser.getId(), newPwd);
		
	}
	
	private void updatePwd(String id, String newPwd) {
		//커넥션 객체 준비
		Connection conn = JDBCTemplate.getConnection();
		//SQL 작성
		String sql = "UPDATE MEMBER SET PWD = ? WHERE ID = ?";
		//SQL 객체에 담기 (+SQL 완성)
		PreparedStatement pstmt = null; //변수 선언
		try {
			pstmt = conn.prepareStatement(sql); //변수 선언 위에서 했으니 할당만..
			pstmt.setString(1, newPwd);
			pstmt.setString(2, id);
			//SQL 실행(실행결과 저장)
			int result = pstmt.executeUpdate();
			//실행 결과에 따른 로직 처리
			if(result == 1) {
				//성공
				System.out.println("비밀번호 변경 성공 !");
				conn.commit();
			}else {
				//실패
				System.out.println("비밀번호 변경 실패 ...");
				conn.rollback();
			}
		} catch (SQLException e) {
			JDBCTemplate.rollback(conn);
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(conn);
			JDBCTemplate.close(pstmt);
		}
		
	}
	
	private void updateNick() {
		// TODO Auto-generated method stub
		
	}



	public void loginCheck(MemberDto dto) {
		if(dto != null) {
			System.out.println("----- 로그인 유저 정보 -----");
			System.out.println(dto);
		}else {
			System.out.println("로그인 실패 ...");
		}
	}//loginCheck
	

}//class
