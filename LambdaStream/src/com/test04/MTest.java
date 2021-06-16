package com.test04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class MTest {
	public static void main(String[] args) {
		//createStream();
		//createCollection();
		pipeline();
	}
	
	private static void pipeline() {
		List<String> qclass = 
				Arrays.asList("가나","나다","다라","라마","마가","바가","가가가");
		//받아와서. 리스트로 만들어서 array 에 담음. 
		
		
		//가 가 포함된 애들만 출력
		List<String> ga = qclass.stream() //.1.stream으로 바꿈.
		                                   .filter(name-> name.contains("가")) // ()안의 연산, predicate를 통해서해당 애들만 걸러줌.      
				                           .sorted()  // 그런다음 정렬 .
				                           .collect(Collectors.toList()); // collector 객체가 들어감. 
		System.out.println(ga);
		
		
		//이름의 길이가 두글자인 애들만 가져오자.
		List<String> two = qclass.stream().filter(name -> name.length() == 3)
											.collect(Collectors.toCollection(ArrayList::new));
		two.forEach(System.out::println);
		
		
		//qclass에서 '동'이라는 글자를 포함한 사람들을 찾고,
		//이름 마지막 글자를 *로 바꾸고, (map사용)
		//정렬해서 , List로 담고, forEach로 출력하자.
        qclass.stream()
                       .filter(name -> name.contains("가"))
					   .map( w -> w.replace(w.substring(w.length()-1, w.length()), "*"))
					   .sorted()
					   .collect(Collectors.toList())
					   .forEach(System.out::println);
        
        
        System.out.println(qclass.stream().filter(name->name.contains("동")).count());
        
        
        //lotto
        List<Integer> lotto = Stream.generate(()->(int)(Math.random() *45) +1)
        							.distinct()
        							.limit(6)
        							.sorted()
        							.collect(Collectors.toList());
        //.forEach(System.out::println); 이렇게 해서 끝내도 댐 
        
        lotto.forEach((i) -> System.out.print(i+ " "));
        				
	}
	
	
	
	
	private static void createCollection() {
		String[] arr = new String[] {"1","2","3","4","5","6","7","8"};
		Stream<String> stream01 = Arrays.stream(arr);
		stream01.forEach(System.out::println);
		
		
		List<String> list01 = Arrays.asList(arr);
		System.out.println(list01);
		List<String> list02 = Arrays.asList("1","2","3","4","5","6","7","8");
		list02.forEach(System.out::println);
		
		
		List<String> qclass = List.of("가","나","다");
		qclass.forEach(System.out::println);
		
	}
	
	private static void createStream() {
		//bulder 
		Stream<String> stream01 = Stream.<String>builder().add("홍길동").add("이순신").build();
		//문자열 Stream만들건데 add() 해서 추가하면서 만들어라.
		
		stream01.forEach(System.out::println);
		// :: =  메소드참조 
		
		
		
		//empty
		Stream<String> stream02 = Stream.empty();
		Object[] tmp = stream02.toArray();
		// System.out.println(stream02.toArray());  한번 쓰면 날라가 버리기 때문에 이렇게 쓰면 안됨. 
		System.out.println(tmp);
		System.out.println(Arrays.toString(tmp));
		System.out.println(tmp.length);
		
		
		//generate
		Stream<Integer> stream03 = Stream.generate(()->100).limit(5);
		stream03.forEach(System.out::println);
		
		//iterator
		Stream<Integer> stream04 = Stream.iterate(1, (i)-> ++i).limit(5);
		stream04.forEach((i)->System.out.print(i+" " +"\n" ));
		            //i 라는 값을 넣어주면 syso()형식으로 출력됨. 
		
		//range
		IntStream range01 = IntStream.range(1, 5);
		range01.forEachOrdered((i)-> System.out.println(i + " "));;
		
		
		//rangeClosed(1, 5)
		IntStream range02 = IntStream.rangeClosed(1, 5);
		range02.forEachOrdered((i) -> System.out.print(i + " "));
		
	}

}
