package com.iu.ap1.Strings;

import java.util.Scanner;

public class StringEx2 {

	public static void main(String[] args) {
		System.out.println("Strat");
		Scanner sc =new Scanner(System.in);
		String[] names = {"jpg","jpeg","gif","png"};
		System.out.println(" 파일명 입력");
		String fileName = sc.next();//sf.sd.dsf.df
		
		//확장자 분리작업
	    int idx = fileName.lastIndexOf(".");
		String result = fileName.substring(idx+1);
		System.out.println(result);		
        
		boolean flag = true;
		//확장자가 이미지인지 검증
         for(int i=0;i<names.length;i++) {
        	 if(result.equals(names[i])) {
        		 System.out.println("정상 파일 입니다");
        	       i = names.length;	 
                flag=!flag;
        	       break;   		 
        	 }
         }   
         if (flag) {
        	 System.out.println("비정상 파일이다");
         }
         
         
         			System.out.println("finish");
		
		
	}

}
