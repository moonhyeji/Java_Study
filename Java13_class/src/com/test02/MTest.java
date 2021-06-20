package com.test02;

public class MTest {

	public static void main(String[] args) {
		
	
	
	Cat cat = new Cat();
	cat.bark();
	
	Dog dog = new Dog();
	dog.bark();
	
	
	/*
	 * 동물:고양이  <- 동물: 이 붙는 이유. 부모의 기본생성자가 머저 나오기 때문에 (Animal의 기본생성자.)
       울음소리 : 야옹
       동물:멍멍이
         울음소리 : 멍
	 * 
	 * 
	 * 
	 */
	
	
	
	
	
	
	   /// 다형성:  형태는 같은데 하는 일은 다른것 ! <some.bark();>
       Animal some = new Dog();  //부모타입 = 자식객체  부모타입의 썸은 자식객체 도그를 받아서 멍멍 할 수도 있고, 
       some.bark();
       
       some = new Cat();  // 썸은 자식객체 캣을 받아서 야옹 할 수도 있따. 
       some.bark();
       
       
    // some.eat(); < some. 이라는 객체가 부모타입으로 되어 있기 때문에 자식객체가 가지고 있는eat를 불러올 수없다. >
     
	
       
       
       /*
        * 다형성
        * 1.부모(선조) 타입으로 자식 (후손) 생성
        *  Parent p = new Child();
        *  
        * 2.부모의 이름에 자식객체 대입
        *  Child c = new Child();
        *  Parent p = c;
        * 
        * 3.부모의 메소드를 통해 자식의 메소드 호출. 
        * 
        * 
        * 
        * 
        */
	}
}
