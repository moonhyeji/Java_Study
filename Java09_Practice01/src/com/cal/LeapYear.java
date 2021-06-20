package com.cal;

import java.util.Scanner;

import com.coffee02.CoffeeMachine;


/*
 *  ① 서력 기원 연수가 4로 나누어 떨어지는 해는 우선 윤년으로 하고, 
 *  ② 그 중에서 100으로 나누어 떨어지는 해는 평년으로 하며, 
 *  ③ 다만 400으로 나누어 떨어지는 해는 다시 윤년으로 정하였다.
 * 
 * 
 * hint; 
 *  1)  1 && 2 || 3
 *  2)  100 으로 나누어 떨어지지 않으면 윤년이다.
 */

public class LeapYear {

	
	
	
	public static boolean isLeapYear(int year) { 
		
		boolean isLeap = false;
		
		//1)year % 4 ==0
		//2)year % 100 != 0
 		//3)year $ 400 == 0
		if ((year % 4 ==0) && (year % 100 != 0) || (year % 400 == 0)){
			isLeap = true;
		}
		
		return false;
	}

	
	

	
	public static void main(String[] args) {
		
	   
	   

		// 연도를 입력받아, 입력받은 년도가 윤년이면 "xxx 년은 윤년이 맞습니다."
		// 아니면 " xxxx년은 윤년이 아닙니다 . " 라고 출력.
       Scanner sc = new Scanner(System.in);
       System.out.println("년도입력 : ");
       int year = sc.nextInt();
        
       
       if(isLeapYear(year)) {
    	   System.out.println(year + "년은 윤년이 맞습니다.");
    	   
       }else {
    	   System.out.println(year + "년은 윤년이 아닙니다.");
       }
    	   
	}	
}
