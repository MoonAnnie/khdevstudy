package practice;

import java.util.Scanner;

public class Problem1156 {

	public static void main(String[] args) {

		/*
		 * 정수 하나 입력받고,
		 * 홀수 짝수 판단해서 출력
		 */
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		if (x % 2 == 0)
		{
			System.out.println("짝");
		}
		else
		{
			System.out.println("홀");
		}
		
	}

}
