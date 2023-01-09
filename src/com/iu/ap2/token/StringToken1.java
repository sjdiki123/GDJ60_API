package com.iu.ap2.token;

import java.util.StringTokenizer;

public class StringToken1 {

	public static void main(String[] args) {
       String nations = "korea,서울,usa,워싱턴,uk,런던,japan,도쿄";
       
       StringTokenizer st = new StringTokenizer(nations, ",");
       
       
       while(st.hasMoreTokens()) {
    	   String t1 = st.nextToken();
    	   System.out.println(t1);
    	   
       }


	}

}
