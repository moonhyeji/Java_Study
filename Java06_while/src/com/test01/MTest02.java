package com.test01;

public class MTest02 {

	public static void main(String[] args) {

		// 1. 1~100까지의 숫자를 역순으로 출력하자. hint: 100부터 시작하자. int i =100
		// prn01();

		// 2.1~100까지의 숫자 중 2의 배수만 출력하자.
		prn02();

		// 3. 1~100까지의 숫자 중 7의 배수의 갯수와 총 합을 출력하자.
		// prn03();

	}

////// 내가 푼 값. 
	public static void prn01() {

		int i = 100;
		while (i < 101) {
			System.out.println(i);
			--i;
			if (i == 1) {
				break;
			}
		}

	}

	//////// 정답.
	// public static void prn01() {
	// int i = 100;
	// while(i>0) {
	// System.out.println(i);
	// i--;
	// }
	// }

	// 2.1~100까지의 숫자 중 2의 배수만 출력하자.

	public static void prn02() {

		int i = 1;

		while (i < 101) {

			if (i % 2 == 00) {
				System.out.println(i);

			}
			i++;

		}
	}
	// 틀린이유 i++; 를 System. out. 바로밑이 아니라 }뒤에두.

	// 3. 1~100까지의 숫자 중 7의 배수의 갯수와 총 합을 출력하자.

	public static void prn03() {
		int i = 1;
		int count = 0;
		int sum = 0;

		while (i < 101) {
			// 만약 7의 배수라면,

			if (i % 7 == 0) {
				// count++ 해주고 (배수의 개수 증가.)
				count++; // 카운드라는 애를 두고 , 조건에 맞으면 1씩 증가시키자.

				// sum에다가 sum+ 현재 값을 넣자.
				// sum + 7 의 배수
				// sum = sum + i;
				sum += i;
			}
			i++;
		}

		System.out.println();
		System.out.println("7의 배수의 개수 : " + count);
		System.out.println("7의 배수의 총합 : " + sum);

	}

}
