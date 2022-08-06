package codeup;

import java.util.Scanner;

public class Problem1356 {

	public static void main(String[] args) {

		//길이가 n인 사각형 출력하기
		//사각형의 안은 공백으로 출력
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				//첫번째 행, 마지막 행, 첫번쨰 열, 마지막 열은 * 출력
				if(i == 1 || i == n || j == 1 || j == n) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();    //한번 실행이 될 때 줄바꿈을 하기 위함
		}
		
		
	}//main

}//class
