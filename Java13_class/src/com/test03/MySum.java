package com.test03;

public class MySum {

	
	public static int sum(int i, int j ) {    // 얘는 인트타입 두개 . 
		return i +j;
		
	}
	
	public static double sum (double i , double j) {   //더블타입 두개 .파라미터의 갯수나, 파라미터의 타입이 다르면 메소드 이름이 같아도(sum)  가능하다. 
		return i +j;
	}
	
	
	
  public static void sum (int i, int j , int k ) {
	  System.out.println(i + j +k);
  }

//// 이 3개는 기능은 다른데 같은 이름 (sum)을 쓰고 있다. 
  //sum : 이름 = 3개가 같음
  //기능: 1번 메소드 : 정수형 int i intj를 더한다.// 2번메소드 : 더블형 double i와 double j를 더한다. 이런식으로 다름. 
  //오버로드: 같은 이름으로 다양한 다른 기능을 한다.
  //왜 이렇게 오버로드 한것인가? ---->    추상적인 개념이 같아서 = sum은 더하겠구나! 하는 것 .
  
}
