package com.test02;

public class MTest {

	
  public static void main(String[] args) {
	
	    FruitBasket bananaBasket = new FruitBasket();
	
		bananaBasket.basketSetting("바나나", 10);
		bananaBasket.fruitCount = 50;
		
		System.out.println(bananaBasket.fruitCount);
		//bananaBasket.basketSize = 100;
		
		FruitBasket.basketSize = 100; // fruitbasket 이라는 참조타입의 바스켓사이즈라는 변수를 100으로 바꾸자.static이라 바뀌는 거 가능.
		
		System.out.println(bananaBasket.basketSize);
		
		//FruitBasket.fruitCount = 30;
		
		
		FruitBasket appleBasket = new FruitBasket();
		
		appleBasket.basketSetting("사과", 30);
		
		System.out.println(appleBasket.fruitCount);
		System.out.println(appleBasket.basketSize);
	

  }	
	
}
