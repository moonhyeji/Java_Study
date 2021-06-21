package com.test01;
import java.util.Vector;

public class MTest02 {
   public static void main(String[] args) {
	
	   
	   
	   Vector<String> v = new Vector<String>();

	   v.add("홍길동");
	   v.add("이순신");
	   v.add("강호동");
	   v.add("유재석");
	   v.add("신동엽");
	   v.add("조세호");
	   v.add("조세호");

         ////System.out.println(v);
         //여기서 toString이 오버라이드 되어있구나 로 유추할 수 있음. 
             
    
	   
	    transElement(v);
	     prnVector(v);

	    
   }
      public static void transElement(Vector<String>v) {
    	  //1. 홍길동의 인덱스를 찾아, : v.indexOf("홍길동")
    	                         //해당 인덱스를 찾는 메소드: indexof : 찾으면 값, 못찾으면 -1을 리턴,: 
    	  //                      :왜 -1?<-리턴하는 값이 인덱스이기 때문에 0부터 인덱스사이즈만큼의 숫자가 오기 때문에 없으면 -1을리턴. 
    	  
    	  
    	  //해당 인덱스의 값을 홍길순으로 바꿔라.  // 인덱스의 값을 바꿔라 라는 메소드: set.
    	  v.set(v.indexOf("홍길동"), "홍길순");
    	   System.out.println(v);
    	  
    	  
    	  
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	  //2. ~신으로 끝나는 객체를 찾아서(string클래스에서 찾자.) , 만일 있으면 "신"을 "자"로 바꾸자.
    	   
    	   
    	 for (int i =0; i<v.size(); i++) {
    		 if(v.get(i).endsWith("신")) {//v에서 i번지값을 가지고 왔는데 걔가 endswith 신이라면, 
    			 //v.get i 번지에 나오는 값이 string값이라서 endswith 은 string클래스의 메소드이다. 
    			
    			 //v.get(i) i=0일경우 홍길순을 의미. 
    		   v.set(i,  v.get(i).replace("신", "자"));
    		 }
    	 }
    	   
    	  System.out.println(v);
    	   
    	  
    	  
    	  
    	  
    	  //3.마지막 글자가 "호"인 객체를 찾아서, 만일 있으면 삭제하자. 
    	 for(String s: v) {
    		 if(s.endsWith("호")) {
    			 // java.util.ConcurrentModificationException 
    			 //얘가 에러나는 경우  v의 덩어리를반복문이 가지고 있는 것,따라서 덩어리 안에서 진행할 수 있는 애가 없을경우 에러가 남. 
    			   // v.remove(s);
    			 
    		 }
    	 }
    	 
    	 
    	 
    	 
    	 
    	 
    	 for (int i =0; i< v.size(); i++) { // 초기값에 조건식이 참이면 명령을 수행한다. 
    		 if(v.get(i).endsWith("호")) {
    			 v.remove(i);
    			 // 여기서 조세호가 2개 있는 경우. 
    			// v.size가 7 이고 총 7개니까
    			 //i가 0부터 시작해서 올라가는데 i가5일 때 조세호가 없어짐. 
    			 //마지막에 i=5일 때 조세호가 없어지면 v.size가 6이 됨. 이  때  i++ 해서 i=6이 되고, i(6)<6은 성립이 안되기 때문에 멈춘다. 
    			 
    			 
    			 
    			 
    		 }
    	 }
    	 
    	 System.out.println(v);
      }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
    public static void prnVector(Vector<String> v) {
    	//<홍길동 이순신 ... 조세호>형태로 출력하자.
    	
        System.out.print("<");
        
        for(int i =0; i<v.size(); i++) {
        	System.out.print(v.get(i)+ " ");
        	//get 메소드  from api
          }

      
        
        //향상된 for문 (for Each문)
        
        ///for (a:b){      
        //b를 a넣어서반복문 안에 넣어서 사용하는 것.    a가. 끝날 때까지. 
        // b우리가 사용할 덩어리. a:우리가 값을 이용할 변수. 
        for(String s : v) {
        	System.out.print(s + " ");	
        }
        System.out.println(">");
    }
    
    //list from api
    // An ordered collection (also known as a sequence).
    //정렬된, 순서가 있는 콜렉션 ( 시퀀스라고도 알려진  시퀀스= 배열
    

    //list 는 배열과 비슷. 
    //순서가 있다 = 내가 입력한 순서대로 들어가 있다. [1.2.3.]
    
    
    
}

