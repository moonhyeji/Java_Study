package com.lotto;

import java.util.Arrays;

/*
 *  중복되지 않는6개 숫자 (1~45)를 작은 순부터 차례대로 정렬하여 콘솔에 출력하는 프로그램을 만들자. 
 */



// 로또 배열 생성 
//중복 값 판별
//정렬
//배열출력

public class Lotto {
//로또 배열 생
	   private int[] make() {
		int [] arr = new int[6]; //6칸짜리 만들거야.
		int index = 0;
				while (index <6) { //0-5까지 인덱스가 있으니까.
		  int insert = (int)(Math.random()*45)+1;
		       if(!isSame(arr, insert)) { //만약 여기서 트루가 나오면 중복이다. (같은게 있니? 라는 뜻. 
			                    //! = not (트루가 나오면 내가 원하지 않는 것, false가 나와야만 함. 
			                //if ~else 안쓰는 이유: 잘 안쓰고 우리가 원하는 참의 조건을 괄호안에넣음.
			  arr[index] = insert;
			  index++;
			  
		  } 
		  }
		return arr; //리턴값은 미리 지정해주기 (처음엔 return null)
	}
	
	
	
	
	
	
	
	
	
	
	
	private boolean isSame(int[] arr, int insert) { // 중복 값 판별 
		        //int [] arr : 만들어지고 있는 배열
		
		
		
		boolean same = false;
		for(int i =0; i<arr.length; i++) {
			if(arr[i] == insert) {
				same = true;
				
			}
		}
		//만일 arr의 i번지 값이 인서트 값고 ㅏ 같으면
		//브레이크 해서 멈출 것이다. 
		
		
		
		return false;
		
		
		
		
	}
	
     private void sorting(int[] arr) {    //정렬하는 매소드   1번인덱스와 2번인덱스를 비교하고 왼쪽에 있는 애가 더크면 서로를 바꿔줄것. 이것을 계속 반복. 
    	// 버블정렬 : bubble sort 
    	 for (int i =0; i<arr.length; i++) {
    		 
    		 for (int j =0; j<arr.length-1;j++) { // arr.length-1 인 이유  :1번인덱스 기준으로 2번인덱스와 비교하기 & 5번인덱스 기준으로 6번인덱스와 비교하기. 
    			
 				// System.out.println(i + "->" + Arrays.toString(arr));

    			 
    			 if(arr[j]>arr[j+1]) {  //j가 j+1보다 크면 바꿔주자.
    				//swap
    				int tmp = arr[j+1];   //j+1  잠깐 딴곳에 옮겨주
    				arr[j+1] = arr[j];    //j를 j+1자리에 옮김.
    				arr[j] = tmp;
    				
    				
    			} 

    		 }
    	 }
 }
	
      
      
      
      
      //배열출력하는메소
     
     

     public void prn(){
     	int[] arr = make();
        
     //  System.out.println(Arrays.toString(arr));

//        sorting(arr);
//Arrays.sort(arr);
     	
     	
     	System.out.print("[");
     	for(int i =0; i<arr.length; i++) {
     		System.out.printf(arr[i] + " ");
     	}
	System.out.println("]");
}
	
	
}
