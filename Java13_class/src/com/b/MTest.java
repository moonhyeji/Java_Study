package com.b;

import com.a.AAA;

public class MTest {

	public static void main(String[] args) {

		// AAA a1 = new AAA(); //[new AAA();가 생성자를 호출하고 있음.
		// System.out.println(a1.getAbc());

		// AAA a2 = new AAA(10);
		// System.out.println(a2.getAbc());

		// a1. 넣으면 0
		// .a2넣으면 10.

		BBB b1 = new BBB();
		b1.setAbc(10);
		b1.setB(20);
		System.out.println(b1.getAbc());
		System.out.println(b1.getSum());

		
		
		BBB b2 = new BBB(10);
		System.out.println(b2.getAbc());
		System.out.println(b2.getB());
		System.out.println(b2.getSum());
		b2.prn(); // BB의 prn() 이라고 출력됨. <- 이것이 재정의 .

		// 다형성 : AAA,BBB만들수 있어서 형태가다양하다. 라는 것. 
		AAA a1 = new AAA();
		AAA a2 = new BBB();

		a1.prn();
		a2.prn();

	}

}
