package main;

import java.io.IOException;

import logIn.LogIn;
import movie.Movie;
import signIn.SignIn;

public class Main {

	public static void main(String[] args) throws IOException {
		
		//로그인
		LogIn l1 = new LogIn();
		l1.logInStart();

		//회원가입
		SignIn s1 = new SignIn();
		s1.signInStart();
		s1.myLogIn();
		
		//영화 예매
		Movie m1 = new Movie();
		m1.movieReg();
		
		
		
		
	}

}
