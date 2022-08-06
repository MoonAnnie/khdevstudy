package person;

public class Person {
	
	private String name;     
	private String addr;
	private int birth;
	private char gender;
	private int age;   //public은 현재 클래스 내에서만 사용이 가능 
					  // so 아래처럼 public 으로 메서드를 만들어서 우회방법으로 나이를 한살 씩 더 먹을 있도록 함
	
	//name
	public void setName(String name) {
		this.name = name;         //name 앞에 this. 를 붙인 이유는, 위에 private 필드 부분에 name과 겹치기 때문
	}							 // this. = 현재 객체를 의미
	
	public String getName() {
		return name;
	}
	
	//addr
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getAddr() {
		return addr ;   //여기에 있는 addr도 필드에 있는 addr 이라 this.addr 하면 더 명확하지만,
						// 메소드 명이 addr 이 아니고 getAddr로 안겹치니까 this. 안써도 됨
	}
	
	//birth
	public void setBirth(int birth) {
		this.birth = birth;
	}
	public int getBirth() {
		return birth;
	}
	
	//gender
	public void setGender(char gender) {
		this.gender = gender;
	}
	public char getGender() {
		return gender;
	}
	
	//age
	public void setAge(int age) {
		if(this.age < age) {
			this.age = age;  //만약에 내가 전달받은 age 가 this. age 보다 클때
		}				    // 그 age로 기존 age 변경하기 (원래 20살이었는데 나중에 잘못해서 17살로 입력 되는걸 방지)
	}					   //직접 셋팅하지 않고 메소드를 통해서 값을 변경함
	public int getAge() {
		return age;
	}

}
