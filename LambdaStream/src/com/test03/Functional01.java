package com.test03;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class Functional01 {
	public static void main(String[] args) {
		 UnaryOperator<String> hello = (name) -> "Hello, " + name;  //람다표현식 (메소드없음) // 함수 만들어 놓고,  
		 System.out.println(hello.apply("lambda!"));  // 값을 주면 ,값에 대한 결과가 나옴. 
		 //UnaryOperator가 하나의  function이라고 생각해도됨. 
		 
		 BinaryOperator<Integer> sum = (i,j) -> i+j;
		 System.out.println(sum.apply(10, 3));
		 
		 System.out.println(sum.andThen((n) -> n * 2).apply(10,3));  //apply한 이후에 andThen() 안을 실행해주러ㅏ.  //더해준 결가 andTheen() 안에 어감.
		
	}
}
