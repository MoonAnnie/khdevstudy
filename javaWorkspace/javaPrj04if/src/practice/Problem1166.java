package practice;

import java.util.Scanner;

public class Problem1166 {

	public static void main(String[] args) {

		/*
		 * 년도를 입력받고
		 * 윤년판별하기
		 * (판단 조건은 아래 링크 참조)
		 * https://codeup.kr/problem.php?id=1166
		 */
		
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();

		//운년판단
		
		//1. 400의 배수이면 무조건 윤년이다.
		//2. (1)이 아닌 수 중에 4의 배수이며, 100의 배수가 아니면 윤년이다.
		
		if(year % 400 == 0)
		{
			System.out.println("윤년");
		}
		else if(year % 4 ==0 && year % 100 !=0 )
		{
			System.out.println("윤년");
		}
		
		
		
	}

}
