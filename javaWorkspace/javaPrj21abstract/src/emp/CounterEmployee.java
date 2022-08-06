package emp;

public class CounterEmployee extends Employee {

//	//data		//>>부모 클래스인 Employee에 해당 내용 옮겨두고, extends Employee 해서 부모 클래스 상속받았으니까
//	private String nick;		//자식 클래스에선 내용 지우기
//	private int salary;
	
	//method
	public void receiveOrder() {
		System.out.println("주문 받을게요 ~");
	}

	public void sayHello() {
		System.out.println("어서오세요 ~");
	}
	
	public void clean() {
		System.out.println("카운터 청소 ~");
	}
	
}//class
