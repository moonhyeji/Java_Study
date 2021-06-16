package com.test01;

public class MTest {
	
	public static void main(String[] args) {
		
		Test01 test01_1 = new Test01() {  // 인터페이스를 한번만 사용하고 싶다. 간단하게 한번 사용하고  말자. 

			@Override
			public void prn() {
				System.out.println("test01_1");
			}
			// 근데 이렇게 바디 안에 메소드 만들고 하는게 너무 귀찮아. 
			
		};
		test01_1.prn();  // 이렇게 간단히 만들 수 있다!!
		
		
		
	    // 그래서 얘네들을 람다로 만들자. 메소드가 하나인인터페이스만 바꿀 수 있는데 
	
		
	     //() -> {code}			//해당 메소드의 내용 
		Test01 test01_2 = () -> {System.out.println("test01_2");};
		test01_2.prn();
		
		//() -> code 
		Test01 test01_3 = () -> System.out.println("test01_3");
		test01_3.prn();
		
		//(type parameter) -> code;  파라미터 있는 애 . 
		Test02 test02_1 = (int n)-> System.out.println("test02_1: " + n);
		test02_1.prn(10);
		
		//(parameter) -> code;  
		Test02 test02_2 = (n) -> System.out.println("test02_2: "+n);
		test02_2.prn(20);
		
		
		//파라미터가 하나인 경우 파라미터 하나만 쓸 수도 있음.  괄호도 생략 가능. 
		Test02 test02_3 = n -> System.out.println("test02_3: "+ n);
		test02_3.prn(30);
		
		
		//(parameter) -> code     //return 쓸 때는 중괄호 사용 
		Test03 test03_1 = n -> {return n+n; };
		System.out.println(test03_1.prn(40));
		
		
		//(parameter) -> code 명령어가 리턴밖에 없는 경우 중괄호,리턴을 생략하고 사용 가능, 이외에는 중괄호 써야 함.  /  
		Test03 test03_2 = n -> n +n ;
		System.out.println(test03_2.prn(50));
		
		//두줄이면 생략 불가! 
		Test03 test03_3 = n ->{
			int k = n+10;
			return n + k ;
		};
		System.out.println(test03_3.prn(60));
		
		
		Test04 test04 = (i, j) -> {
			System.out.printf("%d * %d = ", i, j );
			return i * j;
		};
		System.out.println(test04.prn(2,3));
		}
}

















