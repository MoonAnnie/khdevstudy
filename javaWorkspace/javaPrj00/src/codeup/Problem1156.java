package codeup;

import java.util.Scanner;

public class Problem1156 {

	public static void main(String[] args) {
		
		//어떤 자연수가 입력되면  홀수이면 "odd"을 출력하고, 짝수이면 "even"을 출력하시오.

		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		if(x %2 == 0) {
			System.out.println("even");
		}else {
			System.out.println("odd");
		}
		
		
	}

}
