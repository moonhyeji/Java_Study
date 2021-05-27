package com.test03;

import com.test04.MTest;

public class Mtest {

	public static void main(String[] args) {

		
		
		MyCalc.sum(10, 20);

		  //calculation  . sum 메소드에 변수 10과 20을 넣음. 
       /*
        * public static void sum(int i, int j) {
		  int result = i + j;
		  System.out.printf("%d + %d = %d\n", i, j, result);

        */
		
		
		

	int sub = MyCalc.sub(10, 2);
		System.out.println(sub);
		
		
		/*
		 * public static int sub(int i, int j) {
		   int result = i - j;

		   return result;
		 */

		
		
		double mul = MyCalc.mul(1.2, 3.4);
		System.out.println(mul);
		/*
		public static double mul(double i, double j) {
			double res = i * j;

			return res;
        */
		
		
		
		
		
		MyCalc.div(10, 3);
/*
 * public static void div(int i, int j) {
		// /: 몫
		// % : 나머지
		int div01 = i / j;
		int div02 = i % j;
		System.out.println("몫 : " + div01);
		System.out.println("나머지 : " + div02);

 */
		
		
		
		
	
	

		int sum = MTest.getSum(100, 40, 79);
		System.out.println(sum);

	}
}

		
	

