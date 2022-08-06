package animal;

public class Dog extends Animal{ //Dog를 Animal의 자식으로 만들어줌 (Dog와 Animal을 연결시키는 것)
	
	//data
//	private String name; //부모인 Animal 클래스에 적었으니까 자식 클래스에선 지우기
//	private char gender;
//	private double weight;
	
	//method
	
	public void catchBall() {}
	
	public void walk() {}

	public void cry() {
		System.out.println("멍멍");
	}
	
	
}//class
