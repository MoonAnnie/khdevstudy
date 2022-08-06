package codeup;

import java.util.Scanner;

public class Problem1218 {

	public static void main(String[] args) {

		//삼각형의 3변의 길이 a, b, c가 입력으로 주어진다.
		//여기서 입력되는 변의 관계는 a ≤ b ≤ c 이다. 
		//그 삼각형이 무슨 삼각형인지 출력하시오.
		
		//조건)
		//세 변의 길이가 같은 경우 : 정삼각형
		//두 변의 길이가 같은 경우 : 이등변삼각형
		//a2 + b2 = c2일 경우(피타고라스 정리) : 직각삼각형
		//위의 조건에 맞지 않는 일반 삼각형일 경우 : 삼각형
		//삼각형이 아닐 경우 : 삼각형아님
		//을 출력한다.
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a+b<=c) {
			System.out.println("삼각형아님");
		}
		else if(a==b && b==c) {
			System.out.println("정삼각형");
		}else if(a==b || b==c || a==c) {
			System.out.println("이등변삼각형");
		}else if(Math.pow(a,2) + Math.pow(b,2) == Math.pow(c, 2)) {
			System.out.println("직각삼각형");
		}else {
			System.out.println("삼각형");
		}
		
	}

}
