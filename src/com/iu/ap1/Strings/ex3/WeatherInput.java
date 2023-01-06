package com.iu.ap1.Strings.ex3;

import java.util.Scanner;

public class WeatherInput {

	Scanner sc = null;
	
	//search
	//배열을 받고,키보드로부터 검색할 더시명을 입력받음
	//찾은 dto리턴 없으면 null;

	//add
	//배열을 받고 ,키보드로부터 정보들을 입력 받음
	//배열에 추가하고 배열을 리턴
	
	
	
	public void add (WeatherDTO[]weatherDTOs) {
		WeatherDTO weatherDTO = new WeatherDTO();
		System.out.println(" 도시명을 입력하세요");
		weatherDTO.setCity(sc.next());
		System.out.println(" 기온을 입력하세요");
		weatherDTO.setGion(sc.next());
		System.out.println("날시를 입력하세요");
		weatherDTO.setStatus(sc.next());
		System.out.println("a미세먼지 입력하세요");
		weatherDTO.setMise(sc.next());
		WeatherDTO [] newInfo = new WeatherDTO[weatherDTOs.length];
		
		
		for(int i =0 ; i<weatherDTOs.length;i++) {
			newInfo[i] = weatherDTOs[i];
			
		}
		newInfo[weatherDTOs.length] weatherDTO;


	}
	
	
	
	
	//remove
	//	//배열을 받고 ,키보드로부터 삭제핳ㄹ 도시명을 입력 받음
	//배열에서 삭제하고 배열을 리턴
	
  
  
  
  
  
  
  
  
  
	
}
