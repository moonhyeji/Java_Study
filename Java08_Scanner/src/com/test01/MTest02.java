package com.test01;

import java.util.Scanner;

public class MTest02 {

	public static void main(String[] args) {
		test01();
		
	}
	
	public static void test01() {
		
		
		Scanner id = new Scanner (System.in);         //사용자의 입력값을 받기 위한 장치.
		System.out.printf("아이디: "  );               // 아무거나 입력해 주세요 출력됨.
		
	
		
		String line = id.nextLine();

		
		Scanner name = new Scanner (System.in);   
		System.out.printf("이름: "  );    //

		
		String line2 = name.nextLine();

		
		System.out.printf( line +"님의 아이디는" + line2 +"입니다."  );    //

	   
      
       
       
       
	}
	
	
	
	
    //next()
	//nextInt()
	//nextLint()
	
}
