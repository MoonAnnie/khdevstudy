package main;

import person.Person;

public class Main {

	public static void main(String[] args) {

		System.out.println("===== 객체 배열 =====");
		
//		Person p1 = new Person("문동주", "한국", 20, 'F'); //아래 배열 코드로 옮겨두고 지우기
//		Person p2 = new Person("문동주2", "한국", 21, 'F');
//		Person p3 = new Person("문동주3", "한국", 22, 'F');
//		Person p4 = new Person("문동주4", "한국", 23, 'F');
//		Person p5 = new Person("문동주5", "한국", 24, 'F');

		Person[]personArr = new Person[5];
		personArr[0] = new Person("문동주", "한국", 20, 'F');
		personArr[1] = new Person("문동주2", "한국", 21, 'F');
		personArr[2] = new Person("문동주3", "한국", 22, 'F');
		personArr[3] = new Person("문동주4", "한국", 23, 'F');
		personArr[4] = new Person("문동주5", "한국", 24, 'F');
		
//		System.out.println(personArr[0]);
//		System.out.println(personArr[1]);
//		System.out.println(personArr[2]);
//		System.out.println(personArr[3]);
//		System.out.println(personArr[4]);
			//아래처럼 반복문으로 바꿔주기
		for(int i = 0; i < personArr.length; i++) {
			System.out.println(personArr[i]);
		}


		
		
		
	}//main

}//class
