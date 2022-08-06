package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class TestIo {
	
	public void test() throws Exception{
		
		File f = new File("C:\\dev\\hello.txt");
		
		//파일 맞는지 확인
		System.out.println(f.isFile());
		
		//데이터 읽기 (1byte 단위로 읽기)
//		FileInputStream fis = new FileInputStream(f); //파일 객체 f 를 이용해서 stream 만듦
		
		
//		for(int i = 0; i < 13; ++i) {
//			int result = fis.read();
//			System.out.println((char)result);
//		}
		//내가 파일에 몇 글자가 적혀있는지 모를 땐 범위를 어떻게 지정해야 될까? 일일이 글자 수를 세야 할까?
		//범위를 i < 999 이런 식으로 크게 잡으면 되겠지만.. 출력할 글자가 없을 땐 무한히 많은 공백들이 출력이 될 것임
		//더 이상 출력할 글자가 없을 땐 -1이 출력되는 것을 이용해서 while 문으로 바꿔줌
		
//		while(true) {
//			int result = fis.read();
//			if(result == -1) {
//				break;
//			}
//			System.out.print((char)result);
//		}
		
		//반대로 만드는 법
//		int result = 0; //밑에 while 문 조건에 result 넣어야 하는데 result 값이 없으니까 선언해서 만들어줌
//		while(result != -1) {
//			result = fis.read();
//			System.out.print((char)result);
//		}
		
//		int result = 0; 
//		while((result = fis.read()) != -1) {
//			System.out.print((char)result);
//		}
		
					                   //수레 역할을 하는 보조 스트림인 BufferedReader 을 사용해서 메인스트림인 FileReader와 연결
		//데이터 읽기 (보조스트림 사용해서 데이터 읽기)	// 더 빠르게 읽어오기 가능하고, 한 줄 단위로 읽어오기도 가능함
		BufferedReader br = new BufferedReader(new FileReader(f)); 
//		String s = br.readLine();
//		System.out.println(s);
		//반복문을 이용하면.. 현재 줄에서 마지막 줄까지 읽어들일 수 있음
		String s = " "; //우선 빈 문자로 s 를 만들어줌
		while((s = br.readLine()) != null) {
			System.out.println(s);
		}
		
//		for(int i = 0; i < 2; ++i) {
//			String s = br.readLine();
//			System.out.println(s);
//		}
		
		//사용한 자원(stream) 반납 //안 그러면 컴퓨터가 계속 가지고 있음
		br.close();

		
	}//method
	
	public void test2() throws Exception {
		//문자열 입력받기
		System.out.print("문자열을 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		//출력 테스트
		
		//파일 가져오기
		File f = new File("C:\\dev\\hello.txt");
		System.out.println(f.isFile()); //f가 파일이 맞는지 확인
		
		//통로 만들기
		FileWriter fw = new FileWriter(f, true);  //Exception 생겨서 throws Exception 처리함
		//그냥 이렇게 쓰면 느리니까 보조 스트림을 사용함
		BufferedWriter bw = new BufferedWriter(fw); //괄호 안에 Writer에 해당하는걸 넣어줘야 하는데 FileWriter가 Writer임
		
		//통로 이용해서 보내기
		bw.write(str); //데이터 내보내기
		bw.flush();   //그냥 잘 내보내지면 좋지만.. 가끔 통로게 끼게 되는 경우가 있음.. 그럴 때 뚫어뻥처럼 밀어주는 역할
		bw.close(); //사용한 자원 반납
		System.out.println("write 완료함"); //위에 실행문이 실행 됐는지 확인하기 위해 출력문을 추가한 것뿐
		
		
		
	}
	
	
	
	

}//class
