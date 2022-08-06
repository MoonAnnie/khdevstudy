package codeup;

import java.util.Scanner;

public class Problem1212 {

	public static void main(String[] args) {
		
		//제일 긴거 < 나머지 두개의 합
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		//c가 제일 긴 경우
		if(c > a && c> b) 
		{ //보기 좋으라고 괄호를 아래로 내림
			if(a+b > c) {
				System.out.println("yes");
			}else {
				System.out.println("no");
			}
		}
		else if(b > a && b > c) 
		{
			if(a+c > b) {
				System.out.println("yes");
			}else {
				System.out.println("no");
			}
		}
		else
		{
			if(b+c > a) {
				System.out.println("yes");
			}else {
				System.out.println("no");
			}
		}
		
		
	}//main

}//class
