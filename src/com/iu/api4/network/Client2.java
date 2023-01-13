package com.iu.api4.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client2 {

	public static void main(String[] args) {

		//1 서버 접속시도
		//2.1점심 2.저녁 3 종료
		//3.1,2,3고르기
		//1번 : 서버에서 점심메뉴 하나를보내줌 출력
		//2번 서버에서 저녁 메뉴 하나를 보내줌
		//3종료
		Scanner scanner = new 
		
		
		
		
	String[] lunch = {"라면 " , " 햄버거" , "짜장면","고기"};
		Socket socket = null;
		OutputStream os=null;
		OutputStreamWriter ow=null;
		BufferedWriter bw = null;
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		
		try {
			socket = new Socket("192.168.1.39",8282);
			System.out.println(" 접속 성공입니다");
			
			os	=socket.getOutputStream();
			ow = new OutputStreamWriter(os);
			bw= new BufferedWriter(ow);
			System.out.println(" 1.점심메뉴");
			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
		
		
		
		
		
		
	}

}
