package main;

import mob.Agumon;
import mob.Digimon;
import mob.DigimonAction;
import mob.Padak;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("===== 인터페이스 연습 =====");
		
		Digimon agumon = new Agumon();
		agumon.setName("아구몬");
		agumon.setType("백신");
		
		Digimon padak = new Padak();
		padak.setName("파닥몬");
		padak.setType("백신, 데이터");
		
		System.out.println(agumon);
		System.out.println(padak);
		
		agumon.sayHello();
		agumon.attack();
		agumon.skill();
		
		padak.sayHello();
		padak.attack();
		padak.skill();
		
		//위에있는 아구몬이 진짜 아구몬이 맞는지 확인 (아구몬이라는 변수에 연결되어있는 객체가 어떤 객체인지 알아보기)
		if(agumon instanceof Agumon) {
			System.out.println("아구몬타입 맞음");
		}else {
			System.out.println("아구몬타입 아님");
		}
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}//main

}//class
