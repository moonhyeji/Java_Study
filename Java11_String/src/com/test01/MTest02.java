package com.test01;

import java.util.StringTokenizer;

public class MTest02 {

	
	
	public static void main(String[] args) {
		
		
		
		
		
		
		
		
		
		//111111111111  //substring
		String str01 = "The String class represents character strings";
		System.out.println(str01.substring(11, 16));
		System.out.println(str01.substring(11));

       /*
        * 
         문자열의 일부를 추출하는 함수로써 
         추출하는 부분의 선정은.
          
         1. - (문자열변수.substring(정수));
         
        : 넣어 준 정수 이후의 값을 추출한다.(순서 시작은 0부터 시작한다.)
        
         2.- 문자열변수.substring(정수, 정수)
        : 첫 번째 써 준 정수는 시작 위치(순서 시작은 0부터 시작한다.)에서 부터 두 번째 정수(순서시작은 1부터 시작한다.)까지를 추출한다.
        */
		
		
		
		
		//22222222222222split
		String str02 = "The,String,class";
		
		String[] splitArr = str02.split(",");  // 문자타입[] 변수명 = 문자열변수.split("구분기호") 로 사용. 
		//       의미: str02를 스플릿하다. 
		
		//대상문자를 구분기호를 기준으로 분리하여 문자타입 배열에 집어넣는 구문
		/*
		 * 대상문자가 "3,4,5" 라면
         run[0] = "3";
         run[1] = "4";
         run[2] = "5";
		 */
		/*splitArr[0] = "The";
		splitArr[1] = "String";
		splitArr[2] = "class";
		*/
		
		
		for (int i = 0; i < splitArr.length; i++) {
			System.out.println(splitArr[i]);
		}
		// i는 0부터 length까지 분리해서 출력해 주는거니까 the/ string/ class가 나온다.
		
		
		
		
		
		
		
		
		
		
		System.out.println("--------------");
		
		
		
		
		//33333333333// StringTokenizer  
		//- import java.util.StringTokenizer; //import 가 필요하다. 
		//하나의 문자열을 여러개의 문자열을 분리하기 위해 사용 - 기준은 ',' 구분점으로 함. 
		//구분문자로 인해 분리된 문자열 을 token 이라고 한다. 
		
		//StringTokenizer 변수 = new StringTokenizer(문자열,구분문자);
         //※변수를 사용해서 구분문자로 분리된 문자열(토큰)을 가져올 수 있다.

		String str03 = "The_String_class";            //타입 변수 = 값. 
		
		StringTokenizer tokenizer = new StringTokenizer(str03, "_");   //StringTokenizer 변수 = new StringTokenizer(문자열,구분문자);
		                                            // = 문자열(str03)을 구분문자("_")을 기준으로 분리한다라는 의미. 
		
		
		
		
		while (tokenizer.hasMoreTokens()) {                //hasMoreTokens = 다음에 읽어들일 토근이 있니? (true /false)
			                                              // ->변수(tokenizer)가 다음에 읽어들일토큰이 있니? 있으면 {}의 명령을 수행하고 아님 끝.
			
			
			System.out.println(tokenizer.nextToken());   //nextToken =  StringTokenizer 클래스 객체에서 다음 토큰을 읽어 들인다.
		                                                //->tokenizer 변수의 다음 토큰을 읽어서 출력하자.
		
		
			
			
			
			
			
		}
			
			
			
		System.out.println("--------------");

			
			
		//SPLIT 과  TOKENIZER 의 차이점 :
		//split()은 구분자 사이에 문자열이 없어도 공백인 배열을 만들지만 
		//StringTokenizer는 무시한다
		
        // 예를들어, String str = "a, b, , d" 라고 가정한다면,
		//split은 공백을 인정하고 a/ b/ / d를 만들고,    tokenizer 는 a / b/ d 만을 만든다. 
				String str22 = "a ,b,  ,d ";
	//
		String[] splitArr03 = str22.split(",");
		
		for (int i = 0; i < splitArr03.length; i++) {
			System.out.print(splitArr03[i]);
		}
		
		System.out.println();
		
		
		
		StringTokenizer tokenizer01 = new StringTokenizer(str22, ",");
		
		StringTokenizer Value1 = new StringTokenizer(str22); //StringTokenizer() 일 경우 공백이나 탭으로 분리부분 결정.
		while(Value1.hasMoreTokens()) {    // 다음에 읽어들일 토큰이 있는 동안 반복한다. 
			System.out.print(Value1.nextToken());
		
		}
		
		
		System.out.println();

		
		
		
		
		
			
			
		////////// 스트링 토크나이저 심플 에제.
		String str11 = "사과 배 복숭아 ";
		StringTokenizer Value = new StringTokenizer(str11); //StringTokenizer() 일 경우 공백이나 탭으로 분리부분 결정.
		while(Value.hasMoreTokens()) {    // 다음에 읽어들일 토큰이 있는 동안 반복한다. 
			System.out.println(Value.nextToken());
		}
		
		
		
		
		
		}
}
	
	

