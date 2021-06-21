package com.test07;

public interface Area {
// 인터페이스 이기 때문에 인터페이스 안에 있는 변수는 자동으로 상수화된다.
	// 따라서 넓이: 이고 스트링타입이지만 상수이다. 
	String PRINT = "넓이 : ";
	
	public void print();
	public void make();
}
