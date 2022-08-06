package codeup;

import java.util.Scanner;

public class Problem1169 {

	public static void main(String[] args) {

		/*
		 * 나이가 주어지면 몇 년도에 태어났는지를 출력하시오. (나이는 2012년도 기준입니다.)
		 * 단, 출력할 때 년도 4자리 중 뒤의 두자리만 출력하고,
		 * 한 칸 띄운 후 1900년도 출생이면 1을 출력, 2000년대 출생이면 3을 출력하시오.
		 * 예) 18살이면 1995년생이므로 95 1을 출력한다.
		 */

		Scanner sc = new Scanner(System.in);
		
		int age = sc.nextInt();
		
		int year = (2012-age)+1;
		
		if(year>=1900) {
			System.out.print(year-1900);
			System.out.println(" " +"1");
		}else if(year>=2000) {
			System.out.println(year-2000);
			System.out.println(" " + "3");
		}
		
	}

}
