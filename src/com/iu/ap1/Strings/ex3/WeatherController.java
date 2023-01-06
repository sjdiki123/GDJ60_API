package com.iu.ap1.Strings.ex3;

import java.util.Scanner;

public class WeatherController {
//start
	//1.날씨정보 초기화
	//2.전국 날씨 정보
	//3.지역  날씨 검색
	//도시 정보가 업습니다
	//4.""  날씨 추가
	//5.""  삭제
	//
	//6.종료
	Scanner sc = new Scanner(System.in);
	
	public void Start() {
		boolean check = true; 
		WeatherData weatherData =new WeatherData();
 		 WeatherView weatherView = new WeatherView();
		 WeatherInput weatherInput =new WeatherInput();
		
		int count = sc.nextInt();
		
		WeatherDTO [] weatherDTOs = null;
		
		while(check) {
			System.out.println("1.날씨 정보 초기화");
			System.out.println("2.전국 날씨 정보");
			System.out.println("3.지역 날씨 검색");
			System.out.println("4.지역 닐씨 추가");
			System.out.println("5.지역 날씨 삭제");
			System.out.println("6. 종----료");
			
			int select = sc.nextInt();
			
			switch(select) {
			
			case 1:
				System.out.println(" 초기화 완료 되었습니다");
			weatherDTOs  = weatherData.init();
			break;
			
			case 2:
				   System.out.println();
				weatherView.view(weatherDTOs);
				   break;
			case 3:
				System.out.println(" 도시 정보 가 없습ㄴㅣ다");
				   
				break;
			case 4:
				 break;
				
			case 5:
				 break;
				
				 default:
				 check  =false;
			}
		      
			
			
			
			
			
			
		}
		
			
		 
		
		
	}
	
	
	
	
}
