package main;

public class Main {

	public static void main(String[] args) {
		
		//인터페이스
		//메소드는 추상메소드만 가질 수 있음
		//메소드 구현 강제화 하기 위해서 사용
		//인터페이스도 타입이다
		//인터페이스는 (다중)상속이 가능
		//변수는 ...
		//단일상속의 한계를 극복하기 위해 등장 (자바는 단일상속만 가능)
		
//		Sonata car01 = new Sonata();
		//하지만 Car라는 인터페이스도 클래스처럼 하나의 타입으로 사용이 가능함
		//so 아래처럼 변경
		Car car01 = new Sonata();
		car01.go();
		car01.stop();
		
		

	}//main

}//class
