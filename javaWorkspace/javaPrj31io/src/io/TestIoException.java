package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//TestIo 클래스에다가 try catch 를 활용한 ver.
public class TestIoException {
	
	//출력
	public void testOutput() {
		//1.파일을 객체로써 생성하기
		File f = new File("C:\\dev\\hello.txt");
		System.out.println("파일 맞음? : " + f.isFile()); //f 가 파일이 맞는지 확인
		
		FileWriter fw = null;  //참조형의 기본 값인 null 을 넣어줌
		try {
			//2.파일에 꽂아줄 스트림 생성
			fw = new FileWriter(f); //FileWriter은 어떤 파일을 출력하는 거니까 파라미터로 그 파일을 넣어줘야 함(f)
			//3.스트림 사용
			fw.write("zzz");
			fw.flush();
			System.out.println("전송 완료 !"); //출력문이 없으면 전송이 잘 됐는지 알 수 없으니까 출력문 만듦
			
			
		}catch(IOException e) {
			System.out.println("파일 스트림 생성 중 예외 발생 !");
			System.out.println("에러 메세지 ::: " + e.getMessage()); //e라는 객체에서 메세지 가지고 오기
		}finally {
			//4.스트림 정리
			try {if(fw != null)fw.close();} catch (IOException e) {}
			
		}
		
		
	}
	
	//입력
	public void testInput() {
		//1.파일을 객체로써 생성하기
		File f = new File("C:\\dev\\hello.txt");
		System.out.println("파일 맞음? : " + f.isFile()); 
		
		BufferedReader br = null;
		try {
			//2.파일에 꽂아줄 스트림 생성 (연습 차 보조스트림 이용해봄)
			FileReader fr = new FileReader(f); //메인스트림 생성
			br = new BufferedReader(fr); //보조스트림 생성 - 보조스트림이니까 메인스트림 fr 을 끼어줘야 함
			
			//3.스트림 사용
			String s = "";
			while((s = br.readLine()) != null) { //= 보다는 != 가 먼저 실행이 되니까 앞이 먼저 실행되게 앞을 () 로 묶어줌
//				s = br.readLine(); //BufferedReader 사용했으니까 하나가 아니고 한 줄 (Line)
				System.out.println(s);
			}
		} catch (IOException e) {
			System.out.println("입력 스트림 예외 발생 !");
			System.out.println("예외 메세지 ::: " + e.getMessage());
		}finally {
			//4.스트림 정리
			try {if(br != null) br.close();}catch(IOException e) {}
		}
		
		
	}
	

}
