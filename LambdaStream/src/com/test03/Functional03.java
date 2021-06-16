package com.test03;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Functional03 {

	
	public static void main(String[] args) {
		//func01();
		func02();
	}
	
	private static void func02() {
		//BiFunction<T,U,R>  
		//T,U는 입력할 것, R은 출력
		BiFunction<String, String, Integer> sum = (i,j) -> Integer.parseInt(i) + Integer.parseInt(j);
		System.out.println(sum.apply("10", "20")+10);
	}
	
	private static void func01() {
		Function<Integer,String> time = n ->(n<10)? "0"+n: ""+n; //n이 10보다 작으면 0붙여서 리턴, 아니면 그냥 리턴.
		
		System.out.println(time.apply(1));
		System.out.println(time.apply(5));
		System.out.println(time.apply(9));
		System.out.println(time.apply(10));
		System.out.println(time.apply(12)); 
		
		//여러번 사용해야 하는 경우 class,method 만들면 되지만 반복되더라도 간단하게 만들고 싶을 때, 한번만 사용하고 싶으면,
		//식: expression = 결과값;   ex. 공식,lambda 결과가 값으로 나옴. 
		//문: statements = 행위(기능) ex.제어문, 반복문 
	}
}
