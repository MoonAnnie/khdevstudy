package payment;

import java.util.Scanner;

public class Payment {

	public void PaymentStart() {
		Scanner sc = new Scanner(System.in);

		System.out.println("========== 결제수단 선택 ======================");
		System.out.println("1) 현금");
		System.out.println("2) 신용카드");
		System.out.println("3) 핸드폰 결제");
		System.out.println("4) 간편 결제 - JAVARA PAY");
		System.out.println("============================================");
		System.out.println("(공지) JAVARA PAY 연동 기념 추첨 이벤트 진행 ");
		System.out.println(">> 결제수단을 선택해 주세요.");
		
		int payment = sc.nextInt();
		switch(payment) {
		case 1 : System.out.println(payment + "번 현금이 선택되었습니다.\nJAVARA MALL 을 이용해 주셔서 감사합니다. :)"); break;
		case 2 : System.out.println(payment + "번 신용카드가 선택되었습니다.\nJAVARA MALL 을 이용해 주셔서 감사합니다. :)"); break;
		case 3 : System.out.println(payment + "번 핸드폰 결제가 선택되었습니다.\nJAVARA MALL 을 이용해 주셔서 감사합니다. :)"); break;
		}
		if(payment == 4) {
			System.out.println("JAVARA PAY 를 선택해 주셔서 감사합니다~ ^_^");
			System.out.println();
			System.out.println("*************************************************");
			System.out.println("** JAVARA PAY 오픈 기념 행운의 주사위 도전! ٩(๑•̀o•́๑)و **");
			System.out.println("*************************************************");
			System.out.print(">> 주사위를 굴려주세요. (1)네  (2)아니오");
			System.out.println();
			
			int answer = sc.nextInt();
			while(true) {
				if(answer == 1) {
					System.out.println("================================================");
					System.out.println("⚀ ⚁ ⚂ ⚃ ⚄ ⚅ ~ ~ ~ 주사위 굴리는 중 ~ ~ ~ ⚀ ⚁ ⚂ ⚃ ⚄ ⚅");
					System.out.println("================================================");
					System.out.println();
					System.out.print(">> 던지신 주사위의 합은 : ");
					int diceSum = (int)(Math.random()*72+1);
					System.out.println(diceSum);
					if(diceSum % 2 != 0) {
						System.out.println();
						System.out.println("================================================");
						System.out.println("♬~♬~♬~♬~♬~♬~♬~♬~♬~♬ 축하합니다 ♬~♬~♬~♬~♬~♬~♬~♬~♬~♬");
						System.out.println("★☆★☆★☆★☆★☆★☆20% 할인 쿠폰이 발행되었습니다!☆★★☆★☆★☆★☆★☆");
						System.out.println("=================================================");
						System.out.println();
						System.out.println("JAVARA MALL 을 이용해 주셔서 감사합니다. :)");
					}else {
						System.out.println();
						System.out.println("=================================================");
						System.out.println("♬~♬~♬~♬~♬~♬~♬~♬~♬~♬ 축하합니다 ♬~♬~♬~♬~♬~♬~♬~♬~♬~♬~♬");
						System.out.println("★☆★☆★☆★☆★☆★☆무료배송 쿠폰이 발행되었습니다!☆★★☆★☆★☆★☆★★☆");
						System.out.println("=================================================");
						System.out.println();
						System.out.println("JAVARA MALL 을 이용해 주셔서 감사합니다. :) ");
					}
					break;
		}

	}
}
	}
	
}