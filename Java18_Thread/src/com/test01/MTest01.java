package com.test01;
import java.io.IOException;

public class MTest01 {

	
	
	public static void main(String[] args) {
		Runtime rt = Runtime.getRuntime();
		
		String []path = {"/usr/bin/open","=a","/Applications/Safari"};
		//String path = "notepad.exe";
		
		
		try {
		Process prc = rt.exec(path);
		//process : 프로그램이 메모리에 실제 구현되어 실행되고 있는 객체. 
		// 프로세스 내부에서의 작업들 = 스레드. 
		}catch (IOException e) {
			e.printStackTrace();
			
			
		}
	}
}
