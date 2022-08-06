package codeup;

import java.util.Scanner;

public class Problem1170ans {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int grade = sc.nextInt();
		int classNo = sc.nextInt();
		int number = sc.nextInt();
		
		System.out.print(grade);
		
		if(classNo>=10) {
			System.out.print(classNo);
		}else {
			System.out.print("0" + classNo);
		}
		if(number>=10) {
			System.out.print(number);
		}else {
			System.out.println("0" + number);
		}
		
		/////////////////////이거 말고 카톡에 캡쳐한 답으로 옮겨 적기
		
	}//main

}//class
