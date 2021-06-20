package com.cal02;


import java.util.Scanner;

public class MTest {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);   //입력을 나타내는 메소드. 
		
		
		System.out.println(" 연도 입력 :"); //맨처음 연도입력을 띄우고 
		
		int year = sc.nextInt();   // 변수는 year이고 , nextint는 사용자가 입력한 정수값. 변수에 사용자가 입력한 정수값을 넣음. 
		
		System.out.println("월 입력 :");  // 그 다음 엔터치면 '월 입력' 이라고 하는 글자가 출력이 되고 
		int month = sc.nextInt();   //변수가 month 이고 사용자가 정수값을 넣음. 
		
		                                             // 호출방법으로써,
		CalendarUseApi cal = new CalendarUseApi();   //  클래스 변수 = 뉴 클래스();
		cal.prn(year, month);                        // 변수.메소드(); 
		                                             //형태로 호출함.
		          // 변수는 cal.
	                 //메소드는 prn메소드를 입력.
	
	}
	
	
}
