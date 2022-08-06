package main;

public class MainSwitch {

	public static void main(String[] args) {

		//switch
		/*
		 * 값이 같은지 비교 (==)
		 * 
		 * [문법]
		 * switch(기준값) {
		 * case 비교값1 : 실행내용; break;
		 * case 비교값2 : 실행내용; break;
		 * case 비교값3 : 실행내용; break;
		 * ... //case 는 원하는 만큼 작성
		 * default : 실행내용;
		 * }
		 */
		
		String name = "문동주";
		switch(name) {
		case "홍길동" : 
			System.out.println("길동 ㅎㅇ"); 
			System.out.println("반가워요 길동 ^~^");
			break;
		case "문동주" : 
			System.out.println("동주 ㅎㅇ"); 
			System.out.println("반가워요 동주 ^~^");
			if(10 > 0) {
				System.out.println("당연히 10이 더 크지");
			}
			break;
		case "노하람" : 
			System.out.println("하람 ㅎㅇ"); 
			System.out.println("반가워요 하람 ^~^");
			break;
		case "황현지" : 
			System.out.println("현지 ㅎㅇ"); 
			System.out.println("반가워요 현지 ^~^");
			break;
		}
		
		
		
		
		
		
		
		
		
		
		
	}//main

}//class
