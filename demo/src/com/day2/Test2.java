package com.day2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Test2 {

	public static void main(String[] args) throws IOException {
		
		//선언부
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		
		//System.in : 키보드로 1byte를 입력 받음
		//InputStreamReader : System.in으로 입력받은 1byte를 문자(String)로 형변환 시킴
		//BufferedReader : 입력받은 데이터 처리속도를 빠르게 저장함
		
		
		int r;
		double area,length;
		
		//입력
		System.out.print("반지름 : ");
		
		//r =  br.read();
		
		r =Integer.parseInt(br.readLine());
		
		//연산
		area = r*r*3.14;
		length = r*2*3.14;
		
		//출력
		System.out.printf("반지름: %d, 면적: %g, 둘레: %g", r,area,length);
		
		
	}

}
