package com.test01;

class MyThread03 extends Thread {

	public MyThread03(String name) {
		super(name);

	}

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println(this.getName() + ":" + i);
		}
		System.out.println("--------------" + this.getName() + "--------");
	}


}
	
	
	
public class Thread03 {
		
		public static void main(String[] args) {
			MyThread03 t01 = new MyThread03("멍멍");
		    MyThread03 t02 = new MyThread03("야옹");
		    
		    //java의 thread scheduling은 우선순위와 순환할당 방식을 사용한다. 
		    //우선순위: 순위가 높은애./ 순환할당: 시간마다 반복하게 함. (예를들어 0.1초로 지정해줬으면 0.1초)
		    
		    
		    
		    
		    //Priority : 우선순
		    t01.setPriority(10);   //< t01에 우선순위 제일 높게 주고 ,/10 = thread.max_priority
		    t02.setPriority(Thread.MIN_PRIORITY);  //<t02 에 우선순위 가장 낮게 줌. 
		    // 이러면 멈멍이 끝나고 야옹이 나와야 하는거 아냐?
		    
		    
		    
		    t01.start();
		    t02.start();
		    
		    System.out.println(t01.getName() +"vs"+t02.getName());
		}

	

}