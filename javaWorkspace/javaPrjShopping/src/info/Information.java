package info;

public class Information {
	
	private String name;
	private String birth;
	private String number;
	
	public void InfoStart() {
		
	}
	//getter, setter 생성
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
	public String toString() {
		return "Information [name = " + name + ", birth = " + birth + ", number = " + number + "]";
	}

}//class