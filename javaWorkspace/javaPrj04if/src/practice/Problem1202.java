package practice;

import java.util.Scanner;

public class Problem1202 {

	public static void main(String[] args) {

		/*
		 * 시험성적을 입력받고,
		 * 아래 등급표에 따라 등급을 출력하세요
		 * 90점 이상 : A
		 * 80점 이상 : B
		 * 70점 이상 : C
		 * 60점 이상 : D
		 * 60점 미만 : F
		 */

		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		
		if(score >= 90)
		{
			System.out.println("A");
		}
		else if(80 <= score)
		{
			System.out.println("B");
		}
		else if(70 <= score)
		{
			System.out.println("C");
		}
		else if(60 <= score)
		{
			System.out.println("D");
		}
		else
		{
			System.out.println("F");
		}
		
	}

}
