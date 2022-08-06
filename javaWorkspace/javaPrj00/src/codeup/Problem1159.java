package codeup;

import java.util.Scanner;

public class Problem1159 {

	public static void main(String[] args) {

//		1. 공의 위치가 50m~70m이면 슬기가 이김.
//
//		또는
//
//		2. 공의 위치가 6의 배수이면 슬기가 이김. 
//
//		슬기가 던진 공의 위치가 입력으로 주어지면 슬기가 이기는 구간에는 "win"을 출력하고, 그 외에는 "lose"를 출력하시오.
		
		Scanner sc = new Scanner(System.in);
		
		float x = sc.nextFloat();
		
		if(x>=50 && x<=70) {
			System.out.println("win");
		}else if(x%6 == 0) {
			System.out.println("win");
		}else {
			System.out.println("lose");
		}
		
		
	}

}
