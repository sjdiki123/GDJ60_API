package com.iu.ap1.Strings;

public class StringStudy {

	public static void main(String[] args) {

		
		System.out.println(String.CASE_INSENSITIVE_ORDER);
		
		
		String str = new String("abc");
		String str2 = "abc";
		
		System.out.println(str==str2);
		
		boolean check = str.equals(str2);
		System.out.println(check);

		char ch= str2.charAt(0);
		System.out.println("char" + ch);
		
		int a =  str2.indexOf(0);
		System.out.println("A:" + a);
		 
	}

}
