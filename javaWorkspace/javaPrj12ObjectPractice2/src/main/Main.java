package main;

import battle.BattleManager; //+ 표시 누르면 숨김처리 된 import 된 모든 부분 다 나옴
import game.GameManager;
import mob.Pokemon;

public class Main {

	public static void main(String[] args) {

		Pokemon p1 = new Pokemon("피카츄", 100, 30); //원래 이 new Pokemon();이란 생성자를 쓰려면 
													//Pokemon 클래스에 생성자를 만들어줘야 하는데
		Pokemon p2 = new Pokemon("파이리", 100, 25);
		
		//게임 시작
		GameManager gm = new GameManager();  //gm 의 타입은 ref. 참조변수
		gm.gameStart(p1,p2);
		
		//배틀 시작
		BattleManager bm = new BattleManager();  //bm의 타입은 int, String 이 아니라 BattleManager
		bm.battleStart(p1, p2);
		
		
		
	}//main  >> 여기에 도달하면 프로그램 종료

}//class
