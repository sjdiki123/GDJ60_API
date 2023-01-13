package com.iu.api4.network;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server2 {

	public static void main(String[] args) {
 
		// client 접속 대기
		//1 점심메뉴 중에서 하나를 랜덤하게 골라서 전송
		//2저녁 메뉴 중에서 랜덤으로 골라서 전송
		//.종료
	
	
		ServerSocket ss =null;
		 Socket sc =null;
		 
		try {
			ss = new ServerSocket(8282);
			System.out.println("client접속을 기다리는 중 ");
			sc=ss.accept();
			System.out.println("client 접속 성공");
	
		
		
		
		
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	
	}
	

}
