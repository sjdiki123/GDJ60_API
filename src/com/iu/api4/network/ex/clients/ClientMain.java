package com.iu.api4.network.ex.clients;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientMain {

	public static void main(String[] args) {

		
		Socket socket = null;           
		OutputStream os=null;
		OutputStreamWriter ow=null;
		BufferedWriter bw = null;
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		
	Scanner scanner = new Scanner(System.in);

		
		try {
			socket = new Socket("192.168.1.39",8282);
			System.out.println("접속 성공");			
			boolean check=true;
			while(check) {
				os	=socket.getOutputStream();
				ow = new OutputStreamWriter(os);
				ow = new OutputStreamWriter(os);
				System.out.println("1. 전체 학생 정보 출력");
				System.out.println("2. 학생 정보 검색 출력");
				System.out.println("3.  학생 정보 추가 ");
				System.out.println("4. 학생 정보 삭제 ");
				System.out.println("5.종료 ");
				
				
				
				
			}
			
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
