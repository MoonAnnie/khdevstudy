package collection;

import java.util.HashSet;
import java.util.Set;

public class TestSet {
	
	public void testMethod() {
		
		//Set 의 HashSet 을 활용
		/*
		 * Set 은 순서 없음
		 * Set 은 중복 없음
		 */
		Set hs = new HashSet(); //HashSet은 Set이라는 인터페이스를 상속받고 있으니까 HashSet -> Set으로 바꿈
		
		//값 넣기
		hs.add("one");
		hs.add("two");
		hs.add("three");
		hs.add("four");
		hs.add("five");
		hs.add("six");
		hs.add("one");
		hs.add(3.14);
		hs.add(100);
		hs.add(true);
		hs.add(false);
		
		//사이즈 확인
		System.out.println(hs.size());
		
		//포함 여부 확인
		System.out.println(hs.contains("one"));
		
		//전부 지우기
//		hs.clear();
		
		//비어있는지 확인
		System.out.println(hs.isEmpty());
		
		//요소 삭제
		hs.remove("three");
		hs.remove(3.14);
		
		
		
		System.out.println("------------------");
		//Set 의 모든 요소 확인
		for(Object x : hs) { //hs의 모든 요소를 x에 담아서 x를 출력
			System.out.println(x);
		}
		
		System.out.println("------------------");

		Object[] result = hs.toArray();
		System.out.println(result[0]);
		System.out.println(result[1]);
		System.out.println(result[2]);
		System.out.println(result[3]);
		System.out.println(result[4]);

		
		
		
		
		
	}//method

}//class
