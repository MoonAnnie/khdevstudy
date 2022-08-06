package exception;

public class TestException {
	
	public void test01() throws Exception {
		System.out.println("test01 called...");
		test02();
		System.out.println("test01 end...");
	}

	public void test02() throws Exception {
			System.out.println("test02 called...");
			test03();
			System.out.println("test02 end...");
	}
	
	public void test03() throws Exception { 
		System.out.println("test03 called...");
//		int x = 1/0;  //일부러 오류를 만듦(ArithmeticException)
			//근데 아래처럼 만들어도 됨
//		throw new Exception();  //만들어진 Exception 을 던져야 하니까 앞에 throw 붙임 (Exception 종류 모두 다 가능)
		throw new PokemonException("포켓몬 예외"); //Exception 클래스를 상속받는 PokemonException 클래스 새로 만듦
									 //아 내가 만든 클래스로 Exception 을 던지는게 가능하구나~
//		System.out.println("test03 end..."); //위에 Exception이 있으니까 여기 실행문은 닿지 않음(실행이 안됨)
	}
	
	
}
