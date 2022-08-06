package codeup;

import java.util.Scanner;

public class Problem1157 {

	public static void main(String[] args) {

		//슬기가 던진 공의 위치가 입력으로 주어지면 50이상 60이하이면 "win"을 출력하고, 그 외에는 "lose"를 출력하시오.
		
		Scanner sc = new Scanner(System.in);
		
		float x = sc.nextFloat();
		
		if(x>=50 && x<=60) {
			System.out.println("win");
		}else {
			System.out.println("lose");
		}
		
	}

}
