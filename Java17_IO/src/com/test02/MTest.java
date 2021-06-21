package com.test02;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.BufferedInputStream;

public class MTest {

	
	public static void main(String[] args) throws IOException {
		
		
		String fileName = "a.jpg";
		// a.jpg 파일을 읽어들인다 = a.jpg안의 데이터 가져와서 이 파일을 . 다른 파일에 새로 만들write 것이다. 
		//파일을 복사하겠다. 파일을 읽어들여서 다시 만들겠다.
		
	//	FileInputStream fi = new FileInputStream(fileName);
	//	BufferedInputStream bi = new BufferedInputStream(fi);
		//Buffered. : 데이터를 담아두는 임시저장소. 
	
		//-> 이 두줄을 한줄로 바꾸면.
		BufferedInputStream bi= new BufferedInputStream(new FileInputStream(fileName));
		//BufferedInputStream 은 한줄한줄이 아니라 덩어리로 
		
		
		FileOutputStream fo = new FileOutputStream(new File("b.jpg"));
		
		int a = 0;
		while((a = bi.read()) != -1) {
			fo.write(a);
		}
		// 나중에 만든 객체부터 먼저 닫자. 
		fo.close();
		bi.close();
		
		
	}
}
