package codeup;

import java.util.Scanner;

public class Problem1087ans {

	public static void main(String[] args) {

		//1부터 누적해서 더하기, 입력값 나오면 그만
		
		//입력받기
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		//1부터 누적해서 더하기
		int sum = 0;
		for(int i = 1 ; true ; ++i) {  //밑에 break 를 통해 반복문 탈출할거니까 조건식에 true로 써도 됨
			sum+= i;
			//sum이 n 이상이면 넘어가면, 반복문 그만
			if(sum>=n) {
				break;
			}
		}
		System.out.println(sum);
		//입력값 나오면 그만
		//현재까지 누적한 값 출력
		
		
		
	}//main

}//class
