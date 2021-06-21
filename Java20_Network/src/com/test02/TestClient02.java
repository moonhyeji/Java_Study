package com.test02;

import java.io.*;
import java.net.Socket;

public class TestClient02 implements Runnable { // testclient를 스레드화시킴.

	@Override
	public void run() {   //run 메소드를 오버라이드함. 
		try{
			
			  
			Socket clientSocket;    //socket: A socket is an end point for communication between two machines. 
			PrintWriter out = null;  //Prints formatted representations of objects to a text-output stream.
			BufferedReader in = null; //Reads text from a character-input stream
			BufferedReader stdin = null;
			
			System.out.println("server에 접속합니다...");     //우선 서버에 접속합니다를 출력.
			clientSocket = new Socket("localhost",9999);    
			// 	Socket​(String host, int port) 	
			//Creates a stream socket and connects it to the specified port number on the named host.
              //스트림 소켓을 만들고, 호스트네임가진 포트넘버에 연결한다.
			
			
			
			
			
			//PrintWriter : 출력(클라이언트에서 서버로 보냄.)
			out = new PrintWriter(clientSocket.getOutputStream(),true);  //
			
			//입력(서버에서 클라이언트로 보냄.)
			in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));			
			//clientsocket을 겟인풋스트림함. 
			
			stdin = new BufferedReader(new InputStreamReader(System.in));	
			//system.in에서 넘어오는 데이터를 인풋스트림리더로 읽어서 버퍼드리더로 읽어서. readline().<한줄씩 읽을거야. 하는 것. 
			
			
			String inputLine;
			
			
			while((inputLine = stdin.readLine()) != null){
				out.println(inputLine);
				System.out.println("server로부터 다시 받은 메시지 :" + in.readLine());
			}
			// 여기까지 안에서 계속 반복되고 있음. 
//			서버실행 -> 클라이언트실행 -> 서버실행. 아무거나 입력하고 엔터. 
			
			/*
			 * server에 접속합니다...
              ㅇㅇ
              server로부터 다시 받은 메시지 :ㅇㅇ
              끄는건..? 아하
              
			 */
			
			out.close();
			in.close();
			stdin.close();
			clientSocket.close();
			
			System.out.println("소켓을 닫는다...");
			
	    	}catch(IOException e){
		}
	}
	
	public static void main(String[] args) throws Exception{
		Thread t1 = new Thread(new TestClient02());
		t1.start();
	}
}
