package com.kh;

public class Main {

	public static void main(String[] args) {
		System.out.println("===== 쓰레드 =====");
		
		//방법1
		Thread t1 = new Thread( ()->{
			for(int i = 1; i <= 100; ++i) {
				String name = Thread.currentThread().getName();
				System.out.println(name + " : " + i);
			}
		} );
		
		t1.start();
		
		//방법2
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i = 1; i <= 100; ++i) {
					String name = Thread.currentThread().getName();
					System.out.println(name + " : " + i);		
				}
			}
		});
		t2.start();
		
		//방법3 -> 강사님은 이 방법을 많이 씀 (코드는 짧은 것보다 책을 쓰는 것처럼 쓰는게 좋음)
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				for(int i = 1; i <= 100; ++i) {
					String name = Thread.currentThread().getName();
					System.out.println(name + " : " + i);		
				}
			}
		};
		
		Thread t3 = new Thread(r); //Thread t3 = new Thread(할일);
		t3.start();
		
		//방법4
		Thread t4 = new Thread(new MyRunner());
		t4.start();
		
		
		//1~10 출력(기본)
		for(int i = 1; i <= 100; ++i) {
			String name = Thread.currentThread().getName();
			System.out.println(name + " : " + i);		
		}
	}

}

//쓰레드가 하나면 = 일 하나밖에 못시킴
//쓰레드는 어디에 쓸까? -> ex. 채팅프로그램
