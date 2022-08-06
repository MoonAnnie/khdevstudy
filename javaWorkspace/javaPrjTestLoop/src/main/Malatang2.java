package main;

import java.util.Scanner;

public class Malatang2 {

	public static void main(String[] args) {
		//마라탕 주문하기
		System.out.println("===== 마라탕  주문하기 =====");
		
		//도구 생성
		Scanner sc = new Scanner(System.in);
		
		System.out.println("주문자님의 성함을 입력해 주세요. : ");
		String name = sc.next();
		System.out.println(name + "님 안녕하세요. :)");
		
		//마라탕의 맵기 고르기
		//3단계를 고르도록 추천하기
		System.out.print("(1~3 단계 중) 맵기의 단계를 골라 주세요 : ");
	while(true) {	
		int spicy = sc.nextInt();
	
		if(spicy !=3) {
			System.out.println("'3 단계'를 추천합니다.");
			continue;
		}System.out.println(spicy + "'단계'가 선택되었습니다.");
		
		System.out.println();
		
		System.out.println("===== 고기 고르기 =====");
		
		
		System.out.print("고기를 선택해 주세요. (1) 소고기 (2) 양고기 : ");
		int meat = sc.nextInt();
		
		if(meat == 1) {
			System.out.println("'소고기'가 선택되었습니다.");
			System.out.println();
		}else if(meat == 2) {
			System.out.println("'양고기'가 선택되었습니다.");
			System.out.println();
		}
		
		System.out.println("===== 토핑 고르기 =====");
		
		System.out.println("추가하고 싶은 재료의 갯수를 입력해 주세요. : ");
		int ing = sc.nextInt();
		System.out.println(ing + "개의 재료를 추가하였습니다. 바구니에 재료를 담아주세요.");
		System.out.println();
		
		System.out.println("===== 가격 =====");
		int price = 15000;
		
		if(ing<5) {
			System.out.print("총 가격은");
			System.out.println(price + "원 입니다.");
		}else if(ing<10) {
			System.out.println("총 가격은");
			System.out.println(price*2 + "원 입니다.");
		}else {
			System.out.println("카운터에 문의해 주세요.");
	
		}
		
		
		
	}	
		
		
	}
}



		
