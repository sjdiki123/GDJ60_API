package com.iu.ap2.token;

import java.util.StringTokenizer;

public class StringToken1 {

	public static void main(String[] args) {
       String nations = "korea,서울,usa,워싱턴,uk,런던,japan,도쿄";
       String [] n = nations.split(",");
     
       for(int i = 0;i<n.length;i++) {
    	   NationDTO nationDTO= new NationDTO();
    	   nationDTO.setName(n[i]);
    	   nationDTO.setCity(n[++i]);
       }
       
       StringTokenizer st = new StringTokenizer(nations, ",");
       
       
       while(st.hasMoreTokens()) {
    	   String t1 = st.nextToken();
    	   System.out.println(t1);
    	   String t2 = st.nextToken();
    	   System.out.println(t2);
       }


	}

}
