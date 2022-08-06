package battle;

import mob.Pokemon;

public class BattleManager {

	public void battleStart(Pokemon user, Pokemon enemy) {
		
		boolean isFinish = false;  //inFinish 가 true 면 배틀 종료
								  //처음 부터 배틀이 끝나는게 아닐테니까 boolean 값은 false로 둠
		
		do{
			//공격하기
			user.attack();
			calcDamage(enemy, user); //데미지 계산
			
			//판단
			isFinish = checkDead(enemy);
			if(isFinish) {
				break;
			}
			
			//공격하기
			enemy.attack();
			calcDamage(user, enemy); //데미지 계산
			//판단
			isFinish = checkDead(user);
		}while(!isFinish); //finish가 아닐 때 반복해야됨
		
		System.out.println("배틀 종료 ~~~");

	}//battleStart

	//데미지 계산
	public void calcDamage(Pokemon defender, Pokemon attacker) {
		int result = defender.getHp() - attacker.getAtk(); //defender 라는 변수의 getHp라는 메서드를 호출하라는 뜻
		defender.setHp(result);
		System.out.println("데미지 : " + attacker.getAtk());
		System.out.println(defender.getName() + "의 남은 체력 : " + defender.getHp());
		System.out.println("---------------------");
	}
	
	//체력 0 이하 인지 판단
	public boolean checkDead(Pokemon p) { //아래 return 값이 있으니까 void 가 아니라 boolean 으로 작성
		if(p.getHp() <= 0) {
			System.out.println(p.getName() + "죽음...ㅜㅜ");
			return true;
		}else {
			return false;
		}
	}
	

	
	
	
	
	
	
	
	
}//class
