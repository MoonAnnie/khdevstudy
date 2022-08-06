package mob;

public abstract class Digimon implements DigimonAction { //2)아래 추상메소드가 있으니까 추상클래스로 만들어줌
	
	//data
	protected String name; //3)private field 있으니까 getter, setter, toString 만들기
	protected String type;
	
	//method
//	public abstract void attack(); //1)추상메소드니까 바디 없이 작성
//	public abstract void skill();                         //4)여기 두 추상메소드를 DigimonAction인터페이스로...
	
	//getter, setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "Digimon [name=" + name + ", type=" + type + "]";
	} 
	
	//method
	public void sayHello() {
		System.out.println("나는 디지몬이야 ㅎㅎ");
	}
	
	
	
}
