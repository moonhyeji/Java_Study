package com.test02;

import java.io.*;
import java.net.*;

public class TestServer02 {
	public static void main(String[] args) {
		
		
		
		////////////  tcp
		
		ServerSocket serverSocket = null;   // 서버 생성해줄 서버소켓
		Socket serviceSocket;               //접속될 클라이언트.  (소켓 =클라이언트를 여기에 담을거야!
		
		PrintWriter out = null;            //프린트라이터 = 출력객체. (서버에서 클라이언트로)
		BufferedReader in = null;        //서버입장에서 입력객체.( 클라이언트에서 서버로)

		
		try {
			serverSocket = new ServerSocket(9999);  //9999라는 포트로 서버를엶.

		} catch (IOException e) {
		}
		
		while(true){  //while true 안에서 동작. 
			System.out.println("client를 기다립니다...");
			try {
				serviceSocket = serverSocket.accept();   //서버소켓에 접속함. 
				//서버에 접속된 객체를 servicesok 에 넣어줌.
				
				System.out.println("client가 접속했습니다...");
				
				
				
				
				// 클라이언트에게서 받은 내용을 라인단위로 읽을 것이다.
				in = new BufferedReader(new InputStreamReader(serviceSocket.getInputStream()));

				
				
				//*** 클라이언트에게 보낼 거야. ''true''<< 중요!
				//***PrintWriter
				out = new PrintWriter(serviceSocket.getOutputStream(),true);
				//(클라이언트에서 서버로 보낼것이다.)  이 데이터가 보내고 나서 연결이끝ㄴㅆ는지 몰르기 때문에,
//			true: 하면 다 보낸 것 = 오토플러
				
				
				
				String inputLine;   // 버퍼에 담아서 한줄씩 읽는 것. 
				while((inputLine = in.readLine()) != null){
					// 클라이언트에게서 받은 내용을 라인단위로 읽을 것이다. = in.readLine.
                   //  null이 아닐 때까지 읽을 것이다. 
					
					
					
					
					System.out.println("client가 보낸 메시지 : " + inputLine);
					out.println(inputLine);
				}
				
				out.close();
				in.close();
				serviceSocket.close();
				serverSocket.close();
				
				System.out.println("client에 데이터 전송했습니다...");
				
			} catch (IOException e) {
			}
		}
	}
}
