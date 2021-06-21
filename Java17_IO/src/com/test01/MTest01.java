package com.test01;
import java.io.File;
import java.io.IOException;
public class MTest01 {

	
	public static void main(String[] args) {
		
		//해당 경로에 fi 생성.
		File fi = new File("/Users/hyejimoon/Desktop");  //파일 객체를 생성.
		
		
		
		
	   if(fi.exists()) {
		   System.out.println("exists!");
	 
	   }else {
		   System.out.println("new!");// 존재하지 않으면 new를 출력하고 
		   fi.mkdirs();  //mkdir은 makedirectory :  디렉토리를 새로 생성하는 명령어 // 디랙토리 하나 새로생성.
	   }
	   
	   
	   
	   
	   //fi 밑에 AA생성
	  File aa = new File(fi, "AA");
	  aa.mkdir();                //mkdir은 makedirectory :  디렉토리를 새로 생성하는 명령어
	  
	  
	  //fi밑에 BB생성 
	 File bb = new File("/Users/hyejimoon/Desktop","BB"); 
	 bb.mkdir();
	 
	 
	 
	 
	 
	 //AA밑에 a.txt생성
	 File a = new File(aa, "a.txt");
	 
	 
	 
	 
	 //compile시 처리해야 하는 예외 = checked exception
	 try {
		a.createNewFile();
		
	} catch (IOException e) {
		e.printStackTrace();
	}
	}
}
