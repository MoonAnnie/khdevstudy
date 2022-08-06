package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("===== 배열 =====");
		
		//학생 10명의 성적 입력받는 프로그램
		
		Scanner sc = new Scanner(System.in);
		
		/*
		 * 배열
		 * - 데이터 타입이 같은 여러개의 변수를 한번에 만들 수 있음
		 * - 배열은 여러 칸이 존재하는데, 그 칸을 인덱스라고 부름
		 * - 인덱스(index)는 0부터 시작한다.
		 * - 배열은 만들 때 몇칸 짜리인지 말해줘야 한다.
		 */
		
		//int x = 10; //초기화

//		int[] a;           //배열 변수 선언
//		a = new int[3];   //배열 생성하여, a에 할당 //컴퓨터는 오른쪽 new int[3]을 먼저 실행하고 그 다음 그걸 a로 넣어줌
		
		int[] a = new int[3]; //배열 변수 초기화
		
//		int[] a = new int[] {1,2,3};
//		int[] a = new int[] {10,27,33}  >> int[] a = {10,27,33} 으로 써도 됨

		System.out.println("배열의 길이 ::: " + a.length);
		
		

		
		
	}//main

}//class
