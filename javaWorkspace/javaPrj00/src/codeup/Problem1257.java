package codeup;

import java.util.Scanner;

public class Problem1257 {

	public static void main(String[] args) {

//		시작수와 마지막 수가 입력되면
//		시작수부터 마지막 수까지의 모든 홀수를 출력하시오.
		

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a<b) {
			for(int i=a; i<=b; ++i) {
				if(i%2!=0) {
				System.out.print(i +" ");
				++i;
				}
			}
		}else if(a>b) {
			for(int i=b; i<=a; ++i) {
				if(i%2!=0) {
				System.out.print(i + " ");
				++i;
				}
			}
		}else if(a==b) {
			if(a%2!=0) {
			System.out.print(a);
			}else {
				System.out.print(" ");
			}
		}

		
	}

}
