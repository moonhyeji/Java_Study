package com.test01;

public abstract class Animal {
	
	
	
	public void eat(String feed) {
		System.out.println(feed + "먹는다.");
	}

	
	//추상메소드 -> 상속받는 자식 클래스가 반드시 구현되어야 한다. 
	
	public abstract void bark();
	
	
	
	
	
}
