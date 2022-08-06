package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MemberJoin {
	
	/*
	 * 회원가입
	 */
	
	public void join() {
		//아이디, 비번 입력받기
		System.out.print("아이디 : ");
		String id = Main.sc.nextLine(); //Main 에서 만든 스캐너 사용

		System.out.print("비밀번호 : ");
		String pwd = Main.sc.nextLine(); //Main 에서 만든 스캐너 사용
		
		boolean isValid = checkValid(id,pwd); //유효성 검사
		if(isValid) {
			//입력받은 데이터 파일에 저장하기
			saveData(id,pwd);
			
			//결과
			System.out.println("회원가입 성공");
		}else {
			System.out.println("회원가입 실패");
		}
		
		
	}//join
	
	private boolean checkValid(String id, String pwd) {
		//아이디 검사
		if(id.length() < 2) 
			return false;
		
		//아이디 중복 검사
//		boolean result = checkDup();
//		if(!result)
//			return false;
		//아래 줄로 코드 정리
		if(!checkDup(id)) //id 를 전달하도록 파라미터 값에 id 추가
			return false;
		
		//비번 검사
		if(pwd.length() < 4) 
			return false;
		
		//결과 리턴
//		return false; //< 이건 자동 생성 시 만들어진 return 값
		return true;
	}

	private boolean checkDup(String id) {
		//아이디 중복검사 (메모장에서 모든 아이디 읽어들이면서 일치하는게 있으면 중복, 없으면 회원가입으로~)
		
		File f = new File("C:\\dev\\member.txt");
		
		try (BufferedReader br = new BufferedReader(new FileReader(f));)
		{
			//메모장에서 모든 줄 읽기
			while(true) {
				String data = br.readLine();
				if(data == null) 
					break;
//				String[] arr = data.split(" ");
//				String id = arr[0];
					//아래처럼 정리 가능
				String idData = data.split(" ")[0];
				if(idData.equals(id)) {
					System.out.println("아이디 중복 !!!!!");
					return false; //중복되는 아이디가 있음
				}
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}

		
		
		
		return true; //중복된 아이디가 없음
	}

	/*
	 * 파일에 데이터 저장하기
	 */
	private void saveData(String id, String pwd) { //현재 클래스 안에서만 이 메소드를 사용할거니까 private으로 써도 됨
						//이름 안 맞추고 String a, String b 로 써도 됨(파라미터 안은 단순 변수값이니까)
		//파일 준비
		File f = new File("C:\\dev\\member.txt");
		
		//스트림 만들기 (파일에 대해서 2바이트 단위 처리, 메인스트림+ 보조스트림 사용)
		//FileWriter, BufferedWriter 그냥 쓰면 오류 나서 예외처리 해줌
		try (
				FileWriter fw = new FileWriter(f,true); //덮어쓰기 말고 이어쓰기 하기 위해 true
				BufferedWriter bw = new BufferedWriter(fw);
			) 
		
		{
			//스트림 사용하기(데이터 저장)
			bw.write(id);
			bw.write(" "); //파일에 id 랑 pwd 사이에 공백을 추가해서 저장되도록
			bw.write(pwd);
			bw.write("\n"); //줄바꿈 처리
//			bw.write(id + " " + pwd + "\n"); //위 코드들 한 줄로 쓰기
			bw.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		//스트림 사용하기 (데이터 저장)
		
		//스트림 정리하기
	}
	

}
