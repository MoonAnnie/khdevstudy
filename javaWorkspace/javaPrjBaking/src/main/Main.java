package main;

import select.Cookie;
import shopping.CookieShopping;

public class Main {

	public static void main(String[] args) {
		
		//쿠키의 종류 : 초코칩(cc) , 플레인(pl), 딸기(sb)

		Cookie cc = new Cookie();
		
		Cookie pl = new Cookie();
		
		Cookie sb = new Cookie();
		
		//재료 쇼핑
		CookieShopping cs = new CookieShopping();
		cs.bakingStart(Cookie cc, Cookie pl, Cookie sb);
		
		
		
		
	}//main

}//class
