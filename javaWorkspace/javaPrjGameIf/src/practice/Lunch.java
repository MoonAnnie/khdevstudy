package practice;

import java.util.Scanner;

public class Lunch {

	public static void main(String[] args) {
		
		/*
		 * 점심 식당 고르기
		 * 사용자의 시간 여유에 따라 갈 수 있는 식당 리스트를 보여줌
		 * 
		 * 5분 이상 : 한국지식재산센터 구내식당, 솔낭구 음식점, 오미라 한식 뷔페
		 * 3분 이상 5분 미만 : 솔낭구 음식점, 오미라 한식 뷔페
		 * 3분 미만 : 오미라 한식 뷔페
		 */
		
		System.out.print("점심 식당까지 걸어가는데 할애할 수 있는 시간(분)을 말하시오. : ");
		
		Scanner sc = new Scanner(System.in);
		int time = sc.nextInt();
				
		if(time >= 5)
		{
			System.out.println("한국지식재산센터 구내식당, 솔낭구 음식점, 오미라 한식 뷔페");
		}

		else if(time >=3)
		{
			System.out.println("솔낭구 음식점, 오미라 한식 뷔페");
		}
		else
		{
			System.out.println("오미라 한식 뷔페");
		}
		
	}

}
