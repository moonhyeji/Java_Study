package com.test03;

import java.util.HashSet;
import java.util.Set;


public class MTest01 {
	
	
	public static void main(String[] args) {
		
		
		Set<Integer>set = new HashSet<Integer>();
		set.add(4);
		set.add(2);
		set.add(1);
		set.add(3);
		

		
		for (Integer s: set) {
			System.out.println(s);		
		}
	     
		System.out.println("----------");
		
		//       findSetElement(set, "5");
		}

    // 출력된 값.: 1234567
	//	set:? 얘가 내가 넣어준 값을 자동으로 정렬하나? 
	//- 아님! 정렬 안해줌. 그냥 내가 넣어준 값을 내부적으로 가져서 가지고 있음
				
				
	    //set.add3 을 마지막에  두번 넣어줬는데 중복  안되고 순서도 없음! 
	    // 출력된 값.: 1234567
//------------------------------------------------------
		     
	
	
	public static void findSetElement(Set<String>set, String find) {
		             //set에 있는특정 요소가 find와 같은 값일 때, "5찾았다!"라고 출력하자. 
	//우선 set의 처음부터 마지막까지 불러와야,
	//	for(int i =0; i<set.size(); i++) {
	//		set.get(i);
	//	}
	//set에는  get메소드가 없다고 나옴. : set의주머니에 숫자가 뒤죽박죽 들어가 있어서 순서가 없기 때문에 get(index)메소드가 없다! 
	
		for(String s: set) {
			if(s.equals(find)) { //set안의 string을 찾아보기! string과 관련한 메소드니까. 
				System.out.println(find + "찾았다");
			}
			}
		}
		
}
