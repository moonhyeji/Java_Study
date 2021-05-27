package com.test01;

public class Mtest02 {

     public static void main(String[] args) {
     
     // static 호출방법:Class.method();
     Mtest01.publicMethod();
     Mtest01.protectedMethod();
     Mtest01.defaultMethod();
     //Mtest01.privateMethod();
     
     
     
     
     
     System.out.println();
     
     
     
     // non-static 호출방 : Class 변수 = new Class();
                     //        변수.method();                     
     Mtest01 nonStatic = new Mtest01();
     nonStatic.nonStaticMethod();
     
    		 
     
     
     
     }
	
}
