package logIn;

import java.util.Scanner;

public class LogIn {
	
	
	Scanner sc = new Scanner(System.in);
	
	public void logInStart() {
		
		System.out.println("********************************************");
		System.out.println("JAVARA MALL 에 오신 것을 환영합니다~ ლ( ╹ ◡ ╹ ლ)");
		System.out.println("********************************************");
		
		
		while(true) {
			System.out.println("- 로그인)");
			System.out.println("- 성함을 입력해 주세요.");
			String name = sc.next();
			System.out.println(name + "님 반가워요 :)");
			System.out.println();
			System.out.println("- 생년월일을 입력해 주세요.");
			String birth = sc.next();
			System.out.println();
			System.out.println("- 핸드폰 번호를 입력해 주세요.");
			String number = sc.next();
			System.out.println();
			System.out.println("========== 로그인 정보 =======================");
			System.out.println("이름 : " + name);
			System.out.println("생년월일 : " + birth);
			System.out.println("핸드폰 번호 : " + number);
			System.out.println("============================================");
			System.out.println("위 정보로 로그인을 하시겠습니까?");
			System.out.println("1)예  2)아니오");
			int answer = sc.nextInt();
			if(answer == 1) {
				System.out.println("환영합니다~!!");
				break;
			}
			
		}
		System.out.println();
		
	}

}//class