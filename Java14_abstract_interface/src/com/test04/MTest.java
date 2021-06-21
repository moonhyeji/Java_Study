package com.test04;

public class MTest {

	
	
	
	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.bark();
		cat.eat("참치");
		
		
	   Dog dog = new Dog();
	   dog.bark();
	   dog.eat("육포");
	   
	   
	  Eagle eagle = new Eagle();
	  eagle.bark();
	  eagle.eat("쥐");
	  eagle.fly();
	  
	  
	  //이제까지 animal eagle = new eagle();햇는데 왜 eagle eagle = new eagle(); 일까?
	 // eagle은 animal도 받아서 상속했고 bird도 받아서 상속함. (extends animal. implement bird)
	  
	  // animal로 바꾸면 animal타입 안의 메소드들만 사용 가능. animal 안에 플라이가 없어서 플라이 못 가져옴. 
	  //bird로 바꾸면  bark, 랑 eat이 없다고 나옴.  -> 애니멀걸 못씀.
	  // 왜냐면 부모타입 메소드만 사용 가능해서 .
	  // 따라서 여러개 받은 경우 eagle.하는게 편함. 
	  
	  
	  
	  
	}
}
