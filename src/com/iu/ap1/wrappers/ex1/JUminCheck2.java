package com.iu.ap1.wrappers.ex1;

public class JUminCheck2 {

	
	//check
	//주민번호를 받아서
	//맨 끝 자리 체크용 번호로 뺌
	//9   8   0   7    2   4 -  1  2   3   4   5   6
	//2   3   4   5    6   7    8  9   2   3   4   5
	//18  24  0   35  12  28    8  18  6  12  20  30
	// 합이 122, 합을 11로 나누어서 나머지 구함
	//122/11 = 몫 11  나머지1 
	//나머지 값을 11로 뺀 결과값하고 체크용 번호랑 같은지 확인 
	//11-1 =10
	//11로 뺀 결과값이 두자리면 
	//11로 뺸 결과값을 다시 10로 나눈 나머지를 체크용 번호랑 같은지 확인
	//10/10몫 1 나머지느 0 0==7
	
	public void check(String jumin) {
		
		//jumin.charAt(0)
		//jumin.substring(0);
		jumin = "991224 - 1234567";
		int num=2;
		for (int i =0 ; i<jumin.length()-1;i++) {
			if(i==6) {
				continue;
			}
			System.out.println(Integer.parseInt(jumin.substring(i,i++ ))*num);
			num++;
			if(num==10) {
				num=2;
			}
		}
		
	}
	
}
