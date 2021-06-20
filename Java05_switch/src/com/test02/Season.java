package com.test02;

public class Season {

	public static void main(String[] args) {

		Season season = new Season();
		String result = season.prn(1);
		System.out.println(result);

	}

	public String prn(int month) {
		String result = null;

		switch (month) {
		case 12:
		case 1:
		case 2:
			result = "겨울";
			break;
		case 3:
		case 4:
		case 5:
			result = "봄";
		case 6:
		case 7:
		case 8:
			result = "여름";
			break;
		case 9:
		case 10:
		case 11:
			result = "가을";
			break;

		}

		return result;
	}
}
