package mob;

public abstract class Pokemon { //포켓몬을 실제 객체로 만들지 않기 위해 추상화 클래스로 만듦

	//생성자
	public Pokemon(String name, int atk, int def, int hp) {
		this.name = name;
		this.atk = atk;
		this.def = def;
		this.hp = hp;
	}
	
	//data (field)
	private String name;
	private int atk;
	private int def;
	private int hp;
	
	//method
	public abstract void bodyAttack(); //포켓몬 클래스를 상속받는 모든 클래스가 이 메소드를 꼭 가지고 있길 원해서
									  //추상메소드로 만듦 {} 삭제
	public abstract void skill();
	public int getAtk() {
		return atk;
	}
	public void setAtk(int atk) {
		this.atk = atk;
	}
	public int getDef() {
		return def;
	}
	public void setDef(int def) {
		this.def = def;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public String getName() {
		return name;
	}
	
	//getter, setter
	
	
}
