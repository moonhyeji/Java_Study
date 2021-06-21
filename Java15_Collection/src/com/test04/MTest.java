package com.test04;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.Collection;
import java.util.Map.Entry;

public class MTest {

	public static void main(String[] args) {
		

		/////////map//////////////////
		///hashmap
		
		
		Map<Integer, String> map = new HashMap<Integer,String>();
		
		for(int i = 111; i <116; i++) {
			map.put(i, i+"abc");
		}
        map.put(112, "115abc");

		
	//	System.out.println(map);     //{112=112abc, 113=113abc, 114=114abc, 115=115abc, 111=111abc}
		                           //map은 무작위로 정렬되어있음. = 순서없음. 
        
       System.out.println(map); //{112=115abc, 113=113abc, 114=114abc, 115=115abc, 111=111abc}

        //{112=112ab} 에
        // 키(왼쪽의 112) 중복 안됨. 밸류(115abc)는 중복됨.

	      System.out.println("---------");

        
       printMap(map);

	      System.out.println("---------");

	}
	//list. set. map의 표 꼭 외우기!!!!!
	
	

	
	
	
	
	private static void printMap(Map<Integer, String> map) {
		//key  들만 출력하자 (api참고.)
		Set<Integer>keys = map.keySet();
		System.out.println(keys);
		
		
		
		//value들만 출력하자.
		Collection<String> values = map.values();
		System.out.println(values);
				
		
		//key가 111인 value들만 출력하자.
		System.out.println(map.get(111));
	
		
		
		
		
		
	      System.out.println("---------");

		
		
		//entry: key 와 value를 한번에 관리하는 map과는 달리, key value각각을 관리한다.
		//map<key, value> : get(key) ->vlaue 리턴.
		//entry : getkey(), hetValue() 따로, 
		
	  Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
	  for(Entry<Integer,String>entry: entrySet){
		 System.out.printf("%d : %s\n", entry.getKey(), entry.getValue());
	  }
	
      System.out.println("---------");

      
      
      
      
      
      
	//키가 111인 요소의 key  와 value를 각각 출력하자 .
    int key = 111;
    Set<Map.Entry<Integer, String>> test = map.entrySet();
    Iterator<Entry<Integer,String>> ir = test.iterator();
    while(ir.hasNext()) {
    	Entry<Integer,String>entry = ir.next();
    	if(entry.getKey() == key) {
    		System.out.println(key + ":" + entry.getValue());
    	}
    }
}
}
