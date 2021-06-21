package com.test07;

public abstract class AreaImpl implements Area{   //area 클래스를상속받은 클래스.
	// 이름 보고 유추 가능 : test 라는 클래스를 상속받은 클래스 : testImpl 이라고 함. 

	private String result;
	
	@Override
	public void print() {
		System.out.println(Area.PRINT + result);
		
		
		
	}
	
	@Override
	public abstract void make();  // 
	//메이크 메소드 같아야 하는데 아리아 클래스의 메이크에는 엡스트렉트 없는 이
	//인터페이스인 경우는 추상이기 때문에 엡스트렉트를 략한다. 
	
	
	
	
	//setter:값을 넣어주는 애. 초기화 해주는 애. 
	public void setResult(String result) {
		this.result = result;
	}
}
