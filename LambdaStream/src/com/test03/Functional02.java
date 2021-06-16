package com.test03;

import java.util.Scanner;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class Functional02 {
  
	static Scanner sc = new Scanner(System.in);
	
	public static boolean isNull(String name, Predicate<String> predic) {
		return predic.test(name); 	//test안에 이름이 있는지 없는지 true, false

	}

	//1.name 으로 가고, name 이 lambda식 안으로 들어감. , 이게 결과가 됨.
	//predicate: 값을 줬을 때 해당 값에 대한 결과가 참인지 거짓인지를 리턴 
	public static void predict01() {
		String name = null;
		
		while(true) {
			System.out.println("이름 입력: ");
			name = sc.nextLine();
			
			if (isNull(name, (input)->input.trim().length() == 0)){
				System.out.println("다시입력해 주세요 ");
			}else{
				break;
			}
		}
		System.out.println(" 제 이름은 이거에요: " + name);
	}

	
	
	public static void predict02() {
		Predicate<Integer> p2 = (n) ->n % 2 == 0;
		Predicate<Integer> p3 = (n) ->n % 3 == 0;
		
		
		System.out.println("숫자 입력해 주세요: ");
		int input = sc.nextInt();
		if(p2.test(input)) {
			System.out.println("2의 배수입니다.");
		}
		if(p3.test(input)) {
			System.out.println("3의 배수입니다.");
		}
		//p2,p3를 가지고 6의배수를 판별하고 싶으면?
		Predicate<Integer> p6 = p2.and(p3);
		if(p6.test(input)) {
			System.out.println("2와 3의 공배수입니다.");
		}
	}
	
	public static void main(String[] args) {
		//predict01();
		//predict02();
		predict03();
	}
	
	
	private static void predict03() {
		System.out.println("i 입력: ");
		int i = sc.nextInt();
		System.out.println("j 입력 : ");
		int j = sc.nextInt();
	
		
		//만일 i가 j보다 크면 "i > j" 출력 
		//아니면 "i <= j"출력 
		BiPredicate<Integer,Integer> bp = (n,m) -> n>m;
		
		if(bp.test(i, j)) {
			System.out.println("i > j");
		}else {
			System.out.println("i<= j");
		}	
	}
	
}

