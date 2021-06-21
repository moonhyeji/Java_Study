package com.generic;

public class MTest {

	
	//////////////////////////set //////////////
	
	public static void main(String[] args) {
		Emp emp01 = new Emp();
		emp01.setEmpno("a111");
		emp01.setEname("홍길동");
	    System.out.println(emp01); /////////a111:홍길동

	    

	    
	    
	    Emp emp02 = new Emp();
	    emp02.setEmpno(222);;   //[1] empno 에 문자열이 들어 수 도 있고 숫자가 들어갈 수도 있다. 
	                         // 왜냐하면 emp.java에서 private T emp 에서 T의 타입을 특정해 주지 않았기 때문에 
	    emp02.setEname("김선달");
	    System.out.println(emp02);   //////////222:김선달

	    
	    
	    
	    
	    
	    
	    
	   //emp01.setEmpno((int)emp01.getEmpno()+1);  <-맘대로 숫자,문ㄴ자 넣으니까 에러발생함: 
	    //문자열을 int타입으로 casting할 수 없다. 라고 .  --> 그래서 우리가생각한게 제네릭. 
	    emp02.setEmpno((int)emp02.getEmpno()+1);
	    
	    System.out.println(emp01);     ///////////a111:홍길동

	    System.out.println(emp02);     ///////////223:김선달 <----223됨

	    
	    
	    
	   System.out.println("----------------");
	   
	   Emp<Integer>emp03 = new Emp<Integer>(); 
	   //(2) 왜냐면 숫자만 들어가라 라고 강제했기 때문에 "<Integer>" 애를 입력함으로써.
	  // emp03.setEmpno("111");   //-> 타입이 문자열이라서 숫자 넣을 수 없다고 에러남.  (1)
	   emp03.setEmpno(111); 
	   
	   
	   
	    System.out.println(emp03); 
	   
	   Emp<Integer>emp04 = new Emp<Integer>(113,"이순신");  //<-아무거나 들어갈 수 있는 empno의 타입을 "<Integer>"로 강제함. 
	   emp04.setEmpno(113);
	   
	    System.out.println(emp04); 

	}
	
	
}
