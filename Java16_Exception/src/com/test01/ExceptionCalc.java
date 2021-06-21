package com.test01;
import java.util.Scanner;
import java.util.InputMismatchException;
public class ExceptionCalc {

	
	
	public int calculation() {
     int res = 0;
	 while(true) {
		try {
	
		  res = inputNum() / inputNum();  //예외가 발생할 수도 있는 코드. 
	 
		  break;
	  } catch(InputMismatchException e) {  // 에러가 발생하면 catch() 얘가 잡아주고, 
		  
		  // 여기서 e는 값. inputNum 에서 걸리는 애 . 
		  System.out.println("숫자만 입력하라고!");  // 이런 명령문을 출력함. 
		 e.printStackTrace();  // 여기서 의 스택은 fILO 여기서 스택을 트레이스 해서 출력해주고,
		  
	  }catch(ArithmeticException e) {
		  System.out.println("0으로 나누시면 안됩니다.");
	  }
	 }
		return res;  // 예외가 발생하지 않으면 바로 여기로 넘어옴. 
		
	}
	
	
	
	
	
	
	public int inputNum() {
	System.out.println("숫자만 입력해 주세요. : ");
	Scanner sc = new Scanner(System.in);   //input  된 값. 

	return sc.nextInt(); //입력받은 값을 리턴 
	}
}
/*try{
 * 예외가 발생할 수도 있는 코드 (명령문)
    }catch( [[]]  ){ //발생할 수 있는 예외 타입
    [[해당타입]]의 예외 발생했을 때 수행할 명령문.
 * }
 * 
 * 
 * The class Exception and any subclasses that are not also subclasses of RuntimeException are checked exceptions.
 */


