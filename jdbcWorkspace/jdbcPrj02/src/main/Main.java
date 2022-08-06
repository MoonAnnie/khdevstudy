package main;

import java.util.Scanner;

import member.MemberController;
import member.MemberDto;

public class Main {
	
	public static MemberDto loginUser = null; //MemberDto 타입의 loginUser 변수 생성

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		MemberController mc = new MemberController();
		
		boolean isFinish = false; //기본값으로 false 로 둠
//		while(isFinish == false) {
		while(!isFinish) {

			System.out.println("===== MEMBER =====");
			
			System.out.println("1. 로그인");
			System.out.println("2. 회원가입");
			System.out.println("3. 마이페이지");
			System.out.println("9. 프로그램 종료");

			String input = sc.nextLine();
			
			switch(input) {
			case "1" :
				mc.login();
				break;							  
			case "2" : 
				int result = mc.join(); 
				if(result > 0) System.out.println("회원가입 성공 !");
				else System.out.println("회원가입 실패...");
				break;
			case "3" : 
				mc.edit(); 
				break;
			case "9" : 
				isFinish = true;
				break;
			default : System.out.println("그런 숫자 없어요");
			}
			
		}//while 문
		
		

	}//main

}//class
