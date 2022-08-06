package main;

import java.util.Scanner;

public class Malatang1 {

	public static void main(String[] args) {

		//마라탕 주문하기
		System.out.println("===== 마라탕  주문하기 =====");
		
		//도구 생성
		Scanner sc = new Scanner(System.in);
		
		System.out.println("주문자님의 성함을 입력해 주세요. : ");
		String name = sc.next();
		System.out.println(name + "님 안녕하세요. :)");
		
		//사용자가 고를 재료들을 입력받기
		System.out.print("(1~3 단계 중) 맵기의 단계를 골라 주세요 : ");
		int spicy = sc.nextInt();
		
		if(spicy == 1) {
			System.out.println("'담백한 맛(백탕)'이 선택되었습니다.");
		}else if(spicy == 2) {
			System.out.println("'약간 매운 맛'이 선택되었습니다.");
		}else if(spicy == 3) {
			System.out.println("'아주 매운 맛'이 선택되었습니다.");
		}
		
		System.out.println("===== 고기 고르기 =====");
		
		
		System.out.print("고기를 선택해 주세요. (1) 소고기 (2) 양고기 (3) 닭고기 : ");
		int meat = sc.nextInt();
		
		if(meat == 1) {
			System.out.println("'소고기'가 선택되었습니다.");
		}else if(meat == 2) {
			System.out.println("'양고기'가 선택되었습니다.");
		}else if(meat == 3) {
			System.out.println("'닭고기'가 선택되었습니다. :( ");
		}
		
		System.out.println("===== 야채 고르기 =====");
		
		System.out.println("다음 중 빼고 싶은 재료를 선택해 주세요. (1) 고수 (2) 숙주 (3) 청경채 (4) 당면 (5) 버섯 : ");
		int ing = sc.nextInt();
		
		if(ing == 1) {
			System.out.println("'고수'를 제외합니다.");
		}else if(ing == 2) {
			System.out.println("'숙주'를 제외합니다.");
		}else if(ing == 3) {
			System.out.println("'청경채'를 제외합니다.");
		}else if(ing == 4) {
			System.out.println("'당면'을 제외합니다.");
		}else if(ing == 5) {
			System.out.println("'버섯'을 제외합니다.");
		}
		
		System.out.println("===== 최종 주문 내용 확인 =====");
		if(spicy == 2 && meat == 1 && ing ==1) {
			System.out.println("담백한 탕의 소고기가 들어가고 고수를 제외한 마라탕 입니다. ");
		}
		

		
	}//main

}//class
