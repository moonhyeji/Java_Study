package com.test07;


import java.util.Scanner;

public class Circle extends AreaImpl {

	
	@Override
	public void make() {
           Scanner sc = new Scanner(System.in);
		   System.out.println("반지름을 입력해 주세요:");
		   int r = sc.nextInt();
		   
		   double res = Math.PI * Math.pow(r, 2);
		   
		//   result = res;
		   /*
		    * Double.toString(res);
		    * String.valueOf(res);
		    * 이렇게 써서 setResult(res);의 오류를 해결해 줘도되고,
		    */
		   
		   
		   
		  setResult(res+"");
		  //이렇게 해도 됨. 
		  
		  
				  
	}
	
	
	
	
	
	
	
	
	
	@Override
	public void print() {
		System.out.println("원의:");
	    super.print();
	    
	}

}
