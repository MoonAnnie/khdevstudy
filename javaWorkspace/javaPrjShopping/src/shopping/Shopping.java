package shopping;

import java.util.Scanner;

public class Shopping {

	Scanner sc = new Scanner(System.in);
	
	public void ShoppingStart() {

		System.out.println("========== 카테고리 정보 ======================");
		System.out.println("1) 식품");
		System.out.println("2) 생활용품");
		System.out.println("3) 홈인테리어");
		System.out.println("===========================================");
		System.out.println(">> 쇼핑 카테고리를 선택해 주세요.");
	while(true) {
		int select = sc.nextInt();
		switch(select) {
		case 1 : System.out.println("식품 코너로 이동합니다~"); break;
		case 2 : System.out.println("생활용품 코너로 이동합니다~"); break;
		case 3 : System.out.println("홈인테리어 코너로 이동합니다~"); break;
		}
		if(select == 1) {
			System.out.println("========== 식품 목록 =====================");
			System.out.println("1) 우유");
			System.out.println("2) 계란");
			System.out.println("3) 라면");
			System.out.println("4) 고기");
			System.out.println("========================================");
			System.out.println(">> 구매할 식품을 작성해 주세요. : ");
			String grocery = sc.next();
			System.out.println(grocery + " 을/를 장바구니에 담았습니다~!");
			System.out.println();
			break;
		}else if(select == 2) {
			System.out.println("========== 생활용품 목록 ===================");
			System.out.println("1) 마스크");
			System.out.println("2) 치약");
			System.out.println("3) 샴푸");
			System.out.println("4) 세제");
			System.out.println("=========================================");
			System.out.println(">> 구매할 생활용품을 작성해 주세요. : ");
			String product = sc.next();
			System.out.println(product + " 을/를 장바구니에 담았습니다~!");
			System.out.println();
			break;
		}else if(select == 3) {
			System.out.println("========== 홈인테리어 목록 =================");
			System.out.println("1) 조명");
			System.out.println("2) 쿠션");
			System.out.println("3) 의자");
			System.out.println("4) 커튼");
			System.out.println("=========================================");
			System.out.println(">> 구매할 홈인테리어를 작성해 주세요. : ");
			String product = sc.next();
			System.out.println(product + " 을/를 장바구니에 담았습니다~!");
			System.out.println();
			break;
		}
		
		
	}

		

		
	}


}