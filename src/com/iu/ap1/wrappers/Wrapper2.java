package com.iu.ap1.wrappers;

public class Wrapper2 {

	public static void main(String[] args) {

		int num =10;
		
	//Integer num2 = new Integer(num);
	//auto-boxing
	//Primitive > Reference
		
		Integer num2 = num;
	
		
		//auto=unboxing
		//Reference > Primitive
		//num = num2.intValue();

			num = num2 ;
		
	}

}
