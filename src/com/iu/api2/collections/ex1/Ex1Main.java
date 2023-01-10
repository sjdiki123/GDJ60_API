package com.iu.api2.collections.ex1;

import java.util.ArrayList;

public class Ex1Main {

	public static void main(String[] args) {
		// 학생은 이름 번호 국어 영어 수학 총점으로 평균으로 이루어짐
		//1. 학생정보 초기화
		//2 학생 정보조회
		//3.학생 정보 검새 조화(이름
		//4.학생 정보 추가 
		//5학생 정보 삭제 (이름
		//6종료
		
		
		
		
		StudentDAO dao = new StudentDAO();
   ArrayList<StudentDTO> ar = dao.init();
   
   StudentDTO studentDTO = dao.findByName(ar);
//   System.out.println(studentDTO.getName());
//   System.out.println(studentDTO.getAvg());
   
   dao.addStudent(ar);
   
   
for(int i =0;i<ar.size();i++) {
	System.out.println(ar.get(i).getName());
}
	   
   }
   //향샹된 for
//		for(StudentDTO studentDTO:ar) {
//		}
//		int[]nums = new int [3];
//		for(int n:nums) {
//			
//		}
	}


