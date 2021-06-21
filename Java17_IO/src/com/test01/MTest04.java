package com.test01;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
public class MTest04 {

	
	public static void main(String[] args) {
		File fi = new File("a.txt");
		
		try {
			MyOutput(fi);
		    MyInput(fi);
			
			
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}  // 여기까지 하면 Desktop a.txt파일에 연습중입니다.~~ 재밌다. 가 입력됨. 
	}
	
	
	
	
	
	//throw: 예외를 발생시킴.
	//throws: 예외를 위임 -> "예외가 발생할 수 있는 명령문을 가진 메소드"를 호출한 메소드에서 예외처리 해라.. 
	private static void MyOutput(File fi) throws IOException { //IOException 을 throw하겠다. 하니까 myoutput(fi)에 예외가 발생. 
		FileWriter fw = new FileWriter(fi,true);  //<<- 얘를 가진 메소드가 myoutput 메소드. 
	                                         	//이 메소드 안에서 ioexception 이발생할 수 있으니. 그것을 myoutput(fi) 에서 예외처리 해주세요 (try catch해주세요. 하는것. 
	
		
		//FileWriter fw = new FileWriter(fi,true);
		//true를 붙이면 실행 할 때마다 문구 반복되어 하나씩 추가됨. 
          fw.write ("abcdefg\n");
          fw.append("연습중입니다.")
            .append("java.io 재밌다.\n\n");  //return type의 writer니까 메소드 체이닝 가능. 
          
          
          
          fw.close();  // 여기까지 쓰고 myoutput을 트라이 캐치 해줌. 
	 
          //(fi,true);파일의 끝에 데이터를 더 넣어줄 것인지 덮어씌우기 할 건지 물음. FileWriter​(File file, boolean append)
          //    file - the File to write
          // true: 데이터를 더 넣음. / false : 들어가면 몇번 실행하든 덮어씌우기 함. 
          
          //append: 덧붙이다. 첨부하다. Appends the specified character sequence to this Appendable. 
	
          
          //    append - if true, then bytes will be written to the end of the file rather than the beginning
         //public void write​(char[] cbuf) /여기서 [] 는 캐릭터 배열. 캐릭터배열 = 문자열/ 같음.           
          
	}
	
	//마이인풋에서 아이오익셉션이 발생할 수 있으니 (마이인풋을 호출하는 곳에서)마이인풋(fi)에서 예외처리 해줘라. 
	private static void MyInput(File fi) throws Exception { //IOException 을 throw하겠다. 하니까 myoutput(fi)에 예외가 발생. 
		FileReader fr = new FileReader(fi);  
		int ch;
		while((ch = fr.read()) != -1) {
			System.out.print((char)ch);
		}
	}
}
