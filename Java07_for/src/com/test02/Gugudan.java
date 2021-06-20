package com.test02;

public class Gugudan {

	public static void main(String[] args) {
		gugu();
		gugu2();

		//gugudan();
		// while 로 풀자.

	}

	public static void gugu() {
		// 2단부터 9단까지 전체 출력.
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i * j);
			}
		}
	}

	public static void gugu2() {
	//2단부터 9단까지 전체출력
	     for(int i =2; i<10; i++) {
     	  System.out.println("<"+i+"단"+">");
     	  
		
         for(int j =1; j<10; j++)
         System.out.println(i + "*" +j + "=" +( i*j));

}


}
}
