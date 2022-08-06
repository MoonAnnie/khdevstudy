package main;

import java.util.Map;

import mob.Pikachu;
import person.Trainer;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("===== 포켓몬 =====");
		
		Trainer t = new Trainer("지우", 1);
		
		//포켓몬 생성
		Pikachu p = new Pikachu("피카츄", 7, 3, 100);
		
		//포켓몬 주머니에 넣기
//		Map pocket = t.getPocket(); //pocket은 Map 타입이니까
//		pocket.put("피카츄", p);     //어차피 p에는 피카츄가 들어있으니까 "피카츄"라고 이름을 안 쓰고 아래처럼 해도 됨
//		pocket.put(p.getName(), p);
		
		//위 코드는 Trainer에 신규로 addPokemon 메소드 생성해두면 아래 처럼 변경 가능
		t.addPokemon(p);

		System.out.println(t.getPokemonCnt());
		

		
		
		
		
	}//main

}//class
