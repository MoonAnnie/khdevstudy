package mob;

public class Pokemon {
	
	//생성자 : 클래스명(..){}  <- 이렇게 쓰는 걸 생성자라고 부름 (현재 클래스 명을 똑같이 써주고 {} 하는 것)
	//생성자 오버로딩 가능
	
	//기본생성자(JVM이 만들어줌 (아무런 생성자도 없는 경우에만))
	public Pokemon() { 
		System.out.println("포켓몬 생성자 호출됨 ...");
	} //기본생성자를 만드는 것을 누락했더라도 JVM이 알아서 만들어줌

//	public Pokemon(String s) {
//		
//	}
//	
//	public Pokemon(String s, int hp) { //같은 Pokemon이지만 뒤에 붙은 파라미터 값이 다르니까 이렇게 여러개 생성 가능 
//									  //생성자도 메서드처럼 오버로딩 가능함
//	}
	
	//(모든 필드에 대한) 매개변수가 있는 생성자
	public Pokemon(String name, int hp, int atk) {
		System.out.println("매개변수가 있는 생성자 호출됨 ~~~");
		this.name = name; //현재 객체를 가르키기 위해 this.를 붙임
		this.hp = hp;
		this.atk = atk;
	}
	
	//data
	//이름 공격력 hp
	private String name;
	private int atk;
	private int hp;
	
	//method
	//공격하기 회피하기 도망가기
	public void attack() {
		System.out.println(name + "의 공격 !!! ");
	}
	
	public void evade() {
		System.out.println("피함 ^^");
	}
	
	public void giveUp() {
		System.out.println("도망감 ㅠㅠ");
	}
	
	//getter/setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public String toString() {
		return "Pokemon [name=" + name + ", atk=" + atk + ", hp=" + hp + "]";
	}
	
}
