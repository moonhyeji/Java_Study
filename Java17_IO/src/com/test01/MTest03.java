package com.test01;

import java.io.File;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileInputStream;

public class MTest03 {

	public static void main(String[] args) {
		File fi = new File("a.txt");
		
		
		MyOutput(fi); //myoutput 에 파일을 보내주세요. //output 은 write. 쓰는 애. 코드에서 나가고 있음. 
		
		MyInput(fi);
		
		
	}
		
		
		//read
	private static void MyInput(File fi) {
		FileInputStream fin = null;

		try {
			fin = new FileInputStream(fi);
			int res = 0;
			while ((res = fin.read()) != -1) {
				System.out.println((char) res);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fin.close();

			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	// write
	private static void MyOutput(File fi) {
		FileOutputStream fo = null;
		try {
			fo = new FileOutputStream(fi);
			for (int i = 65; i <= 90; i++) {
				fo.write(i); // 빨간줄 뜨면 clause 두번째꺼 클릭.
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fo.close(); // 클로즈 해주는게 매우 중요! 코드에서
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
