package com.test02;

public class MTest {

	public static void main(String[] args) {

		
	 // 1. stringTest();
		stringBufferTest();
      // StringBuffer 는 mutable (변경가능한) 객체이다.

	}

	
	
	//string을 연산할 때, 내부적으로는 stringBuilder로 변환하여 연산함.(jdk 1.5) < 그냥 써두고 . 나중에 이해. 
	public static void stringBufferTest() {
		

		
		StringBuilder str22 = new StringBuilder();

		str22.append ( "a")
		     .append ("b")
		     .append ( "c")
		     .append ( "d");
		//중간생략 (약 400라인).........
		System.out.println(str22);
		
		StringBuffer sb = new StringBuffer(); // <- 스트링버퍼도 참조타입이구나!
		sb.append("안녕하세요!")
		 .append("저는")
		 .append("김선달입니다."); 
		
		//.append .append .append 이런식으로 쓰는 걸 메소드 체이닝 이라고 한다. 
		// append를 이용하여 문자열을 추가할 수 있다.

		//아니면 sb.append;
		  //   sb.append;
		    // sb.append; 이런식으로 계속 써도 됨.
		
		
        //이름은 바뀌는데 해쉬코드는 바뀌지 않음.
		//스트링버퍼는 스트링과는 다르게 뮤터블 하다. 변한다.
		
		//따라서 값은 sb 에 연결되어있어도 주소값은 변하지 않는다.
		//스트링만 기본타입처럼 사용 가능하고,스트링버퍼는 기본타입처럼 이용 불가능. 

		System.out.println(sb);        //출력한다.  안녕하세요!저는김선달입니다.

		System.out.println(sb.hashCode());   //출력한다. 주소값이 나옴. 1304836502

		
		
		
		
		
		//-------------------------------------
		sb.replace(0, 6,"하이!");  //문자열 0번째에서 6번째까지를 "하이" 로 replace해준다. 
		System.out.println(sb);    //출력한다.  하이!저는김선달입니다. (안녕하세요 -> 하이 로 바뀜.)

		
		System.out.println(sb.hashCode());  //출력한다. 주소값은 바뀌지 않았다. stringbuffer는 뮤터블하다.
		//StringBuffer sb = new StringBuffer();  인데도 주소값은 안바뀜. (new: (원래는)새로운 주소에 새로운 객체가 생김. // <- 스트링버퍼도 참조타입이구나!
		//값은 바뀌고 해당값이 저장된 주소값은 안바뀜!/ 얘는뮤터블 하다!
		
		
		
		
		sb.reverse();   //스트링버퍼는 이렇게 리버스 해주는 메소드도 있꾸나! 문자열을 전부 리버스 해준다. 
		System.out.println(sb); //출력한다. (  .다니입달선김는저!이하  ) 


		
		
	    
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	// -------------------------------------------------------------------------

	public static void stringTest() {
		// 중요!!! 이것을 immutable 이라고 한다!! <- 이뮤터블 다시공부!
		
		
		String s = "안녕하세요!"; // 1.이것만 출력했을 때
		s += "저는 ";           // 2. 이것만 출력했을 때랑 값이 바귐.- 주소값이 다르기 때문
		s += "홍길동 입니다.";

		System.out.println(s);
		System.out.println(s.hashCode());
		
		
		

		s.replace("안녕하세요!", "하이!"); // 얘는 만들어졌는데 출력은 안됨. 왜냐면
		// s가 지금 안녕하세요 저는 홍길동입니다 랑연결돼 있어서.
		// 바꿔라 라는 것만 있고 s에 다시 대입해라. 라는 게 없어서 .
		System.out.println(s);

		
		
		
		// 따라서. 연결을 하고 싶으면 대입을 넣어야 한다.(만들어져 있낀 한데 대입하지 않으면 안변함.)
		s = s.replace("안녕하세요!", "하이!");
		System.out.println(s);

		
		//StringBuilder는 StringBuffer와 하는 일, 쓸 수 있는 메서드가 모두 동일하다.
            //StringBuffer는 멀티 스레드에 안전하게 동작한다.
             //StringByilder는 싱글 스레드에서 안전하게 동작한다. 
		
		
		
		
		
		
		
		
		//////////////공부////////
		String strr = "abc";
				strr += "d";
		//일 경우 쉽게 해당 문자열을 변경 가능하지만 string 의 특징인 immutable로 인해 새로운 스트링 객체가 생긴다.
				
		// 따라서 계속해서 새로운객체가 생성될 경우 프로그램의 크기가커져서 프로그램의 성능이 저하될 수 있다.
				
				
				
				//Stringbuilder 클래스를 통해서 새로운객체를 만들지 않고도 문자열을 변경할 수 있다.
				
				
				//공부에 도움되는 페이지 
			   //	https://seeminglyjs.tistory.com/195
				// https://jeong-pro.tistory.com/85
//https://kin.naver.com/qna/detail.nhn?d1id=1&dirId=1040201&docId=227146181&qb=U3RyaW5nIHN0cmluZ2J1ZmZlcg==&enc=utf8&section=kin.ext&rank=1&search_sort=0&spq=0
		
		
	}
}
