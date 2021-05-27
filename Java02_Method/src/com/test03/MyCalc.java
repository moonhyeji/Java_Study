package com.test03;

public class MyCalc {

	// method : 접근제한자 메모리영역 리턴타입 메소드명(parameter) { // 명령문들.. }

	public static void sum(int i, int j) {
		
		
		int result = i + j;

		System.out.printf("%d + %d = %d\n", i, j, result);

		/*
		 * syso. print() : () 안의 문구을 출력.
		 * syso. println() :  ()안의 문구를 출력해주고 줄바꿈.
		 * syso. printf (지시자or특수문자%, 값 or 변수)
		 *              -> "%d + %d = %d\n", i, j, result
		 *               -> i + j = result
		 %d : 정수출력
         %f : 실수출력
         %c: 문자출력
         %s : 문자열 출력.
		 */
		
		
		//메인메소드에서 호출 해줘야 해서 
		/*
		 * 		MyCalc.sum(10, 20);
              메인메소드에서 호출해줌. 
		 */
		
	}

	
	
	
	
	
	
	public static int sub(int i, int j) {
		int result = i - j;

		return result;
		
		//이상태에서만이면 syso가 없기 때문에 출력값이 아무것도 안뜸. 
	    //하지만 Mtest클래스에 변수가 있는 객체가 있고,변수를 담은 syso가 있음.
		//따라서 값이출력됨.
		
		/*
		int sub = MyCalc.sub(10, 2);
		System.out.println(sub);
		*/
	}

	
	
	
	
	
	
	
	public static double mul(double i, double j) {
		double res = i * j;

		return res;
	}
	
	
	
	
	
	

	public static void div(int i, int j) {
		// /: 몫
		// % : 나머지
		int div01 = i / j;
		int div02 = i % j;
		System.out.println("몫 : " + div01);
		System.out.println("나머지 : " + div02);

	}

}
