package main;

import exception.TestException;

public class Main {

	public static void main(String[] args) {

		TestException te = new TestException();
		
		try {
			te.test01();
		}catch(Exception e) {
//			System.out.println("뭔가 사고 발생 ...");
			String s = e.getMessage();
			System.out.println(s);
		}
		
	}//main

}//class
