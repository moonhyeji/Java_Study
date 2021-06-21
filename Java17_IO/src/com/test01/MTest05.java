package com.test01;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
public class MTest05 {
	
	public static void main(String[] args) {
		File fi = new File("b.txt");
		
		MyOutput(fi);
		MyInput(fi);
	}

	private static void MyOutput(File fi) {
         
         //try with resources: try의 괄호 안에 clos해야하는 명령문을 작성하면, 자동으로 close
         try(FileWriter fw = new FileWriter(fi);){
        	 
        	 
        	 fw.write("연습중입니다.");
        	 fw.append("abcd\n");
        	 
        	 
        	 
         }catch(IOException e) {
        	 e.printStackTrace();
         }
	}

	

	private static void MyInput(File fi) {
		try(FileReader fr = new FileReader(fi);){
			
			int ch;
			while ((ch = fr.read()) != -1) {  //<<- fr.read : 파일리더라는 애가  파일에 있는 데이터를 읽어서 ㅎ
				//reads a single character.  . -1 if the end of the stream has been reached.
				// -1이 오면 파일이 끝났으니까 종료해라. 
				
				System.out.print((char)ch);
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
			
		}catch(IOException e) {
			e.printStackTrace();
			
		}
	}
	

}
