package com.test02;

import java.util.ArrayList;

import java.util.List;

public class MTest01 {
///////////////////////////////////         list////////////////
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("홍길동");
		list.add("이순신");
		list.add("강호동");
		list.add("유재석");
		list.add("조세호");
		list.add("신동엽");

		System.out.println(list);

		//transElement(list);

		
	   list.add("이순신");
	
       System.out.println(list);
       
       
       //list는 순서가 있고 중복이 가능하다. (순서1.3.4.2 =/= 정렬 1.2.3.4.)
       
		
		
	}

	public static void transElement(List<String> list) {
		// 1.홍길동의 인덱스를 찾아 김길동으로 바꾸자.

		list.set(list.indexOf("홍길동"), "김길동");

		// set 바꾼걸 대입해주는 애.
		// indexof 홍길동을 김길동으로 바꾸는 메소
		System.out.println(list);

		
		
		
		
		
		
		// 2. ~~ 신으로 끝나는 객체를 찾아서,
		// 만일 있으면 '신'을 '자'로 바꾸자.

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).endsWith("신")) {
				// list가 가진 i번지 값을 가지고와서 얘가 마지막이 신이라고 끝난다면,
				list.set(i, list.get(i).replace("신", "자"));

			}
		}
		System.out.println(list);

		
		
		
		
		
		
		// 3.끝 글자가 '호' 인 객체를 찾아서 삭제하자.
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).endsWith("호")) {
				// list.remove(i);
				list.remove(list.get(i));

			}
		}
		System.out.println(list);
	}
}
