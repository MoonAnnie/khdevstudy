package test;

public class ApiTest {

	//method
	public void test01() {
		String str = "Hello World";
		
		//charAt : 특정 인덱스의 '문자' 리턴하는 메소드
		char result = str.charAt(1);
		
		//compareTo : 사전 순으로 비교 (맨 앞글자들의 알파벳 순서 차이를 반환)
//		int result = str.compareTo("Jbc123");
		
		//concat : str 뒤에 문자를 덧붙임 **자주 쓰이니까 잘 알아두기
//		String result = str.concat("zzz");
		
		//substring : 인덱스를 이용해서 문자를 자름
//		String result = str.substring(3,7);
		
		//lowercase
//		String result = str.toLowerCase();
		
		//uppercase
//		String result = str.toUpperCase();
		
		
		//print
		System.out.println(result);
		
	}//test01
	
	//method 추가
	public void test02() {
		//StringBuilder, StringBuffer
		
//		StringBuilder sb = new StringBuilder();
//		sb.append("zz"); //>>sb에 문자열 zz를 추가해주는 것
//		sb.append("abc"); 
//		System.out.println(sb);
		
		StringBuffer sb = new StringBuffer();
		sb.append("zz");
		sb.append("abc");
		System.out.println(sb);
		
		}
	
	//method 추가2
	
	public void test03() {
		//Math
		
		int result = Math.abs(-77);
		
		System.out.println(result);
		
	}
	
	public void test04() {
		String s = "apple,samsung,lg,google";
		String[] result = s.split(",");
		for(int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
	
	
	
	
	
}//class
