package codeup;

import java.util.Scanner;

public class Problem1168 {

	public static void main(String[] args) {
		/*
		 * 성별 정보는 1이면 1900년대 출생 남자, 2이면 1900년대 출생 여자, 
		 * 3이면 2000년대 출생 남자, 4이면 2000년대 출생 여자를 말한다.
		 * 기준년도는 2012년도이다. 현재 나이를 출력하시오.
			790101 1        =====> 성별정보가 1이므로, 1979년생, 34살이다.
			080521 4        =====>  성별정보가 4이므로, 2008년생,  5살이다.
		 */

		Scanner sc = new Scanner(System.in);
		
		//790101 1
		int birth = sc.nextInt();
		int gender = sc.nextInt();
		
		int year = birth/10000;
		
		//나이계산
		int answer = 0;
		if(gender == 1 || gender == 2) {
			answer = 2012 - (1900 + year) +1; //그냥 year로 쓰면 year은 79이기 때문에 1900을 더해줘야 함
		}else {
			answer = 2012 - (2000 + year) +1;
		}
		
		System.out.println(answer);
		
		
	}//main

}//class
