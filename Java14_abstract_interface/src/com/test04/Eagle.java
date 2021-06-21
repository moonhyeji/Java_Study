package com.test04;

public class Eagle extends Animal implements Bird {

	
	
	//버드라는 임플리먼트가 가지고 있는 플라이 라는 추상메소드 를 오버라이드함. 
	@Override
	public void fly() {        
		   System.out.println("파닥파닥");
	}

	
	
	
	
	
	
	
	// animal이라는 추상클래스가 가지고 있던 바크라는 추상메소드.
	@Override
	public void bark() {
 System.out.println("삑삑");
		
		
		
	}

}
