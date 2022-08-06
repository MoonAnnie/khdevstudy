package main;

public class MethodTest {
	
//	//메소드 오버로딩 (파라미터만 다르게, 같은 이름으로 여러개 만드는 것)
//	
//	public void test() { //test() 괄호 까지가 메소드 이름임 //괄호 = 파라미터 부분
//		System.out.println("test() called...");
//	}
//
//	public void test(int x) { //메소드 이름이 같으면 안되니까 test2로 바꾸거나, 안에 파라미터 값을 다르게 해주면 됨 -> 메소드 오버로딩
//		System.out.println("test() called...");
//	}
//	
//	public void test(int x, String s) {
//		System.out.println("test() called...");
//	}
//	
//	public void test(int x, int y) {
//		System.out.println("test() called...");
//	}
//	
////	public boolean test(int x, int y) { //타입이 boolean이더라도 컴퓨터가 인식하는 건 메소드 이름인 test() 부분이라 위랑 겹치는 제목은 안됨
////		System.out.println("test() called...");
////		return true;
////	}
	
	//상수(==항상 같은 수)
	final int AGE = 20; //final을 붙여서 age가 바뀌지 않음  (오류 나서 내가 임의로 일단 ; 하나 더 붙임)
//	age = 21; // age를 21로 바꿨지만 위에 final 을 붙였기 때문에 21로 바뀌지 않음
	
	final double PI = 3.14; //이 변수 값은 건들지 말라는 뜻으로 final을 붙임
	
	
	
	
	
	
	
}//class
