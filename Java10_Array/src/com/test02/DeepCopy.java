package com.test02;

import java.util.Arrays;

public class DeepCopy {

	public static void main(String[] args) {
		
	//객체를 복사하는 방식에 따라 얕은 복사와 깊은 복사로 나뉜다. 
	
	// 깊은 값 복사 ( 값 자체를 복사 )
	int [] original = new int[] {10, 20,30,40};
	
	
	
	
	//1.인덱스 값 하나하나를 복사
	int [] copyOne = new int [original.length];
	
 	for (int i =0; i < original.length; i++) {
		copyOne [i] = original [i];  //<-------이렇게 하나하나 넣어서 복사 
		
	}
	
	System.out.println(Arrays.toString(original));  //[10, 20, 30, 40]
    System.out.println(Arrays.toString(copyOne));   //[10, 20, 30, 40]
	System.out.println(original == copyOne);       //같은가? false

	copyOne[1] = 200;            //copyOne 배열의 1번 인덱스에 200을 대입.
	 
	System.out.println(Arrays.toString(original));  //[10, 20, 30, 40]
    System.out.println(Arrays.toString(copyOne)); //[10, 200, 30, 40]   <- 대입 

	
	System.out.println("------------------------------");

	//2.원본 객체에 복사 요청  (.clone())
	int[] copyTwo = original.clone(); // 원본 오리지널 애한테 똑같은애 복사해줘 하는 것. 
	                         // 따라서. int [] copyTwo = new int[] {10, 20,30,40};

	
	System.out.println(Arrays.toString(original));   //[10, 20, 30, 40]
	System.out.println(Arrays.toString(copyTwo));    //[10, 20, 30, 40]  - int[] copyTwo = original.clone();
	System.out.println(original == copyTwo);         //  false
    copyTwo[2] = 300;                                 //copyTwo 배열의 2번 인덱스에 300을 대입.
    System.out.println(Arrays.toString(original));   //[10, 20, 30, 40]
	System.out.println(Arrays.toString(copyTwo));     //[10, 20, 300, 40]

    		 
	
	//둘다 원본에 영향을 미치지 않는 아예 새로운 복사본이 만들어지는 것이라서 false가 나옴.

	System.out.println("------------------------------");
	
   //3. System 을 사용하여 복사
	int [] systemArray = new  int[10];  // 값이 10개가 들어갈 수 있는 배열이 있
	Arrays.fill(systemArray, 4);         //systemArray 배열을 전부 4로 채운다.       
	                                     //Arrays.fill은 배열의 각 원소를 동일한 값으로 변경할 때 사용합니다.  //Arrays.fill( 배열명 , 채워넣을 숫자);
	System.out.println(Arrays.toString(systemArray));   // 그리고 systemArray 배열을 문자열로 출력한다.[4, 4, 4, 4, 4, 4, 4, 4, 4, 4]

	
	
   //System.arraycopy(원본 배열 객체,    원본 시작 위치,       복사 배열 객체,    복사 시작 위치,      복사 갯수);
	// arraycopy (원본 배열,      원본에서 복사 시작할 인덱스,      복사 배열,       복사 시작할 인덱스 , 복사 갯수)
	System.arraycopy(original, 0, systemArray, 5, 3); 
	System.out.println(Arrays.toString(systemArray));   // [4, 4, 4, 4, 4, 10, 20, 30, 4, 4]
   /*
    * 원본 배열은 original {10, 20,30,40} 이고, 
    * 원본 시작 위치는 인덱스 0 이라서 '10'부터 시작
    * 복사 배열 객체는 systemArray [4, 4, 4, 4, 4, 4, 4, 4, 4, 4]
      복사 시작 위치는 5번 인덱스.
      복사 갯수는 3개라서  10,20,30까지.
      따라서, [4, 4, 4, 4, 4, 10, 20, 30, 4, 4]
   /*
    */

	
   System.out.println(original.hashCode());
   System.out.println(copyOne.hashCode());
   System.out.println(copyTwo.hashCode());
   System.out.println(systemArray.hashCode());

	
	//해쉬코드가 다 다름.
	}
	
	//https://blog.naver.com/mingyeung/221946969958
	
//	https://kin.naver.com/open100/detail.nhn?d1id=1&dirId=1040201&docId=1436135&qb=7J6Q67CUIERlZXBjb3B5&enc=utf8&section=kin.ext&rank=3&search_sort=0&spq=0
}

