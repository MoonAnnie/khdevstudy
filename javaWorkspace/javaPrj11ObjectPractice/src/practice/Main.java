package practice;

public class Main {

	public static void main(String[] args) {

		Food f1 = new Food();
		
		//f1에다 값 넣기
		f1.setCal(350);
		f1.setIsDouble('Y');
		f1.setMenu("제육볶음");
		f1.setPrice(9000);
		
		//값 출력
		System.out.println(f1);	//to String 작성 없이 그냥 f1 출력하기 하면 오류남


		
		
		
	}//main

}//class
