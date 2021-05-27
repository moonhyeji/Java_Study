package com.test01;

public class MTest {

	// 1. 사칙연산
	// 상수 : 변수 앞에 final을 붙인다.
	public static final int TEN = 10;

	public static void main(String[] args) {
		

		System.out.println(opr01(TEN, 3)); /// opr 01을 출력
		System.out.println(opr02()); /// opr 02를 출력

		opr03(TEN, 3);
        opr04();
        // System.out.println(opr04()); <-이렇게 해서 출력 안하는 이유:리턴할 값이없어서. 리턴값이 void
        
        opr05();
        
        boolean result = opr06();
        System.out.println(result);
        
        opr07();
        
        
        
        
	}

	public static String opr01(int a, int b) {
		System.out.printf("%d + %d = %d\n", a, b, a + b);  // \n:줄바꾸기.
		System.out.printf("%d - %d = %d\n", a, b, a - b);
		System.out.printf("%d * %d = %d\n", a, b, a * b);
		System.out.printf("%d / %d = %d\n", a, b, a / b);
		System.out.printf("%d %% %d = %d\n", a, b, a % b);

		return "사칙연산 끝\n";

	}

	// 2. 대입연산
	public static String opr02() {
		int res = 0;
		System.out.println("res:" + res); // 0
		
		res = res + TEN;
		System.out.println("res:" + res); // 10
		
		res = res + 3;
		System.out.println("res:" + res); // 13

		// res = res + TEN;
		res += TEN;    //23
		System.out.println("res:" + res); // 23
		return "---------------";

	}

	// 3. 증감연산자 10 3               <<oper03(ten, 3)
	public static void opr03(int a, int b) {
		/*
		 * 증감연산 (++,--) 변수의 앞,뒤에 증가/증감연산자를 붙이게 되면, 변수가 가진 값을 1씩 증가/증감하게 된다.
		 * 
		 * 전위연산자(++a): 연산자를 변수 앞에 붙이면, 연산을 먼저 하고 값을 나중에 리턴한다. 
		 * 후위연산자(a++): 연산자를 변수 뒤에 붙이면, 값을 먼저 리턴하고 연산을 나중에 한다.
		 */

		// 리턴(연산자)
		System.out.println(a); //   10(10)
		System.out.println(a++); // 10 (11) 값먼저리턴 (나중에 연산)
		System.out.println(++a); // 12 (12)  (나중에연산) +1
		                                 // 연산먼저하고 연산된값리턴.

		int result = a++ + --b + b++ + ++a;
		System.out.println(result);

          //순차적으로 연산하면서 나오는 리턴값에 대한 연산을 뒤에서 해줌****
		
		
		// result의결과는?
		// 12(13) + 2(2) + 2(3) +14(14) =30
		

	}

	
	
	//4. 논리연산자
    public static void opr04() {
    	//  & : and (그리고)
    	// |  : or (또는)
    	// 결과 -> true/ false
    	
    	
    	
     // & : 양 쪽 모두 true  여야지 true    	
     System.out.println(true & true);   //true
     System.out.println(true & false);  //false
     System.out.println(false & true);  //false
     System.out.println(false & false); //false

     // | : 둘 중 하나만  true 면 true
     System.out.println(true | true);   // true
     System.out.println(true | false);  //true
     System.out.println(false | true);  //true
     System.out.println(false | false); //false

    System.out.println("--------");
    
    
    
    //&& : 양 쪽 모두 true여야 true.  앞의 값이 false면, 뒤의 조건을 확인하지 않음. (+ 기본 &의특징 그대로)
    System.out.println(true && true);   //true
    System.out.println(true && false);  //false
    System.out.println(false && true);  //false
    System.out.println(false && false); //false

    
    // || :어느 한쪽만 true라도 그 결과는 true이다. 앞의 값이 true면 , 뒤의 조건을 확인하지 않음.
    System.out.println(true || true);   //true
    System.out.println(true || false);  //true
    System.out.println(false || true);  //false
    System.out.println(false || false); //false
    
    System.out.println("-------------");
    
    int a =2;
    int b =3;
    System.out.println((a>b)&&(a<b));  //false.
    
    }
    
    
    //5. 비교연산
    public static void opr05() {
    	int i = 10;
    	
    	System.out.println(i == TEN);  //true
    	System.out.println(i != TEN);   //!= 같지않다.  false
    	System.out.println(i > 5 );  //true
    	System.out.println(TEN <= 50); //true
    	
    	
    }
    
    //6. 삼항연산   : 
    public static boolean opr06() {
    //타입 변수 = (조건)? 참일때 리턴값 : 거짓일 때 리턴값;
    	//타입 = 참 리턴값  = 거짓 리턴값의 타입이 일치!
    	
    int a = 2;
    int b = 3;
    int i = (a>b)? a + b : a - b;
    System.out.println(i);  //()조건식이 거짓이기 때문에 , 거짓일 때 리턴값(a-b)를 출력. 
    
    boolean res = (a>b)? true : false;
    
    return res;   // false
    
    	
}
   //7. 비트연산 ---------->>>> 별로 안중요. 이런게 있다 하고만 넘어가기.
    public static void opr07() {
    	// &, |, ^, ~, <<, >>
    	//0, 1비트 상태에서 연산한다.
    	
    	
    	//int 는 4byte. =  32bit
      int a = 10;
      // 0000 0000 0000 0000 0000 0000 0000 1010
      int b = 2;
      // 0000 0000 0000 0000 0000 0000 0000 0010
      
      System.out.println(a & b);
      // 0000 0000 0000 0000 0000 0000 0000 1010
      // 0000 0000 0000 0000 0000 0000 0000 0010
      //&-----------------------
      // 0000 0000 0000 0000 0000 0000 0000 0010

      
      //a.b가 정수임. 정수값에 &연산 하면 비트연산으로 바뀜.
      // 1 = true 전기가 들어옴. 0= false = 전기가 안들어옴.
     
      System.out.println(a | b);
      //결과값은 1.  / 10 
     // 0000 0000 0000 0000 0000 0000 0000 1010
      // 0000 0000 0000 0000 0000 0000 0000 0010
      //&-----------------------
      // 0000 0000 0000 0000 0000 0000 0000 0010


      
      System.out.println(~a);
      // 0000 0000 0000 0000 0000 0000 0000 1010
      // 1111 1111 1111 1111 1111 1111 1111 0101
      
     System.out.println("------------");
     
     int c = 10;
     // 0000 0000 0000 0000 0000 0000 0000 1010
    System.out.println(Integer.toBinaryString(c));
    System.out.println(c);
    
    
    System.out.println(Integer.toBinaryString(c>>2));
    System.out.println(c >>2);
    
    // 0000 0000 0000 0000 0000 0000 0000 1010
    //  00 0000 0000 0000 0000 0000 0000 10  쪽으로 두칸 감. 

    System.out.println(Integer.toBinaryString(c << 1));
    //  000 0000 0000 0000 0000 0000 0000 1010 0  오른쪽으로 한칸 연산.. 
    System.out.println( c <<1);      	
    	
    }
    
    
    
    
}
    
    
    
    
    
    
    