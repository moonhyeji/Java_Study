package com.test01;

public class MTest01 {

	public static void main(String[] args) {

		System.out.println(plusMinus(24));
     //plusMinus 함수를 출력하되, 변수를 (int input)을 24를 대입해서 출력해라.

}


//plusMinus()함수
	public static boolean plusMinus(int input) {

	  boolean res = false;

		int a = 3;
		int b = 5;
		int tmp = a++ + ++a + ++a + b++ + --b;

		res = (tmp == input)? true : false;   //tmp = input
    //tmp 가 input 과 같은가? 참이면 true : 아니면 false를 res에 담아라.

			return res;
    //res를 리턴해라.
    //res = true  따라서
// 매개변수 int input가 24일 때, plusMinus()함수 의 결과값은 true 가 됨.
	}

}
