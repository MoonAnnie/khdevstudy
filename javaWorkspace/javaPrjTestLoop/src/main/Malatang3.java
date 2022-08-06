package main;

import java.util.Scanner;

public class Malatang3 {

	public static void main(String[] args) {
		//제목
		System.out.println("===== 당신의 입맛에 맞는 마라탕을 만들어 드립니다.  =====");
		
		//도구 생성
		Scanner sc = new Scanner(System.in);
		
		System.out.println("주문자님의 성함을 입력해 주세요. : ");
		String name = sc.next();
		System.out.println(name + "님 안녕하세요. :)");
		System.out.println();
		
		//마라탕의 맵기 고르기
	while(true) {
		System.out.print("매운 것을 잘 드시나요? (1) 아니오 (2) 조금 (3) 잘 먹습니다. : ");
	
		int spicy = sc.nextInt();
	
		if(spicy == 1) {
			System.out.println("담백한 '1단계'를 추천합니다.");
		}else if(spicy == 2) {
			System.out.println("조금 매운 '2단계'를 추천합니다.");
		}else if(spicy == 3) {
			System.out.println("얼얼한 '3단계'를 추천합니다.");
		}
		
		System.out.println();
		System.out.println("===== 고기, 해산물 고르기 =====");
		
		
		System.out.print("좋아하는 것을 골라 주세요. : ");
		System.out.println("(1) 고기, (2) 해산물 ");
		int meat = sc.nextInt();
		
		if(meat == 1) {
			System.out.println("'소고기'를 추천합니다.");
			System.out.println();
		}else if(meat == 2) {
			System.out.println("'새우'를 추천합니다.");
			System.out.println();
		}
		
		System.out.println("===== 추가 재료 고르기 =====");
		
		System.out.println("추가하고 싶은 재료의 갯수를 입력해 주세요.");
		System.out.println("(5개 미만까지는 15000원, 10개 미만까지는 300000원 입니다.) : ");
		int ing = sc.nextInt();
		System.out.println(ing + "개의 재료를 추가하였습니다. 바구니에 재료를 담아주세요.");
		System.out.println();
		
		System.out.println("===== 주문 내역 ===== ");
		System.out.print("주문자 : ");
		System.out.println(name);
		System.out.print("주문 내역 : ");
		if(spicy == 1) {
			System.out.print("담백한 1단계의, ");
		}else if(spicy == 2) {
			System.out.print("조금 매운 2단계의, ");
		}else if (spicy == 3) {
			System.out.print("얼얼한 3단계의, ");
		}
		
		if(meat == 1) {
			System.out.print("소고기가 들어가고, ");
		}else if(meat ==2) {
			System.out.print("새우가 들어가고, ");
		}
		
		System.out.print("추가 재료가 ");
		System.out.print(ing);
		System.out.println("개가 들어간 마라탕이 주문되었습니다. ");
		
		int price = 15000;
		System.out.print("가격 : ");
		if(ing<5) {
			System.out.print("총 가격은 ");
			System.out.println(price + " 원 입니다.");
		}else if(ing<10) {
			System.out.print("총 가격은 ");
			System.out.println(price*2 + " 원 입니다.");
		}else {
			System.out.println("카운터에 문의해 주세요.");
		}
		
		System.out.println();
		System.out.println("===== 최종 확인 =====");
		System.out.println();
		System.out.println("주문이 마음에 들면 (1), 다시 주문하려면 (2)를 눌러 주세요 : ");
		int order = sc.nextInt();
		if(order == 1) {
			System.out.println("주문이 완료되었습니다. 맛있게 드세요 :)");
			break;
			
		}else if(order == 2) {
			System.out.println("처음부터 다시 주문합니다.");
			System.out.println();
		}
		
		}	
		
	}	
		
		
	}




		
