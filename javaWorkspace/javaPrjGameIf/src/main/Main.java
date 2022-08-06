package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		//업다운 게임
		//사용자가 숫자를 입력하게 하고,
		//숫자를 맞추면 맞췄다고 알려주기
		//숫자를 못맞추면, up인지 down 인지 알려주기
		System.out.print("1 ~ 50 사이의 숫자를 입력하세요 : ");
		
		Scanner sc = new Scanner(System.in);
		
		//정답
		int answer = 33;
		
		int input;
		
		//입력받기
		input = sc.nextInt();

		//판단
		if(input == answer)
		{
			System.out.println("정답입니다.");
		}
		else
			if(input > answer)
			{
				System.out.println("DOWN");
			}
			else
			{
				System.out.println("UP");
			}
		
		
		
	}

}
