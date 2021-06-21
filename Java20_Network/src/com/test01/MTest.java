package com.test01;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class MTest {

	
	public static void main(String[] args) throws UnknownHostException {
		InetAddress addr = InetAddress.getLocalHost();
		System.out.println(addr);
	    System.out.println("localhost:" + addr.getHostAddress());
	    System.out.println("host name:" + addr.getHostName()+ "\n");
	    
	   InetAddress[] naver = InetAddress.getAllByName("www.naver.com");
	   for(int i =0; i<naver.length; i++) {
		   System.out.println(naver[i].getHostName()+":" +naver[i].getHostAddress());
	   }
	}
}
// 내 컴의 실제 아이피 주소
//내 컴 이름. 
//자바로 서버 만들고 클라이언트 만들어서 채팅할 경우 어떤 아이피로 어떤 컴퓨터 이름의 누가 접속했는지 알 수 있음.


//네이버로 연결해주는 실제 주소값
//저 주소(네이버)로 연결되는 실제 주소값.-hostaddress.

