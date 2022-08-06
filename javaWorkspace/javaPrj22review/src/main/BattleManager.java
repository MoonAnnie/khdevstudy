package main;

import food.Chicken;

public class BattleManager {

	public static String name = "배틀매니저"; //static 을 붙이는 순간 클래스 변수가 됨 -> static은 어디서든 사용이 가능해짐
		
	//data
	private boolean isFinish;
	
	
	//getter, setter
	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		BattleManager.name = name;
	}

	public boolean isFinish() {
		return isFinish;
	}

	public void setFinish(boolean isFinish) {
		this.isFinish = isFinish;
	}

	//method
	public void test01() {
		System.out.println("name : " + name);
		System.out.println("GameManager.name : " + GameManager.name);
		System.out.println("BattleManager.name : " + BattleManager.name);
		System.out.println("Chicken.name : " + Chicken.name);
	}
	
}
