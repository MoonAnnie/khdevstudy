package temp;

public class TestMain {

	public static void main(String[] args) {
		
		System.out.println("향상된 for문");
		
		//enhanced for
		int[] arr = new int[10];
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 3;
		arr[4] = 4;
		arr[5] = 5;
		arr[6] = 6;
		arr[7] = 7;
		arr[8] = 8;
		arr[9] = 9;
		
		for(int i = 0; i < 10; i++) {
			arr[i] *= 10;  //>>arr[i] = arr[i]*10
		}
		
//		for(int i = 0; i < 10; i++) {
//			System.out.println(arr[i]);
//		}
		
		// V 아래처럼 작성 가능

		//향상된 for문   //>> 배열에 있는 것을 하나씩 넣어주는 것
		for(int x : arr) {
			System.out.println(x);
		}
		
		
		
		

	}//main

}//class
