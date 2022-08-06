package animal;

public class Animal {
	
	public Animal(String name, double weight) {
		this.name = name;
		this.weight = weight;
	}

	private String name;
	private double weight;
	
	//method
	public void introduce() {
		System.out.println("저는 : " + name + " 이고, 제 몸무게는 : " + weight + " kg 입니다.");
	}

	//getter, setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	//toString
	public String toString() {
		return "Animal [name=" + name + ", weight=" + weight + "]";
	}
	
	
	
}
