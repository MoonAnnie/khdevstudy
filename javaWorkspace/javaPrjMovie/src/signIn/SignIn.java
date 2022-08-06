package signIn;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SignIn {
	Scanner sc = new Scanner(System.in);

	public void signInStart() {
		// 파일 객체 생성
		File f = new File("C:\\dev\\Java Cinema_Membership.txt");
		
		try(FileWriter fw = new FileWriter(f);
			BufferedWriter br = new BufferedWriter(fw)) {
			System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
			System.out.println("■              2.회원 가입              ■");
			System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");

			System.out.println("▶ 회원가입을 시작합니다.");
			System.out.println("");
			// 스트림 사용
			System.out.print("- ID : ");
			String inputId = sc.nextLine();
			
			System.out.print("- PWD : ");
			String inputPwd = sc.nextLine();
			
			
			fw.write(inputId);
			fw.write(inputPwd);
			fw.flush();
			
			System.out.println("▷ " +inputId+ "님 Java Cinema 회원가입을 축하드립니다 :)");
			System.out.println("▷ 로그인 하려면 (enter) 키를 눌러 주세요.");
			String enter = sc.nextLine();
			
		} catch(IOException e) {

			System.out.println("파일 스트림 생성 중 예외 발생 !");
			System.out.println("에러 메시지 ::: " + e.getMessage());

		} 
		
	}

	public void myLogIn() {
		
		while(true) {
			System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
			System.out.println("■              3. 로그인                ■");
			System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
			System.out.println("▶ 로그인해 주세요.");
			System.out.println("");
			
			System.out.print("- ID : ");
			String inputId = sc.nextLine();
			
			System.out.print("- PWD : ");
			String inputPwd = sc.nextLine();
			
			// 파일 객체 생성
			File f = new File("C:\\dev\\Java Cinema_Membership.txt");
			
			try(FileReader fr = new FileReader(f);
				BufferedReader br = new BufferedReader(fr);) {
				
				String s = br.readLine();
				
				if(s.contains(inputId+inputPwd)) {
					System.out.println("▷ 로그인되었습니다.");
					System.out.println("▷ 영화를 선택하려면 (enter) 키를 눌러 주세요.");
					String enter = sc.nextLine();
					break; //로그인 성공 시 반복문 탈출
				}else {
					System.out.println("▷ ID 혹은 PWD 오류입니다. 다시 로그인해 주세요.");
				}
				
			} catch (IOException e) {
				System.out.println("입력 스트림 예외 발생 !");
				System.out.println("예외 메시지 ::: " + e.getMessage());
			}
		}
		

		
	}

}
