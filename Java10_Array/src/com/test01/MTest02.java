package com.test01;


import java.util.Arrays;



public class MTest02 {

	
	//1.다차원 배열 .
	public static void main(String[] args) {
		
	
	
	int [][] a = new int [3][2]; //첫번째 [] 는 0.1.2 총 3개이고,  두번째 [] 는 0.1 총 2개임.
	a[0][0] =1;
	a[0][1] =2;
	a[1][0] =3;
	a[1][1] =4;
	a[2][0] =5;
	a[2][1] =6;

	System.out.println(a[1][1]);
   
	
	
	
	
	
	
	
	
  System.out.println("--------------------");
	
	
	
	
	//2. 큰배열 안에 크기가각각 다른 작은 배열을 넣을수도 있다.
	int [][] b = new int[3][];
	
	b[0] = new int [3];
	b[1] = new int [5];
	b[2] = new int [2];
	
	
	int [][] p;
	p = new int[2][2];
	p[1][1] = 1;
	p[0][0] = 1;   //....
	
	
	

	
	//3.   {}; 큰배열 안에  작은배열 4개가 들어가있다.
	int [][] c = new int[][] {
		                    {1,2},
		                    {3,4,5,6,7},
		                    {8},
		                    {9,10,11}
                         };
                    
                         
                     
    //4.
     int [][] d = {{1,2,3,4},   {5},     {6,7},     {8,9,10}};
       
     
     System.out.println( d[3][1]);  //0123 의 3 {8.9.10}의  01 두번째니까 9 출력.
     
     System.out.println("--------------------");

    	prn(d);  //prn메소드에 d배열을 이용하는 거니까 여기에 위치.

       	
       	
       	
       	
       
       String[][] s = {{"have","a","nice","day"},{"너무","어려워"},{"배열","이차원배열"}};
                                     modi(s);
        
      System.out.println("--------------------");

        
        
        
        
        
        String [] qclass = {"트와이스","아이유","강동원","주지훈","차은우"};
                       System.out.println(Arrays.toString(qclass)); //배열(array)을 문자열(String)로 출력)하기
        									//(qclass)배열을  문자열로 출력. -- 객체의 정보를 문자열로 만들어 리턴하도록 하는 메서드

  //        [트와이스, 아이유, 강동원, 주지훈, 차은우]

                       
                       
  System.out.println("--------------------");

                             System.out.println(Arrays.toString(s));
                             
                           //Arrays.toString(s) 가 1차원 배열일 경우 그대로 잘 출력되는데 2차원배열일 경우 주소값이 출력됨.
                           //ㄴ 이유: Arrays.toString() 도 배열의 요소 값의  toString() 메서드를 호출하여 
                           //요소의 값을 출력해 주는 것이기 때문에 .   
                           //2차원 배열일 경우  배열의 요소는 배열이므로  배열의 toString() 불러와 출력하면  해시코드 밖에 출력되지 않습니다.
                                

     System.out.println("--------------------");
       
                            System.out.println(Arrays.deepToString(s));  //Arrays.deepToString : ()배열, 2차원배열을 출력. 


        
        
        
                            
                            
        
        
        
       }
	
	
	

	
	
	  //문	public static void prn(int[][] arr) {
			//arr 배열의 모든 요소를 출력하자.
			
		
		
		public static void prn(int[][] arr) {
			//arr 배열의 모든 요소를 출력하자.
			
			for(int i = 0 ; i <arr.length; i++) {

				for (int j = 0; j <arr[i].length; j++) {
					  // arr[i].length arr의 i번지의 랭스. // i는 배열안의 값이 아니라 인덱스 값이기 때문에 
				  System.out.printf("%3d",arr[i][j]);
				}
			
			System.out.println();

		}

	 }
		  // nice -> good/ 어려워 ->쉬워 로 바꾸고 전체 출력하자. 

		public static void modi (String[][] arr) {		  
		 arr [0][2] = "good";
		 arr [1][1] ="쉬워";
		
	    for (int i =0; i <arr.length; i++) {
	    	for (int j =0; j<arr[i].length; j++) {
	    	
	    		System.out.printf("%s", arr[i][j]);
	    	}
	    	System.out.println();
	    }
	}
	
	
	


}
