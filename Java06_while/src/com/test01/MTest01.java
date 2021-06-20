package com.test01;

public class MTest01 {

	/*
	 * while(조건){
	 *  조건이 참일 때 반복될 명령; 
	 *  } 
	 *  i++;(증감식)
	 */
	
	


	public static void main(String[] args) {    
		 prn01();
		 prn02();
          prn03();
          prn04();
          
	}
	
	
	
	

	public static void prn01() {
		int i = 10;

		while (i < 10) {
			System.out.print(i);
			//i++;

		}
		System.out.println("While이 종료된 이후의 i 값 : " + i);
	}

	
	
	
	public static void prn02() {
	   int i = 10;
	   
	   do { 
		   System.out.println(i);
		   i++;
	   } while (i <10);
   System.out.println("do~while 종료후 i " + i);
   // 먼저 명령을 확인하고 나중에 조건을 확인.
   // do ~ while 은 적어도 한번은 무조건 실행됨.
   
   
   System.out.println("----------");

   }

	
	

	
    public static void prn03() {
    	int i = 1;
    	
    	while (true) {
    		System.out.println(i);
    		i++;
    	if (i<10) {
    		break;
    	}
    	}
        System.out.println("----------");

    } 
	
	
	
	public static void prn04() {
    int i = 1;
   do {
	  System.out.println(i);   //1. do{  여기가 반복영역  } 안을 가장 먼저 최초실행.
	       i++;   //<-------얘는 반복영역 안에 넣어주는 애.
    }while(i<10);           //2.조건식을 보고 참이면 do{} 를 반복 /
                            // 2.          거짓이면 이대로 do while문 종료.
  
   System.out.println(i); //< - 얘가 없으면 9까지만 실행됨. ()조건식이 거짓일 때 나와서 마주치는 애가 얘라서 10 됨.
   
	//i == 10 이 아닌이유 =i 가 1일 때 조건이 false이다.
  System.out.println("do~while 종료후 i " + i);
 
	}
	
	
}