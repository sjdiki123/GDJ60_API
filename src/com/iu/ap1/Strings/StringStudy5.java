package com.iu.ap1.Strings;

public class StringStudy5 {

	public static void main(String[] args) {
	
		String str ="apple# Apple, aPPle# appLe";//전처리
		
		str = str.replace(",","#");
	//str = str.trim();
		String [ ] result = str.split("#");//파싱(parsing
		
		
		for (int i =0 ;i< result.length;i++) {
			System.out.println(result[i].trim().toUpperCase());
			
		}

	}

}
