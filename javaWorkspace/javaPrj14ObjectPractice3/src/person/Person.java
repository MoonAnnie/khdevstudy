package person;

public class Person {
	
	//(파라미터 있는)생성자
	public Person(String s, int x, char c) {
		this.name = s;   //여기서 name은 현재 클래스의 현재 객체가 가진 name을 의미하고 싶다 => this.name
		age = x;
		gender = c;
	}
	
	//date （private 으로 만들었기 때문에 getter, setter, toString 작성해야함)
	private String name;
	private int age;
	private char gender;
	
	//method
	public void sayHello() { //sayHello라는 메소드
		System.out.println("hello, 나는 " + name); //현재 객체가 가진 name 을 출력하기 위해 this.name 붙이면 좀 더 명확
	}										//하지만 현재는 name 이 하나니까 그냥 쓰기로~

	//getter, setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	
	//toString
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
	
	
	
	
	

}//class
