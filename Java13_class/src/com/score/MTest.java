package com.score;

public class MTest {

	
	public static void main(String[] args) {
		
		Score lee= new Score();
		lee.setName("이순신");
	    lee.setKor(85);
	    lee.setEng(89);
	    lee.setMath(100);
		
	    Score hong = new Score("홍길동", 100, 79, 89);
	    
	    
	    System.out.println(lee);    ///  < -------println 은 hong의 .tostring을 자동으로 호출해준다.
	    System.out.println(hong.toString());  
	 //   println 은 hong의 .tostring을 자동으로 호출해준다.(print도, printf도) 
	   // System.out.println(hong):  객체(hong)의 주소값이 호출됩니다.
		
		
	    
	    
	    
	    //이름: name	국어:85	영어:89	수학:100	총점:274	평균:91.33333333333333	등급:A
//	    이름: name	국어:100	영어:79	수학:89	총점:268	평균:89.33333333333333	등급:B
	  //   부모의 .tostring을 재정의 받아서 ,   내가 원하는 오버라이드에 넣고 내가 바꿔준값이리턴되게 된다.   
	}
}
