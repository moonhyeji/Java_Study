package com.test01;

public class MTest {

	
	
public static void main(String[] args) {
	
	
	// Super();<- 얘가 숨겨져 있음. 
	AA a = new AA();
	
	//부모 타입으로 자식객체 대입 
	Super s = a; // 가능! (동물 <- 고양이 대입 가능한 것처럼. ) 
	
	
	AA abc = (AA)s;    // <------가능.>
	System.out.println(abc); 
	
	
	
	
	//java.lang.ClassCastExcception
	//BB b = (BB) s;      //  < ------- s에 실제로 들어가있는건 AA객체인데,AA를BB로 바꾸려고 하니 안됨. 
	//System.out.println(b);
	
	
	
	
	
}
}
