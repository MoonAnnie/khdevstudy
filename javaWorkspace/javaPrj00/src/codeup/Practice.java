package codeup;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {

//		a, b, c 가 변의 길이이고 c가 제일 긴 길이라고 한다면
//		c < a + b 이면 삼각형이 성립됨.
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(c<a+b) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
		
	}//main

}//class
