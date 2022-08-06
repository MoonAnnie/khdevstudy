package codeup;

import java.util.Scanner;

public class Problem1169ans {

	public static void main(String[] args) {

		//나이계산2
		Scanner sc = new Scanner(System.in);
		
		int age = sc.nextInt();
		
		int year = 2012 - age + 1;
		
		int gender = 0;
		
		if(year < 2000) {
			gender = 1;
		}else {
			gender = 3;
		}
		
		System.out.print(year%100);
		System.out.print(" ");
		System.out.println(gender);    //(year%100 + " " + gender) 이렇게 출력문 하나로도 작성 가능
		
		
	}//main

}//class
