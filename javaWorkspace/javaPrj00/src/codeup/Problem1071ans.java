package codeup;

import java.util.Scanner;

public class Problem1071ans {

	public static void main(String[] args) {

		//0이 입력되면 출력 x
		
		//입력받기
		//출력하기
		//위 작업을 무한반복문으로 처리
		//입력값이 0이면? 반복문 종료 처리
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int x = sc.nextInt();
			if(x == 0) {
				break;
			}
			System.out.println(x); //여기에 쓰는 이유는 판단을 해준 다음 마지막에 출력을 해줘야 하기 때문
		}						  // 더 위에 썼었다면 0 눌러도 출력이 됨
		
		
		
	}//main

}//class
