package com.test06;

public class Profile {  

	
	
	
	private String name;   //값을 받아 필드를 초기화해줌. 
	private String phone;
	
	
	
	
	// 클래스 프로필은 파라미터 두개짜리 생성자를 받음.
	
	public Profile (String name, String phone) {  //  프로필 메소드 인자를 name과 phone으로 하 
		this.name = name;                        //클래스 내에서 사용할 변수로 name phone을 정해줌.
		this.phone = phone;
	}
	
	
	public void printProfile() {      //        프린트프로필 매소드는 
		System.out.println("이름 :" + name);    
		System.out.println("전화번호: " + phone);     //이런식으로 출력된다.
	}
	
}
