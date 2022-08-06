package main;

import car.Car;
import car.benz.Glc;
import car.benz.Gls;
import car.tesla.Model3;
import car.tesla.ModelX;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("===== 추상메소드 연습 =====");
		
//		Car c1 = new Model3(); 
//		Car c2 = new ModelX(); 
//		Car c3 = new Glc();
//		Car c4 = new Gls();    
		//new Car();  //>>추상클래스라서 객체 생성 불가능
		
//		c1.go();
//		c2.go();
//		c3.go();
//		c4.go();
		
		Car[] carArr = new Car[4];
//		carArr[0] = c1;
//		carArr[1] = c2;
//		carArr[2] = c3;
//		carArr[3] = c4;
		// V 아래처럼 변경 가능
		carArr[0] = new Model3();
		carArr[1] = new ModelX();
		carArr[2] = new Glc();
		carArr[3] = new Gls(); 
		
//		carArr[0].go();
//		carArr[1].go();
//		carArr[2].go();
//		carArr[3].go(); 
		// V 아래처럼 변경 가능
		for(int i = 0; i < 4; ++i) {
			carArr[i].go();
		}
		
		//위 ^ for문을 향상된 for문으로 쓴다면
//		for(Car x : carArr) {
//			x.go();
//		}
		
		//코드를 한번에 정리하면,,
//		Car[] carArr = new Car[4];
//		carArr[0] = new Model3();
//		carArr[1] = new ModelX();
//		carArr[2] = new Glc();
//		carArr[3] = new Gls(); 
//
//		for(int i = 0; i < 4; ++i) {
//			carArr[i].go();
//		}
		
		

	}//main

}//class
