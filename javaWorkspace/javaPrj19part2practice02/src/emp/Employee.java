package emp;

public class Employee {
	
	//메뉴 보여주기
	public void showMenu() {  //메뉴판 보여주는 걸 showMenu라는 메소드로 만듬!
		System.out.println("===== Menu =====");
		System.out.println("1. 상하이");
		System.out.println("2. 타워버거");
		System.out.println("3. 불새버거");
		System.out.println("4. 와퍼");
	}
	
	//주문 접수 말하기 라는 메소드 추가하기
	public void sayMenu(int menu) {
		switch(menu) {
		case 1 : System.out.println("상하이 주문 완료"); break;
		case 2 : System.out.println("타워 주문 완료"); break;
		case 3 : System.out.println("불새 주문 완료"); break;
		case 4 : System.out.println("와퍼 주문 완료"); break;
		}
	}
	
	

}//class
