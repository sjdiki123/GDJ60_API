package com.iu.ap2.collection;

import java.util.ArrayList;

public class ListMain3 {

	public static void main(String[] args) {

		//Generic : 타입에 안전성
		//E 변수명
		//E = integer
		ArrayList<Integer> ar =new ArrayList<>() ;
		ar.add(1);
		
		int num = ar.get(0);
		
		ArrayList<WetherDTO> ar2 = new ArrayList<>();
		WetherDTO wetherDTO = new WetherDTO();
		wetherDTO.setCity("seoul");
		ar2.add(wetherDTO);
		wetherDTO = new WetherDTO();
		wetherDTO.setCity("jeju");
		ar2.add(wetherDTO);
		
//		wetherDTO = new WetherDTO();
//		wetherDTO.setCity("jeju");
	
	    ar2.remove(wetherDTO);
		
		
		for (int i =0;i<ar2.size();i++) {
			System.out.println(ar2.get(i).getCity());
			
		}
	}

}
