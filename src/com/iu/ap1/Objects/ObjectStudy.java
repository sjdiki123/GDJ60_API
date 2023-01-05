package com.iu.ap1.Objects;

public class ObjectStudy {

				public static void main(String[] args) {
					//객체 생상 공식
				Object object  = new Object();
		
				// 멤버 사용 (접근)
				//참조 변수명 .변수명 참조 변수명 .매서드명()
			
				int result = object.hashCode();
				System.out.println(result);
       
		     	String r = object.toString();
				System.out.println(r);
				System.out.println(object);//object.toString(_)
				                
				
				Child child = new Child();
				child.toString();
				
				Object obj = new Object();
				System.out.println(object ==obj);
				boolean check = object.equals(obj);
				System.out.println(check);
				
				System.out.println(child.toString());
				System.out.println(child);
				System.out.println(child .hashCode());
				
				Object o= child; 

				

	}

}
