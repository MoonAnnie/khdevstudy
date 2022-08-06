package main;

import employee.Emp;
import kiosk.Kiosk;
import order.Order;

public class Main {
	
	public static Emp emp = new Emp("아이유");


	public static void main(String[] args) {

		System.out.println("===== 피자가게 =====");
		
		//인사하기
		emp.sayWelcome(); //emp 객체한테 sayWelcom 이라는 메소드를 실행시킴
		
		//키오스크 사용하여, 주문 내용 얻기
		Kiosk kiosk = new Kiosk();
//		boolean isTakeOut = kiosk.checkTakeOut(); //kiosk한테 일 시키기 > kiosk. + 동작
//		int dough = kiosk.selectDough();
//		int topping = kiosk.selectTopping();
//		int side = kiosk.selectSide();
//		int drink = kiosk.selectDrink();
		//아래처럼 바꾸기
		Order order = kiosk.useKiosk();
		kiosk.calc(order);
		
		
		//주문 객체 생성
//		int price = 0;
//		int time = 0;
//		Order order = new Order(isTakeOut, dough, topping, side, drink, price, time);
		
		//출력문 출력
//		System.out.println(isTakeOut);
//		System.out.println(dough);
//		System.out.println(topping);
//		System.out.println(side);
//		System.out.println(drink);
		// 아래 V 처럼 한번에 바꾸기
		System.out.println(order);
		
		
//Main 클래스의 코드를 한 번에 쓰면 아래처럼 됨
//		emp.sayWelcome();
		//키오스크 사용하여, 주문 내용 얻기
//		Kiosk kiosk = new Kiosk();
//		Order order = kiosk.useKiosk();
//		System.out.println(order);


		
		
		
		
	}//main

}//class

