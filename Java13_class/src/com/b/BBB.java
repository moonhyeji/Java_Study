package com.b;

import com.a.AAA;
//superclass를 브라우저 눌러서 aaa검색해서 aaa 로 finish.




//AAA를 상속받은BBB다 라는 의미.
public class BBB extends AAA {

	private int b;

	// 기본생성자
	public BBB() {
	//super(); ->해당 명령어가 없어도 자동으로 부모 생성자 호출!!
		     // -> 얘가생략되 어 있는 것. 
		System.out.println("BBB()");
	}

	
	
	
	// 파라미터 한개짜리 생성자
	public BBB(int b) {
    	//부모의 생성자 -> AAA(int abc);
    	
		super(b);
    	this.b = b;
    	System.out.println("BBB(int b)");
    }

	
	
	// 파라미터 두개짜리 생성자
	public BBB (int abc, int b) {
    	super (abc);
    	this.b = b;
    	System.out.println("BBB(int abc, int b)");
    }
	
	
	
	
	//getter & setter
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	
	
	
	public int getSum() {
		//super: 부모 객체 
		//this : 나 객체
		//super() : 부모 생성자 
		//this() : 나 생성자 
	        	//int sum = super.getAbc() + this.getB();
		int sum = getAbc() + getB();
		
		         // 여기서 수퍼는 AAA객체. 
		         //여기서 super 지워도 될까? 지워도 됨. 
		//this도 내꺼니까 그냥 갖다써도 되니까 지워도 됨.
		// 그럼 생략 불가능할 때는? 
		//지역변수와 전역변수의 이름이 같을 때만 생략불가능.
		//this.abc = abc; 이런것만 생략불가능 
		return sum;
	}
	
	
	// 재정의 . = override 부모와 완벽하게 같은데 다시 만들었다. 
	@Override
	public void prn() {
		System.out.println("BB의 prn()");
		
		
		
		
	}
    
    
}
