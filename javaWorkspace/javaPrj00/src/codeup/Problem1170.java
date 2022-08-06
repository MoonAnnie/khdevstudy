package codeup;

import java.util.Scanner;

public class Problem1170 {

	public static void main(String[] args) {
		//학번을 입력 받아 다음 형식으로 출력하시오.
		//학번은 학년, 반, 번호로 입력된다.
		//예)
		//2 3 27   =====>    2327로 출력
		//2 3 7   ======> 2307로 출력   (번호가 10번미만이면 0을 붙여 출력)

		Scanner sc = new Scanner(System.in);
		
		int grade = sc.nextInt();
		int classNo = sc.nextInt();
		int number = sc.nextInt();
		
		
		if(number<10) {
			System.out.print(grade);
			System.out.print(classNo);
			System.out.println("0" + number);
		}else {
			System.out.print(grade);
			System.out.print(classNo);
			System.out.println(number);
		}
	}

}
