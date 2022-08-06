package codeup;

import java.util.Scanner;

public class Problem1071 {

	public static void main(String[] args) {
//		정수가 순서대로 입력된다.
//		0이 아니면 입력된 정수를 출력하고, 0이 입력되면 출력을 중단해보자.
		
		Scanner sc = new Scanner(System.in);

		while(true) {
			int n = sc.nextInt();
			if(n!=0) {
				System.out.println(n);
			}
			else {
				break;
		}
		}
		

	}

}
