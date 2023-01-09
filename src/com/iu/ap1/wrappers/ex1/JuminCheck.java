package com.iu.ap1.wrappers.ex1;

public class JuminCheck {

	
	// check1
	//주민등록 번호를 받아서 남성 , 여성 출력
	
	public void check1(String jumin) {
		//jumin.charAt(7);
		String  check = jumin.substring(7,8);
		
		if (check.equals("1")|| check.equals("3")){
				System.out.println(" 남자");		
     	} else {
		
		System.out.println(" 여자");
	   }
	}
	
	//check2
	// 주민번호를 받아서 나이를 계산
	//3-5 봄 6-8여름  9-11 가을  12-2 겨울 
	
	public void check2(String jumin)  {
		
	String y = jumin.substring(0,2);
	String check = jumin.substring(7, 8);
int year = 1900;
	if(check.equals("3") || check.equals("5")) {
		year = 2000;
	}
		
	 year = year+ Integer.parseInt(y);
	int age  = 2023- year;
		
	System.out.println(" age " + age);
	
	String m = jumin.substring(0,2);
int month =Integer.parseInt(m);
if(month>=3 && month <=5) {
	System.out.println("봄");
}else if (month>=6 && month <=8) {
	System.out.println("여름");
}else if (month>=9 && month <=11) {
	System.out.println("가을");
}else  (month>=12 && month <=2) {
	System.out.println("겨울");
}
	
	                  
	}
		
		
	
	


}