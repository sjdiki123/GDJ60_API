package com.iu.api2.collections.ex1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StudentDAO {

	
	private StringBuffer sb;
	private Scanner sc;
	
	public StudentDAO() {
		this.sc=new Scanner(System.in); 
		this.sb = new StringBuffer();
		
		
		sb.append("iu-1-90-60-70-");
		sb.append("winter-2-86-84-75-");
		sb.append("suji, 3 ,89, 74 ,87");
		sb.append("choa, 4, 71, 25, 99");
		
		    
	}
	//학생 정보 백업
//	현재시간을 파일명으로 해서 전달	
	
	public void  studenBackup(ArrayList<StudentDTO> ar) {
		File file = new File("C:\\filetest" ,"student.txt" );
		
		FileWriter fw = null;
		
		try {
			fw = new FileWriter(file);
			for(StudentDTO studentDTO :ar) {
				StringBuffer sb = new StringBuffer();
				sb.append(studentDTO.getName());
				sb.append("-");
				sb.append(studentDTO.getNum());
				sb.append("-");
				sb.append(studentDTO.getKor());
				sb.append("-");
				sb.append(studentDTO.getEng());
				sb.append("-");
				sb.append(studentDTO.getMath());
				sb.append("-");
				sb.append(studentDTO.getMath());
				sb.append("\r\n");
				
				
				fw.write(sb.toString());
				fw.flush();
				
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
			
		}
	}
	
	
	
	
	// 학생 정보 추가
    public void addStudent(ArrayList<StudentDTO> ar) {
    	StudentDTO studentDTO = new StudentDTO();
    	System.out.println("이름을 입력");
    	studentDTO.setName(sc.next());
    	System.out.println("번호를 입력");
    	studentDTO.setNum(sc.nextInt());
    	System.out.println("국어점수를 입력");
    	studentDTO.setKor(sc.nextInt());
    	System.out.println("수학점수를 입력");
    	studentDTO.setMath(sc.nextInt());
    	System.out.println("영어점수를 입력");
    	studentDTO.setEng(sc.nextInt());
    	studentDTO.setTotal(studentDTO.getKor()+studentDTO.getMath()+studentDTO.getEng());
		studentDTO.setAvg(studentDTO.getTotal()/3.0);
		ar.add(studentDTO);
    	
    	
    }
	
	
	
	
	//학생 정보 검색
	public StudentDTO findByName(ArrayList<StudentDTO> ar) {
		System.out.println("검색할 이름 입력");
		String name = sc.next();

		StudentDTO st =null;
		
	for(StudentDTO studentDTO :ar) {
		if(name.equals(studentDTO.getName())) {
			st =studentDTO;
			break;
		}
	}
	return st;

	}

	
	//학생정보 초기화
	public ArrayList<StudentDTO> init() {
		//String data = this.sb.toString()
		
		File file = new File ("C:\\filetest" );
		
		String [ ]names = file.list();
		long max = 0;
		for(String name:names) {
		name =name.substring(0,name.lastIndexOf("."));
		long data = Long.parseLong(name);
		
		if(data>max) {
			max = data;
			
		}
		}
		
		
		
		//파일 생성
		file = new File(file, max+"txt");
		//2 파일내용 읽기 위해서 연결

		FileReader fr =null;
		BufferedReader br =null;
		 ArrayList<StudentDTO> ar = new ArrayList<>();
		 
		try {
		fr = new FileReader(file);
		br = new BufferedReader(br);
		
		String data = null;
		while((data=br.readLine()) !=null) {
			data= data.replace(" " , "-");
			data= data.replace("," , "");	
			  StringTokenizer st = new StringTokenizer(data, "-");
			 
					StudentDTO studentDTO = new StudentDTO();
					studentDTO.setName(st.nextToken());
					studentDTO.setNum(Integer.parseInt(st.nextToken()));
					studentDTO.setKor(Integer.parseInt(st.nextToken()));
					studentDTO.setEng(Integer.parseInt(st.nextToken()));
					studentDTO.setMath(Integer.parseInt(st.nextToken()));
					studentDTO.setTotal(studentDTO.getKor()+studentDTO.getMath()+studentDTO.getEng());
					studentDTO.setAvg(studentDTO.getTotal()/3.0);
					ar.add(studentDTO);
				
		}
		
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
		try {
			
		} catch (Exception e) {
		
		}		
		
		return ar;
	}
}
	}
