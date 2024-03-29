package com.kh.main;

import com.kh.board.BoardController;
import com.kh.member.MemberController;
import com.kh.member.MemberVo;
import com.kh.menu.Menu;
import com.kh.util.InputUtil;

public class Main {
	
	public static MemberVo loginMember; //loginMember 라는 static 변수 생성 (전역)
	
	/*
	 * 회원
	 * 게시판
	 */

	public static void main(String[] args) {
		
		System.out.println("===== 환영합니다 =====");
		
		Menu menu = new Menu();
		
		while(true) {
			//메뉴 보여주기
			int input = menu.showMenu();
			
			//선택한 값에 따라 동작
			switch(input) {
			case 1: 
				new MemberController().login(); 
				break;
			case 2: 
				new MemberController().join();
				break;
			case 3:
				/* 게시판 글 작성 */
				new BoardController().write();
				break;
			case 4:
				/* 게시판 리스트 조회*/ 
				break;
				
				
				
				
			}//switch
		}//while
		



	}

}