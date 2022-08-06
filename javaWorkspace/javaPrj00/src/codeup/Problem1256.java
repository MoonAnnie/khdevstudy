package codeup;

import java.util.Scanner;

public class Problem1256 {

	public static void main(String[] args) {

//		별(*)을 n개 만큼 출력한다.

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int i = 0;
		
		while(i<n) {
			System.out.print("*");
			i++;
		}
		
		
	}

}
