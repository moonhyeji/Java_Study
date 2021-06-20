package com.test02;

import java.util.Arrays;

public class ShallowCopy {

	public static void main(String[] args) {
		// reference 복사 (얕은 값 복사, 주소값 복사)
		int [] original = {10, 20, 30, 40};
		int [] copy = original;   
		
		
		


		System.out.println(Arrays.toString(original));  //[10, 20, 30, 40]

		System.out.println(Arrays.toString(copy));  //[10, 20, 30, 40]

		System.out.println(original == copy); // true. 
	
		copy[1] =200;             //copy 배열의 1번 인덱스에 200을 대입.
		
		System.out.println(Arrays.toString(original));  // [10, 200, 30, 40]

		System.out.println(Arrays.toString(copy));  //[10, 200, 30, 40]
/*
 *   원본에 영향을 미치는 (배열의 주소값을 복사)하기 때문에 
 *   복사 후 변경하면 원본도 변경된다. original의 주소값이 리턴된다.

 */
		
		
	    System.out.println("------------------------------------------");
	    
	    System.out.println(original.hashCode());
	    System.out.println(copy.hashCode());

	    // 따라서 해쉬코드도 다 같음. 
		
	}
	
}
