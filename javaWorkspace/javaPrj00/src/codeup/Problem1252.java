package codeup;

import java.util.Scanner;

public class Problem1252 {

	public static void main(String[] args) {

		//어떤 수 n을 입력으로 받아 1부터 n까지의 숫자를 출력하시오.
		 
		//for(초기식;조건식;증감식){실행내용}
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int i = 1;
		
		for(i=1; i>=1 && i<=n; ++i) {
			System.out.print(i + " ");
		}
		
	}

}
