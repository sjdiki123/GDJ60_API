package com.iu.ap1.Strings;

public class StringBuffer1 {

	public static void main(String[] args) {
		//StringBuffer 는 String이 아님
		StringBuffer sb = new StringBuffer("hello");
		
		//hello+worid
		sb.append("world");
		
		System.out.println(sb);

		
		//참조 변수를 출력하면 toString(): 클래스명 @ 객체주소
		//toString를 오버 라이딩 햇다..
		//변수에는 같은 데이터 타입만 대입 가능 
		
		   
	}


}
