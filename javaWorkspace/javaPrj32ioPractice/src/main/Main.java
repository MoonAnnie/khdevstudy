package main;

import java.util.Scanner;

public class Main {
	
	public static final Scanner sc = new Scanner(System.in); //여기에 스캐너를 만들면 여러 클래스에서 사용이 가능하다 
	//sc라는 변수에 재할당 불가하도록(다른 값으로 못바꾸게) final
	public static void main(String[] args) {
		System.out.println("===== 입출력 연습 =====");
		
		//선택지 보여주기
		System.out.println("1. 회원가입");
		System.out.println("2. 로그인");
		
		//선택값 입력받기
		String input = sc.nextLine();
	
		
		if("1".equals(input)) { //리터럴 ("1") 을 앞으로 빼는게 더 좋음
			//1.회원가입 처리
			new MemberJoin().join();
		}else if(input.equals("2")) {
			//2.로그인 처리
			new MemberLogin().login();
		}

		

	}

}
