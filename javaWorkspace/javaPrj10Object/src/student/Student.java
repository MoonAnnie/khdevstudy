package student;

public class Student {
	
	public String name; // 외부 파일에서 보여지게 하려면 앞에 public을 꼭 붙여줘야 함
	public byte age;   // 안그러면 Main 페이지에서 호출이 안됨
	public int score;
	
//	접근제한자 리턴타입 메소드이름(파라미터..) {실행내용}
	public void hello() {
		System.out.println("hello ~");
	}
	
	public void student() {
		System.out.println("여기는 student 메소드 ...");
	}
	
	/*
	 * 접근제한자
	 * public , protected, default, private
	 * 
	 */
	
	

}
