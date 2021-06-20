package com.test01;

public class MTest03 {

	public static void main(String[] args) {

		char[] ch = new char[26];

		for (int i = 0; i < 26; i++) {

			ch[i] = (char) ('a' + i);

		}

		/*
		 * 
		 * 1)다음과 같이 출력하라. 
		 * a b c d e f 
		 * g h i j k l 
		 * m n o p q r 
		 * s t u v w x 
		 * y z
		 */

		 prn(ch);

		// 2)1번과 같은 형태인데 , 거꾸로 출력하라.
		 reverse(ch);

		// 3) 1 번과 같은 형태인데 , 대문자로 출력하라.
		// upper(ch);
		 
		 
		 
		 
		 
		 
	}

	public static void prn(char[] ch) {
		for (int i = 1; i <= ch.length; i++) {
			System.out.printf("%c", ch[i - 1]);
			if (i % 6 == 0) {
				System.out.println();

			}
		}

		System.out.println();

		
		
		////2.//////////////////////
		
		
	}

	public static void reverse(char[] ch) {
		int cnt = 1;

		for (int i = ch.length; i > 0; i--) {
			System.out.printf("%c", ch[i - 1]);

			if (cnt % 6 == 0) {
				System.out.println();
			}
			cnt++;
		}

		System.out.println();

	}

	public static void upper(char[] ch) {
  //java.lang.Characte 클래스에서 ''대문자"로 바꾸는 메소드 사용.
				
		
		
		
			for (int i = 1; i <= ch.length; i++) {
				System.out.printf("%c", Character.toUpperCase(ch[i - 1]));
				
				if (i % 6 == 0) {
					System.out.println();

				}
			}
	
			System.out.println();
		
		
	
	}
}
