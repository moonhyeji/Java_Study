package com.test01;

public class MTest01 {

	public static void main(String[] args) {
	
		
		
		
		// array만드는 방법
		// 1.
		
		int[] a;           // 선언
		a = new int[5];    // 정의
		a[0] = 1;          // 초기화
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;
		// a[5] =6;

		System.out.println(a[2]);  //a[2] = 3;
		System.out.println(a[1] + a[3]);  //a[0] = 1;   , a[4] = 5;

		
	System.out.println("----------");
		
		
		// 2.  
		int[] b = new int[] { 5, 4, 3, 2, 1 }; // 선언 정의 초기화

		System.out.println(b[1]); // b라는 배열의 4를 가져오고 싶을 때 사용.

		
		System.out.println("----------");

		
		
		// 3.
		int[] c = { 7, 8, 9, 1, 2 };   // 정의 skip 가능. 
		System.out.println(c); // 해당 객체의 주소값이 나옴.   //[I@4dc63996

		
		
		
		System.out.println("----------");

		
		
		
		
		// nice를 good 으로 바꾸고 전체 출력하자.
		String[] s = new String[] { "have ", "a ", "nic ", "day " };
		
		modi(s);
	}

	public static void modi(String[] arr) {

		// arr [2] = "good" ;
		for (int i = 0; i < arr.length; i++) {  //0인덱스부터 /  arr.의 길이보다 적을 때 / 0인덱스+1 해가면서 반복 
											//배열의 수는 총 4개니까 
			
			if (arr[i].equals("nice")) {  //만약 arr의 인덱스 중 하나가 nice와 같을 
			
				arr[i] = "good";   //그 인덱스에 good을 대입.

			}
			System.out.printf("%s", arr[i]);    //반복이 끝나면 arr에 변수를 대입한 채로 변수 s 출력.
											//if가 성립되지 않는다면 s 그대로를 출력. "have a nic day "
		}
	}

	
	
	
	
		
	
	}


