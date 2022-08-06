package main;

import emp.CookEmployee;
import emp.CounterEmployee;
import emp.Employee;

public class Main {

	public static void main(String[] args) {

		System.out.println("===== 추상화 =====");
		
//		CounterEmployee counterEmp = new CounterEmployee();
			//>>굳이 CounterEmployee 타입 말고 아래처럼 Employee 타입으로 받아줘도 됨 (상속 받았으니까)
		Employee counterEmp = new CounterEmployee();
		Employee cookEmp = new CookEmployee();
		
//		//Employee들한테 청소하기를 시키려면..
//		counterEmp.clean();
//		cookEmp.clean();
		//^ 위에를 배열을 만들어서 아래처럼 작성 가능
		Employee[] empArr = new Employee[2];
		empArr[0] = counterEmp;
		empArr[1] = cookEmp;
		
		empArr[0].clean();
		empArr[1].clean();
		
//		new Employee();
		
		
		
		
		
		
	}//main

}//class
