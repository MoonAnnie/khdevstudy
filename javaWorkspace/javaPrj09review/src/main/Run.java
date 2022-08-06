package main;

import array.ArrayTest;
import bool.BooleanTest;
import operator.OperTest;
import print.PrintTest;  //print 패키지의 PrintTest 클래스를 가져다 쓰겠다는 뜻 (패키지는 소문자, 클래스는 대문자)
import variable.VarTest;

public class Run {

	public static void main(String[] args) {

		System.out.println("===== review =====");
		
//		PrintTest pt = new PrintTest();
//		pt.test();
		
//		VarTest vt = new VarTest();
//		vt.test();
		
//		OperTest ot = new OperTest();
//		ot.test();
		
//		ArrayTest at = new ArrayTest();
//		at.test();
//		at.test2();
//		at.test3();
//		at.test4();
//		at.test5();
		
		BooleanTest bt = new BooleanTest();
		bt.test();
		
		
		
		
	}//main

}//class
