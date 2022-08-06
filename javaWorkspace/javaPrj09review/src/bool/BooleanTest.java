package bool;

public class BooleanTest {
	
	public void test() {
		
		boolean x = 1 > 0;
		System.out.println(x); //boolean 타입은 true , false 둘 중 하나로 출력이 됨
		
		if(x) {
			System.out.println("if 통과");
		}else {
			System.out.println("else ~~~");
		}
		
		
	}

}
