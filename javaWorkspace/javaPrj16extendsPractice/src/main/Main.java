package main;

import mob.Ggobugi;
import mob.Pairi;
import mob.Pikachu;
import mob.Pokemon;

public class Main {

	public static void main(String[] args) {
		
		//포켓몬 생성
//		Pikachu pikachu = new Pikachu();
//		Pairi pairi = new Pairi();
//		Ggobugi ggobugi = new Ggobugi();
		             //상속 해줬으니까 v 아래처럼 Pokemon 으로 이름 바꾸기
		Pokemon pikachu = new Pikachu();
		Pokemon pairi = new Pairi();
		Pokemon ggobugi = new Ggobugi();
		
		//포켓몬 배열 생성
		Pokemon[] pArr = new Pokemon[3];
		pArr[0] = pikachu;
		pArr[1] = pairi;
		pArr[2] = ggobugi;
		
		
		
//		//모든 포켓몬 몸통 박치기
		for(int i = 0; i < pArr.length; i++) {
			pArr[i].bodyAttack();
		}
//		pikachu.bodyAttack();
//		pairi.bodyAttack();
//		ggobugi.bodyAttack();
		
		//모든 포켓몬 스킬 사용
//		pikachu.lightning();    //이렇게 쓰게 되면 Pokemon 클래스 안에 lightning, fire, waterCanon을 만들어 주라고 할텐데
//		pairi.fire();           //Pokemon 클래스는 포켓몬들이 공통으로 갖는 것들만 써줘야 하기 때문에, lightning, fire, waterCanon
//		ggobugi.waterCanon();  //이렇게 특색있는 것을 쓰면 안됨. so 각 포켓몬들의 스킬명을 공통적인 이름인 skill01로 이름을 바꿔주면 됨!
		
		pikachu.skill01();
		pairi.skill01();
		ggobugi.skill01();
		
	}//main

}//class
