package com.iu.ap1.Strings.ex3;

public class WeatherView {

	
	//2개의 메서드 생상
	//1.모든 날씾 정보를 출력
     //2. dto 하나의 정보를 출력

	
	public void view(WeatherDTO [] datas) {
		for(int i =0 ; i < datas.length;i++) {
			this.view(datas[i]);
		}
			
	}
	
	
	
	
	
	public void view(WeatherDTO weatherDTO) {
		System.out.println("city" + weatherDTO.getCity());
		System.out.println("gion" + weatherDTO.getGion());
		System.out.println("mise" + weatherDTO.getMise());
		System.out.println("status" + weatherDTO.getStatus());
	}





	
	
	
	
	
}
