package codeup;

import java.util.Scanner;

public class Problem1171 {

	public static void main(String[] args) {

		//1171
		
		//2 7 15
		
		// >> 207015

		Scanner sc = new Scanner(System.in);
		
		int grade = sc.nextInt();
		int classNo = sc.nextInt();
		int num = sc.nextInt();
		
		System.out.print(grade);
		
		if(classNo >= 10) {
			System.out.print(classNo);
		}else {
			System.out.print("0" + classNo);
		}
			
		if(num >= 100) {
			System.out.print(num);			
		}else if(num >= 10) {
			System.out.print("0" + num);
		}else {
			System.out.print("00" + num);
		}		
		
		
		
	}//main

}//class
