package com.iu.ap1.Strings.ex3;

import java.util.StringTokenizer;

public class WeatherData {

	private  String data;
	
	public WeatherData() {
		this.data="SEOUL,12,맑음,60,DAEGU,68,비,10"
				+ "JEJU,-56,눈,12,JUNJU,32,흐림,5";
		
		
	}
	//init
	// data를 파싱해사 각 data를 Dto에 대입하고 Dto들을 리턴 
	public WeatherDTO[] init() {  
	StringTokenizer st = new StringTokenizer(this.data ,",");
	WeatherDTO [] wethers = new WeatherDTO[st.countTokens()];      
	
	
	
	
	
	}
	
	}
//	String [] datas   =this. data.split(",");
//	WeatherDTO[] wethers = new WeatherDTO[datas.length/4];
//	int idx = 0;
//	for (int i =0 ;i< datas.length;i++) {
//          WeatherDTO weatherDTO = new WeatherDTO();
//          weatherDTO.setCity(datas[i]);
//          weatherDTO.setGion(datas[i+1]);
//          weatherDTO.setStatus(datas[i+2]);
//          weatherDTO.setMise(datas[i+3]);
//          
//          
//          wethers[idx] = weatherDTO;
//          idx++;
//		
//	}
//	return wethers;
//	}
//	
//	  
//	
//}
