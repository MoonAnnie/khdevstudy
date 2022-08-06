package pokemon;

public class Pokemon {
	
	public Pokemon(String name, int atk, int def) {
		this.name = name;
		this.atk = atk;
		this.def = def;
	}
	
	private String name;
	private int atk;
	private int def;
	
	//method
	public void imPokemon() {
		System.out.println("이름 : " + name + ", 공격력 : " + atk + ", 방어력 : " + def);
	}

	//getter, setter
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

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}

	
	public String toString() {
		return "Pokemon [name=" + name + ", atk=" + atk + ", def=" + def + "]";
	}
	
	


	
	
	
}
