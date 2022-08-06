package logIn;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.Scanner;

public class LogIn {
	
	public void logInStart() throws IOException {
		
		System.out.println("■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ");
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		System.out.println("■            JAVA CINEMA              ■");
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		System.out.println("■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ");
		
		System.out.println("▶ 영화를 예매하시려면 (enter) 키를 눌러 주세요.");
		
		while(true) {
		Scanner sc = new Scanner(System.in);
			String x = sc.nextLine();
			System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
			System.out.println("■              1.날짜 선택              ■");
			System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
			System.out.println("▶ 예매하려는 연도와 날짜를 입력해 주세요.");
			
			Calendar cal = Calendar.getInstance();
			System.out.println("- 연도를 입력해 주세요. : ");
			int year = sc.nextInt();
			System.out.println("- 월을 입력해 주세요. : ");
			int month = sc.nextInt();
			System.out.println("- 일을 입력해 주세요. : ");
			int day = sc.nextInt();
			
			cal.set(Calendar.YEAR, year);
			cal.set(Calendar.MONTH, month);
			
			System.out.println("---------["+year+"년 "+month+"월]---------");
			System.out.println("  일  월  화  수  목   금   토");

			cal.set(year,month-1,1); //입력받은 월의 1일로 세팅
			                         //month는 0이 1월이므로 -1을 해준다
			  
			int end = cal.getActualMaximum(Calendar.DATE); //해당 월 마지막 날짜
			int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK); //해당 날짜의 요일(1:일요일 … 7:토요일)
			

			for(int i=1; i<=end; i++) {
				if(i==1) {
					for(int j=1; j<dayOfWeek; j++) {
						System.out.print("    ");
					}
				}
				if(i<10) { //한자릿 수일 경우 공백을 추가해서 줄 맞추기
					System.out.print(" ");
				}
				System.out.print(" "+i+" ");
				if(dayOfWeek%7==0) { //한 줄에 7일씩 출력
					System.out.println();
				}
				dayOfWeek++;
			}
			System.out.println("     ");

			System.out.println("-------------------------------");
			System.out.println("▶ 예매하려는 날짜가 맞다면 (1)번, 다시 정하려면 (2)번을 눌러 주세요.");
			int dateAnswer = sc.nextInt();
			if(dateAnswer == 1) {
				System.out.println("▶ 예매는 회원만 가능합니다. 회원가입을 하려면 (1)번, 끝내시려면 (2)번을 눌러 주세요.");
				int memberAnswer = sc.nextInt();
				if(memberAnswer == 1) {
					System.out.println("▶ 회원가입 페이지로 넘어갑니다.");
					break; //반복문 탈출
				}
			}else {continue;}
			
		}//while
		
	}

}//class
