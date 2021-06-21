package com.test01;

public class Mtest {

	
	public static void main(String[] args) {
		ExceptionCalc cal = new ExceptionCalc();
		System.out.println(cal.calculation());
	}
}


// java.util.InputMismatchException 예외. 
/*
 * 
 * Arrayindexoutofboundsexception
 * 
 * nullpointerException
 * 
 *
 * runtime exception : 실제로 클래스가 있음.
 * 
 * 
 * checked exception : 우리가 특별히 하지 않았는데 빨간줄로 알려주는 것. 
 * ( 오타는 이클립스가 알려주는거)
 * 
 * 
 * java.lang - Exception Summary
 * Direct Known Subclasses:=exception을 상속받고 있는 자식 에러들.
 * 
 *  프로그램의 비정상적인 종료를 막아주는 것 = 예외처리. 
 */