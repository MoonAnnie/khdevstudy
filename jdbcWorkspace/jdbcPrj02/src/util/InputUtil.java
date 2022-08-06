package util;

import java.util.Scanner;

public class InputUtil {
	
	public static final Scanner sc = new Scanner(System.in);
	
	public static int getInt() { //return 타입이 int 니까 void -> int
//		int n = sc.nextInt();
//		sc.nextLine();
		//아래처럼 작성
//		int n = Integer.parseInt(sc.nextLine());
//		return n;
		//아래처럼 작성
		return Integer.parseInt(sc.nextLine());
	}
	

}
