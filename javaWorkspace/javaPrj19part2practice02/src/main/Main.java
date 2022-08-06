package main;

import java.util.Scanner;

import emp.Employee;

public class Main {

	public static void main(String[] args) {
		
		//햄버거 주문받기
		
		//메뉴판 보여주기
//		System.out.println("===== Menu =====");   //>>메뉴판 보여주는걸 Employee 클래스로 옮기고, 그걸 Main에서 다시 호출하면 됨
//		System.out.println("1. 상하이");
//		System.out.println("2. 타워버거");
//		System.out.println("3. 불새버거");
//		System.out.println("4. 와퍼");
		Employee emp = new Employee(); //>>Employee에 옮겨둔 메뉴판 보여주는 걸 Main에서 호출하는 방법!
		emp.showMenu();
		
		//입력받기
		Scanner sc = new Scanner(System.in);
		int menu = sc.nextInt();
		
		//입력받은 내용 출력   //>> 입력 받은 내용 출력하는걸 Employee가 하게끔 Employee 클래스로 옮김
//		switch(menu) {
//		case 1 : System.out.println("상하이 주문 완료"); break;
//		case 2 : System.out.println("타워 주문 완료"); break;
//		case 3 : System.out.println("불새 주문 완료"); break;
//		case 4 : System.out.println("와퍼 주문 완료"); break;
//		}
		emp.sayMenu(menu);

		
		
		
		
		
		
		
	}//main
	

}//class
