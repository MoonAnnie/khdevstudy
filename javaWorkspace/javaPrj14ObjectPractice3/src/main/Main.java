package main;

import animal.Animal;
import person.Person;
import pokemon.Pokemon;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("===== 연습 =====");
		
		//사람 2명 만들기
		Person p1 = new Person("문동주", 29, 'F');
//		p1.setName("문동주"); //파라미터로 넣었으니까 지워주기
		
		Person p2 = new Person("문혜령", 32, 'F');
//		p2.setName("문혜령");
		
		p1.sayHello();
		p2.sayHello();
		
		Animal a1 = new Animal("강아지", 20.5);
		
		a1.introduce();
		
		Pokemon pk = new Pokemon("피카츄", 50, 60);
		pk.imPokemon();
		

		
	}//main

}//class
