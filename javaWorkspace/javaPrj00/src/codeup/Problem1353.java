package codeup;

import java.util.Scanner;

public class Problem1353 {

	public static void main(String[] args) {

		//삼각형 출력하기
		//일단 사각형부터
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 1; i<=n; i++) {
			for(int j = 1; j<=n; j++) {
				if(i>=j) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		
	}//main

}//class
