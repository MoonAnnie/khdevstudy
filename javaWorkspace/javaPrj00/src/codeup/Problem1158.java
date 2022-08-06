package codeup;

import java.util.Scanner;

public class Problem1158 {

	public static void main(String[] args) {

//1. 공이 30m~40m나 60m~70m 에 들어오면 슬기가 이김.
//2. 그 외의 구간에 떨어지면 체육선생님이 이김.
//슬기가 던진 공의 위치가 입력으로 주어지면 슬기가 이기는 구간에는 "win"을 출력하고, 그 외에는 "lose"를 출력하시오.

		Scanner sc = new Scanner(System.in);
		
		float x = sc.nextFloat();
		
		if(x>=30 && x<=40) {
			System.out.println("win");
		}else if(x>=60 && x<=70) {
			System.out.println("win");
		}else {
			System.out.println("lose");
		}

		
		
		
		
	}

}
