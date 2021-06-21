package com.test03;

import java.util.Set;
import java.util.HashSet;
import com.compare.Score;
import java.util.Iterator;

public class MTest02 {

	
	public static void main(String[] args) {
		
	Set<Score> set = new HashSet<Score>();
		set.add(new Score("홍길동", 100, 90, 60));
		set.add(new Score("이순신", 50, 95, 100));
		set.add(new Score("김선달", 88, 100, 58));
	
		
	 transElement(set,   "이순신", 10);
		printSet(set);
	 

	}
	
	/////////////////////////////////////////////////////////////////////////
  
	
	private static void transElement(Set<Score> set, String name, int kor) {
		//iterator: collection의 저장 요소들을 읽어드리는 표준화된 방법이다.!
       //set에서 name을 찾아서, 국어점수의 값을 kor로 바꾸고, 전체출력하자. 	
    Iterator<Score> ir = set.iterator();
    while(ir.hasNext()) {   //만약 그 다음 값이 있으면  
      Score temp = ir.next(); //Score을 어딘가(temp)에 담아놓고, 
    		  
    	if(temp.getName().equals(name)) {   //호출해서 변경 // 그 temp에 담은 값의 이름이 같으면
    		temp.setKor(kor);// 이름을 바꾸자. 
    	}
    }
    System.out.println(set);
    
    
    
    
	System.out.println("--------------");

	
	}
	
	

    
    
    
    
    
	
    
	private static void printSet(Set<Score> set) {
		//방법1
		/*
		 * for(Score sc : set){
		 * System.out.println(sc);
		 * }
		 * 
		 */
		
		
		
		
		
		/////////////////////////////////////////방법2
		Object[] objectArr = set.toArray();
		for (int i =0; i < objectArr.length; i++){
			
			//이름만 출력해 주세요. 
			System.out.println(((Score)objectArr[i]).getName());
			//Score타입에는 getname 메소드가 있음. score.java
			// cf. )(objectArr[i].getName()); - 이렇게 하면 안됨. object타입이기 때문에 원래 타입 ( score)로 바꿔줘야 함. 

		}
		
		
		
		
		
		
		
	System.out.println("--------------");
		
		///////////////////////////////////////////방법 3
		//interator: collection의 저장 요소들을 읽어드리는 표준화된 방법이다.! 
		//-> collection의 저장요소니까 list도 됨. 
		//점수까지 다 출력 . 
		Iterator<Score> iterator = set.iterator(); 
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
		/*
		 * 이름 : 홍길동국어 : 100영어 : 90수학 : 60총점 :250평균 : 83.33333333333333등급 : B
           이름 : 이순신국어 : 10영어 : 95수학 : 100총점 :205평균 : 68.33333333333333등급 : D
           이름 : 김선달국어 : 88영어 : 100수학 : 58총점 :246평균 : 82.0등급 : B

		 */
		
		
		
		
		
		
	}
}
