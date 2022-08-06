package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PracticeMap {

	public void test() {
		//맵 만들고, 모든 key, 모든 value 확인
		Map map = new HashMap();
		
		//data 집어넣기
		map.put("one", "apple"); //map에 one 이라는 key 와 apple 이라는 value 넣기
		map.put("two", "banana");
		map.put("three", "tomato");
		
		//map 의 모든 key 확인하기 (key 랑 value 한 쌍은 entry 라 부름)
		Set ks = map.keySet(); //map 안에 있는 entry들이 가지고 있는 모든 키값들을 뽑아서 하나의 Set 타입 객체에 넣어두자 
		for(Object x : ks) {											  //keySet 의 리턴타입이 Set 이니까
			System.out.println(x);
			System.out.println(map.get(x));
		}
		
	}//method
	
	public void test2() {
		
		Map map = new HashMap();
		
		//데이터 넣기
		map.put("apple", "red");
		map.put("banana", "yellow");
		map.put("grape", "purple");
		
		//모든 데이터 확인
		Set<Map.Entry> es = map.entrySet(); //Set에다가 generic 으로 Map.Entry 타입만 들어오게 만들어주면
		for(Map.Entry x : es) {  //이렇게 Object -> Map.Entry 로 바꿀 수 있음
//			x.getKey();  //이제 여기서 x 는 entry 다. //entry 에서 key 값을 가져온다는 뜻
//			x.getValue();
			//출력문을 이용해 확인
			System.out.println(x.getKey()); //나중에 key, value 를 따로 따로 관리해야 될 때가 생겨서 분리해둠
			System.out.println(x.getValue());

		}
	
		
	}//test2
	
	public void test3() {
		Map map = new HashMap();
		
		//데이터 넣기
		map.put("apple", "red");
		map.put("banana", "yellow");
		map.put("grape", "purple");
		
	}
	
}//class
