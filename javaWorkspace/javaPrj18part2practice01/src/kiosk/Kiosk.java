package kiosk;

import java.util.Scanner;

import menu.Menu;
import menu.dough.Bite;
import menu.dough.Cheese;
import menu.dough.Gold;
import menu.dough.Normal;
import menu.dough.RichGold;
import menu.drink.Coke;
import menu.drink.Fanta;
import menu.drink.Sprite;
import menu.side.Spaghetti;
import menu.side.Wing;
import menu.topping.Potato;
import menu.topping.Shrimp;
import order.Order;

public class Kiosk {
	
	private Scanner sc = new Scanner(System.in); //이 Scanner은 kiosk 클래스에서만 쓰겠다는 의미로 private 추가함
	
	//주문 쭉 받기 (*<- 첫 수업시간엔, 이걸 맨 마지막에 작성함)
	public Order useKiosk() { //return 타입이 order니까 void -> order로 바꿈
		boolean isTakeOut = checkTakeOut();
		int dough = selectDough();
		int topping = selectTopping();
		int side = selectSide();
		int drink = selectDrink();
		int price = 0;
		int time = 0;
		Order order = new Order(isTakeOut, dough, topping, side, drink, price, time);
		return order;
	}
	
	//비용, 시간 계산하기
	public void calc(Order o) { //계산할 때 Order를 받아서 해야 되니까 파라미터 값으로 Order을 넣음
		//현재 주문에 대한 총 비용, 총 시간 계산하기
//		int totalPrice = 0;
//		int totalTime = 0;
		
		//도우 선택지에 따른 가격, 시간 구하고 ,,, 주문 내역서에 더하기
		calcDough(o);
		//토핑 선택지에 따른 가격, 시간 구하고 ,,, 주문 내역서에 더하기
		calcTopping(o);
		//사이드 선택지에 따른 가격, 시간 구하고 ,,, 주문 내역서에 더하기
		calcSide(o);
		//음료 선택지에 따른 가격, 시간 구하고 ,,, 주문 내역서에 더하기
		calcDrink(o);
		
	}
	
	private void calcDrink(Order o) {
		int drink = o.getDrink();
		if(drink == 1) {
			Menu m = new Coke();
			o.addPrice(m.getPrice());
			o.addTime(m.getTime());
		}else if(drink == 2) {
			Menu m = new Sprite();
			o.addPrice(m.getPrice());
			o.addTime(m.getTime());
		}else if(drink == 3) {
			Menu m = new Fanta();
			o.addPrice(m.getPrice());
			o.addTime(m.getTime());
		}
		
	}

	private void calcSide(Order o) {
		int side = o.getSide();
		if(side == 1) {
			Menu m = new menu.side.Potato();
			o.addPrice(m.getPrice());
			o.addTime(m.getTime());
		}else if(side == 2) {
			Menu m = new Spaghetti();
			o.addPrice(m.getPrice());
			o.addTime(m.getTime());
		}else if(side == 3) {
			Menu m = new Wing();
			o.addPrice(m.getPrice());
			o.addTime(m.getTime());
		}
		
	}

	private void calcTopping(Order o) {
		int topping = o.getTopping();
		if(topping == 1) {
			Menu m = new menu.topping.Cheese(); //Cheese는 dough에도 있으니까 full-name을 적어준 것
			o.addPrice(m.getPrice());
			o.addTime(m.getTime());
		}else if(topping == 2) {
			Menu m = new Potato();
			o.addPrice(m.getPrice());
			o.addTime(m.getTime());
		}else if(topping == 3) {
			Menu m = new Shrimp();
			o.addPrice(m.getPrice());
			o.addTime(m.getTime());
		}
		
	}

	private void calcDough(Order o) {
		int dough = o.getDough();
		if(dough == 1) {
			Menu m = new Normal();
			o.addPrice(m.getPrice());
			o.addTime(m.getTime());
		}else if(dough == 2) {
			Menu m = new Cheese();
			o.addPrice(m.getPrice());
			o.addTime(m.getTime());
		}else if(dough == 3) {
			Menu m = new Gold();
			o.addPrice(m.getPrice());
			o.addTime(m.getTime());
		}else if(dough == 4) {
			Menu m = new Bite();
			o.addPrice(m.getPrice());
			o.addTime(m.getTime());
		}else if(dough == 5) {
			Menu m = new RichGold();
			o.addPrice(m.getPrice());
			o.addTime(m.getTime());
		}
		
	}

	//포장여부 묻기
	private boolean checkTakeOut() { //아래 return 값이 있으니까 void -> boolean 으로 바꿈
		System.out.println("포장하시겠습니까? (Y/N)");
		String result = sc.nextLine();
		if(result.equalsIgnoreCase("Y")) { //.equalsIgnoreCase는 대소문자 상관 없어짐
			return true;
		}else {
			return false;
		}
	}
	
	//도우 선택(일반, 치크, 골드, 바이트, 리치골드)
	private int selectDough() { //return 타입이 숫자라 void 에서 int 로 바꿈
		//선택지 보여주기
		System.out.println("===== 도우 =====");
		System.out.println("1. 일반 도우");
		System.out.println("2. 치즈 크러스트");
		System.out.println("3. 골드");
		System.out.println("4. 바이트");
		System.out.println("5. 리치골드");

//		int result = sc.nextInt(); //맨 위에 Scanner 만들었으니까 또 안 만들어도 됨
//		sc.nextLine(); //엔터키 제거
			//위 두줄을 V아래처럼 작성함
		String result = sc.nextLine(); //String으로 값을 받았는데 selectDough는 int 타입이니까 아래처럼 int 로 바꿔줌
		return Integer.parseInt(result); //Integer.parseInt();을 하면 괄호 안에 있는 것을 int 타입으로 바꿔주는 것
	}
	
	//토핑 선택(콤비, 페퍼, 치즈, 포테이토, 불고기, 고구마, 쉬림프)
	private int selectTopping() {
		//선택지 보여주기
		System.out.println("===== 토핑 =====");
		System.out.println("1. 콤비네이션");
		System.out.println("2. 페퍼로니");
		System.out.println("3. 치즈");
		System.out.println("4. 포테이토");
		System.out.println("5. 불고기");
		System.out.println("6. 고구마");
		System.out.println("7. 쉬림프");
		
		String result = sc.nextLine();
		return Integer.parseInt(result); 
	}
	
	//사이드 선택(스파게티, 감자튀김, 윙)
	private int selectSide() {
		//선택지 보여주기
		System.out.println("===== 사이드 =====");
		System.out.println("1. 스파게티");
		System.out.println("2. 감자튀김");
		System.out.println("3. 윙");
		System.out.println("4. 없음");
		
		String result = sc.nextLine();
		return Integer.parseInt(result); 
	}
	
	//음료 선택
	private int selectDrink() {
		//선택지 보여주기
		System.out.println("===== 음료 =====");
		System.out.println("1. 콜라");
		System.out.println("2. 사이다");
		System.out.println("3. 환타");
		System.out.println("4. 없음");
		
		String result = sc.nextLine();
		return Integer.parseInt(result); 
		
	}


	//외부에선 useKiosk 만 호출할 수 있게, 나머지 포장여부, 도우, 토핑 등등은 private 으로 바꿈



}
