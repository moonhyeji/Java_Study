package com.test03;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Arrays;

public class TestClient03 {
	
	public static void main(String[] args) throws Exception {
		
		
		
		//This class represents a socket for sending and receiving datagram packets. 
		//클라이언트 생성.
		DatagramSocket ds = new DatagramSocket();
		System.out.println("클라이언트 입니다.");
		
		
		//보낼 데이
		byte[] buff = "연습입니다.".getBytes();
	//Encodes this String into a sequence of bytes using the platform's default charset, storing the result into a new byte array.
   //이 스트링을 바이트 순서로 암호화한다.새로운 바이트 배열로 저장한다.

		
		
		
		//packet으로 감싼다.(데이터.데이터크기.주소.포트)
		DatagramPacket sendP = new DatagramPacket(buff, buff.length,InetAddress.getByName("localhost"),8888);
		
		
		//packet보낸다.
		ds.send(sendP);
		
		ds.close();
		ds.disconnect();
	}
// 포트번호가 없으면 클라이언트. 포트번호가 있으면 서버.
}
