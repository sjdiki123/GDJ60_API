package com.iu.ap2.collection;

import java.util.ArrayList;

public class LIstMain {

	public static void main(String[] args) {
//순거가 유지 되고 , 값의 중복 허용 ,배열기반

		int []arr = new int [3];
		ArrayList ar = new ArrayList();
		
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		//add 새로운 데이터를 추가 
		ar.add(1);
		ar.add(2);
		ar.add(3);
		ar.add(4);
		
		for (int i = 0; i<arr.length;i++) {
			System.out.println(arr[i]);
			
		}
		System.out.println("------------");
		
		ar.add(1, 8);//
		ar.remove(0);
		ar.set(2, 9);
		//ar.clear();
		for(int i = 0 ; i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		
	}

}
