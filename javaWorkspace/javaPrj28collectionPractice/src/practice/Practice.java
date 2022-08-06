package practice;

import java.util.HashSet;
import java.util.Set;

public class Practice {
	
	public void test() {
		
		Set set = new HashSet();
		set.add("chicken");
		set.add("pizza");
		set.add("hamburger");
		set.add("pasta");

		//set 의 모든 요소 꺼내기 (by 향상된 for문)
		for(Object x : set) { //set을 하나씩 꺼내서 x 라는 변수에 넣어주는데 x의 타입은 Object (실제는 string 일지라도..)
			System.out.println(x);
		}
		
		//배열로 꺼내기
		System.out.println("--------------------");
//		Object[]arr = set.toArray(); //set을 가지고 배열의 형태로 만들기
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
			//V 반복문으로 정리
//		for(int i = 0; i < arr.length; ++i) {
//			System.out.println(arr[i]);
//		}
//			//아래처럼 재 정리 가능
//		for(Object x : arr) {
//			System.out.println(x);
//		}

		
		
		
	}//method

}//class
