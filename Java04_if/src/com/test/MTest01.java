package com.test;

public class MTest01 {

	public static void main(String[] args) {

		prn01();
		prn02(false, false);
		// if : 만약에
	}

	public static void prn01() {
		System.out.println("<if>");

		int i = 30;
		int j = 20;

		if (i >= 10) {
			System.out.println("i는 10보다 크거나 같습니다.");

		}		
          System.out.println("---------------------");
          
          
          
          
  		// if ~ else. : if가 아니라면 엘스입니다.
  		System.out.println("<if else>");

		if (j < 10) {
			System.out.println("j는 10보다 작습니다.");

		} else {
			System.out.println("j는 10보다 작지 않습니다.");

		}

		// if ~ else if ~ else
  		System.out.println("<if ~ else if ~ else>");

		if (i > j) {
			System.out.println("i가 j보다 큽니다.");   //<< 첫번째 if가 참인지 거짓인지 보고 참이면 명령문 실행하고 나감.
			                                        //거짓이면 다음 else if문보기.

		} else if (i == j) {                         //<<else if가 참이면 명령 실행하고 나감
			                                          //거짓이면 else문 보기 
			System.out.println("i와 j가 같습니다.");

		} else {
			System.out.println("i가 j보다 작습니다.");

		}
	    System.out.println("---------------------");

	}


	public static void prn02(boolean ring, boolean married) {

		if (ring) {                                  //만약 반지가 있으면 명령문. 없으면 else
			if (married) {                           ////만약 결혼했으면 ->결혼하셨군  
				System.out.println("결혼하셨군요!");         //결혼안했으면 -> 연인이있으시군

			} else {
				System.out.println("연인이 있으시군요!");
			}                                         
		} else {            						     //반지가없으면
			if (married) {						          //결혼했으면  - 결혼하셨군요
				System.out.println("결혼하셨군요!"); 	 		
 
			} else {
				System.out.println("솔로셨군요..");	     // 결혼안했으면 - 솔로셨군요.
			}
		}
      System.out.println("------------------");
      
      
      if (ring && married) {                    //만약 결혼반지가 있고 결혼했으면
    	  System.out.println("결혼하셨군요!");            //결혼하셨군요
             } else if (ring || married) {       //아니면 : 결혼반지가 있거나 결혼했으면
    	  System.out.println("연인이 있으시군요!");     //연인이있으시군요.
      } else {                                  // 결혼반지도없고 결혼하지도않았으면
    	  System.out.println("솔로셨군요...");         //솔로셨군요.
      }
	}

}
