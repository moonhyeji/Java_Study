package com.test01;

class MyThread implements Runnable {

	
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("i:" + i);
		}
	}

}

public class Thread01 {
	public static void main(String[] args) {
		//main thread의 우선순위가 높다.
		System.out.println("main Thread start!!");
		
		//Thread 가 아니다.
		/*
		MyThread t01 = new MyThread();
		MyThread t02 = new MyThread();
        t01.run();
        t02.run();
         */
		
		
		
		
		//Thread 이다.
	  Thread t01 = new Thread(new MyThread());//t01도 t02도 동시에 출력, 따라서 출력될 때마다 렌덤. 
	  Thread t02 = new Thread(new MyThread());// 

	  
	     //start() : 자동으로 run() 호출
	  t01.start();
	  t02.start();
	  
		
	  
	  // thread t01.t02를 실행시켜놓고 자기도 실행됨.
      System.out.println("main thread stop!!!");
      
      
      
	}

}
