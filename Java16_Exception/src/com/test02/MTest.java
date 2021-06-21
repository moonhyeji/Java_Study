package com.test02;
import java.util.Scanner;
import java.util.InputMismatchException;

public class MTest {

	
	public static void main(String[] args) {
		int a = 0;
	try {
		System.out.println("숫자를 입력해 주세요");
	    Scanner sc = new Scanner(System.in);
	   
	    		a = sc.nextInt();
	    		
	    		if( a== 4) {
	    			throw new MyException("반장이 좋아하는 4");  //throw 라고 하면 예외를 발생시킬 수 있다. 
	    			
	    		}
	    }catch (MyException e) {
		System.out.println("MyException 발생");
	     e.printStackTrace();
	     
	    }catch(InputMismatchException e) {
	    	System.out.println("숫자가 아닌 다른 것!");
	    	e.printStackTrace();
	    	
	    }catch(ArithmeticException e) {
	    	System.out.println("계산 잘못되었을 때 ");
	    	e.printStackTrace();
	    	
	    }catch(Exception e) {
	    	System.out.println("뭔가 잘못되었을 !");
	    	e.printStackTrace();
	    	
	    	
	    	
	    	
	     
	    	
	    	
	    	
	    	
	    	//exception : 모든 예외는 exception의 자식들. 무슨 예외인지 모르는 경우 exception사용. 
	    } finally {
	    	System.out.println("입력한 값: " + a);  //무조건 마지막에 꼭 해야 하는 명령어.
	    	                //중간에 예외 발생해서 catch가 실행이되든, try로 해서 명령문이 잘 실행이 되든간에.
	    }
}
}
