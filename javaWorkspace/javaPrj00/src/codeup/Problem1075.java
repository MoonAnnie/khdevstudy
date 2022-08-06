package codeup;

import java.util.Scanner;

public class Problem1075 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		while(number>=0 && number<=100) {
			if(number!=0) {
			System.out.println(number-1);
			number--;
			}else {
				break;
			}
		}
		
		
	}

}
