package com.test03;

public class sumX {

	/*
	 * 1  2  3  4  5 
	 * 6  7  8  9 10 
	 *11 12 13 14 15
	 *16 17 18 19 20
	 *21 22 23 24 25
	 * 
	 * 
	 * x 의 총 합을 구하자. ( 1. 5. 7. 9 13. 17 19 21 25) 정답 : 117
	 * 
	 */


	public static void main(String[] args) {

		          prn();
		          }
	
	public static void prn() {
		int cnt = 1;
		int sum = 0;

		for (int i = 0; i < 5; i++) {
			
			for (int j = 0; j < 5; j++) {
				
				if((i == j)||( i +j == 4)) {
					sum += cnt;
				}
				
				System.out.printf("%3d", cnt++);
                  
                   
			}
			System.out.println();

		}
	}

}
