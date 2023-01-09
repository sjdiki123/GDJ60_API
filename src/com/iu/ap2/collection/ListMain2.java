package com.iu.ap2.collection;

import java.util.ArrayList;
import java.util.Scanner;

public class ListMain2 {

	public static void main(String[] args) {

		int [] arr =new int[3];
		ArrayList ar = new ArrayList();
		
		//다형성 
		//Integer num1 = new Integer(1);
		Integer num1 =1;
		ar.add(1); // auto - boxing
		ar.add(1.2);
		ar.add('a');
		ar.add(false);
		ar.add("hello");
		ar.add(new Scanner(System.in));
		
		int n1 = (Integer)ar.get(0);
		Object n2 = ar .get(1);               
		
		
		for (int i = 0; i< ar.size();i++) {
			System.out.println(ar.get(i));
}
		
		
		
	}

}
