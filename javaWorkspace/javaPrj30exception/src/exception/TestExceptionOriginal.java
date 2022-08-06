package exception;

public class TestExceptionOriginal {
	
	public void test01() {
		System.out.println("test01 called...");
		try {
			int x = 1/0;
			
			int[] arr = new int[3];
			arr[7] = 10;
		}catch(Exception e) {
			System.out.println("[에러] 뭔지 모르겠는데...예외임...");
		}finally {
			System.out.println("파이널 블록~~~");
		}
		System.out.println("test01 end..");
	}

	public void test02() {
		try {
			System.out.println("test02 called...");
			System.out.println("test02 end...");
		}catch(Exception e) {
			System.out.println("메소드02 에서 에러남.. ㅠㅠ 근데 괜찮음!");
		}
	}
	
	public void test03() {
		System.out.println("test03 called...");
		System.out.println("test03 end...");
	}
	
	
}
