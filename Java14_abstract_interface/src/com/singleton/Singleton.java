package com.singleton;



//메모리영역(Heap)에 객체를 한번만 생성. 
public class Singleton {
	
	
	
	//# 싱글톤 만들기 위한 패턴 3가지 
	//1.생성자를 외부에서 생성하지 못하도록, private로 만든다. 
	private Singleton() {
		System.out.println("Singleton instance 생성!");
	}
	
	
	
	
  //2. 객체를 확인할주소를 담아줄 변수를 선언한다. 
	private static Singleton singleton;

	
	
	
	
  //3.객체를 생성해주는 메소드를 만든다.
	public static Singleton getInstance() {
	
		//만일 없으면 객체생성.
	if(singleton == null) {        //값이없으면
		System.out.println("new!");  // 새 객체 만들어서 주소값을 넣어놓음. 
		singleton = new Singleton();
		
	}else {
		System.out.println("exists!");
		
	}
	
	return singleton;
	
	}
}
