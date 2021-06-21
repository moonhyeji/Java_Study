package com.test02;


import java.util.ArrayList;
import java.util.List;

import com.compare.Score;
import java.util.Comparator;
import java.util.Collections;



//하나의 파일에서 퍼블릭의 클래스는 하나밖에 못만듦.//하지만 클래스는 여러개 만들 수 있음. 
public class MTest02 {
	
	
    public static void main(String[] args) {
		List<Score> list = new ArrayList<Score>();
	   //여기서List라는 애는 컬랙션을 상속받음. 
		/*
		 * 컬렉션: 여러개의 값을 효과적으로 관리하기 위한 객체.
		 * 
		 *  배열: 같은 타입만. 크기가 처음 객체 생성될 때 고정됨.
		 *  컬렉션: 타입 내 마음대로 넣을 수 있음. 크기가 점점 커짐 (-백터 사용)
		 *  
		 *  
		 *  리스트: 내가 넣어주는 대로 크기가 정렬됨. 중복 가능. 
		 */
		
		
		
		
		
		
		Score hong = new Score();
		hong.setName("홍길동");
		hong.setKor(100);
		hong.setEng(78);
		hong.setMath(39);
		list.add(hong);
		
		
		Score lee = new Score("이순신", 79, 100,78);
        list.add(lee);	 

	     list.add(new Score("김선달", 50,90,100));    	
    	
	     System.out.println(list);
	     System.out.println("----------");
	     Collections.sort(list, new MySortTest());
	     
	     
	     //collection.sort할 때는 comparator로 정렬을 해주는데 
	  /*   얘를 상속받은 애compare라는 애를 강제로 구현시킨다. 
	     o1= other 1
	     o2 =other 2 
	    
	   other 1 과 other2 를 비교할 것이다.  다른놈 두개 
	   */
	    //score.java 에서는  this와 other를 비교.
	     
	     
	     
	     System.out.println(list);
    	
    	
	}

}


/*
 * 
 * 
 *  + : 앞의 인자가 더 큰값
 *  0 : 같은 값
 *  - : 뒤의 인자가 더 큰값 
 *  
 */

//하나의 파일에서 퍼블릭의 클래스는 하나밖에 못만듦.//하지만 클래스는 여러개 만들 수 있음. 
   class MySortTest implements Comparator<Score>{
	//외부클래스를 따로 만들어서 외부클래스의 객체가 내가 비교하고 싶은 애를 비교해줌. 
	   
	   
	   
	//other 1과 other 2를 비교.  (Score.java. -> comparable.)
	@Override
	public int compare(Score o1, Score o2) {
		if(o1.getAvg() > o2.getAvg()) {
			return 1;
		} else if(o1.getAvg() < o2.getAvg()) {
			return -1;
		}
		 return 0;
		 
	}
}

// 내가 원하는 기준에 따라서 정렬이 다르게 됨. 


/*
 *Comparable
 *-compareTo(Object other)
 *각각의 "나(this)" 와 "다른객체(other)"를 비교.
 *
 *
 *Comparator
 *-compare(Object other1, Object other2)
 *  :객체 1과 객체 2를 "심판"이 비교  
 * 첫번째 매개변수가 더 클 때 양수를 반환하여 오름차순으로 정렬.
 *
 * 
 */



