package com.test01;

public class Dog extends Animal {

	@Override
	public void bark() {
          System.out.println("멍멍");		
	}

	
	//도그에 빨간줄 나와잇을 때 add unimplement method누르면 
	@Override
   public void eat(String feed) {
		System.out.print("멍멍이가");
		super.eat(feed);
		
	}
	
	// eat -> 해도되고 안해도 되고.
	

}
