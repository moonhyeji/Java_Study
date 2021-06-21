package com.test01;
import java.io.File;

public class MTest02 {

	/*
	 * 
	 * c:\  -> window
	 * /User/hyeji moon/  ->linux(mac os)
	 */
	
	public static void main(String[] args) {
		
		File fi = new File("/Users/hyejimoon/Desktop"); 
		
		//파일 객체를 생성.
		// 이 객체에 있는 자식 폴더 혹은 자식 파일까지 다 보여주는 구나!
				
			//	prnFolder01(fi);
		        prnFolder02(fi);
	}
	private static void prnFolder02(File fi) {
		
  /*
   * 파일과 폴더를 구분해서 출력.
   * ex) 
   * file: Dumpstack.log.tmp
   * file: hiberfil.sys
   * dir:  Intel
   * ...
   * file의 총 갯수: n 개
   * dir의 총 갯수 : m 개.
   * 
   */
	  int cntFile = 0;
	  int cntDir = 0;
	  
	  
	  
	  for(File file: fi.listFiles()) { 
		  if(file.isFile()) { //isFile. :파일인지 아닌지.
		     cntFile++;
		 System.out.println("file:"+ file);
		  }else if (file.isDirectory()) {
			  cntDir++;
			  System.out.println("dir :" + file);
		  }
		  
		  }
	
		System.out.println("file의 총 갯수:" +cntFile +"개");
	   System.out.println("dir의 총 갯수:" + cntDir + "개");
		//for (String list: fi.list()) {
		//	System.out.println(list);

		}

	
	
	private static void prnFolder01(File fi) {
		for (String list: fi.list()) {
			System.out.println(list);
			
		}
	}
	
}
