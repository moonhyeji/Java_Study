package com.test02;

import com.test01.Mtest01;


public class Mtest03 {

public static void main(String[] args) {
	
	Mtest01.publicMethod();   //어디서든.
	
	//Mtest01.protectedMethod();  //상속이 아닐 경우엔 같은 패키지 내
    //Mtest01.defaultMethod();   //같은 패키지 내
    //Mtest01.privateMethod();  //같은 클래스 내
    
	
	// -> 따라서 지금 풀력해보면 public 외에는 다 빨간줄 뜸. 
	//protectedMethod 의 경우 에러메세지
	//The method protectedMethod() from the type Mtest01 is not visible
	
}

	
	
}
