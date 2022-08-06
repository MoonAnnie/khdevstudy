package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MemberLogin {
	/*
	 * 로그인
	 * 
	 * 파일 열기 > 파일에서 읽기 > 비교하기 > split > 입력받기 > equals > 결과출력 > 스트림 생성, 사용, 정리
	 */
	public void login() {
		//안내문 + 입력받기
		System.out.println("아이디 : ");
		String id = Main.sc.nextLine();

		System.out.println("비밀번호 : ");
		String pwd = Main.sc.nextLine();

		//로그인 처리
		boolean isLogin = processLogin(id, pwd);
		
		//결과 출력
		if(isLogin == true) { //isLoin은 이미 boolean 타입이니까 그냥 if(isLogin) 으로만 써도 됨
			System.out.println("로그인 성공");
		}else {
			System.out.println("로그인 실패");
		}
		
		
	}//join
	
	/*
	 * 로그인 처리
	 */
//	private void processLogin(String id, String pwd) { //굳이 외부에서 사용 안 하니까 private 으로 만듦
	private boolean processLogin(String id, String pwd) { //아래 return 타입 있으니까 boolean 으로 바꿈
		boolean result = false;

		//파일에서 데이터 읽기
		
		//파일 준비
		File f = new File("C:\\dev\\member.txt");
		//스트림 생성
		try (BufferedReader br = new BufferedReader(new FileReader(f));) 
		{
			
			//스트림 사용
			while(true) {
				String data = br.readLine(); //데이터 읽기
				if(data == null) break;			// 이 코드들
//				if(data.length() < 2) continue; // 쓰는 의미 : 공백처리
				String[] idPwdArr = data.split(" "); //0번 인덱스엔 id, 1번 인덱스엔 pwd
				String idData = idPwdArr[0];
				String pwdData = idPwdArr[1];
//				boolean result = id.equals(idData) && pwd.equals(pwdData);
//				return result;
				//위에 두 줄을 한 줄로 작성
				result = id.equals(idData) && pwd.equals(pwdData);
				if(result) break;
				
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		return result; 
		
		//로그인 성공 여부 판단
	}
}
