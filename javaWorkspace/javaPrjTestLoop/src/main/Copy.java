package main;

import java.util.Scanner;

public class Copy {

	public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
		
		
		int select;
		do
		{	
			System.out.println("!~ 당신의 점심메뉴를 추천드립니다 ~!");
			System.out.println("");
			System.out.println("한식, 중식, 양식, 일식 중 하나를 선택하세요.");
			String type  = sc.nextLine();
			System.out.println("당신의 선택은: " + type + "입니다.");
			System.out.println("이제 1 ~ 5 사이의 숫자를 선택해 주세요.");
			
			int user = sc.nextInt();
			
		if(type.equals("한식"))
			{
				if(user==1) 
					{
					System.out.println("라면 추천드립니다!");
					}
				else if(user==2)
				{
					System.out.println("제육볶음 추천드립니다!");
				}
				else if(user==3)
				{
					System.out.println("콩국수 추천드립니다!");
				}
				else if(user==4)
				{
					System.out.println("김치찌개 추천드립니다!");
				}
				else if(user==5)
				{
					System.out.println("해장국 추천드립니다!");
				}
			}
		else if(type.equals("중식"))
			{
				if(user==1) 
					{
					System.out.println("마라탕 추천드립니다!");
					}
				else if(user==2)
				{
					System.out.println("짬뽕 추천드립니다!");
				}
				else if(user==3)
				{
					System.out.println("짜장면 추천드립니다!");
				}
				else if(user==4)
				{
					System.out.println("탕볶밥 추천드립니다!");
				}
				else if(user==5)
				{
					System.out.println("딤섬 추천드립니다!");
				}
			}
		else if(type.equals("양식"))
			{
				if(user==1) 
					{
					System.out.println("피자 추천드립니다!");
					}
				else if(user==2)
				{
					System.out.println("샌드위치 추천드립니다!");
				}
				else if(user==3)
				{
					System.out.println("토마토 스파게티 추천드립니다!");
				}
				else if(user==4)
				{
					System.out.println("크림 스파게티 추천드립니다!");
				}
				else if(user==5)
				{
					System.out.println("빵 추천드립니다!");
				}
			}
		else if(type.equals("일식"))
			{
				if(user==1) 
					{
					System.out.println("덮밥 추천드립니다!");
					}
				else if(user==2)
				{
					System.out.println("초밥 추천드립니다!");
				}
				else if(user==3)
				{
					System.out.println("돈까스 추천드립니다!");
				}
				else if(user==4)
				{
					System.out.println("라멘 추천드립니다!");
				}
				else if(user==5)
				{
					System.out.println("모밀,우동 추천드립니다!");
				}
			}
				System.out.println("마음에 드시나요?");
				System.out.println("마음에 드신다면 1번 다시하시려면 2번을 작성해주세요.");
				select = sc.nextInt();
				sc.nextLine(); // int 뒤의 엔터값을 받아줄 line공간
				
		} while(select==2);
		
		
	}

}


