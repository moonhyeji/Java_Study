package com.test05;

public class IgTV implements TV {

    //보통 만드는 순서 
	//필드
	//생성자
    //순으로  씀. 
	
	
	
	
	
	//필드.
	private int volume;
	
	
	//생성자. 
    public IgTV() {
    	System.out.println("IgTV가 켜졌습니다.");
    }
    
	
	
	
	
	
	@Override
	public int volumeUp() {
    volume += 3;
    return volume;
	}

	
	
	
	
	@Override
	public int volumeDown() {
    volume -= 3;
    return volume;
	}
	
	
       public String toString() {
    	   return " IgTV의 현재 볼륨은" + volume + "입니다.";
    	   
       }

}
