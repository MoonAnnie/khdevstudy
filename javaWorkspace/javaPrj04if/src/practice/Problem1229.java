package practice;

import java.util.Scanner;

public class Problem1229 {

	public static void main(String[] args) {                                  // (3) 여기부터 시작되는게 됨!

		/*
		 * https://codeup.kr/problem.php?id=1229
		 * 링크의 표를 참고하여
		 * 비만도를 계산하고,
		 * 비만도 등급을 출력
		 */
		
		//1. 키, 몸무에 입력 받기 (실수)
		Scanner sc = new Scanner(System.in);
		
		double height = sc.nextDouble();
		double weight = sc.nextDouble();

		//2. 표준 몸무게 계산 (stand weight)
		double sw;  //(2) 여기에 sw 변수를 만들게되면 적용되는 범위는 {} 를 찾아서 확인하면 되니까 그 앞에 나오는 
		if(height < 150)
		{
			 sw = height - 100;     //(4) 그러면 이제 여기에 나오는 sw에 빨간줄이 생김 왜냐면 이미 위에서 sw를 선언했는데 여기서 또 sw을 선언하는 거라
		} 										//중복으로 처리되서 에러가 남 => 여기에 앞에 있는 double 을 지워주면 됨 
		else if(height < 160)
		{
			 sw = (height - 150) / 2 + 50;
		}
		else
		{
			 sw = (height - 100) * 0.9;
		}

		
		//3. 비만도 수치 계산
		double bmi = (weight - sw) * 100 / sw;        // (1)그냥 이렇게 치면 sw에 빨간줄 그어짐. 위에 sw 변수 만들었는데 왜 그어지냐? 위에 {} 에서만 적용되기 떄문
		
		
		//4. 수치에 따라 등급 출력
		
		if(bmi <= 10)
		{
			System.out.println("정상");
		}
		else if(bmi <= 20)
		{
			System.out.println("과체중");
		}
		else
		{
			System.out.println("비만");
		}
		
		
	}

}
