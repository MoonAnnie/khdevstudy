package mob;

public class Agumon extends Digimon /* implements DigimonAction */ {

	@Override
	public void attack() {
		System.out.println(/*super.getName()*/ name + " 공격 !"); 
	}					//>>현재 객체의 부모에 가서 부모가 가지고 있는 멤버 중 getName이라는 메소드를 호출하라는 것
					   //>>아구몬 입장에서 super(부모) 는 Digimon 이다 
					  //>>Digimon에서 getName은 return this.name을 전달함
					 //>>근데 super.getName이 아닌 그냥 getName()만 써도 됨
					//>>왜냐하면 getName을 현재 클래스에서 찾아보고, 없으면 부모클래스에 가서 찾을텐데
				   //>>아구몬에 getName 없으니까 Digimon에 있는 getName을 찾아가게됨
	              //>>Digimon에서 자식 클래스한텐 쓰게해주기 위해 private이 아닌 protected로 바꿔줘서 그냥 name으로만 써도 됨
	
	@Override
	public void skill() {
		System.out.println(super.getName() + " 꼬마불꽃 !");
	}

	@Override
	public void sayHello() {
		super.sayHello();
//		System.out.println("나는 아구몬이야 ~~~ !");
	} 
	
	
	

}
