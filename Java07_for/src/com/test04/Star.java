package com.test04;

public class Star {

	/*
	 * ★ ★★ ★★★ ★★★★ ★★★★★
	 */
	public void prn01() {
		// i는 줄.
		for (int i = 0; i < 5; i++) {
			// j는 별 ( 0+1, 1+1, 2+1, 3+1,4+1)
			for (int j = 0; j < i + 1; j++) {
				System.out.print("★");
			}
			System.out.println();

		}

	}

	/*
	 * ★★★★★ ★★★★ ★★★ ★★ ★
	 */
	public void prn02() {
		// i 는 줄
		for (int i = 0; i < 5; i++) {
			// j는 별(5-0, 5-1, 5-2,5-3,5-4)
			for (int j = 0; j < 5 - i; j++) {
				System.out.print("★");

			}
			System.out.println();

		}

	}

	/*
	 * ★ ★★ ★★★ ★★★★ ★★★★★
	 */
	public void prn03() {

		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < 4 - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < i + 1; k++) {
				System.out.print("★");
			}
			System.out.println();
		}

	}

	/*
	 * ★★★★★ ★★★★ ★★★ ★★ ★
	 */
	public void prn04() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < 5 - i; k++) {
				System.out.print("★");
			}
			System.out.println();

		}
	}

	/*
	 * ★ ★★★ ★★★★★ ★★★★★★★ ★★★★★★★★★
	 */

	public void prn05() {

		for (int i = 0; i < 5; i++) {
			for (int j = 4 - i; j > 0; j--) {
				System.out.print(" ");
			}
			// k 는 별 (2*0+1, 2*1+1, 2*2+1,2*3+1,2*4+1)
			for (int k = 0; k < 2 * i + 1; k++) {
				System.out.print("★");

			}
			System.out.println();

		}

	}
}
