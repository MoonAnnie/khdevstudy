package main;

public interface Car {

	//data
	/* public static final */int value = 10; //>>public static final 을 앞에 안붙여도 됨
	String str = "zzz";
	double weight = 80.14;
	
	
	//method
//	public abstract void go(); //>>인터페이스는 추상메소드만 가질 수 있으니까 abstract를 붙여줘야 함
	// V이렇게만 써도 됨		  //>>but 인터페이스는 추상메소드만 가질 수 있으니까 abstract이나 public을 안써줘도 됨
	void go(); 
	void stop();
	
	
}
