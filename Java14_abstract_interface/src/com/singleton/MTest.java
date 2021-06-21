package com.singleton;

public class MTest {

	
	
	public static void main(String[] args) {
		
		
		//Singleton s = new Singleton();
		//이렇게 하고싶은데 못하는 이유 -> 생성자가 private라서 객체생성을 밖에서 못함.
	
      Singleton st01 = Singleton.getInstance();
      System.out.println(st01);
	
      Singleton st02 = Singleton.getInstance();
      System.out.println(st02);

      
      
      System.out.println(st01 == st02);
      System.out.println(st01.hashCode());
      System.out.println(st02.hashCode());
	}
}
