package com.test02;

public class Cat extends Animal {

	
	public Cat() {
		System.out.println("고양이");
	}
	
	
	
	
	//@~~ : annotation
	@Override          //: 재정의 : 부모의 메소드를 내맘대로 바꿈. 
	public void bark() {     //<- 부모메소드 내맘대로 바꿀거>
		super.bark();        // <-울음소리 : >
		System.out.println("야옹");
		
	}
	
	
     public void eat() {
    	 System.out.println("냠냠");
     }
	
	
}
