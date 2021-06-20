package com.test01;

import java.util.Scanner; //javautil이라는 패키지안의 스캐너라는 애를 읽어온다는 뜻. 

public class MTest01 {

	/*
	 public static void main(String[] args) {
		 
		 

	Scanner sc = new Scanner(System.in);       //  사용자의 입력값을 받기 위한 장치     
	                                           //System.in : 사용자가 입력한 값이라고 이해. (구체적 데이터가 아니라)
	 //sc: 생성된 scanner를 변수에 저장.
	
	System.out.println("숫자를 입력해 주세요 : ");       
	 String a = sc.next();                        //*nextInt가 실행되면 (1)우선 멈춰서 사용자에게 입력되길 기다리고 있음.
	                                                  //(2) 사용자가 숫자를 입력 -> 입력한 값이 a 에 담기게 됨. 
	 											       //(next'Int'이기 때문에 숫자만 입력해야 함. /문자입력하면 에러발생.) 
	//int a  : 입력된 문자열을 변수 a 에 저장.
	 
	 
	 //입력이 되면 "다시한번 입력해 주세요가 실행됨."
	System.out.println("다시한번 입력해 주세요 : ");
	
	//nextInt();     없으면,
		//숫자를 입력해 주세요 : 
		//다시한번 입력해 주세요 : 이렇게 출력됨. 
	
	int b = sc.nextInt();
    System.out.println("두 숫자의 합은 " +  (String)(a+b) + "입니다.");
    
			
	}
	*/
	
	//////////////////////////////////////////////////////////////////////////////////////////////
	
	
	// + 공부 scanner에 대해 : scanner: 사용자가 입력한 값을 받기 위한 수단이다: 라고 정도만 이해. 
	
	//public static void main(String[] args) {   //MTest01이 실행이 되면 main메소드가 자바에 의해 호출괴고,
	 
      //Scanner sc = new Scanner (System.in);     // 오른쪽 부분이 우선순위가 높기 때문에 오른쪽 부분이 먼저 실행됨.
                              
	                              //System.in : 사용자가 입력한 값이라고 이해. (구체적 데이터가 아니라)
                                  // 이 값(system.in) 괄호안에 넣고 스캐너라는 객체를 새롭게(new)만들면
                                 //   * = (Scanner of new Scanner)스캐너라고 하는 객체가 사용자가 입력한 값을 스캐닝 하는 (알아내는)역할을 하겠다.
                                  // * 이렇게 만들어진 값을 sc라는 변수에 담으면 (System.in)이라는 객체는  변수sc에 담겨서, sc를 통해서 객체 제어 가능. 
	   
	 
	 
	   //int i = sc.nextInt();  //******sc: scanner라고 하는 객체가 담긴 변수.
	                           //이 객체는 nextInt라고 하는 메소드를 가지고 있음.
	                            //********nextInt: 가 실행되면 실행이 되고 멈춰서 기다리고 있는 상태. 
	                            //* 사용자가 숫자를 입력 -> 입력한 값이 i 에 담기게 됨. 
                      //* ( next'Int'이기 때문에 숫자만 입력해야 함. /문자입력하면 에러발생.)
 
	                             
//	   System.out.println(i*1000);     // 그 i의 값이 *1000 이 되어 출력됨.
	
	   
	   
	
//	}
      
	
	
	
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      
  	  while(sc.hasNextInt()) {             //sc: 스캐너라는 객체가 담겨있는 변수
  		                          //.hasNextInt: 스캐너객체가 갖고있는 hasnextint 라는 메소드를 호출
  		                           //hasNextInt하는일 1. 메소드를 실행시키면 일단정지.{}안의 반복문이 실행이 안되고 유지 
  		                           //               2.입력값에 공백(엔터)가 들어왔다면 (1) 중지된 자바의 실행을 다시 재생시킴.
  		                                                          // (2) 정수라면 true 리턴->{}실행. 
  		                                                               //다른 수라면 false리턴.
  		             //--> 간단히. 입력값이 들어오면  while()이true면 {} 반복실행. 아니면 중지.
   		System.out.println(1000*sc.nextInt());
    		}	
        }
     }




////////////////////////////////////////////////////////////
/*
 * 
공부정리
Scanner sc = new Scanner(System.in);         <-이부분은 그냥 암기하자.


nextInt() : 사용자가 입력한 정수값을 의미. nextInt가 실행되면 우선 실행이 되고 멈춰서 입력되길 기다리고 있음.

hasNextInt() : 사용자가 입력한 값이 정수라면 true 리턴해서 { 명령 }실행  & 다른 수라면 false리턴.
  		  
 */
////////////////////////////////////////////////////////////
 /*
  * 숫자를 입력해 주세요 에서 숫자를 한번만이 아닌, [1 5 6] 띄어쓰기를 하면서 이런식으로 작성하고 엔터를 치면
  * 다시한번 입력해 주세요 가 출력되고 입력되기를 기다리는게 아니라 바로
  * 두숫자의 합은 6입니다. 처럼
  * 처음에 입력한 1과 띄어쓰기 후의 5가 합해진 수가 출력된다.
  * 
  * - 이 이유는 next가 스페이스바를 감지해서 다음으로 넘어갔다고 보면 된다.
next()는 스페이스바를 감지해서 다음으로 넘어가는 메소드이다.
 next()는  문자열을 공백을 기준으로 한단어 및 한문자씩 입력을 받음.  - 예를들어. next()함수는 Hello World를 입력받았지만 Hello 문장만 출력한 걸 볼 수 있습니다.

​

 nextLine()  문자 및 문자열을 한라인 전체를 입력받습니다.(엔터기준)
 nextLine()  함수는 Hello World를 입력받고, 문장 전체를 출력



next()는문자열 받음
 nextInt()는정수를 받음.
 nextLine() 한 줄을 통째로 받음.

  */


//https://blog.naver.com/ky91zzang/221383152177


