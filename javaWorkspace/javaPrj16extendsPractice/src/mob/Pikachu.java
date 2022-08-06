package mob;

public class Pikachu extends Pokemon { //Pikachu가 Pokemon을 상속 받게끔 해둠

//	//data
//	private int atk;    //Pokemon 클래스에 넣어두고 여긴 지우기
//	private int def;
//	private int hp;
	
	
	//method
//	public void lightning() {   //이름을 lightning 이라고 써두면 추후 Pokemon 클래스에 넣어둘 수 없음 (lightning는 피카츄에만 해당하는 거라) 
	public void skill01() {    //so 이름을 공통으로 쓸 수 있는 skill로 바꿈
		System.out.println("백만볼트 ~~~ !");
	}
	
//	public void bodyAttack() {
//		System.out.println("몸통 박치기 ~~~");  //피카츄, 파이리, 꼬부기 공통되는 거니까 Pokemon에 넣어두고 나머진 지우기
//	}
	
	
}//class
