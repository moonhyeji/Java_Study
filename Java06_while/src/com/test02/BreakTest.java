package com.test02;

public class BreakTest {

	/*
	 * A B C B D E 
	 * F G H I J K 
	 * L M N O P Q 
	 * R S T U V W 
	 * X Y Z 를 출력하자.
	 */

	
	
	
	public static void prn() {

		int count = 0;
		char c = 'A';
		boolean stop = false;

		
		
		
		while (!stop) {
			while (true) {    // <- 조건이 트루면 무한반복.
				System.out.printf("%3c", c);
				c++;
				count++;

				if (count % 5 == 0) {
					break;    // break를 만나면 반복문 밖으로 나감.
				
				}
				
				if (count % 26 == 0) {
					stop = true;
					break;
				}

			}
			System.out.println();

		}
	}


  public static void main(String[] args) {
	  prn();
	  
  }
  }
  
  
  
  
  
  
