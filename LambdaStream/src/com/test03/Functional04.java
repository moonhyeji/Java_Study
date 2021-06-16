package com.test03;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Functional04 {
	
	public static void main(String[] args) {
		
	
	//supplier : 값을 만들어 주는 애 
	Supplier<Integer> rnum = ()  -> (int)(Math.random() * 45) + 1;
	     System.out.println(rnum.get());
	     System.out.println(rnum.get());
	     System.out.println(rnum.get());
	
	     
	     
	//consumer : 소비한다. = 리턴되는 값이 없음/ 입력되는 값은 있는데 출력되는 값이 없음. 
	Consumer<String> hello = (name) -> System.out.println("hello" + name);
	hello.accept("Lambda");
	
	
	
	//biconsumer   - 파라미터 2개 넣으면 리턴이 안됨. 
	BiConsumer<String, Integer>qclass = 
			(subject, score) -> System.out.printf("%s 과목의 평균은 %d입니다.", subject, score);
	qclass.accept("java", 100);
	
	
	
	}
}

















