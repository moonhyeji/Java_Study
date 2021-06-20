package com.test02;

public class ContinueTest {

	public static void main(String[] args) {

		prn();

	}

	public static void prn() {
       int i = 0;

		while (i < 10) {
			
			i++;
			if (i % 2 == 0) {
				continue; //  이 밑에 있는 명 령 (System~)을 무시하고 
				         //다음 조건(while)을 확인해라(조건으로 돌아가서반복해라) 라는 뜻.
			}
			System.out.println(i);

		}
	}

}
