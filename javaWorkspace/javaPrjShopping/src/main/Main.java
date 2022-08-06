package main;

import info.Information;
import logIn.LogIn;
import payment.Payment;
import shopping.Shopping;

public class Main {

	public static void main(String[] args) {
		
		//로그인
		LogIn li = new LogIn();
		li.logInStart();

		//로그인 정보
		Information i = new Information();
		i.InfoStart();
		
		//쇼핑 
		Shopping s = new Shopping();
		s.ShoppingStart();
		
		//결제
		Payment p = new Payment();
		p.PaymentStart();

	}//main

}//class