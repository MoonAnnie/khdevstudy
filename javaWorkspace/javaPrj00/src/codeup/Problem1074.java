package codeup;

import java.util.Scanner;

public class Problem1074 {

	public static void main(String[] args) {

//		정수(1 ~ 100) 1개가 입력되었을 때 카운트다운을 출력해보자.
		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		while(number>=1 && number<=100) {
			System.out.println(number);
			number--;
		}
		
	}

}
