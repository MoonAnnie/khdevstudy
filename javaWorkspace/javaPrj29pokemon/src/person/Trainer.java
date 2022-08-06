package person;

import java.util.HashMap;
import java.util.Map;

import mob.Pokemon;

public class Trainer {
	
	//생성자
	public Trainer(String name, int level) {
		this.name = name;
		this.level = level;
//		this.pocket = pocket; //poket은 받을 필요 없어서 삭제
	}
	
	
	//data
	private String name;
	private int level;
//	private Map pocket; //타입을 쓸 땐 구체적인 HashMap이 아니고 상위타입인 Map으로 쓰는게 일반적이다.  
	private final Map<String, Pokemon> pocket = new HashMap<>(); //위처럼 쓰면 null 가르키게 되니까 HashMap이라는 객체를 만들어줌
	//key 값에는 String, value 값에는 Pokemon 만 들어갈 수 있게 만들기
	//pocket 을 재할당이 불가능하게 final로 만듦
	//pocket 이라는 변수에 다른 것을 넣는게 싫어서.. 

	
	//method
//	public Pokemon getPikachu() {
//		Pokemon p = pocket.get("피카츄"); //HashMap을 보면 피카츄는 pocket에 들어있기 때문에 pocket.get(name)
//		return p;					 //피카츄를 p의 변수에 담고 Pokemon 타입으로 지정하기 (Object -> Pokemon)
//	}
// 
//	public Pokemon getKkobuki() {
//		Pokemon p = pocket.get("꼬부기");
//		return p;
//	}
//	
//	public Pokemon getPairi() {
//		Pokemon p = pocket.get("파이리");
//		return p;
//	}
	
		//포켓몬들을 불러오는 메소드는 아래처럼 하나의 메소드로 정리 가능
	
	public Pokemon getPokemon(String name) {
//		Pokemon p = pocket.get(name);
//		return p;
		//아래 한줄로 작성 가능
		return pocket.get(name);
	}
	
	public void addPokemon(Pokemon p) {
		pocket.put(p.getName(), p); //포켓에다가 포켓몬의 이름, 포켓몬 객체를 넣어줌
	}


	//getter, setter
	
	public String getName() {
		return name;
	}


//	public void setName(String name) {
//		this.name = name;
//	}//필요없음


	public int getLevel() {
		return level;
	}


	public void setLevel(int level) { //레벨이 더 떨어질 리가 없으니까..
		if(level > this.level) {
			this.level = level;
		}else {
			System.out.println("레벨은 현재 레벨보다 낮아질 수 없습니다.");
		}
	}


//	public Map<String, Pokemon> getPocket() {
//		return pocket;
//	} //밖에서 못 건들이게 지우기


//	public void setPocket(Map<String, Pokemon> pocket) {
//		this.pocket = pocket;
//	} //필요없음

	
	public int getPokemonCnt() { //호출하면 현재 내가 가진 포켓몬 숫자 알려주는 함수
		return pocket.size();
	}
	
}
