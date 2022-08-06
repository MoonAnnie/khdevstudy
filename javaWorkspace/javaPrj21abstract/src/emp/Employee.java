package emp;

public abstract class Employee {
	
	//data //>>CounterEmployee, CookEmployee에 있던 data 가져옴
	private String nick;
	private int salary;
	
	//method //>>CounterEmployee, CookEmployee가 공통으로 가지고 있는 method를 부모에게도 만들어 줌
	public abstract void clean();

}

